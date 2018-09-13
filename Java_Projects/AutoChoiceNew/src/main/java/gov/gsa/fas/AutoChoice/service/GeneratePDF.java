package gov.gsa.fas.AutoChoice.service;

import gov.gsa.fas.AutoChoice.DAO.VehicleAvailDAO;
import gov.gsa.fas.AutoChoice.DTO.VehicleReportDTO;

import java.io.FileOutputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.List;

import org.jboss.ejb3.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPTableEvent;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

@Primary
@Repository
@Scope("request")
public class GeneratePDF implements PdfPCellEvent, PdfPTableEvent {

	/** Path to the resulting PDF file. */
	public static final String RESULT = "c:/itext/hello.pdf";

	@Autowired
	private VehicleAvailDAO va;

	/**
	 * Creates a PDF file: hello.pdf
	 * 
	 * @param args
	 *            no arguments needed
	 */
	/*
	 * public Document createPDF(String file) {
	 * 
	 * //new GeneratePDF().createPdf(RESULT); PdfWriter.getInstance(document,
	 * new FileOutputStream(file)); }
	 */

	/**
	 * Creates a PDF document.
	 * 
	 * @param filename
	 *            the path to the new PDF document
	 * @throws DocumentException
	 * @throws IOException
	 */

	public void tableLayout(PdfPTable table, float[][] width, float[] height,
			int headerRows, int rowStart, PdfContentByte[] canvas) {
		float widths[] = width[0];
		float x1 = widths[0];
		float x2 = widths[widths.length - 1];
		float y1 = height[0];
		float y2 = height[height.length - 1];
		PdfContentByte cb = canvas[PdfPTable.LINECANVAS];
		cb.rectangle(x1, y1, x2 - x1, y2 - y1);
		cb.stroke();
		cb.resetRGBColorStroke();
	}

	/**
	 * @see com.lowagie.text.pdf.PdfPCellEvent#cellLayout(com.lowagie.text.pdf.PdfPCell,
	 *      com.lowagie.text.Rectangle, com.lowagie.text.pdf.PdfContentByte[])
	 */
	public void cellLayout(PdfPCell cell, Rectangle position,
			PdfContentByte[] canvases) {
		float x1 = position.getLeft() + 2;
		float x2 = position.getRight() - 2;
		float y1 = position.getTop() - 2;
		float y2 = position.getBottom() + 2;
		PdfContentByte canvas = canvases[PdfPTable.LINECANVAS];
		canvas.rectangle(x1, y1, x2 - x1, y2 - y1);
		canvas.stroke();
	}

	/**
	 * Creates a PDF document.
	 * 
	 * @param filename
	 *            the path to the new PDF document
	 * @throws DocumentException
	 * @throws IOException
	 * @throws SQLException
	 */
	public Document createPdf(String filename) throws DocumentException,
			IOException {

		// step 1
		Document document = new Document(PageSize.A4.rotate());
		// step 2
		PdfWriter writer = PdfWriter.getInstance(document,
				new FileOutputStream(filename));
		// step 3
		document.open();
		// step 4
		document.add(getheaderTable(writer));
		document.add(getTable());
		// step 5
		document.close();
		return document;
	}

	/**
	 * Creates a table that mimics cellspacing using table and cell events.
	 * 
	 * @return a table
	 * @throws DocumentException
	 * @throws IOException
	 */
	public PdfPTable getheaderTable(PdfWriter writer) throws DocumentException,
			IOException {
		GeneratePDF gp = new GeneratePDF();
		PdfPTable headertable = new PdfPTable(new float[] { 5 });
		headertable.setTableEvent(gp);
		headertable.setWidthPercentage(100f);
		headertable.getDefaultCell().setCellEvent(new GeneratePDF());

		PdfPCell cell1 = new PdfPCell(new Phrase(
				"VEHICLE AVAILABILITY LISTING (VAL) AS OF 11/05/2014"));
		cell1.setPadding(20);
		cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
		headertable.addCell(cell1);
		PdfPCell cell2 = new PdfPCell(
				new Phrase(
						"All vehicle orders must be submitted to GSA Automotive no later than 3:00 PM EST on the closeout date indicator below. ",
						new Font(FontFamily.HELVETICA, 10, Font.BOLD,
								new BaseColor(153, 0, 12))));
		cell2.setPadding(5);
		cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
		headertable.addCell(cell2);
		PdfPCell cell3 = new PdfPCell(new Phrase(
				"OPEN = VENDOR HAS NOT ESTABLISHED A CLOSING DATE", new Font(
						FontFamily.HELVETICA, 10, Font.BOLD, new BaseColor(153,
								0, 12))));
		cell3.setPadding(5);
		cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
		headertable.addCell(cell3);
		return headertable;
	}

