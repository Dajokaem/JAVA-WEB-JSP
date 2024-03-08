<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jos56
 */
@WebServlet(name = "SV_Login", urlPatterns = {"/SV_Login"})
public class SV_Login extends HttpServlet {
Control ct = new Control();
   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession misesion = request.getSession();
        misesion.invalidate();
        response.sendRedirect("login.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nm = request.getParameter("nombreusu");
        String contra = request.getParameter("contra");
        boolean x = false;
        x = ct.Validar(nm,contra);
        
        if(x){
            HttpSession misesion = request.getSession(true);
          
            Usuario a = ct.traerIdUsu(nm);
            misesion.setAttribute("Usuario", a);
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("loginerror.jsp");
        }
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jos56
 */
@WebServlet(name = "SV_Login", urlPatterns = {"/SV_Login"})
public class SV_Login extends HttpServlet {
Control ct = new Control();
   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession misesion = request.getSession();
        misesion.invalidate();
        response.sendRedirect("login.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nm = request.getParameter("nombreusu");
        String contra = request.getParameter("contra");
        boolean x = false;
        x = ct.Validar(nm,contra);
        
        if(x){
            HttpSession misesion = request.getSession(true);
          
            Usuario a = ct.traerIdUsu(nm);
            misesion.setAttribute("Usuario", a);
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("loginerror.jsp");
        }
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
