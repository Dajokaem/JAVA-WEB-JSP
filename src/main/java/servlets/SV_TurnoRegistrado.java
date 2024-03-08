<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Odontologo;
import Logica.Paciente;
import Logica.Turno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jos56
 */
@WebServlet(name = "SV_TurnoRegistrado", urlPatterns = {"/SV_TurnoRegistrado"})
public class SV_TurnoRegistrado extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = (Paciente) request.getSession().getAttribute("pac");
        Turno turn = (Turno) request.getSession().getAttribute("turn");
        int idOdon = Integer.parseInt(request.getParameter("Odontologo"));
        Odontologo odon = ct.traerOdon(idOdon);
        
        odon.agregarTurno(turn);
        
        
        pac.agregarTurno(turn);
        ct.EditarPaciente(pac);
        response.sendRedirect("altaPacientes.jsp");
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
import Logica.Turno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jos56
 */
@WebServlet(name = "SV_TurnoRegistrado", urlPatterns = {"/SV_TurnoRegistrado"})
public class SV_TurnoRegistrado extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = (Paciente) request.getSession().getAttribute("pac");
        Turno turn = (Turno) request.getSession().getAttribute("turn");
        int idOdon = Integer.parseInt(request.getParameter("Odontologo"));
        Odontologo odon = ct.traerOdon(idOdon);
        
        odon.agregarTurno(turn);
        
        
        pac.agregarTurno(turn);
        ct.EditarPaciente(pac);
        response.sendRedirect("altaPacientes.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
