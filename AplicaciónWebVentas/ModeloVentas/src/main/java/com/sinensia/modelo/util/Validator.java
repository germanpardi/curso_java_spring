/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.util;

import com.sinensia.modelo.beans.Cliente;
import com.sinensia.modelo.dao.ClienteDAO;
import com.sinensia.modelo.logica.ClienteSERVICE;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Validator {
    
    public boolean validarMail(String email) {

		// Patrón para validar el email
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

		// El email a validar
		// String email = "info@programacionextrema.com";

		Matcher mather = pattern.matcher(email);

		if (mather.find() == true) {
			return true;
			// System.out.println("El email ingresado es válido.");
		} else {
			return false;
			// System.out.println("El email ingresado es inválido.");
		}
    }
    
    public boolean validarGeneral(String nombre, String email, String password, int edad){
        
        if(nombre==null || nombre.equals("")){
            return false;
        }
        if(edad<=0){
            return false;
        }
        if(password == null || password.equals("")){
            return false;
        }
        
        return true;
    }
    
    public boolean validarMailRep(String email, ClienteDAO cdao){
        
        
        for(Cliente cli : cdao.leerTodos()){
            if(email.equals(cli.getEmail())) return false;
        }
        return true;
    }
    
}
