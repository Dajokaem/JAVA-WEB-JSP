<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Odontologo;
import Logica.Secretario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "SV_EditarSecre", urlPatterns = {"/SV_EditarSecre"})
public class SV_EditarSecre extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Secretario secre = new Secretario();
        secre = ct.traerSecre(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UnSecre", secre);
        response.sendRedirect("EditarSecre.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Secretario secre = new Secretario();
        String dpi = request.getParameter("dpi");
        String nm = request.getParameter("nm");

        String tel = request.getParameter("tel");
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String esp = request.getParameter("esp");
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        secre = (Secretario) request.getSession().getAttribute("UnSecre");
        // Convertir el String a un objeto Date
        Date fecha;
        secre.setDNI(dpi);
        secre.setNombre(nm);
        secre.setTel(tel);
        secre.setDireccion(dir);
        secre.setSector(esp);

        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            secre.setFecha_Nac(fecha);

        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        ct.EditarSecre(secre);

        response.sendRedirect("SV_Secretario");
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
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "SV_EditarSecre", urlPatterns = {"/SV_EditarSecre"})
public class SV_EditarSecre extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Secretario secre = new Secretario();
        secre = ct.traerSecre(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UnSecre", secre);
        response.sendRedirect("EditarSecre.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Secretario secre = new Secretario();
        String dpi = request.getParameter("dpi");
        String nm = request.getParameter("nm");

        String tel = request.getParameter("tel");
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String esp = request.getParameter("esp");
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        secre = (Secretario) request.getSession().getAttribute("UnSecre");
        // Convertir el String a un objeto Date
        Date fecha;
        secre.setDNI(dpi);
        secre.setNombre(nm);
        secre.setTel(tel);
        secre.setDireccion(dir);
        secre.setSector(esp);

        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            secre.setFecha_Nac(fecha);

        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        ct.EditarSecre(secre);

        response.sendRedirect("SV_Secretario");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
