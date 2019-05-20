/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Cliente;
import java.util.HashMap;
import util.FileHandler;

/**
 *
 * @author Admin
 */
public class TestPractica {
    
    public static void main(String[] args){

        FileHandler fh = new FileHandler();
        HashMap<Long,Cliente> toShow = fh.handleFile();
        
        for(HashMap.Entry<Long, Cliente> entry : toShow.entrySet()) {
                System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
           }
    }
    
}
