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
public class Cliente {
    
    private String id_usuario;
    private String email;
    private int edad;
    private String telefono;
    private String genero;

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_usuario=" + id_usuario + ", email=" + email + ", edad=" + edad + ", telefono=" + telefono + ", genero=" + genero + '}';
    }

    public Cliente() {
    }

    public Cliente(String id_usuario, String email, int edad, String telefono, String genero) {
        this.id_usuario = id_usuario;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }
    
    
    
    
    
}
