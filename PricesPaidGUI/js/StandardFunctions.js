
var standardCommodities = {
    // CPU seems to requie both 7020 and 7025!  This 
    // is why commoditype could end up being a problem for us!
    All: '*',
    CPU: '*702*',
    Software: '*7030*',
    Supplies: '*7510*',
    Punchcards: '*7040*',
    Configuration: '*7010*',
    MiniMicro: '*7042*',
    Component: '*7050*'
};


var standardFieldDescriptor = [];
standardFieldDescriptor["productdescription"] = "Product Description";
standardFieldDescriptor["manuname"] = "Manufacturer Name";
standardFieldDescriptor["manupartnum"] = "Manufacturer Part Number";
standardFieldDescriptor["orderdate"] = "Order Date";
standardFieldDescriptor["vendor"] = "Vendor";
standardFieldDescriptor["unitprice"] = "Unit Price";
standardFieldDescriptor["unitofissue"] = "Unit of Issue";
standardFieldDescriptor["qty"] = "Qty";
standardFieldDescriptor["extendedprice"] = "Extended Price";
standardFieldDescriptor["contractnumber"] = "Contract Number";
standardFieldDescriptor["orderid"] = "Order Id";
standardFieldDescriptor["orderingagency"] = "Ordering Agency";
standardFieldDescriptor["orderingbureau"] = "Ordering Bureau";
standardFieldDescriptor["orderingofficezip"] = "Ordering Office Zip";
standardFieldDescriptor["shiptoofficezip"] = "Ship to Office Zip";
standardFieldDescriptor["pscdescription"] = "PSC Description";
standardFieldDescriptor["productservicecode"] = "Product Service Code";
standardFieldDescriptor["unproductservicecode"] = "U.N. Product Service Code";
standardFieldDescriptor["vendorduns"] = "Vendor DUNS #";
standardFieldDescriptor["orderingprocess"] = "Ordering Process";
standardFieldDescriptor["datasource"] = "Data Source";

var nonStandardFieldDescriptor = [];
nonStandardFieldDescriptor["dataSource"] = "Data Source";


var standardColors = [];
standardColors[0] =  'aqua';
standardColors[1] =   'black';
standardColors[2] =   'blue';
standardColors[3] =   'fuchsia';
standardColors[4] =   'gray';
standardColors[5] =   'green';
standardColors[6] =   'lime'; 
standardColors[7] =  'maroon';
standardColors[8] =   'navy';
standardColors[9] =   'olive'; 
standardColors[10] =  'orange';
standardColors[11] =   'purple';
standardColors[12] =   'red';
standardColors[13] =   'silver';
standardColors[14] =   'teal';
// standardColors[15] =   'white';
standardColors[15] =   'yellow';

var NUM_STANDARD_COLORS = 16;


var transactionColumns = [
    {id: "Product Description", name: standardFieldDescriptor["productdescription"], field: "productDescription", width: 200, sortable: true},
    {id: "Manufacturer Name", name: standardFieldDescriptor["manuname"], field: "Manufacturer Name", width: 200, sortable: true},
    {id: "Manufacturer Part Number", name: standardFieldDescriptor["manupartnum"], field: "Manufacturer Part Number", width: 150, sortable:true},
    {id: "OrderDate", name: standardFieldDescriptor["orderdate"], field: "orderDate", width: 100, sortable:true},
    {id: "Vendor", name: standardFieldDescriptor["vendor"], field: "vendor", width: 150, sortable:true},
    {id: "UnitPrice", name: standardFieldDescriptor["unitprice"], field: "unitPrice", width: 100, sortable:true},
    {id: "UnitofIssue", name: standardFieldDescriptor["unitofissue"], field: "Unit of Issue", width: 100, sortable:true},
    {id: "Qty", name: standardFieldDescriptor["qty"], field: "Quantity",width: 100,  sortable:true},
    {id: "ExtendedPrice", name: standardFieldDescriptor["extendedprice"], field: "Extended Price", width: 150,  sortable:true},
    {id: "Contract Number", name: standardFieldDescriptor["contractnumber"], field: "Contract Number", width: 150,  sortable:true},
    {id: "Order Id", name: standardFieldDescriptor["orderid"], field: "awardIdIdv", width: 150, sortable:true},
    {id: "OrderingAgency", name: standardFieldDescriptor["orderingagency"], field: "contractingAgency", width: 250, sortable:true},
    {id: "OrderingBureau", name: standardFieldDescriptor["orderingbureau"], field: "Bureau", width: 150, sortable:true},
    {id: "OrderingOfficeZip", name: standardFieldDescriptor["orderingofficezip"], field: "From Zip Code", width: 100, sortable:true},
    {id: "ShipToOfficeZip", name: standardFieldDescriptor["shiptoofficezip"], field: "To Zip Code", width: 100, sortable:true},
    {id: "PSCDescription", name:  standardFieldDescriptor["pscdescription"], field: "PSC Description", width: 100, sortable:true},
    {id: "ProductServiceCode", name: standardFieldDescriptor["productservicecode"], field: "psc", width: 100, sortable:true},
    {id: "UNPSC", name: standardFieldDescriptor["unproductservicecode"], field: "Unspsc Code", width: 100, sortable:true},
    {id: "DUNS", name: standardFieldDescriptor["vendorduns"], field: "Duns Number", width: 100, sortable:true},
    {id: "OrderingProcess", name: standardFieldDescriptor["orderingprocess"], field: "Ordering Process", width: 100, sortable:true},
    {id: "DataSource", name: standardFieldDescriptor["datasource"], field: "dataSource", width: 100, sortable:true}
];
var controlColumns = [];  
var columns = controlColumns.concat(transactionColumns);

// Now I attempt to make every column sortable
//columns.forEach(function (c) {
//    c.sortable = true;
//});    
