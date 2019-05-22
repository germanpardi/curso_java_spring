/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import com.sinensia.modelo.MySQLCliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/** Los Servlets heredan de la clase HttpServlet
 *
 * @author Admin
 */
public class RegistroServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta )throws ServletException, IOException{
        
        respuesta.setContentType("text/html;charset=UTF-8");
        try(PrintWriter salida=respuesta.getWriter()){
            salida.println("<html><head>");
            salida.println("<title>Web servlet de java</title>");
            salida.println("</head><body>");
            salida.println("<h1>Respuesta al registro</h1>");
            salida.println(" Ruta del servlet: "+ peticion.getContextPath()+", método: "+peticion.getMethod());
            salida.println("<ul>");
            for(int i=0;i<3;i++){
                salida.println("<li> Num "+i+"</li>");
            }
            salida.println("</ul>");
            String nombre = peticion.getParameter("nombre");
            int edad = Integer.parseInt(peticion.getParameter("edad"));
            String email = peticion.getParameter("email");
            String sactivo = peticion.getParameter("activo");
            boolean activo = sactivo != null;
            String password = peticion.getParameter("password");
            salida.println("Nombre: "+nombre+"<br/>");
            salida.println("Edad: "+edad+"<br/>");
            salida.println("Email: "+email+"<br/>");
            salida.println("Activo: "+activo+"<br/>");
            MySQLCliente mc = new MySQLCliente();
            mc.addCliente(nombre, email, password, edad, activo);
            
            salida.println("</body></html>");
            salida.println("");
            
        }
        
    }
    
    @Override
    public String getServletInfo(){
        return "Registro Clientes";
    }
    
}