	public PdfPTable getTable() throws DocumentException, IOException {
		GeneratePDF gp = new GeneratePDF();
		PdfPTable table = new PdfPTable(new float[] { 5, 1, 1, 1 });
		table.setTableEvent(gp);
		table.setWidthPercentage(100f);
		table.getDefaultCell().setPadding(5);
		table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
		table.getDefaultCell().setCellEvent(gp);
		table.getDefaultCell().setBackgroundColor(null);
		List<VehicleReportDTO> cars = va.getReportItems();
		Boolean light_title_set = true;
		Boolean heavy_title_set = true;
		Integer curr_group_duns = 0;
		Integer prev_group_duns = 0;
		Boolean firsttime = true;

		for (VehicleReportDTO car : cars) {
			if (car.getDivision().equals("P") && light_title_set.equals(true)) {
				PdfPCell cell1 = new PdfPCell(new Phrase("LIGHT VEHICLES",
						new Font(FontFamily.HELVETICA, 14, Font.BOLD,
								BaseColor.BLUE)));
				cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell1.setColspan(4);
				cell1.setPadding(20);
				table.addCell(cell1);
				light_title_set = false;
			} else {
				if (car.getDivision().equals("H")
						&& heavy_title_set.equals(true)) {
					PdfPCell cell1 = new PdfPCell(new Phrase("HEAVY AND MEDIUM VEHICLES",
							new Font(FontFamily.HELVETICA, 14, Font.BOLD,
									BaseColor.BLUE)));
					cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
					cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell1.setColspan(4);
					cell1.setPadding(20);
					table.addCell(cell1);
					heavy_title_set = false;
				}
			}

			if (firsttime.equals(true)) {
				curr_group_duns = car.getGroup_DUNS();
				prev_group_duns = car.getGroup_DUNS();
				firsttime = false;
				table = createHeadercols(table, car.getManufacturer_Name(),
						car.getGROUP_DESCRIPTION());

			} else {
				curr_group_duns = car.getGroup_DUNS();
				if (!curr_group_duns.equals(prev_group_duns)) {
					table = createHeadercols(table, car.getManufacturer_Name(),
							car.getGROUP_DESCRIPTION());
				}
			}

			prev_group_duns = car.getGroup_DUNS();
			
			PdfPCell contentcell = new PdfPCell(new Phrase(car.getItemDesc(), new Font(
					FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK)));
			contentcell.setPaddingLeft(15);
			table.addCell(contentcell);
			
			contentcell = new PdfPCell(new Phrase(car.getModel(), new Font(
					FontFamily.HELVETICA, 10, Font.NORMAL,BaseColor.BLACK)));
			contentcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			contentcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			
			table.addCell(contentcell);
			
			contentcell = new PdfPCell(new Phrase(new SimpleDateFormat("MM/dd/yyyy").format(car
					.getOpen_Date()), new Font(
					FontFamily.HELVETICA, 10, Font.NORMAL,BaseColor.RED)));
			contentcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			contentcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(contentcell);
			
			contentcell = new PdfPCell(new Phrase(new SimpleDateFormat("MM/dd/yyyy").format(car
					.getCloseout_Date()), new Font(
					FontFamily.HELVETICA, 10, Font.NORMAL,BaseColor.RED)));
			contentcell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			contentcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(contentcell);
		}
		return table;
	}

	public static PdfPTable createHeadercols(PdfPTable table, String manuname,
			String groupdesc) {
		for (int i = 0; i < 1; i++) {
			PdfPCell headercell = new PdfPCell(new Phrase(manuname, new Font(
					FontFamily.HELVETICA, 10, Font.BOLD, new BaseColor(153, 0,
							12))));

			table.addCell(headercell);
			headercell = new PdfPCell(new Phrase("MODEL", new Font(
					FontFamily.HELVETICA, 10, Font.BOLD, new BaseColor(153, 0,
							12))));
			table.addCell(headercell);
			headercell = new PdfPCell(new Phrase("OPENDATE", new Font(
					FontFamily.HELVETICA, 10, Font.BOLD, new BaseColor(153, 0,
							12))));
			table.addCell(headercell);
			headercell = new PdfPCell(new Phrase("CLOSEOUT DATE", new Font(
					FontFamily.HELVETICA, 10, Font.BOLD, new BaseColor(153, 0,
							12))));
			table.addCell(headercell);
		}
		PdfPCell cell1 = new PdfPCell(new Phrase(groupdesc,new Font(
				FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.BLACK)));
		cell1.setColspan(3);
		cell1.setPaddingLeft(10);
		table.addCell(cell1);
		PdfPCell cell2 = new PdfPCell(new Phrase(""));
		table.addCell(cell2);
		return table;
	}
	/**
	 * Main method.
	 * 
	 * @param args
	 *            no arguments needed
	 * @throws DocumentException
	 * @throws IOException
	 * @throws SQLException
	 */
}