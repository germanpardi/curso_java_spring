/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FileReader {
    
    public ArrayList<String[]> readFile(String file){
        
        File fichAlt = new File(file);
        Scanner sc=null;
        String[] words;
        ArrayList<String[]> clientList = new ArrayList<String[]>();
        try{
            
            sc = new Scanner(fichAlt);
            while(sc.hasNextLine()){
                String linea = sc.nextLine();
                
                words = linea.split(",");
                if(words.length == 5|| words.length==4){
                    clientList.add(words);
                }   
            }  
        }catch(Exception e){
            System.err.println("Error: "+e.toString());
        }finally {
            try {
                if (sc != null) 
                    sc.close();
                
            } catch (Exception ex2) {
                System.err.println("Mensaje al cerrar: " + ex2.getMessage());
            }
        
         }
        return clientList;
        
    }
    
}
