/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import beans.Cliente;
import beans.ClienteInvitado;
import beans.ClienteVip;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Polimorfismo {
    
    public static void polimorfeando(){
        
        ClienteInvitado invitado = new ClienteInvitado("invitado","j@j.com",32,"3232","M",10);
        
        invitado.setId_usuario("invitado #1");
        invitado.setDuracionMax(20);
        
        //invitado.mostrar();
        Cliente clienteNormal = invitado;
        //clienteNormal.mostrar();
        
        Cliente normal = new Cliente("normal","ut@j.com",35,"3256532","M");
        normal.setId_usuario("normal #1");
        //normal.mostrar();
        
        ClienteVip vip1 = new ClienteVip("vip1","vip2@j.com",35,"3256532","M","Este cliente tiene beneficios");
        vip1.setId_usuario("vip #1");
        vip1.setBeneficios("Este cliente tiene beneficios especiales.");
        ClienteInvitado invitado2 = new ClienteInvitado("invitado2","vip2@j.com",35,"3256532","M",100);
        
        invitado2.setId_usuario("invitado #2");
        invitado2.setDuracionMax(200);
        Cliente normal2 = new Cliente("normal2","ut@j.com",35,"3256532","M");
        normal2.setId_usuario("normal #1");
        //System.out.println("Nombre: "+ normal.getId_usuario());
        
        ArrayList<Cliente> listadeclientes= new ArrayList<Cliente>();
        
        listadeclientes.add(normal);
        listadeclientes.add(normal2);
        listadeclientes.add(vip1);
        listadeclientes.add(invitado);
        listadeclientes.add(invitado2);
        /*
        for (Cliente cliente : listadeclientes) {
            cliente.mostrar();
        }
        */
        HashMap<Integer,Cliente> diccionario =  new HashMap<Integer,Cliente>(); 
        for(int i=0; i< listadeclientes.size();i++){
            diccionario.put(i+1,listadeclientes.get(i));
        }
        /* For Each normal... Iterando sobre las colecciones.
        
        for(HashMap.Entry<Integer, Cliente> entry : diccionario.entrySet()) {
                if(entry.getValue() instanceof ClienteInvitado){ // AQUI entry.getValue() es el objeto Cliente del HashMap.
                    ClienteInvitado aux = (ClienteInvitado) entry.getValue();// Y aunque es de tipo ClienteInvitado tiene la forma de Cliente
                    aux.setDuracionMax(2850);                                  // Por eso debemos realizar el casteo en la línea anterior.
                }
                System.out.println("Cliente #: " + entry.getKey() + " Es: " );
                entry.getValue().mostrar();
           }
        */
        // ForEach en notación Lambda--- Las letras k y v estan reservadas para Key y Value--- o para 
        diccionario.forEach((k,v)->{
            if(v instanceof ClienteInvitado){ // AQUI entry.getValue() es el objeto Cliente del HashMap.
                    ClienteInvitado aux = (ClienteInvitado) v;// Y aunque es de tipo ClienteInvitado tiene la forma de Cliente
                    aux.setDuracionMax(2850);                                  // Por eso debemos realizar el casteo en la línea anterior.
                }
                System.out.println("Cliente #: " + k + " Es: " );
                v.mostrar();
        });
        
    }
    public static void main(String[] args){
        Polimorfismo.polimorfeando();
    
    }
    
}
