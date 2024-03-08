<<<<<<< HEAD

package servlets;

import Logica.Control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SV_EliminarUsuarios", urlPatterns = {"/SV_EliminarUsuarios"})
public class SV_EliminarUsuarios extends HttpServlet {

    Control ct = new Control();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("id"));
        ct.EliminarUsuario(i);
        response.sendRedirect("SV_Usuario");
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
=======

package servlets;

import Logica.Control;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SV_EliminarUsuarios", urlPatterns = {"/SV_EliminarUsuarios"})
public class SV_EliminarUsuarios extends HttpServlet {

    Control ct = new Control();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("id"));
        ct.EliminarUsuario(i);
        response.sendRedirect("SV_Usuario");
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
