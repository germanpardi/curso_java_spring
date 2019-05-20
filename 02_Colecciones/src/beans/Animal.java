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
public abstract class Animal {
    
    private int patas;
    private boolean aerobico;
    private boolean acuatico;
    private boolean wings;
    String nombre;
    double size;

    public Animal(String nombre, double size) {
        this.nombre = nombre;
        this.size = size;
        this.acuatico = false; // Buena practica inicializar otros parametros también aunque no estén en el constructor.
        this.aerobico = false;
        this.patas = 0;
    }

    public Animal(int patas, boolean aerobico, boolean acuatico, String nombre, double size) {
        this.patas = patas;
        this.aerobico = aerobico;
        this.acuatico = acuatico;
        this.nombre = nombre;
        this.size = size;
    }
    
    public Animal() {
    }
    
    @Override
    public String toString() {
        return "Animal{" + "patas=" + patas + ", aerobico=" + aerobico + ", acuatico=" + acuatico + ", nombre=" + nombre + ", size=" + size + '}';
    }
    
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isAerobico() {
        return aerobico;
    }

    public void setAerobico(boolean aerobico) {
        this.aerobico = aerobico;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean haveWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }
    
    public boolean isAnfibio(){
        return aerobico&&acuatico;
    }
    
    public abstract void mover();
    
    public abstract void volar();
    
    public abstract void comer();

}
