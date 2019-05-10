/*
 * To change this license header,{ choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import beans.ClienteInvitado;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class Prueba_Fechas_yHerencia {
    
    public static void probar(){
        GregorianCalendar fecha = new GregorianCalendar();
        fecha.set(2019,7,19);
        System.out.println("Fecha: "+ fecha.getTime());
        GregorianCalendar miCumple = new GregorianCalendar();
        miCumple.set(2019, 7, 18);
        //System.out.println(miCumple.get(5));
        //System.out.println(fecha.get(5));
        //System.out.println(miCumple.get(2));
        //System.out.println(fecha.get(2));
        
        if(  (miCumple.get(2)>= fecha.get(2)) && (miCumple.get(5)>= fecha.get(5)) ){
            if((miCumple.get(2)!= fecha.get(2)) || (miCumple.get(5)!= fecha.get(5)) ){
                System.out.println("Aun no cumples  "); 
            }
        }
        if(miCumple.before(fecha)){
            System.out.println("Ya cumpliste  ");         
        }
        if((miCumple.get(2)== fecha.get(2)) && (miCumple.get(5)== fecha.get(5))  ){
            System.out.println("Feliz cumple ");
        }
    }

    public static void probandoHerencia(){
        ClienteInvitado invitado = new ClienteInvitado("juan","j@j.com",32,"3232","M",10);
        //invitado.setDuración_max(10);
        System.out.println("Cliente: " +invitado.getId_usuario()+". Duracion: "+invitado.getDuracionMax());
    }
    public static void main(String[] args) {
        probar();
       // probandoHerencia();
        
    }
      
}
