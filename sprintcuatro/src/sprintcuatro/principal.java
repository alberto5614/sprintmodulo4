/**
 *@author Integrantes: Enmanuel Perez, Hervin Pradines, Marcos Barcia,Rodrigo Millán
 *Clase principal que contiene el método main para ejecutar el programa
 * 
 * 
 */

package sprintcuatro;



import java.util.InputMismatchException;

import java.util.Scanner;


public class principal {

	String nombre1;

	/**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args los argumentos de línea de comandos.
     */
	public static void main(String[] args) {

		Contenedor listado = new Contenedor();		

		Scanner leer = new Scanner(System.in);

		boolean salir = false;

		int opcion;		

		System.out.println("Bienvenido al sistema de registro e informacion de aseguradora HERM");

		while(!salir){

			System.out.println("\n\t-- Menu opcioness --");
			System.out.println("---------------------------------");
			System.out.println("|  1.- Almacenar cliente        |");
			System.out.println("|  2.- Almacenar profecional    |");
			System.out.println("|  3.- Almacenar administarivo  |");
			System.out.println("|  4.- Almacenar capacitacion   |");
			System.out.println("|  5.- Eliminar usuario         |");
			System.out.println("|  6.- Listar usuarios          |");
			System.out.println("|  7.- Listar usuarios por tipo |");
			System.out.println("|  8.- Lista capacitacion       |");
			System.out.println("|  9.- Salir                    |");
			System.out.println("---------------------------------");
			
			try{

				System.out.println("Seleccione la opcion deseada: ");
				opcion = Integer.parseInt(leer.nextLine());

				switch (opcion){
				
				case 1:
					Cliente cliente = new Cliente();
					cliente.ingresadDatos(listado);
					break;
				case 2:
					Profecional profecional = new Profecional();
					profecional.ingresarDatos(listado);
					break;
				case 3:
					Administrativo administrativo = new Administrativo();
					administrativo.ingresarDatos(listado);					
					break;				
				case 4:
					Capacitacion capacitacion = new Capacitacion();
					capacitacion.ingresarCapacitacion(listado, leer);					
					break;
				case 5:	
					listado.eliminarUsuarioPorRut();					
					break;				
				case 6:				
					listado.listaUsuarios();										
					break;				
				case 7:		
					TipoUsuario listarportipo = new TipoUsuario();
					listarportipo.listarPorTipoUsuario(listado);					
					break;
				case 8:
					
					listado.listaCapacitacionUsuario();
					break;
				case 9:
					System.out.println("Que tenga una excelente jornada");
					salir=true;
					
					break;   
				default:   
					System.out.println("Las opciones son entre 1 y 9");

				}
			}
			
			catch(InputMismatchException | NumberFormatException e){
				System.out.println("Debes seleccionar un numero de opcion");
			}

			
			System.out.println("\n\t\t---Pulse ENTER para continuar---");
			leer.nextLine();
		}
		}
		
		
} 




