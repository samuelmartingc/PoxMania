$(document).ready(
    function(){
        $("#terminos").click(function () {
            $("#term2").toggle();
        });

         $("#term2").click(function () {
            $("#term2").toggle();
        });

	
         $("#form").submit(function () {  
        if($("#nick").val().length < 1) {  
            alert("El nick debe rellenarse");  
            return false;  
        }  
        if($("#password").val().length < 3) {  
            alert("La contraseña debe tener al menos 3 caracteres");  
            return false;  
        }  
        if($("#password_confirmation").val() != $("#password").val()) {  
            alert("Las dos contraseñas deben ser iguales");  
            return false;  
        }  
        if($("#aceptar").is(':checked')) { } else {  
            alert("Debe aceptar los terminos y condiciones para continuar"); 
            return false; 
        }  

   		 }); 
    });