/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import Interfaces.ICarnivoro;

/**
 *
 * @author Admin
 */
public class Tucan extends Animal implements ICarnivoro {

    @Override
    public void mover() {
        System.out.println(nombre+ " se mueve");
       
    }

    public Tucan(String nombre, double size) {
        super(2, true, false, nombre, size);
        this.setWings(true);
    }

    @Override
    public void volar() {
        if(!haveWings())System.err.println("Este animal no puede volar");
        else System.out.println(nombre+" vuela pero no es nada intimidante.");
    }

    @Override
    public void comer() {
        System.out.println(nombre+ " come semillas");
    }

    @Override
    public String comerCarne(ICarnivoro ic) {
        if(ic instanceof Gato){
            Gato cat = (Gato)ic;
            return "el pajaro se come a "+ cat.getNombre();
        }
        return null;
    }

    @Override
    public String nombrar() {
        return this.nombre;
    }
    
}
