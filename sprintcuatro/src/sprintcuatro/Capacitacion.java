
/**
 * Clase que representa una capacitación de la empresa de asesorías en prevención de riesgos.
 */


package sprintcuatro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Capacitacion extends Usuario {
	
	

	
			private String idcapacitacion;
			private int rutCliente;
			private String diaSemana;
			private String hora;
			private String lugar ;
			private String duracion;
			private int cantidadAsistentes;
	
			
			/**
			 * Constructor vacío de la clase Capacitacion.
			 */		
			
			public Capacitacion() {	
			}

	
	
			
			
			public Capacitacion(String idcapacitacion, int rutCliente, String diaSemana, String hora, String lugar,
					String duracion, int cantidadAsistentes) {
				super();
				this.idcapacitacion = idcapacitacion;
				this.rutCliente = rutCliente;
				this.diaSemana = diaSemana;
				this.hora = hora;
				this.lugar = lugar;
				this.duracion = duracion;
				this.cantidadAsistentes = cantidadAsistentes;
			}

		
			
			public String getIdcapacitacion() {
				return idcapacitacion;
			}

			public void setIdcapacitacion(String idcapacitacion) {
				this.idcapacitacion = idcapacitacion;
			}

			public int getRutCliente() {
				return rutCliente;
			}

			public void setRutCliente(int rutCliente) {
				this.rutCliente = rutCliente;
			}

			public String getDiaSemana() {
				return diaSemana;
			}

			public void setDiaSemana(String diaSemana) {
				this.diaSemana = diaSemana;
			}


			public String getHora() {
				return hora;
			}

			public void setHora(String hora) {
				this.hora = hora;
			}

			public String getLugar() {
				return lugar;
			}

			public void setLugar(String lugar) {
				this.lugar = lugar;
			}

			public String getDuracion() {
				return duracion;
			}

			public void setDuracion(String duracion) {
				this.duracion = duracion;
			}

			public int getCantidadAsistentes() {
				return cantidadAsistentes;
			}

			public void setCantidadAsistentes(int cantidadAsistentes) {
				this.cantidadAsistentes = cantidadAsistentes;
			}





			@Override
			public String toString() {
				return "Capacitacion [idcapacitacion=" + idcapacitacion + ", rutCliente=" + rutCliente + ", diaSemana="
						+ diaSemana + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion
						+ ", cantidadAsistentes=" + cantidadAsistentes + "]";
			}


			public  void ingresarCapacitacion (Contenedor listado, Scanner leer) {
				
				boolean existenClientes = false;
				
				for (IAsesoria usuario : listado.usuarios) {
			        if (usuario instanceof Cliente) {
			            existenClientes = true;
			            break;
			        }
			    }
			    
			    if (!existenClientes) {
			        System.out.println("\n\t-- No existen clientes registrados. No se puede ingresar la capacitación.");
			        return;
			    }
				
								
				
			 // almacenar capacitaciom

				String idCapacitacion, diaSemana, hora,lugar,duracion;
				
				int rutCliente,cantidadAsistentes;
				
				int a = listado.curso.size();
				int id = a+1;
				
				idCapacitacion = "Cap" +Integer.toString(id);

				
				//rut
				while (true) {
					try {


						System.out.print("Ingrese el rut del cliente, sin punto ni guion: ");
						rutCliente = Integer.parseInt(leer.nextLine());
						if(rutCliente <= 99999999  && Validar.validarRut(rutCliente)) {
							break;
						} else {
							System.out.println("Ingrese un rut valido");
						}
					}catch(InputMismatchException | NumberFormatException e1){
						System.out.println("\n\t-- Debes ingresar un rut valido, debe de ser menor a 99999999");
						leer.nextLine(); 
					}	

				}
				//dia de la capacitacion 

				while (true) {
					System.out.println("ingrese dia de la sema de la capacitacion debe de ser entre lunes a domingo:");
					diaSemana= leer.nextLine();
					if(!diaSemana.isEmpty() && Validar.validarDia(diaSemana)) {
						
						diaSemana = diaSemana.substring(0, 1).toUpperCase() + diaSemana.substring(1).toLowerCase();

						break;
					}else {
						System.out.println("\n\t-- Debe de ingresar un dia valido");
					}
				}

				// hora de la capacitacion

				while (true ) {
					System.out.println("Ingrese la hora de la capacitacion, debe de estar en formato HH:MM :");
					hora = leer.nextLine();
					if(!hora.isEmpty() && Validar.validarHora(hora)) {
						break;
					}else {
						System.out.println("\n\t-- Ingrese una hora en formato correcto");
					}
				}
				
				// lugar capacitacion
				
				while(true) {
					System.out.println("Ingrese el lugar de la capacitacion, debe de ser entre 10 y 50 caracteres: ");
					lugar = leer.nextLine();
					if(!lugar.isEmpty() && Validar.validarNombre(lugar)) {
						break;
					}else {
						System.out.println("\n\t-- Ingrese un lugar entre 10 y 50 caracteres");
					}
				}			
				

				while(true) {
					System.out.println("Ingrese la duracion de la capacitacion, debe de tenet maximo 70 caracteres: ");
					duracion = leer.nextLine();
					if(!lugar.isEmpty() && Validar.validarDireccion(duracion)) {
						break;
					}else {
						System.out.println("\n\t-- Ingrese una duracion entre maximo 70  caracteres");
					}

				}


				// cantidad asistentes


				while (true) {    
				    System.out.print("Ingrese la cantidad de asistentes: ");
				    String cantidad = leer.nextLine();
				    
				    if (cantidad.isEmpty()) {
				        System.out.println("\n\t-- Debe ingresar un valor.");
				    } else {
				        try {
				            cantidadAsistentes = Integer.parseInt(cantidad);
				            
				            if (cantidadAsistentes <= 10000 && Validar.validarNumeros(cantidadAsistentes)) {
				                break;
				            } else {
				                System.out.println("\n\t--Ingrese una cantidad válida menor a 1000.");
				            }
				        } catch (NumberFormatException e) {
				            System.out.println("\n\t-- Debe ingresar un número válido.");
				        }
				    }
				}

				

				setIdcapacitacion(idCapacitacion);
				setRutCliente(rutCliente);
				setDiaSemana(diaSemana);
				setHora(hora);
				setLugar(lugar);
				setDuracion(duracion);
				setCantidadAsistentes(cantidadAsistentes);


				listado.agregarCapacitacion(this);
				
				System.out.println("\n\t-- Capacitacion ingresada correctamente.--");	

				
			}
				
				
				
				
			}
			
				
		
			


	
	
	


