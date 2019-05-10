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

    public ClienteInvitado(String id_usuario, String email, int edad, String telefono, String genero, int duracionMax) {
        super(id_usuario, email, edad, telefono, genero);
        this.duracionMax= duracionMax;
    }
    
    private int duracionMax;

    public int getDuracionMax() {
        return duracionMax;
    }

    public void setDuracionMax(int duracionMax) {
        this.duracionMax = duracionMax;
    }
    
    @Override
    public void mostrar(){
        System.out.print("INVITADO ");
        super.mostrar();
        System.out.println("Max Duración: " + this.duracionMax + "\n");
        //System.out.println("Cliente "+ id_usuario); Habris que cambiar estas propiedades a protected, asì al esta clase ser hija, puede acceder.
        //System.out.println("Email: "+ this.email);
        //System.out.println("Edad: "+ this.getEdad());
    }
    
    
}
