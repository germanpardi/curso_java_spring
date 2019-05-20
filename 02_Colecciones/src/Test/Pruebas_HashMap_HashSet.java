/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import beans.Cliente;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


/**
 *
 * @author Admin
 */
public class Pruebas_HashMap_HashSet {
    public static HashMap<String,Cliente> ejemploHashMap(){
        HashMap<String,Cliente> diccClientes = new HashMap<String,Cliente>();
        
        Cliente c1 = new Cliente("germanpardi","g@gmail.com",24,"682625434","M");
        Cliente c2 = new Cliente("ELPROFE","profe@g.com",34,"628998624","M" );
        Cliente c3 = new Cliente("Lola","lola@g.com",22,"628456674","F");
        
        diccClientes.put("primero", c1);
        diccClientes.put("segundo", c2);
        diccClientes.put("tercero", c3);
        
        return diccClientes;
    
    }
    public static HashSet<Cliente> ejemploSet(){
        HashSet<Cliente> setclientes = new HashSet<Cliente>();
        
        Cliente c1 = new Cliente("germanpardi","g@gmail.com",24,"682625434","M");
        Cliente c2 = new Cliente("ELPROFE","profe@g.com",34,"628998624","M" );
        Cliente c3 = new Cliente("Lola","lola@g.com",22,"628456674","F");
        
        setclientes.add(c1);
        setclientes.add(c2);
        setclientes.add(c3);
        
        return setclientes;
        
    }
    public static void main(String[] args) {
        HashMap<String,Cliente> diccClientes = ejemploHashMap();
        HashSet<Cliente> setclientes = ejemploSet();
        
        
        for(HashMap.Entry<String, Cliente> entry : diccClientes.entrySet()) {
                System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
           }
        Iterator<Cliente> iter = setclientes.iterator();
        while(iter.hasNext()){
            Cliente aux = iter.next();
            aux.mostrar();
        }
    }
}
