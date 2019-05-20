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
    
    private long idCliente;
    private String nombre;
    private String email;
    private boolean activo;

    public Cliente() {
    }

    public Cliente(long idCliente, String nombre, String email, boolean activo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", activo=" + activo + '}';
    }

    
}
