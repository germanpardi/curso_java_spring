/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MySQLCliente {
    
    public MySQLCliente(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(
            new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/bd_ventas?user=admin&password=Admin1234&useSSL=false&serverTimezone=UTC";
        }catch(SQLException e){
            System.out.println("Mensaje error: "+e.toString());
            Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "SQL Error", e);
        }catch(ClassNotFoundException e){
            Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "Class Error", e);
        }catch(Exception e){
          Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "Otro error", e);  
        }
    }
    
    public boolean addCliente (String nombre, String email, String pw, int edad, boolean activo){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ventas?user=admin&password=Admin1234&useSSL=false&serverTimezone=UTC","admin","Admin1234")) {
            
            String sqlQuery = "INSERT INTO cliente (nombre, email, password, edad, activo) "+" VALUES ( '"+nombre+"' ,'"+email+"'  , '"
                    +pw+"'," +edad+ ", "+(activo? "1":"0")+")";
            Statement sentencia =con.createStatement();
            sentencia.executeUpdate(sqlQuery);
            return true;
        }   
           catch(SQLException e){
        Logger.getLogger(MySQLCliente.class.getName()).log(Level.SEVERE, "SQL Error", e);
        return false;
            }
  
    }
}