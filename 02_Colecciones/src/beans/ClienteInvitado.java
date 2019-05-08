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

    public ClienteInvitado(String id_usuario, String email, int edad, String telefono, String genero) {
        super(id_usuario, email, edad, telefono, genero);
    }
    
    private int duración_max;

    public int getDuración_max() {
        return duración_max;
    }

    public void setDuración_max(int duración_max) {
        this.duración_max = duración_max;
    }
    
    
    
}
