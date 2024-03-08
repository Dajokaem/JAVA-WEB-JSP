<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Logica.Control;
import Logica.Horario;
import Logica.Odontologo;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SV_AsignarHorario", urlPatterns = {"/SV_AsignarHorario"})
public class SV_AsignarHorario extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        HttpSession sesion = request.getSession();
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id);
        sesion.setAttribute("odon", odon);
        response.sendRedirect("Horario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("op");
        int id_hora=1;
        switch (op) {
            case "mat":
                 id_hora=1;
                break;
            case "med":
                id_hora=2;
                break;
            case "cie":
                id_hora=3;
                break;
            default:
                
                break;
        }

        
        int id_odon = Integer.parseInt(request.getParameter("id_odon"));
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id_odon);
        Horario hora = new Horario();
        hora = ct.traerHora(id_hora);
        odon.setHora(hora);
        ct.asignarHoraOdon(odon);
        response.sendRedirect("SV_Odontologo");
        

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
import Logica.Horario;
import Logica.Odontologo;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SV_AsignarHorario", urlPatterns = {"/SV_AsignarHorario"})
public class SV_AsignarHorario extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        HttpSession sesion = request.getSession();
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id);
        sesion.setAttribute("odon", odon);
        response.sendRedirect("Horario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("op");
        int id_hora=1;
        switch (op) {
            case "mat":
                 id_hora=1;
                break;
            case "med":
                id_hora=2;
                break;
            case "cie":
                id_hora=3;
                break;
            default:
                
                break;
        }

        
        int id_odon = Integer.parseInt(request.getParameter("id_odon"));
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id_odon);
        Horario hora = new Horario();
        hora = ct.traerHora(id_hora);
        odon.setHora(hora);
        ct.asignarHoraOdon(odon);
        response.sendRedirect("SV_Odontologo");
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
