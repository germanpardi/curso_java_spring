/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sinensia.modelo.beans.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ClienteUnitTest {
    
    public ClienteUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void probarJUnit() {
         assertEquals(10,10);
         assertNotEquals("Texto","texto");
     }
     
     @Test
     public void probarClienteDAO(){
         ClienteDAO cdao = new ClienteDAO();
         cdao.poner(new Cliente(1,"prueba","email",(short)32,(short)1,"0000"));
         cdao.poner(new Cliente(2,"prueba1","email1",(short)32,(short)1,"0000"));
         assertEquals(cdao.leerTodos().size(),2);
     }
}
