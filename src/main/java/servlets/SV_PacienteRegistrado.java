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
@WebServlet(name = "SV_PacienteRegistrado", urlPatterns = {"/SV_PacienteRegistrado"})
public class SV_PacienteRegistrado extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = ct.traerPaciente(Integer.parseInt(request.getParameter("idpac")));
        String afe = request.getParameter("afe");
        String HR_Turno = request.getParameter("HR_Turno");
        HttpSession sesion = request.getSession();
        Turno turn = new Turno();
        String patronFecha = "yyyy-MM-dd";
        boolean x = true, y = false;
        List<Turno> turns = new ArrayList<Turno>();
        turns = ct.traerTurnos();
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        Date fecturn;

        try {
            
            fecturn = sdf.parse(request.getParameter("fecturn"));

            if (x) {

                for (Turno ts : turns) {

                    if ((fecturn.equals(ts.getFecha_turno())) && (HR_Turno.equals(ts.getHora_turno()))) {

                        y = true;
                        break;
                    }
                }
            }

            if (y) {
                response.sendRedirect("espacioOcupado.jsp");
                return;
            } else {
                
                turn.setFecha_turno(fecturn);

            }
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        turn.setHora_turno(HR_Turno);
        turn.setAfeccion(afe);
        sesion.setAttribute("turn", turn);
        sesion.setAttribute("pac", pac);
        response.sendRedirect("altaTurnoRegistrado.jsp");
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
@WebServlet(name = "SV_PacienteRegistrado", urlPatterns = {"/SV_PacienteRegistrado"})
public class SV_PacienteRegistrado extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = ct.traerPaciente(Integer.parseInt(request.getParameter("idpac")));
        String afe = request.getParameter("afe");
        String HR_Turno = request.getParameter("HR_Turno");
        HttpSession sesion = request.getSession();
        Turno turn = new Turno();
        String patronFecha = "yyyy-MM-dd";
        boolean x = true, y = false;
        List<Turno> turns = new ArrayList<Turno>();
        turns = ct.traerTurnos();
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        Date fecturn;

        try {
            
            fecturn = sdf.parse(request.getParameter("fecturn"));

            if (x) {

                for (Turno ts : turns) {

                    if ((fecturn.equals(ts.getFecha_turno())) && (HR_Turno.equals(ts.getHora_turno()))) {

                        y = true;
                        break;
                    }
                }
            }

            if (y) {
                response.sendRedirect("espacioOcupado.jsp");
                return;
            } else {
                
                turn.setFecha_turno(fecturn);

            }
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        turn.setHora_turno(HR_Turno);
        turn.setAfeccion(afe);
        sesion.setAttribute("turn", turn);
        sesion.setAttribute("pac", pac);
        response.sendRedirect("altaTurnoRegistrado.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
