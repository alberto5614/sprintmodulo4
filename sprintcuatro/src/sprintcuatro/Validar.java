package sprintcuatro; 


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {

	
	//Validamos el ingreso de la fecha con formato dd/mm/yyyy, ademas que no acepte el 29 en febrero ecep en año bisiesto
	//, asi como los dias con treinta dias no acepte 31

		
	public static  boolean validarFecha(String fecha) {
	    String regex = "^(0[1-9]|[1-2][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$"
	            + "|^(29)/(02)/((19|20)(0[48]|[2468][048]|[13579][26]))$"
	            + "|^(30)/(0[469]|11)/((19|20)\\d{2})$"
	            + "|^(31)/(0[13578]|1[02])/((19|20)\\d{2})$";

	    if (fecha.matches(regex)) {
	        String[] partes = fecha.split("/");
	        int dia = Integer.parseInt(partes[0]);
	        int mes = Integer.parseInt(partes[1]);
	        int anio = Integer.parseInt(partes[2]);

	        if (mes == 2 && dia == 29) {
	            // Verificar si es año bisiesto
	            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	            return esBisiesto;
	        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
	            return false;
	        } else {
	            return true;
	        }
	    } else {
	        return false;
	    }
	}
	
	

	//validamos que nombre tenga mas de 10 caracteres y mensos de 50, ademas que solo acepte letras
	public static boolean validarNombre(String nombre) {
		return nombre.matches("^[a-zA-Z ]{10,50}$");
	}


	public static boolean validarNomApe(String nom_ape) {
		return nom_ape.matches("^[a-zA-Z ]{05,30}$");
	}

	//validamos telefono
	public static boolean validarTelefono(String telefono) {
		String regex = "^\\d{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(telefono);
		return matcher.matches();
		
	}

	// validamos rut
	public static boolean validarRut(int rut ) {


		String rutString = String.valueOf(rut); // Convertir el rut a una cadena
		String regex = "^[0-9]{1,8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(rutString);

		return matcher.matches();
	}

	//validamos afp
	public static boolean validarAfp(String afp) {
		
		String regex = "^[a-zA-Z ]{4,30}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(afp);
		return matcher.matches();
		
		
	}

	public static boolean validarsistemaSalud(String salud) {
		
		String regex = "^[12]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(salud);
		return matcher.matches();
		
		
	}
	public static boolean validarDireccion(String direccion) {
		
		String regex = "^.{1,70}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(direccion);
		return matcher.matches();
	}
	
	
	
	
	public static boolean validarComuna(String comuna) {
		
		String regex = "^.{1,50}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(comuna);
		return matcher.matches();
	}
	
	
public static boolean validarEdad(int edad) {
		
	String edadString = String.valueOf(edad); // Convertir el rut a una cadena
	String regex = "^(?:0|[1-9][0-9]?|1[0-4][0-9]|150)$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(edadString);

	return matcher.matches();
	}
	
	
	public static boolean validarArea(String area) {
		
		String regex = "^[a-zA-Z0-9 ]{5,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(area);
		return matcher.matches();
		
		
	}
	
	//validamos ingreso de experiecia que se ade un maximo de 100 caracteres
	public static boolean validarExperiencia(String experiencia) {
		String regex = "^[a-zA-Z0-9 ]{1,100}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(experiencia);
		return matcher.matches();
	}
	
	//Valida que solo se ingresen dias entre lunes a domingo
	public static boolean validarDia(String dia) {
		
		String regex = "^(lunes|martes|miércoles|jueves|viernes|sábado|domingo)$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(dia);
        return matcher.matches();
	}
	
	//validamos que sea solo sea hh:mm
	public static boolean validarHora(String hora) {
		String regex = "^\\d{1,2}:\\d{2}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(hora);
		return matcher.matches();
		
	}
	
	//validamos que sean solo numeros
	public static boolean validarNumeros(int numero) {
		
		String numeroString = String.valueOf(numero);
		
		String regex = "^[0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numeroString);
		return matcher.matches();
		
		
	}
	
    
	
}
