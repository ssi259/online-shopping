$(function(){
	switch(menu)
	{
	case 'about':
		$('#about').addClass('active');
		break;

	
	case 'services' :
		$('#services').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	default :
		$('#services').addClass('active');
	
	$('#a_'+menu).addClass('active');
	break;


	}




});