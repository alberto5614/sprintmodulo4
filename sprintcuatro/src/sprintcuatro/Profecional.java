package sprintcuatro;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Profecional extends Usuario  {
	
	
	
	private String titulo;
	private String fechaIngreso;
	
	
	public Profecional() {
				
	}
	public Profecional(String nombre, String fechaNacimiento, int run,String titulo,String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;	
	}
		
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	@Override
	public String toString() {
		return "Profecional Nombre= " + nombre + ", FechaNacimiento= " + fechaNacimiento + ", Run= " + run + ", Titulo= "
				+ titulo + ", Fecha Ingreso= " + fechaIngreso + "]";
	}
	
	
	
	
	
	@Override
	public void analizarUsuario() {		
		
		System.out.println("Profecional Nombre= "+nombre+" | fechaNacimiento= " + fechaNacimiento + " | run= " + run +" | titulo= " + titulo 
				+ " |fechaIngreso= " + fechaIngreso );
		
	
	}
	
	@Override
	public void listarUsuario() {
		System.out.println("Nombre: " + nombre + "Rut: "+ run + " Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("---------------------------------------------------------");
		
		
	}
	
	 public void ingresarDatos(Contenedor listado) {
		 super.ingresarDatos();
		 

			
			while (true) {

				System.out.println("Ingrese el titulo del profecional, debe de ser entre 10 y 50 caracteres: ");
				titulo = leer.nextLine();
				if(!titulo.isEmpty() &&  titulo.length() >= 10 && titulo.length() <= 50) {
					break;
				}else {
					System.out.println("\n\t-- Debe ingresar datos validos, entre 10 y 50 caracteres");
				}


			}

			
			while (true) {
			System.out.print("Ingrese fecha de ingreso del profesional en formato dd/mm/aaaa: ");
		    fechaIngreso = leer.nextLine();
		    
		    if (!fechaIngreso.isEmpty() && Validar.validarFecha(fechaIngreso)) {
		        LocalDate nacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		        LocalDate ingreso = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		        Period edad = Period.between(nacimiento, ingreso);
		        if (edad.getYears() >= 18) {
		            break;
		        } else {
		            System.out.println("\n\t--El profecional deb de tener al menos 18 años, segun la ley del trabajo.");
		            System.out.println("\n\t--Si tiene entre 15 años y  menor de 18, dirigase a RRHH");
		        }
		    } else {
		        System.out.println("\n\t-- Debe ingresar una fecha válida.");
		    }
		}

			setTitulo(titulo);
		    setFechaIngreso(fechaIngreso);
			
		    listado.agregarUsuario(this);
		    System.out.println("\n\t-- Profesional agregado correctamente.");
		    
					
	}
	
		 
	
}
