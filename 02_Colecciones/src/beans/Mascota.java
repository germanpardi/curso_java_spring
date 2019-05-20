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
public abstract class Mascota extends Animal {
    
    protected Cliente propCliente;

    public Cliente getPropCliente() {
        return propCliente;
    }

    public void setPropCliente(Cliente propCliente) {
        this.propCliente = propCliente;
    }

    public Mascota(int patas, boolean aerobico, boolean acuatico, String nombre, double size) {
        super(patas, aerobico, acuatico, nombre, size);
        
    }
    
    
    
}
