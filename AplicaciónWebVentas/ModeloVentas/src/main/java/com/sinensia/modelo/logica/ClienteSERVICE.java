/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.logica;

import com.sinensia.modelo.beans.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.util.Validator;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ClienteSERVICE {
    ClienteDAO cdao = new ClienteDAO();
    Validator val = new Validator();
    
    public void addCliente(Cliente cliente){

        
        if(val.validarGeneral(cliente.getNombre(), cliente.getEmail(), cliente.getPassword(), cliente.getEdad())&& val.validarMail(cliente.getEmail())&& val.validarMailRep(cliente.getEmail(),cdao)){
            //Suponemos que bien:
            //ClienteDAO cdao = new ClienteDAO();
            cdao.poner(cliente);
        }
    }

    
    public Cliente encontrarPorId(int id){
        //ClienteDAO cdao = new ClienteDAO();
        return cdao.leerUno(id);
    }
    
    public Cliente encontrarPorEmail(String email){
        //ClienteDAO cdao = new ClienteDAO();
        for(Cliente cliente : cdao.leerTodos()){
            if(cliente.getEmail().equals(email)) return cliente;
        }
        return null;
    }
    
    public ArrayList<Cliente> listarClientes(){
        //ClienteDAO cdao = new ClienteDAO();
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        lista = cdao.leerTodos();
        return lista;
    }
    
    public void eliminarCliente(int id){
        cdao.eliminar(id);
    }
    public void eliminarByMail(String mail){
        eliminarCliente(encontrarPorEmail(mail).getId());
    }
    public void modificar (Cliente nuevoCliente){
        
        if(val.validarGeneral(nuevoCliente.getNombre(), nuevoCliente.getEmail(), nuevoCliente.getPassword(), nuevoCliente.getEdad())&& val.validarMail(nuevoCliente.getEmail())){
            //Suponemos que bien:
            //ClienteDAO cdao = new ClienteDAO();
            cdao.modificar(nuevoCliente);
        }
  
    }
 }
