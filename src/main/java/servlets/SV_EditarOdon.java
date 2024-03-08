<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Odontologo;
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
@WebServlet(name = "SV_EditarOdon", urlPatterns = {"/SV_EditarOdon"})
public class SV_EditarOdon extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Odontologo Odon = new Odontologo();
        Odon = ct.traerOdon(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UnOdon", Odon);
        response.sendRedirect("EditarOdon.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Odontologo odon = new Odontologo();
        String dpi = request.getParameter("dpi");
        String nm = request.getParameter("nm");

        String tel = request.getParameter("tel");
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String esp = request.getParameter("esp");
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        odon = (Odontologo) request.getSession().getAttribute("UnOdon");
        // Convertir el String a un objeto Date
        Date fecha;
        odon.setDNI(dpi);
        odon.setNombre(nm);
        odon.setTel(tel);
        odon.setDireccion(dir);
        odon.setEspe(esp);

        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            odon.setFecha_Nac(fecha);

        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        ct.EditarOdon(odon);

        response.sendRedirect("SV_Odontologo");
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
@WebServlet(name = "SV_EditarOdon", urlPatterns = {"/SV_EditarOdon"})
public class SV_EditarOdon extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Odontologo Odon = new Odontologo();
        Odon = ct.traerOdon(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UnOdon", Odon);
        response.sendRedirect("EditarOdon.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Odontologo odon = new Odontologo();
        String dpi = request.getParameter("dpi");
        String nm = request.getParameter("nm");

        String tel = request.getParameter("tel");
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String esp = request.getParameter("esp");
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        odon = (Odontologo) request.getSession().getAttribute("UnOdon");
        // Convertir el String a un objeto Date
        Date fecha;
        odon.setDNI(dpi);
        odon.setNombre(nm);
        odon.setTel(tel);
        odon.setDireccion(dir);
        odon.setEspe(esp);

        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            odon.setFecha_Nac(fecha);

        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        ct.EditarOdon(odon);

        response.sendRedirect("SV_Odontologo");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
