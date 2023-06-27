/**

 * Constructor de la clase Cliente que recibe todos los atributos como parámetros.
 *
 * @param rut          RUT del cliente.
 * @param nombres      Nombres del cliente.
 * @param apellidos    Apellidos del cliente.
 * @param telefono     Teléfono del cliente.
 * @param afp          AFP del cliente.
 * @param sistemaSalud Sistema de salud del cliente (1 para Fonasa, 2 para Isapre).
 * @param direccion    Dirección del cliente.
 * @param comuna       Comuna del cliente.
 * @param edad         Edad del cliente.
 */
 



package sprintcuatro;

import java.util.InputMismatchException;

public class Cliente extends Usuario {
	
	
	private String apellidos;
	private String telefono;
	private String afp;
	private String sistemaSalud; 
	private String direccion;
	private String comuna;
	private int edad;
	
	
	
			
	public Cliente() {
		
		
	}



	public Cliente(String nombre, String fechaNacimiento, int run,String apellidos, String telefono, String afp, 
			String sistemaSalud, String direccion, String comuna,int edad) {
		super(nombre, fechaNacimiento, run);
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}




	
	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getAfp() {
		return afp;
	}


	public void setAfp(String afp) {
		this.afp = afp;
	}


	public String getSistemaSalud() {
		return sistemaSalud;
				
		
	}


	public void setSistemaSalud(String sistemaSalud) {
		
		if (sistemaSalud.equals ("1")) {
			this.sistemaSalud = "Fonasa";	
		}else {
			this.sistemaSalud = "Isapre";
		
		}	
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
     * Devuelve una representación en forma de cadena de la instancia de Cliente.
     *
     * @return Cadena que representa al cliente.
     */
	
	public String obtenerNombre() {
		return "El nombre competo es :" + nombre +" "+ apellidos;
	}
	
	/**
	 * Devuelve una representación en forma de cadena de la instancia de Cliente.
	 *
	 * @return Cadena que representa al cliente.
	 */
	
	@Override
	public String toString() {
		return "Cliente Nombre= " + nombre + ", Fecha Nacimiento= " + fechaNacimiento + ", Run= " + run + ", Apellidos= "
				+ apellidos + ", Telefono= " + telefono + ", Afp= " + afp + ", Sistema Salud= " + sistemaSalud
				+ ", Direccion= " + direccion + ", Comuna= " + comuna + ", Edad= " + edad ;
	}
	/**
	 * Imprime los detalles del usuario en la consola.
	 */
	
		@Override
	public void analizarUsuario() {
		System.out.println("Cliente Nombre= " + nombre + ", Fecha Nacimiento= " + fechaNacimiento + ", Run= " + run 
				+ ", Apellidos= "+ apellidos + ", Telefono= " + telefono + ", Afp= " + afp + ", Sistema Salud= " + sistemaSalud
				+ ", Direccion= " + direccion + ", Comuna= " + comuna + ", Edad= " + edad ); 				
	}
		/**
		 * Imprime los detalles del usuario en la consola para listarlos.
		 */
		@Override
		public void listarUsuario() {
			System.out.println("Nombre: " + nombre + "Rut: "+ run + " Fecha de Nacimiento: " + fechaNacimiento);
			System.out.println("---------------------------------------------------------");
			
			
		}
		
		/**
		 * Ingresa los datos del cliente y los agrega al contenedor de usuarios.
		 *
		 * @param listado el contenedor de usuarios.
		 */
		public void ingresadDatos(Contenedor listado) {
			super.ingresarDatos();
			
			      	

			while (true) {
				System.out.print("Ingrese el apellido del cliente, entre 5 y 30 caracteres : ");
				apellidos = leer.nextLine();	                    
				if (!apellidos.isEmpty() && Validar.validarNomApe(nombre)) {
					apellidos = apellidos.substring(0,1).toUpperCase()+apellidos.substring(1).toLowerCase();;
					break;
				} else {
					System.out.println("\n\t-- El apellido no cumple con las condiciones establecidas.");
				}
			}     	

			

			int opcionTelefono=0;
			while (true) {

				try {

					System.out.print("Ingrese el teléfono del cliente, indique si es celular(1) o fijo(2) : ");

					opcionTelefono = Integer.parseInt(leer.nextLine());

					if(opcionTelefono == 1) {
						System.out.println("Ingrese el numero de celular, recuede que son 9 digitos:");
						telefono = leer.nextLine();
						if (!telefono.isEmpty() && Validar.validarTelefono(telefono)) {
							telefono = "el numero de celular es +56" + telefono;
							break;
						}else {
							System.out.println("\n\t-- Debe de ingesar datos");
						}
					}else {
						if(opcionTelefono == 2) {
							System.out.println("Ingrese el numero de telefono fijo, recuede que son 9 digitos:");
							telefono = leer.nextLine();
							if (!telefono.isEmpty() && Validar.validarTelefono(telefono)) {
								telefono = "\n\t--el numero telefono fijo es +56" + telefono;
								break;
							}else {
								System.out.println("\n\t Debe de ingesar datos");
							}
						}
							
						
					}	                		

				}catch(InputMismatchException | NumberFormatException e2){
					System.out.println("\n\t--Debes seleccionar un numero de opcion");
					leer.nextLine();
				}

			}	

			
			while (true) {
				System.out.print("Ingrese la AFP del cliente, entre 4 y 30 caracteres: ");
				afp = leer.nextLine();
				if(!afp.isEmpty() && Validar.validarAfp(afp)) {
					break;
				}else {
					System.out.println("\n\t-- Debe de ingresar datos correctos");
				}          	
			}

			String sistemaSalud;
			while (true) {
				System.out.println("Ingrese el sistema de salud del cliente, (1) Fonasa y (2) Isapre:");
				sistemaSalud = leer.nextLine();
				if(!sistemaSalud.isEmpty() && Validar.validarsistemaSalud(sistemaSalud)) {

					break;
				}else {
					System.out.println("\n\t-- Debe de ingresar dato valido");
				} 
			}
		

			while (true) {
				System.out.print("Ingrese la dirección del cliente, maximo 70 caracteres: ");
				direccion = leer.nextLine();
				if(Validar.validarDireccion(direccion)) {
					break;
				}else {
					System.out.println("\n\t-- La direccion debe estar entre 1 y 70 caracteres");
				}


			}         
			
			while (true) {
				System.out.print("Ingrese la comuna del cliente, debe de tener maximo 50 caracteres: ");
				comuna = leer.nextLine();
				if(Validar.validarComuna(comuna)) {
					break;
				}else {
					System.out.println("\n\t-- La comuna debe estar entre 1 y 50 caracteres");
				}


			}      			

			while (true) {
			    System.out.print("Ingrese la edad del cliente: ");
			    try {
			        edad = Integer.parseInt(leer.nextLine());
			        if (Validar.validarEdad(edad)) {
			            break;
			        } else {
			            System.out.println("\n\t-- La edad debe estar entre 0 y 150 años.");
			        }
			    } catch (NumberFormatException e) {
			        System.out.println("\n\t-- Debe ingresar un valor numérico para la edad.");
			    }
			}

			setApellidos(apellidos);
			setTelefono(telefono);
			setAfp(afp);
			setSistemaSalud(sistemaSalud);
			setDireccion(direccion);
			setComuna(comuna);
			setEdad(edad);
			
			listado.agregarUsuario(this);
		    System.out.println("\n\t-- Cliente agregado correctamente.");
			
			
		}	
		
}
	
	

	
	
	
	

