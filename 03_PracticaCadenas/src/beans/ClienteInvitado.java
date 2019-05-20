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
public class ClienteInvitado extends Cliente {

    public ClienteInvitado(long idCliente, String nombre, String email, boolean activo) {
        super(idCliente, nombre, email, activo);
    }

    private int durMax;

    public int getDurMax() {
        return durMax;
    }

    public void setDurMax(int durMax) {
        this.durMax = durMax;
    }

    @Override
    public String toString() {
        return super.toString() +  " durMax= " + durMax + '}';
    }

    
    
    
}
