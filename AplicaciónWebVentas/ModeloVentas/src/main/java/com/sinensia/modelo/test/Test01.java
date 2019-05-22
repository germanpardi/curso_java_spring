/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.test;

import com.sinensia.modelo.beans.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.logica.ClienteSERVICE;

/**
 *
 * @author Admin
 */
public class Test01 {
    
    public static void main(String[] args){
        // primer bloque testea el ADD
         Cliente c1 = new Cliente();
         c1.setActivo((short)1);
         c1.setEdad((short)4);
         c1.setEmail("cccc45@g.com");
         c1.setId(1);
         c1.setNombre("c1");
         c1.setPassword("0000");
         ClienteSERVICE cservice = new ClienteSERVICE();
         ClienteDAO cdao = new ClienteDAO();
         cservice.addCliente(c1);
         System.out.println("Hola mundo");
         
         //PRUEBAS MODIFICAR!! 
         Cliente aux = new Cliente();
         
         aux.setId(1);
         aux.setActivo((short)1);
         aux.setEdad((short)22);
         aux.setEmail("a@a.com");
         aux.setNombre("nombreNUEVO");
         aux.setPassword("1234");
         cservice.modificar(aux);
         
         Cliente aux2 = new Cliente();
         aux2.setId(3);
         aux2.setActivo((short)1);
         aux2.setEdad((short)22);
         aux2.setEmail("a@a2.com");
         aux2.setNombre("nombreNoDebeSalir");
         aux2.setPassword("1234");
         cservice.addCliente(aux2);
         
         for(Cliente c: cservice.listarClientes()){
             System.out.println("Cliente: " +c.toString());
         }
        
    }
    
}
