
function initialize_plot(data,medianUnitPrice) {
    
    var plotData = [[]];

    var i = 0;
    var thingToPlot = data.forEach(function (e) {

	if ((data.length < 15) || (medianUnitPrice <= 100.0) || (e.unitPrice < (medianUnitPrice * 4.0))) {
	    var newArray = [];

	    newArray[0] = e.orderDate;
	    newArray[1] = Math.ceil(e.unitPrice * 100) / 100;
	    //newArray[2] = Math.sqrt(Math.abs(e.unitsOrdered));
            qty = parseInt(e.Quantity).toString() //toString will remove the zeros if its 1.0 value
            if (e.Quantity == 1) {
		    newArray[2] = .1 + 1
		}
	    else{
		if (e.Quantity < 0){
		    newArray[2] = 0 
		}
		else{
		    newArray[2] = Math.log(e.Quantity) + 1
		}
	    }
	    newArray[3] = {
		label:  e.dataSource + ';;' + e.longDescription + ';;' + e["Manufacturer Name"] + ';;' + 
				e["Manufacturer Part Number"] + ';;' + e.orderDate + ';;' + e.vendor + ';;' + e.unitPrice + ';;' 
				+ e["Unit of Issue"] + ';;' + qty + ';;'	+ e['Extended Price']
	       ,color:  e.color
	    };
	    //console.log('label = ' + JSON.stringify(newArray[3]))
	    plotData[0].push(newArray);
	}
    });
    
    var labelobject = []
    plotData[0].forEach(function(entry) {
    	datasource = entry[3].label.split(';;')
    	color = entry[3].color
    	var test = {'label':datasource[0],'color':color}
	    labelobject.push(test)
	});
    
    var finalresult = [] 
    labelobject.forEach(function(entry){
	    found = 'n'
	    finalresult.forEach(function(finalresultentry){
		if (finalresultentry.label == entry.label){
			found = 'y'
		}
		
	    })
	    if (found == 'n')
	    {
		finalresult.push(entry)	
	    }
		
	})

	function tooltipContentEditor(str, seriesIndex, pointIndex, plot) {
    // display series_label, x-axis_tick, y-axis value
	    datasource = plot.data[seriesIndex][pointIndex][3]['label'].split(';;')

	    proddescrip = datasource[1].match(/.{1,40}/g)
	    //Note these edits cannot be implemented using format_transactiondata as the Price needs to be numeric
	    unitPrice = '$' + numberWithCommas(datasource[6].slice(0,-2))
	    extendedPrice = '$' + numberWithCommas(datasource[9].slice(0,-2))
	    Qty = datasource[8]    
    return 'Product Description : ' + proddescrip.join('<br>') + 
    	'<br>' + 'Manufacturer Name : ' + datasource[2] + 
    	'<br>' + 'Manufacturer Part Number : ' + datasource[3] +
    	'<br>' + 'Order Date : ' + datasource[4] +
    	'<br>' + 'Vendor : ' + datasource[5] +
    	'<br>' + 'Unit Price : ' + unitPrice +
    	'<br>' + 'Unit of Issue : ' + datasource[7] +
    	'<br>' + 'Qty : ' + datasource[8] +
    	'<br>' + 'Extended Price : ' + extendedPrice
    	
    //return plot.series[seriesIndex]["label"] + '/n' + plot.data[seriesIndex][pointIndex]
    }
    $('#chartdiv').empty();

// It seems we no longer need this!
//    if (isIE8orLower) {
    if (false) {
      $('#chartdiv').append("<div style='width: 700px; color: red; margin: 20px'>The graph not supported on Internet Explorer less than Version 9.  You appear to be using version "+ieversion+", or your browser is using that as its rendering mode for some reason. If you need the graph, upgrade, or use a different browser, or change the document mode.<\div>");
    } else {
    console.log('plotdata = ' + JSON.stringify(plotData))
//plotData = [[["2012-05-01",117.44,0.1,{"label":"OS2;;SAMSONITE CORPORATION LAPTOP V Samsonite Corporation Laptop Vertical To TOTE,LAPTOP,VERTICAL Laptop vertical to;;Samsonite Corporation;;409571761;;2012-05-01;;SITA BUSINESS SYSTEMS, INC.;;117.4400;;EA;;1;;117.4400","color":"aqua"}],["2012-03-23",117.44,0.1,{"label":"OS2;;SAMSONITE CORPORATION LAPTOP VSamsonite Corporation Laptop Vertical To TOTE,LAPTOP,VERTICAL Laptop vertical to;;Samsonite Corporation;;409571761;;2012-03-23;;SITA BUSINESS SYSTEMS, INC.;;117.4400;;EA;;1;;117.4400","color":"aqua"}],["2013-06-03",40.16,0.6931471805599453,{"label":"ADVANTAGE;;LAPTOP RISER LAPTOP RISER;;FELLOWES;;8032001;;2013-06-03;;MTEK, INC.;;40.1600;;EA;;2;;80.3200","color":"black"}],["2012-05-23",275.88,0.1,{"label":"ADVANTAGE;;LAPTOP DEPOT, 8 LAPTOP UNIT P;;DATUM FILING SYSTEMS;;LTD8;;2012-05-23;;DATUM FILING SYSTEMS, INC.;;275.8800;;EA;;1;;275.8800","color":"black"}],["2013-06-03",783.02,0.1,{"label":"ADVANTAGE;;LAPTOP SECURITY DESK: LAPTOP;;VERSATABLES.COM;;LSD7230BG;;2013-06-03;;VERSA PRODUCTS;;783.0200;;EA;;1;;783.0200","color":"black"}],["2011-08-16",394.74,4.564348191467836,{"label":"ADVANTAGE;;LAPTOP SECURITY DESK: LAPTOP;;VERSATABLES.COM;;LSD3630BB;;2011-08-16;;VERSA PRODUCTS;;394.7400;;EA;;96;;37895.0400","color":"black"}],["2013-07-31",103.5,0.6931471805599453,{"label":"ADVANTAGE;;ROLLING LAPTOP CASE LAPTOP RO;;CASE LOGIC;;ZLR116BLACK;;2013-07-31;;A & T MARKETING INC.;;103.5000;;EA;;2;;207.0000","color":"black"}],["2013-08-29",97.84,0.6931471805599453,{"label":"ADVANTAGE;;ROLLING LAPTOP CASE LAPTOP RO;;CASE LOGIC;;ZLR116BLACK;;2013-08-29;;IAMNER, INC;;97.8400;;EA;;2;;195.6800","color":"black"}],["2013-08-14",97.84,1.3862943611198906,{"label":"ADVANTAGE;;ROLLING LAPTOP CASE LAPTOP RO;;CASE LOGIC;;ZLR116BLACK;;2013-08-14;;IAMNER, INC;;97.8400;;EA;;4;;391.3600","color":"black"}],["2012-02-09",56.1,0.1,{"label":"ADVANTAGE;;LAPTOP COOLING LOUNGE LAPTOP;;BELKIN;;F5L028;;2012-02-09;;MTEK, INC.;;56.1000;;EA;;1;;56.1000","color":"black"}],["2011-01-03",449.82,0.1,{"label":"ADVANTAGE;;LAPTOP SECURITY DESK: LAPTOP;;VERSATABLES.COM;;LSD3630BC;;2011-01-03;;VERSA PRODUCTS;;449.8200;;EA;;1;;449.8200","color":"black"}],["2012-09-27",40.16,0.1,{"label":"ADVANTAGE;;LAPTOP RISER LAPTOP RISER;;FELLOWES;;8032001;;2012-09-27;;MTEK, INC.;;40.1600;;EA;;1;;40.1600","color":"black"}],["2011-12-01",39.49,1.3862943611198906,{"label":"ADVANTAGE;;LAPTOP BAG FOR LAPTOP COMPUTE;;EIGENLABS;;02CAS0002XXA;;2011-12-01;;B & H FOTO & ELECTRONICS CORP.;;39.4900;;EA;;4;;157.9600","color":"black"}],["2012-06-05",35.68,0.1,{"label":"ADVANTAGE;;14 LAPTOP SLEEVE 14 LAPTOP;;CASE LOGIC;;PLS14BLACK;;2012-06-05;;MTEK, INC.;;35.6800;;EA;;1;;35.6800","color":"black"}],["2011-08-19",35.68,1.3862943611198906,{"label":"ADVANTAGE;;14 LAPTOP SLEEVE 14 LAPTOP;;CASE LOGIC;;PLS14BLACK;;2011-08-19;;MTEK, INC.;;35.6800;;EA;;4;;142.7200","color":"black"}],["2012-05-18",30.36,0.1,{"label":"ADVANTAGE;;12 LAPTOP SLEEVE 12 LAPTOP;;CASE LOGIC;;LNEO12BLACK;;2012-05-18;;BUSINESS EXPRESS INC;;30.3600;;EA;;1;;30.3600","color":"black"}],["2011-04-04",24.65,0.1,{"label":"OS2;;STAND,LAPTOP,MESH,BK STAND,LAPTOP,MESH,BK;;safco products company;;saf2161bl;;2011-04-04;;NEW YORK INKJET, LLC;;24.6500;;EA;;1;;24.6500","color":"aqua"}],["2012-02-08",22.17,0.6931471805599453,{"label":"ADVANTAGE;;16 LAPTOP SLEEVE 16 LAPTOP;;CASE LOGIC;;VLS116BLACK;;2012-02-08;;MTEK, INC.;;22.1700;;EA;;2;;44.3400","color":"black"}],["2011-07-25",22.17,1.3862943611198906,{"label":"ADVANTAGE;;16 LAPTOP SLEEVE 16 LAPTOP;;CASE LOGIC;;VLS116BLACK;;2011-07-25;;MTEK, INC.;;22.1700;;EA;;4;;88.6800","color":"black"}],["2011-05-17",22.17,1.791759469228055,{"label":"ADVANTAGE;;14 LAPTOP SLEEVE 14 LAPTOP;;CASE LOGIC;;VLS114BLACK;;2011-05-17;;MTEK, INC.;;22.1700;;EA;;6;;133.0200","color":"black"}]]]
    plot1 = $.jqplot('chartdiv', [plotData[0]], {
        title: 'Bubble Graph',
        axes: {
            xaxis: {
                renderer: $.jqplot.DateAxisRenderer,
                label: '<span style="font-size=11pt"> Order Date </span> <br> <br><span color: black;>Color denotes Data Source.</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span>Bubble size denotes number of units.</span>'
            },
            yaxis:{
    			label: 'Price Paid',
    			tickOptions:{
    			    formatString:'$%.2f'
    			}
            }
    		
        },
        seriesDefaults: {
            renderer: $.jqplot.BubbleRenderer,
            rendererOptions: {
                bubbleAlpha: 0.6,
                highlightAlpha: 0.8,
                showLabels:false,
                /*autoscalePointsFactor: 0,*/
                autoscalePointsFactor: -0.25,
                autoscaleMultiplier: 1,
                autoscaleBubbles: true
            },
            shadow: true,
            shadowAlpha: 0.05
        },
        highlighter: {
            show: true,
            sizeAdjust: 7.5,
	    tooltipLocation:'se',
            tooltipContentEditor:tooltipContentEditor
	},
        
    });
    
    
    
    $('#legend1b').empty()

    $('#legend1b').append('<table><tr><th align="center" id="h">Data Source</th><th align="center" id="e">Color</th></tr>');
    finalresult.forEach(function(entry){
		$('#legend1b').append('<tr><td id="h1" headers="h">'+entry.label+'</td><td id="e1" headers="e" bgcolor = ' + entry.color + ' width="100px"></td></tr></table>');
	})
    // Legend is a simple table in the html.
    // Now populate it with the labels from each data value.
    //$.each(finalresult, function(index, val) {
       // $('#legend1b').append('<tr><td>'+finalresult[index]+'</td><td>'+val+'</td></tr>');
    //});
     
    // Now bind function to the highlight event to show the tooltip
    // and highlight the row in the legend. 
    
    //$('#chartdiv').bind('jqplotDataHighlight', 
    //    function (ev, seriesIndex, pointIndex, data, radius) {    
    //        var chart_left = $('#chartdiv').offset().left,
    //            chart_top = $('#chartdiv').offset().top,
    //            x = plot1.axes.xaxis.u2p(data[0]),  // convert x axis unita to pixels on grid
    //            y = plot1.axes.yaxis.u2p(data[1]);  // convert y axis units to pixels on grid
    //        var color = 'rgb(50%,50%,100%)';
    //        $('#tooltip1b').css({left:chart_left+x+radius+5, top:chart_top+y});
    //        $('#tooltip1b').html('<span style="font-size:14px;font-weight:bold;color:'+color+';">' + 
    //        data[3] + '</span><br />' + 'x: '+data[0] + '<br />' + 'y: ' + 
    //        data[1] + '<br />' + 'r: ' + data[2]);
    //        $('#tooltip1b').show();
    //        $('#legend1b tr').css('background-color', '#ffffff');
    //        $('#legend1b tr').eq(pointIndex).css('background-color', color);
    //    });
     
    // Bind a function to the unhighlight event to clean up after highlighting.
    //$('#chartdiv').bind('jqplotDataUnhighlight', 
    //    function (ev, seriesIndex, pointIndex, data) {
    //        $('#tooltip1b').empty();
    //        $('#tooltip1b').hide();
    //        $('#legend1b tr').css('background-color', '#ffffff');
    //    });


        }
    
}
