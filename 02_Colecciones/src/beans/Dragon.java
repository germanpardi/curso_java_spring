/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import Interfaces.ICarnivoro;
import Interfaces.IDepredador;

/**
 *
 * @author Admin
 */
public class Dragon extends AnimalSalvaje implements IDepredador,ICarnivoro {

    public Dragon(int patas, boolean aerobico, boolean acuatico, String nombre, double size) {
        super(4, true, false, nombre, size);
        this.setWild(true);
        this.setWings(true);
    }
    
    

    @Override
    public void mover() {
        
        System.out.println(nombre + " destruye todo a su paso");
        
    }

    @Override
    public void volar() {
        if(!haveWings()) System.err.println("Error:"+ nombre+ "no puede volar");
        else System.out.println(nombre+ " vuela alto y destruye ciudades enteras");
    }

    @Override
    public void comer() {
        if(isWild()) System.err.println("Por favor controla a "+nombre+" que ya se ha comido a 30 personas");
        else System.out.println("Aunque "+nombre+" es salvaje se comporta bien y eso es raro");
    }

    @Override
    public void cazar(String presa) {
        System.out.println(nombre+" quema todo y caza a su presa "+presa);
    }

    @Override
    public String comerCarne(ICarnivoro ic) {
       return("come carne");
    }

    @Override
    public String nombrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    
    
    
}
