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
public class ClienteVIP extends Cliente {

    public ClienteVIP(long idCliente, String nombre, String email, boolean activo) {
        super(idCliente, nombre, email, activo);
    }

    private String beneficios;

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return super.toString() +  " Beneficios= " + beneficios + '}';
    }
    
    
    
    
}
