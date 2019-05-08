/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import beans.Cliente;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Test_02 {
    public void ejemploHashMap(){
        HashMap<String,Cliente> diccClientes = new HashMap<String,Cliente>();
        
        Cliente c1 = new Cliente("germanpardi","g@gmail.com",24,"682625434","M");
        Cliente c2 = new Cliente("ELPROFE","profe@g.com",34,"628998624","M" );
        Cliente c3 = new Cliente("Lola","lola@g.com",22,"628456674","F");
        
        diccClientes.put("primero", c1);
        diccClientes.put("segundo", c2);
        diccClientes.put("tercero", c3);
    
    }
    public static void main(String[] args) {
        HashMap<String,Cliente> diccClientes = new HashMap<String,Cliente>();
        
        Cliente c1 = new Cliente("germanpardi","g@gmail.com",24,"682625434","M");
        Cliente c2 = new Cliente("ELPROFE","profe@g.com",34,"628998624","M" );
        Cliente c3 = new Cliente("Lola","lola@g.com",22,"628456674","F");
        
        diccClientes.put("Cliente_001", c1);
        diccClientes.put("Cliente_002", c2);
        diccClientes.put("Cliente_003", c3);
        
        for(HashMap.Entry<String, Cliente> entry : diccClientes.entrySet()) {
                System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
           }
    }
}
