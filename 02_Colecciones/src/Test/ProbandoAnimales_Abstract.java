/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Interfaces.ICarnivoro;
import beans.Animal;
import beans.Cliente;
import beans.Dragon;
import beans.Gato;
import beans.TortugaNinja;
import beans.Tucan;

/**
 *
 * @author Admin
 */
public class ProbandoAnimales_Abstract {
    
    public static void ProbarClasesAbstractas(){
       
        Cliente german = new Cliente();
        german.setId_usuario("German");
        TortugaNinja donatello = new TortugaNinja(4, true, true, "Donatello", 150.908);
        Gato nala = new Gato(4,true,false,"Nala", 37.68);
        nala.setPropCliente(german);
        Dragon rhaegar = new Dragon(4,true,false,"Rhaegar", 2180.7);
        Tucan pajaro = new Tucan("pajaro",20.5);
        
        //nala.mover();
        //nala.volar();
       // nala.comer();
        //nala.cazar("iguana");
        
       // rhaegar.mover();
        //rhaegar.volar();
        System.out.println("¿Qué come el gato?" + nala.comerCarne(pajaro));
        System.out.println("¿Qué come el pajaro?" + pajaro.comerCarne(nala));
    }
    
    public static void main(String[] args){
        
        ProbandoAnimales_Abstract.ProbarClasesAbstractas();
    }
    
}
