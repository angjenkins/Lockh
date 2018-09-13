/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.parsing;

/**
 * @author zabelc
 *
 */
public class RecordParsingException extends Exception {
	private static final long serialVersionUID = 3824979730925532182L;

	public RecordParsingException(String arg0) {
		super(arg0);
	}

	public RecordParsingException(String message, Throwable cause) {
		super(message, cause);
	}
}
