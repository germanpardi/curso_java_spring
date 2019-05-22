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
public class ClienteDAOTest {
    
    private static ClienteDAO cdao; 
    
    public ClienteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cdao = new ClienteDAO();
        assertNotNull("Error inicialización DAO",cdao);
    }

    @Test
    public void creandoCliente() {
        cdao.poner(new Cliente(null,"prueba","email",(short)32,(short)1,"0000"));
        cdao.poner(new Cliente(2,"prueba1","email1",(short)39,(short)1,"0000"));
        cdao.poner(new Cliente(3,null,"email2",(short)49,(short)1,"0000"));
        cdao.poner(new Cliente(4,"prueba3","email3",(short)29,(short)4,"0000"));
    }
    
    @Test
    public void Clientemal_1(){
        
        cdao.poner(new Cliente(4,"prueba3","email3",(short)29,(short)4,"0000"));
        assertEquals("email2",cdao.leerUno(3).getEmail());
        assertEquals(4,cdao.leerTodos().size());
    }
}
