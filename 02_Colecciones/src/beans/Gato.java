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
public class Gato extends Mascota implements ICarnivoro,IDepredador {

    public Gato(int patas, boolean aerobico, boolean acuatico, String nombre, double size) {
        super(patas, aerobico, acuatico, nombre, size);
        this.setWings(false);
        
    }

    @Override
    public void mover() {
        System.out.println(nombre+" ha estado echada por horas");
    }

    @Override
    public void volar() {
        if(!haveWings())System.err.println("Error: "+nombre+" no puede volar");
        else System.out.println(nombre+ " vuela y eso es raro");
    }

    @Override
    public void comer() {
        System.out.println("Meooowww!! "+propCliente.getId_usuario()+ " Meooowww!!");
    }

    

    @Override
    public void cazar(String presa) {
        System.out.println("meowwww " + presa );
    }

    @Override
    public String comerCarne(ICarnivoro ic) {
        return "El gato se come a "+ ic.nombrar();
    }

    @Override
    public String nombrar() {
        return this.nombre;
    }
    
}
