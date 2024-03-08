<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
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
@WebServlet(name = "SV_PacienteOdon", urlPatterns = {"/SV_PacienteOdon"})
public class SV_PacienteOdon extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Paciente> pacs = new ArrayList<Paciente>();
        pacs = ct.traerPacientes();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("pacs", pacs);
        response.sendRedirect("verPacientesOdon.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idpac = Integer.parseInt(request.getParameter("idpac"));
        int idodon = Integer.parseInt(request.getParameter("idodon"));
        List<Turno> turns = ct.traerTurnosPacOdon(idpac, idodon);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("turnos", turns);
        response.sendRedirect("verTurnos.jsp");
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
@WebServlet(name = "SV_PacienteOdon", urlPatterns = {"/SV_PacienteOdon"})
public class SV_PacienteOdon extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Paciente> pacs = new ArrayList<Paciente>();
        pacs = ct.traerPacientes();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("pacs", pacs);
        response.sendRedirect("verPacientesOdon.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idpac = Integer.parseInt(request.getParameter("idpac"));
        int idodon = Integer.parseInt(request.getParameter("idodon"));
        List<Turno> turns = ct.traerTurnosPacOdon(idpac, idodon);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("turnos", turns);
        response.sendRedirect("verTurnos.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
