<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Odontologo;
import Logica.Secretario;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "SV_AsignarTipo", urlPatterns = {"/SV_AsignarTipo"})
public class SV_AsignarTipo extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int tipo = Integer.parseInt(request.getParameter("tipo"));
        HttpSession sesion = request.getSession();
        Usuario usu = ct.trUnoUsuario(Integer.parseInt(request.getParameter("usuario")));
        switch (tipo) {
            case 1:
                List<Secretario> secs = ct.traerSecretarios();
                sesion.setAttribute("lista", secs);
                break;
            case 2:
                List<Odontologo> odons = ct.traerOdons();
                sesion.setAttribute("lista", odons);
                break;
        }
        sesion.setAttribute("tipo", tipo);
        sesion.setAttribute("usuario", usu);
        response.sendRedirect("SeleccionListaRegistrados.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
import Logica.Odontologo;
import Logica.Secretario;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "SV_AsignarTipo", urlPatterns = {"/SV_AsignarTipo"})
public class SV_AsignarTipo extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int tipo = Integer.parseInt(request.getParameter("tipo"));
        HttpSession sesion = request.getSession();
        Usuario usu = ct.trUnoUsuario(Integer.parseInt(request.getParameter("usuario")));
        switch (tipo) {
            case 1:
                List<Secretario> secs = ct.traerSecretarios();
                sesion.setAttribute("lista", secs);
                break;
            case 2:
                List<Odontologo> odons = ct.traerOdons();
                sesion.setAttribute("lista", odons);
                break;
        }
        sesion.setAttribute("tipo", tipo);
        sesion.setAttribute("usuario", usu);
        response.sendRedirect("SeleccionListaRegistrados.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
