/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Admin
 */
public class TortugaNinja extends Mascota{

    public TortugaNinja(int patas, boolean aerobico, boolean acuatico, String nombre, double size) {
        super(4, true, true, nombre, size);
        this.setWings(false);
    }

    @Override
    public void mover() {
        System.out.println(nombre +  " realiza salto mortal de edificio.");
    }

    @Override
    public void volar() {
        
        if(!haveWings())System.err.println(" Error: "+ nombre+ " no puede volar");
        
        else System.out.println(nombre + "vuela y eso es raro");
        
    }

    @Override
    public void comer() {
        System.out.println(nombre + " Ingiere pizzas");
    }
    
}
