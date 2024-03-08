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
@WebServlet(name = "SV_AsignarUsuario", urlPatterns = {"/SV_AsignarUsuario"})
public class SV_AsignarUsuario extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idusu = Integer.parseInt(request.getParameter("idusu"));
        Usuario usu = ct.traerUsuario(idusu);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuario", usu);
        response.sendRedirect("SeleccionTipo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int tipo = Integer.parseInt(request.getParameter("tipo"));
        int idusu = Integer.parseInt(request.getParameter("usur"));
        Usuario usu = ct.traerUsuario(idusu);
        switch (tipo) {
            case 1:
                int idsecre = Integer.parseInt(request.getParameter("Secretario"));
                Secretario secre = ct.traerSecre(idsecre);
                secre.setUsus(usu);
                ct.EditarSecretario(secre);

                break;
            case 2:
                int idOdon = Integer.parseInt(request.getParameter("Odontologo"));
                Odontologo odon = ct.traerOdon(idOdon);
                odon.setUsu(usu);
                ct.EditarOdon(odon);

                break;
        }
        response.sendRedirect("SV_Usuario");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

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
@WebServlet(name = "SV_AsignarUsuario", urlPatterns = {"/SV_AsignarUsuario"})
public class SV_AsignarUsuario extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idusu = Integer.parseInt(request.getParameter("idusu"));
        Usuario usu = ct.traerUsuario(idusu);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuario", usu);
        response.sendRedirect("SeleccionTipo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int tipo = Integer.parseInt(request.getParameter("tipo"));
        int idusu = Integer.parseInt(request.getParameter("usur"));
        Usuario usu = ct.traerUsuario(idusu);
        switch (tipo) {
            case 1:
                int idsecre = Integer.parseInt(request.getParameter("Secretario"));
                Secretario secre = ct.traerSecre(idsecre);
                secre.setUsus(usu);
                ct.EditarSecretario(secre);

                break;
            case 2:
                int idOdon = Integer.parseInt(request.getParameter("Odontologo"));
                Odontologo odon = ct.traerOdon(idOdon);
                odon.setUsu(usu);
                ct.EditarOdon(odon);

                break;
        }
        response.sendRedirect("SV_Usuario");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
