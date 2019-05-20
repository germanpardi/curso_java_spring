/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Cliente;
import beans.ClienteInvitado;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class FileHandler {
    
    public HashMap<Long,Cliente> handleFile(){
        
      HashMap<Long,Cliente> listaFinal = new HashMap<Long,Cliente>();
      
      FileReader fr = new FileReader();
      
      ArrayList<String[]> guestList = fr.readFile("Ejercicio ficheros.txt");
      
        for (String[] guest : guestList) {
           if(guest.length==4){
               Cliente c = new Cliente(Integer.parseInt(guest[0]),guest[1],guest[2],Boolean.parseBoolean(guest[3]));
               listaFinal.put(c.getIdCliente(),c);
           }
           if(guest.length==5){
               ClienteInvitado cinv = new ClienteInvitado(Integer.parseInt(guest[0]),guest[1],guest[2],Boolean.parseBoolean(guest[3]));
               cinv.setDurMax(Integer.parseInt(guest[4]));
               listaFinal.put(cinv.getIdCliente(), cinv);
           }
            
        }
        return listaFinal;
      
      
    }
    
}
