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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
@WebServlet(name = "SV_Secretario", urlPatterns = {"/SV_Secretario"})
public class SV_Secretario extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Secretario> secres = new ArrayList<Secretario>();

        secres = ct.traerSecres();
        HttpSession misesion = request.getSession();
        misesion.setAttribute("Secres", secres);

        response.sendRedirect("verSecretarios.jsp");

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
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);

        // Convertir el String a un objeto Date
        Date fecha;
        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            secre.setFecha_Nac(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sector = request.getParameter("sector");
        secre.setDNI(dpi);
        secre.setNombre(nm);
        secre.setTel(tel);
        secre.setDireccion(dir);
        secre.setSector(sector);
        ct.crearSecre(secre);
        response.sendRedirect("altaSecretario.jsp");
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
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
@WebServlet(name = "SV_Secretario", urlPatterns = {"/SV_Secretario"})
public class SV_Secretario extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Secretario> secres = new ArrayList<Secretario>();

        secres = ct.traerSecres();
        HttpSession misesion = request.getSession();
        misesion.setAttribute("Secres", secres);

        response.sendRedirect("verSecretarios.jsp");

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
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);

        // Convertir el String a un objeto Date
        Date fecha;
        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            secre.setFecha_Nac(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sector = request.getParameter("sector");
        secre.setDNI(dpi);
        secre.setNombre(nm);
        secre.setTel(tel);
        secre.setDireccion(dir);
        secre.setSector(sector);
        ct.crearSecre(secre);
        response.sendRedirect("altaSecretario.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
