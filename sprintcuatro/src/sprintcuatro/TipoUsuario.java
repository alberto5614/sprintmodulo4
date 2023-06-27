package sprintcuatro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TipoUsuario {


	
	Scanner leer = new Scanner(System.in);

	public void listarPorTipoUsuario(Contenedor listado) {
		int opcionUsuario = 0;
		boolean salirListado = false;
		
		

		while (!salirListado) {
			System.out.println("\n\t-- Listar por tipo de usuario --");
			System.out.println("------------------------------");
			System.out.println("|  1.- Listar Cliente        |");
			System.out.println("|  2.- Listar Profecional    |");
			System.out.println("|  3.- Listar Administrativo  |");
			System.out.println("|  4.- Salir                 |");
			System.out.println("------------------------------");

			try {
				System.out.println("Seleccione la opción deseada: ");
				opcionUsuario = Integer.parseInt(leer.nextLine());

				switch (opcionUsuario) {
				case 1:
					listado.listarClientes();
					break;
				case 2:
					listado.listarProfecional();
					break;
				case 3:
					listado.listarAdministrativo();
					break;
				case 4:
					salirListado = true;
					break;
				default:
					System.out.println("\n\t-- Las opciones son entre 1 y 4 ");
				}
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("\n\t-- Debes seleccionar un número de opción");
			}
		}
	}
	}
