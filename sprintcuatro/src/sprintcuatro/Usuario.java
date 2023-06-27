

/**
 * Clase que representa a un usuario.
 * Implementa interfaz IAsesoria
 * Recive como parametro listado del main 
 */


package sprintcuatro;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;




public  class Usuario implements IAsesoria{

	Scanner leer =new Scanner(System.in);

	Contenedor listado;
	protected String nombre;
	protected String fechaNacimiento;
	protected int run;

	public Usuario(Contenedor listado) {
		this.listado = listado;
	}

	/**
     * Constructor vacío de la clase Usuario.
     */
	public Usuario() {
	}

	 /**
     * Constructor de la clase Usuario.
     *
     * @param nombre           el nombre del usuario.
     * @param fechaNacimiento  la fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     * @param run              el RUN del usuario.
     */
	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	// Métodos getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {

		return fechaNacimiento;

	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	/**
     * Devuelve una representación en forma de cadena del usuario.
     *
     * @return una cadena que representa al usuario.
     */
	
	
	@Override
	public String toString() {
		return "Usuario nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run  ;
	}

	
	 /**
     * Imprime los detalles del usuario en la consola.
     */
	
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre usuario= "+ this.nombre);  	
	}
	/**
     * Imprime los detalles del usuario en la consola para listarlos.
     */

	public void listarUsuario() {
		System.out.println("Nombre usuario= "+ this.nombre);
	}

	/**
     * Calcula la edad del usuario basándose en su fecha de nacimiento.
     *
     * @param fecha la fecha de nacimiento del usuario en formato "dd/MM/yyyy".
     * @return una cadena con los años transcurridos desde la fecha de nacimiento.
     */
	public static String  mostrarEdad(String fecha) {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);
	    LocalDate fechaActual = LocalDate.now();

	    long edad = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
	    return "Años transcurridos: " +edad;
	    
	}
	/**
     * Solicita al usuario que ingrese los datos y los agrega al contenedor de usuarios.
     */
	
	public void ingresarDatos() {

		while (true) {
			System.out.print("Ingrese el nombre, debe de tener entre 10 y 50 caracteres : ");
			nombre = leer.nextLine();	                    
			if (!nombre.isEmpty() && nombre.length() >= 10 && nombre.length() <= 50) {
				nombre = nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase();;
				break;
			} else {
				System.out.println("\n\t-- El nombre no cumple con las condiciones establecidas.");
			}
		}     


		while (true) {
			System.out.print("Ingrese la fecha de nacimiento en formato (dd/mm/aaaa): ");
			fechaNacimiento = leer.nextLine();
			if (!fechaNacimiento.isEmpty() &&Validar.validarFecha(fechaNacimiento)) {

				break;
			} else {
				System.out.println("\n\t-- Fecha inválida. Por favor, inténtelo nuevamente.");
			}
		}     

		while (true) {
			try {


				System.out.print("Ingrese el RUN : ");
				run = Integer.parseInt(leer.nextLine());
				if(run <= 99999999  && Validar.validarRut(run)) {
					break;
				} else {
					System.out.println("Ingrese un rut valido");
				}
			}catch(InputMismatchException | NumberFormatException e1){
				System.out.println("\n\t-- Debes ingresar un rut valido");

			}	

		}	

		Usuario usuario = new Usuario();

		usuario.setNombre(nombre);
		usuario.setFechaNacimiento(fechaNacimiento);
		usuario.setRun(run);

		listado.agregarUsuario(usuario);
	}

}


	
	



