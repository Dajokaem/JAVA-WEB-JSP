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
@WebServlet(name = "SV_VerHorario", urlPatterns = {"/SV_VerHorario"})
public class SV_VerHorario extends HttpServlet {
Control ct = new Control();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_odon = Integer.parseInt(request.getParameter("id"));
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id_odon);
        
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("odon", odon);
        response.sendRedirect("verHorario.jsp");
        
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
@WebServlet(name = "SV_VerHorario", urlPatterns = {"/SV_VerHorario"})
public class SV_VerHorario extends HttpServlet {
Control ct = new Control();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_odon = Integer.parseInt(request.getParameter("id"));
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id_odon);
        
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("odon", odon);
        response.sendRedirect("verHorario.jsp");
        
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
