package sprintcuatro;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;


public class Contenedor {
	
	Scanner leer = new Scanner(System.in);

	 List<IAsesoria> usuarios;
	 List<Capacitacion> curso; 
	
	
	
	// constructor
    public Contenedor() {
        usuarios = new ArrayList<>();
        curso = new ArrayList<>();
    }

    // agrega usuarios
    public void agregarUsuario(IAsesoria usuario) {
        usuarios.add(usuario);
    }

     // agerga capacitacion  
    public void agregarCapacitacion(Capacitacion capacitacion){
    	curso.add(capacitacion);    	
    }  
    
    
    // lista totodos los usuarios pero solo con los campos de la clase usuario
    public void listaUsuarios() {
    	
    	if (usuarios.isEmpty() ) {
	        System.out.println("\n\t-- No existen usuarios registrados. ");
	        return;
	    }    	    	
        for (IAsesoria usuario : usuarios) {
        	
            usuario.listarUsuario();
            System.out.println();
        }
    }
    
    // Lista las capacitaciones
    public void listaCapacitacion() {
    	if(curso.isEmpty()) {
    		System.out.println("\n\t-- No existen capacitaciones");
    	}else {
    		for (Capacitacion capacitacion : curso) {
                System.out.println(capacitacion.toString());
                System.out.println();
            }
    	}
    	
        
    }
    
    // lista capacitaciones mas datos del usuario
    public void listaCapacitacionUsuario() {
    	
    	 if (usuarios.isEmpty()) {
    	        System.out.println("\n\t-- No existen clientes registrados.");
    	        return;
    	    }
    	
    	
        for (Capacitacion capacitacion : curso) {
            System.out.println("Capacitación:");
            System.out.println(capacitacion.toString());

            int rutCapacitacion = capacitacion.getRutCliente();

            for (IAsesoria usuario : usuarios) {
                if (usuario instanceof Usuario && ((Usuario) usuario).getRun() == rutCapacitacion) {
                    System.out.println("Cliente asociado:");
                    usuario.analizarUsuario();
                    break;
                }
            }

            System.out.println();
        }
    }
    
    // lista todos los usuarios
    
    public void analizarUsuarios() {
        for (IAsesoria usuario : usuarios) {
            usuario.analizarUsuario();
            System.out.println();
        }
    }
	
       
    // lista solo usuarios cliente	   
    
    public void listarClientes() {   	    	
    	
    	boolean existenClientes = false;

        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Cliente) {
                existenClientes = true;
                break;
            }
        }
        if (!existenClientes) {
        	System.out.println("--------------------------------------.");
            System.out.println("\n\\-- No existen clientes registrados.");
            return;
        }
    	    	
        System.out.println("Listado de Clientes:");
        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Cliente) {
            	System.out.println(usuario.toString());
            	System.out.println();                
                System.out.println("-----------------------------------------");
            }
        }
    }
    
    
// lista solo usuarios profecional	   
    
    public void listarProfecional() {
    	
    	boolean existenProfecional = false;

        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Profecional) {
                existenProfecional = true;
                break;
            }
        }
        if (!existenProfecional) {
        	System.out.println("-----------------------------------------.");
            System.out.println("\n\t-- No existen profecional registrados.");
            return;
        }
    	
    	
    	
    	
        System.out.println("Listado de Profecionales:");
        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Profecional) {
            	System.out.println(usuario.toString());
            	System.out.println();                
                System.out.println("-----------------------------------------");
            }
        }
    }
    
    
// lista solo usuarios administrativo	   
    
    public void listarAdministrativo() {
    	
    	boolean existenAdministrativos = false;

        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Administrativo) {
            	existenAdministrativos = true;
                break;
            }
        }
        if (!existenAdministrativos) {
        	System.out.println("---------------------------------------------.");
            System.out.println("\n\t-- No existen administrativos registrados.");
            return;
        }
    	
    	
    	
    	
    	
        System.out.println("Listado de Administrativos:");
        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Administrativo) {
            	System.out.println(usuario.toString());
            	System.out.println();                
                System.out.println("-----------------------------------------");
            }
        }
    }
     
    public boolean rutExisteCliente(int rutCliente) {
        for (IAsesoria usuario : usuarios) {
            if (usuario instanceof Cliente && ((Cliente) usuario).getRun() == rutCliente) {
                return true; // El rut del cliente existe en la lista de usuarios
            }
        }
        return false; // El rut del cliente no existe en la lista de usuarios
    }
    
    
    
    // elimina un usuario por el rut
    
    
    public void eliminarUsuarioPorRut() {
    	int run;
    	if (usuarios.isEmpty() ) {
	        System.out.println("\n\t-- No existen usuarios registrados. ");
	        return;
	    }
    	
    	System.out.print("Ingrese el rut del usuario que desee eleminar, sin punto ni guion: ");
		run = Integer.parseInt(leer.nextLine());
		if(run<99999999 && Validar.validarRut(run)) {
    	
    	
        Iterator<IAsesoria> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            IAsesoria usuario = iterator.next();
            if (((Usuario) usuario).getRun() ==(run)) {
                iterator.remove();
                System.out.println("Usuario con rut " + run + " eliminado correctamente.");
                return; // Salir del método después de eliminar el usuario
            }
        }
        System.out.println("\n\t-- No se encontró un usuario con el rut " + run + ".");
       
    }		
    	
    }     
    
}



