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
import java.util.ArrayList;
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
@WebServlet(name = "SV_Turno", urlPatterns = {"/SV_Turno"})
public class SV_Turno extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idTurn = Integer.parseInt(request.getParameter("id"));
        List<Turno> turns = ct.traerTurnosPac(idTurn);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("turnos",turns);
        response.sendRedirect("verTurnos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = (Paciente) request.getSession().getAttribute("pac");
        Turno turn = (Turno) request.getSession().getAttribute("turn");
        int idOdon = Integer.parseInt(request.getParameter("Odontologo"));
        Odontologo odon = ct.traerOdon(idOdon);
        pac.agregarTurno(turn);
        ct.crearPaciente(pac);
        odon.agregarTurno(turn);
        ct.EditarOdon(odon);
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
import java.util.ArrayList;
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
@WebServlet(name = "SV_Turno", urlPatterns = {"/SV_Turno"})
public class SV_Turno extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idTurn = Integer.parseInt(request.getParameter("id"));
        List<Turno> turns = ct.traerTurnosPac(idTurn);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("turnos",turns);
        response.sendRedirect("verTurnos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = (Paciente) request.getSession().getAttribute("pac");
        Turno turn = (Turno) request.getSession().getAttribute("turn");
        int idOdon = Integer.parseInt(request.getParameter("Odontologo"));
        Odontologo odon = ct.traerOdon(idOdon);
        pac.agregarTurno(turn);
        ct.crearPaciente(pac);
        odon.agregarTurno(turn);
        ct.EditarOdon(odon);
        response.sendRedirect("altaPacientes.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
