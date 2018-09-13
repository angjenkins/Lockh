function showArrowBox(){
	$(".arrow_box").show();	
}


function slideMenu(val)
{
	if(val==1){
		$( ".bgImgDiv" ).css( "margin-left", "-8px" );
		}else if(val==2){
		$( ".bgImgDiv" ).css( "margin-left", "105px" );
		}else if(val==3){
		$( ".bgImgDiv" ).css( "margin-left", "205px" );
		}else if(val==4){
		$( ".bgImgDiv" ).css( "margin-left", "315px" );
		}else if(val==5){
		$( ".bgImgDiv" ).css( "margin-left", "420px" );
		}else if(val==6){
		$( ".bgImgDiv" ).css( "margin-left", "510px" );
		}else if(val==7){
		$( ".bgImgDiv" ).css( "margin-left", "630px" );
		}
}
function deliveryProcedureMenu(val)
{
	if(val==1){
		$( ".bgImgDiv" ).css( "margin-left", "-18px" );
	}else if(val==2){
		$( ".bgImgDiv" ).css( "margin-left", "95px" );
	}else if(val==3){
		$( ".bgImgDiv" ).css( "margin-left", "180px" );
	}else if(val==4){
		$( ".bgImgDiv" ).css( "margin-left", "255px" );
	}else if(val==5){
		$( ".bgImgDiv" ).css( "margin-left", "330px" );
	}
	
}
function indexMenu(val)
{
	if(val==1){
		$( ".bgImgDiv" ).css( "margin-left", "-18px" );
	}else if(val==2){
		$( ".bgImgDiv" ).css( "margin-left", "128px" );
	}else if(val==3){
		$( ".bgImgDiv" ).css( "margin-left", "257px" );
	}else if(val==4){
		$( ".bgImgDiv" ).css( "margin-left", "380px" );
	}else if(val==5){
		$( ".bgImgDiv" ).css( "margin-left", "500px" );
	}else if(val==6){
		$( ".bgImgDiv" ).css( "margin-left", "610px" );
	}else if(val==7){
		$( ".bgImgDiv" ).css( "margin-left", "583px" );
	}
	
}
function orderStatusMenu(val)
{
	if(val==1){
		$( ".bgImgDiv" ).css( "margin-left", "-30px" );
	}else if(val==2){
		$( ".bgImgDiv" ).css( "margin-left", "73px" );
	}
}
function orderMenu(val)
{
	if(val==1){
		$( ".bgImgDiv" ).css( "margin-left", "-33px" );
		}else if(val==2){
		$( ".bgImgDiv" ).css( "margin-left", "70px" );
		}else if(val==3){
		$( ".bgImgDiv" ).css( "margin-left", "190px" );
		}else if(val==4){
		$( ".bgImgDiv" ).css( "margin-left", "290px" );
		}else if(val==5){
		$( ".bgImgDiv" ).css( "margin-left", "355px" );
		}else if(val==6){
		$( ".bgImgDiv" ).css( "margin-left", "420px" );
		}
}
$( document ).ready(function() {
	$(".closeImg").click(function(){
		  $( ".arrow_box" ).fadeOut("slow");
		});
	/*$('input:checkbox+label').click(function() {
		  var checkbox = $('#' + $(this).attr('for'));
		  var Id=$(this).attr('for');
		 var isChecked=$("#"+Id).prop('checked');
		  //var isChecked=document.getElementById(Id).checked;
		  alert(isChecked);
		 if (isChecked == true) {
			  $(this).removeClass('checked');
			  $(this).addClass('unchecked'); 
		  } else {
			  $(this).addClass('checked');
		  }
		});
	$('input:radio+label').click(function() {
		  var radiobox = $('#' + $(this).attr('for'));
		  var radioBoxName=radiobox.attr("name");
		 // alert(radioBoxName);
		  $("input:radio[name="+radioBoxName+"]").each(function (i) {        
		        this.checked = false;
		        var eleId=$(this).attr("id");
		        $("#"+eleId).next().removeClass('radioSelected');
		        // console.log(.nextSibling());
		        //this.next().removeClass('radioSelected');
		    });
		 
			  $(this).addClass('radioSelected');
		  
		});*/
$('article').readmore({maxHeight: 100});
//$('.child').hide();
$('.parent li a').click(function(event){
   if ($(this).next('ul.leftSubMenu').children().length !== 0) {     
       event.preventDefault();
   }
$(this).siblings('.child').slideToggle('slow');
});


$( "#top" ).click(function() {
  $( ".block" ).fadeIn( "slow");
 
});

$( ".close" ).click(function(){
  $( ".block" ).fadeOut("slow");
});

});

