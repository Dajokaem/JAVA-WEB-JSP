<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Odontologo;
import Logica.Paciente;
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
@WebServlet(name = "SV_EditarPaciente", urlPatterns = {"/SV_EditarPaciente"})
public class SV_EditarPaciente extends HttpServlet {

    Control ct = new Control();

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("id"));
        Paciente pac = new Paciente();
        pac = ct.traerPaciente(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UnPac", pac);
        response.sendRedirect("EditarPaciente.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = new Paciente();
        String dpi = request.getParameter("dpi");
        String nm = request.getParameter("nm");

        String tel = request.getParameter("tel");
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String san = request.getParameter("sangre");
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        pac = (Paciente) request.getSession().getAttribute("UnPac");
        // Convertir el String a un objeto Date
        Date fecha;
        pac.setDNI(dpi);
        pac.setNombre(nm);
        pac.setTel(tel);
        pac.setDireccion(dir);
        pac.setSangre(san);

        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            pac.setFecha_Nac(fecha);

        } catch (ParseException ex) {
            Logger.getLogger(SV_EditarPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ct.EditarPaciente(pac);

        response.sendRedirect("SV_Paciente");
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
import Logica.Paciente;
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
@WebServlet(name = "SV_EditarPaciente", urlPatterns = {"/SV_EditarPaciente"})
public class SV_EditarPaciente extends HttpServlet {

    Control ct = new Control();

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int id = Integer.parseInt(request.getParameter("id"));
        Paciente pac = new Paciente();
        pac = ct.traerPaciente(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UnPac", pac);
        response.sendRedirect("EditarPaciente.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = new Paciente();
        String dpi = request.getParameter("dpi");
        String nm = request.getParameter("nm");

        String tel = request.getParameter("tel");
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String san = request.getParameter("sangre");
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        pac = (Paciente) request.getSession().getAttribute("UnPac");
        // Convertir el String a un objeto Date
        Date fecha;
        pac.setDNI(dpi);
        pac.setNombre(nm);
        pac.setTel(tel);
        pac.setDireccion(dir);
        pac.setSangre(san);

        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            pac.setFecha_Nac(fecha);

        } catch (ParseException ex) {
            Logger.getLogger(SV_EditarPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ct.EditarPaciente(pac);

        response.sendRedirect("SV_Paciente");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
