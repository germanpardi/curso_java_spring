/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sinensia.modelo.beans.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.logica.ClienteSERVICE;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteServicioTest {
    
    public ClienteServicioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
   

    
     @Test
     public void serviceTest1() {
         
         Cliente c1 = new Cliente();
         c1.setActivo((short)1);
         c1.setEdad((short)4);
         c1.setEmail("a1@a.com");
         c1.setId(1);
         c1.setNombre("c1");
         c1.setPassword("0000");
         ClienteSERVICE cservice = new ClienteSERVICE();
         Cliente aux = new Cliente();
         cservice.addCliente(c1);
         aux.setId(1);
         aux.setActivo((short)1);
         aux.setEdad((short)22);
         aux.setEmail("a@a.com");
         aux.setNombre("nombreNUEVO");
         aux.setPassword("1234");
         cservice.modificar(aux);
    
         
         
         assertNotNull(cservice.encontrarPorEmail(aux.getEmail()));
         
     /*
     @Test
     public void serviceTest2() {
         
         Cliente c1 = new Cliente();
         c1.setActivo((short)1);
         c1.setEdad((short)4);
         c1.setEmail("cccc1");
         c1.setId(2);
         c1.setNombre("");
         ClienteSERVICE cservice = new ClienteSERVICE();
         Cliente aux = new Cliente();
         cservice.crear(c1);
         assertEquals(cservice.encontrarPorEmail(c1.getEmail()),c1);
     }
*/
    }
}