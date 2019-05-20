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
public abstract class AnimalSalvaje extends Animal{
    
    private boolean wild;

    public AnimalSalvaje(int patas, boolean aerobico, boolean acuatico, String nombre, double size) {
        super(patas, aerobico, acuatico, nombre, size);
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }
    
    
    
}
