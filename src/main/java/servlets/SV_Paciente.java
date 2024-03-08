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
@WebServlet(name = "SV_Paciente", urlPatterns = {"/SV_Paciente"})
public class SV_Paciente extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Paciente> pacs = new ArrayList<Paciente>();
        pacs = ct.traerPacientes();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("pacs",pacs);
        response.sendRedirect("verPacientes.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = new Paciente();
        Turno turn = new Turno();
        List<Odontologo> odons = new ArrayList<Odontologo>();
        odons = ct.traerOdons();
        List<Turno> turns = new ArrayList<Turno>();
        turns = ct.traerTurnos();
        HttpSession sesion = request.getSession();
        String DPI = request.getParameter("dpi");
        boolean x = true, y = false, z= false, w = false;
        if (!turns.isEmpty()) {

            x = true;

        } else {
            x = false;
        }
        List<Paciente> pacs = ct.traerPacientes();
        if(pacs!=null){
            z = true;
        }
        if(z){
            for(Paciente pruebaDpi:pacs){
                if(pruebaDpi.getDNI().equals(DPI)){
                    w = true;
                    break;
                }
            }
            
        }
        if(w){
            Paciente reg = ct.traerPacDpi(DPI);
            sesion.setAttribute("reg", reg);
            response.sendRedirect("PacienteRegistrado.jsp");
            return;
        }
        String nm = request.getParameter("nm");
        String afe = request.getParameter("afe");
        
        
        String Tel = request.getParameter("tel");
        Boolean obr = Boolean.getBoolean(request.getParameter("obra"));
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String HR_Turno = request.getParameter("HR_Turno");
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        Date fecha, fecturn;

        try {
            fecha = sdf.parse(request.getParameter("fac"));
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
                pac.setFecha_Nac(fecha);
                turn.setFecha_turno(fecturn);

            }
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String san = request.getParameter("sangre");

        pac.setDNI(DPI);
        pac.setNombre(nm);
        pac.setTel(Tel);
        pac.setDireccion(dir);
        pac.setObra(obr);
        pac.setSangre(san);
        turn.setAfeccion(afe);
        turn.setHora_turno(HR_Turno);

        
        sesion.setAttribute("pac", pac);
        sesion.setAttribute("turn", turn);
        sesion.setAttribute("odons", odons);
        response.sendRedirect("altaTurnos.jsp");

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
@WebServlet(name = "SV_Paciente", urlPatterns = {"/SV_Paciente"})
public class SV_Paciente extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Paciente> pacs = new ArrayList<Paciente>();
        pacs = ct.traerPacientes();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("pacs",pacs);
        response.sendRedirect("verPacientes.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Paciente pac = new Paciente();
        Turno turn = new Turno();
        List<Odontologo> odons = new ArrayList<Odontologo>();
        odons = ct.traerOdons();
        List<Turno> turns = new ArrayList<Turno>();
        turns = ct.traerTurnos();
        HttpSession sesion = request.getSession();
        String DPI = request.getParameter("dpi");
        boolean x = true, y = false, z= false, w = false;
        if (!turns.isEmpty()) {

            x = true;

        } else {
            x = false;
        }
        List<Paciente> pacs = ct.traerPacientes();
        if(pacs!=null){
            z = true;
        }
        if(z){
            for(Paciente pruebaDpi:pacs){
                if(pruebaDpi.getDNI().equals(DPI)){
                    w = true;
                    break;
                }
            }
            
        }
        if(w){
            Paciente reg = ct.traerPacDpi(DPI);
            sesion.setAttribute("reg", reg);
            response.sendRedirect("PacienteRegistrado.jsp");
            return;
        }
        String nm = request.getParameter("nm");
        String afe = request.getParameter("afe");
        
        
        String Tel = request.getParameter("tel");
        Boolean obr = Boolean.getBoolean(request.getParameter("obra"));
        String dir = request.getParameter("dir");
        String patronFecha = "yyyy-MM-dd";
        String HR_Turno = request.getParameter("HR_Turno");
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);
        Date fecha, fecturn;

        try {
            fecha = sdf.parse(request.getParameter("fac"));
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
                pac.setFecha_Nac(fecha);
                turn.setFecha_turno(fecturn);

            }
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String san = request.getParameter("sangre");

        pac.setDNI(DPI);
        pac.setNombre(nm);
        pac.setTel(Tel);
        pac.setDireccion(dir);
        pac.setObra(obr);
        pac.setSangre(san);
        turn.setAfeccion(afe);
        turn.setHora_turno(HR_Turno);

        
        sesion.setAttribute("pac", pac);
        sesion.setAttribute("turn", turn);
        sesion.setAttribute("odons", odons);
        response.sendRedirect("altaTurnos.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
