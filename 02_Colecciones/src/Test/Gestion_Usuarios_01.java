/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import beans.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author germanpardi
 */
public class Gestion_Usuarios_01 {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("germanpardi","g@gmail.com",24,"682625434","M");
        Cliente c2 = new Cliente("ELPROFE","profe@g.com",34,"628998624","M" );
        Cliente c3 = new Cliente("Lola","lola@g.com",22,"628456674","F");
        Cliente c4 = new Cliente("juana","juana@g.com",25,"622244399","F");
        
        
        List<Cliente> listaclientes = new ArrayList<Cliente>();
        listaclientes.add(c1);
        listaclientes.add(c2);
        listaclientes.add(c3);
        listaclientes.add(c4);
        
        
        
        
        boolean loop = true;
        
        while(loop){
            System.out.println("\n Seleccione:" +"\n"+ " 1 para crear" + "\n" +" 2 para listar"+ "\n" +" 3 para  modificar un usuario"+ "\n" +" 4 para eliminar un usuario"+ "\n" +" 0 para SALIR");
            Scanner sc = new Scanner(System.in);
            int opc = sc.nextInt();
            switch(opc) {
            case 1:
                System.out.println("Inserte el id del cliente: ");
                String id_nuevo = sc.next();
                
                System.out.println("Inserte el correo: ");
                String correo_nuevo = sc.next();
                
                System.out.println("Inserte edad del cliente: ");
                int edad_nueva = sc.nextInt();
                
                System.out.println("Inserte el telefono: ");
                String tlf_nuevo = sc.next();
                
                System.out.println("Inserte el genero: ");
                String gen_nuevo = sc.next();
                
                Cliente c_new = new Cliente(id_nuevo, correo_nuevo, edad_nueva, tlf_nuevo, gen_nuevo);
                listaclientes.add(c_new);
                
                

                break;
            case 2: 
                for (Cliente cliente : listaclientes) {
            
                    System.out.println(cliente.toString());
            
                }

                break;
            case 3: 
                System.out.println("Inserte el id del cliente que desea modificar: ");
                String id_mod = sc.next();
                for (Cliente cliente : listaclientes) {
            
                    if(cliente.getId_usuario().equals(id_mod)){
                        
                        System.out.println("Inserte el id del cliente: ");
                        String id_new = sc.next();
                        cliente.setId_usuario(id_new);
                        
                        System.out.println("Inserte el correo: ");
                        String correo_new = sc.next();
                        cliente.setEmail(correo_new);
                        
                        System.out.println("Inserte edad del cliente: ");
                        int edad_new = sc.nextInt();
                        cliente.setEdad(edad_new);
                        
                        System.out.println("Inserte el telefono: ");
                        String tlf_new = sc.next();
                        cliente.setTelefono(tlf_new);
                        
                        System.out.println("Inserte el genero: ");
                        String gen_new = sc.next();
                        cliente.setGenero(gen_new);
                        System.out.println("Se ha modificado el cliente");
                        break;
                    }
                    
            
                }
                System.out.println("El cliente no existe");
                break;
                     

                case 4: 
                System.out.println("Inserte el id del cliente que desea eliminar: ");
                String id_elim = sc.next();
                for (Cliente cliente : listaclientes) {
            
                    if(cliente.getId_usuario().equals(id_elim)){
                        System.out.println("Se ha eliminado el cliente: "+ cliente.getId_usuario());
                        listaclientes.remove(cliente);
                        break;       
                    }
                }
                
                System.out.println("El cliente que ha indicado no existe.");
                break;    
            case 0: 
                loop = false;

                break;

            default:
                System.out.println("El numero introducido es invalido");

                break;
            }
        } 
  
    }
  
}
