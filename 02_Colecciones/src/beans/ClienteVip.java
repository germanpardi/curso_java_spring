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
public class ClienteVip extends Cliente {

    public ClienteVip(String id_usuario, String email, int edad, String telefono, String genero, String beneficios) {
        super(id_usuario, email, edad, telefono, genero);
        this.beneficios = beneficios;
    }

    private String beneficios;

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        
        System.out.println(this.beneficios + "\n");
    }
    
}
