package sprintcuatro;

/**
 * Clase que representa a un Administrativo.
 */

public class Administrativo extends Usuario {
	
	private String area;
	private String experienciaPrevia;
	
	/**
     * Constructor por defecto de Administrativo.
     */
	
	public Administrativo() {
		
	}
	
	/**
     * Constructor de Administrativo con parámetros.
     *
     * @param nombre             el nombre del administrativo.
     * @param fechaNacimiento    la fecha de nacimiento del administrativo.
     * @param run                el RUN del administrativo.
     * @param area               el área de trabajo del administrativo.
     * @param experienciaPrevia  la experiencia previa del administrativo.
     */
	
	public Administrativo(String nombre, String fechaNacimiento, int run, String area,  String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
		
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	@Override
	public String toString() {
		return "Administrativo Nombre= " + nombre + ", FechaNacimiento= " + fechaNacimiento + ", Run= " + run + ", Area= "
				+ area + ", Experiencia Previa= " + experienciaPrevia + "]";
	}
	
	
	
	
	@Override
	public void analizarUsuario() {
		System.out.println("Administrativo area= " + area + ", experienciaPrevia= " + experienciaPrevia + ", nombre= " + nombre
				+ ", fechaNacimiento= " + fechaNacimiento + ", run= " + run );	
		
		
	}
	
	@Override
	public void listarUsuario() {
		System.out.println("Nombre: " + nombre + "Rut: "+ run + " Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("---------------------------------------------------------");
		
		
	}
	 /**
     * Permite ingresar los datos de un administrativo.
     *
     * @param listado el contenedor de usuarios.
     */
	void ingresarDatos(Contenedor listado) {
		super.ingresarDatos();
		
		while(true) {
			System.out.println("Ingrese area de trabajo del adminitrativo, deben de ser entre 5 y 20 caracteres:");
			area = leer.nextLine();
			if(!area.isEmpty() && Validar.validarArea(area)) {
				break;

			}else {
				System.out.println("\n\t-- Debe de infesar datos validos, entre 5 y 20 caracteres");
			}


		}

		

		while (true) {
			System.out.println("Ingrese experiencia del administrativo, deben de ser menos de 100 caracteres:");
			experienciaPrevia =leer.nextLine();
			if (!experienciaPrevia.isEmpty() && Validar.validarExperiencia(experienciaPrevia)) {
				break;
			}else {
				System.out.println("\n\t-- Debe de ingresar datos validos");
			}
		}
		
		 setArea(area);
		 setExperienciaPrevia(experienciaPrevia);
		 
		 listado.agregarUsuario(this);
		 System.out.println("\n\t-- Admistrativo agregado correctamente.");	
		
	}	

}
