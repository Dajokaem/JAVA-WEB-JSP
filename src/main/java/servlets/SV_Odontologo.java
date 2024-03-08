<<<<<<< HEAD
package servlets;

import Logica.Control;
import Logica.Odontologo;
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
@WebServlet(name = "SV_Odontologo", urlPatterns = {"/SV_Odontologo"})
public class SV_Odontologo extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                List<Odontologo> listaOdon = new ArrayList<Odontologo>();
        
        listaOdon = ct.getOdons();
        HttpSession misesion=request.getSession();
        misesion.setAttribute("listaOdon", listaOdon);
        
        response.sendRedirect("verOdontologos.jsp");

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
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);

        // Convertir el String a un objeto Date
        Date fecha;
        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            odon.setFecha_Nac(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String esp = request.getParameter("esp");
        odon.setDNI(dpi);
        odon.setNombre(nm);
        odon.setTel(tel);
        odon.setDireccion(dir);
        odon.setEspe(esp);
        ct.crearOdon(odon);
        response.sendRedirect("altaOdontologo.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
=======
package servlets;

import Logica.Control;
import Logica.Odontologo;
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
@WebServlet(name = "SV_Odontologo", urlPatterns = {"/SV_Odontologo"})
public class SV_Odontologo extends HttpServlet {

    Control ct = new Control();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                List<Odontologo> listaOdon = new ArrayList<Odontologo>();
        
        listaOdon = ct.getOdons();
        HttpSession misesion=request.getSession();
        misesion.setAttribute("listaOdon", listaOdon);
        
        response.sendRedirect("verOdontologos.jsp");

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
        // Crear un objeto SimpleDateFormat con el patrón de formato
        SimpleDateFormat sdf = new SimpleDateFormat(patronFecha);

        // Convertir el String a un objeto Date
        Date fecha;
        try {
            fecha = sdf.parse(request.getParameter("fac"));
            // Imprimir la fecha
            odon.setFecha_Nac(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(SV_Odontologo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String esp = request.getParameter("esp");
        odon.setDNI(dpi);
        odon.setNombre(nm);
        odon.setTel(tel);
        odon.setDireccion(dir);
        odon.setEspe(esp);
        ct.crearOdon(odon);
        response.sendRedirect("altaOdontologo.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
