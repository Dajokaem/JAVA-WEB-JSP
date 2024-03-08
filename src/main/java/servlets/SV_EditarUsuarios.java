<<<<<<< HEAD

package servlets;

import Logica.Control;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SV_EditarUsuarios", urlPatterns = {"/SV_EditarUsuarios"})
public class SV_EditarUsuarios extends HttpServlet {
Control ct  = new Control();

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int id = Integer.parseInt(request.getParameter("id"));
       Usuario sus = new Usuario();
       sus = ct.trUnoUsuario(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UsuEditar",sus);
        response.sendRedirect("EditarUsuarios.jsp");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nm = request.getParameter("nombreusu");
        String cont = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        Usuario sus = (Usuario) request.getSession().getAttribute("UsuEditar");
        sus.setNombreUsuario(nm);
        sus.setContrasenia(cont);
        sus.setRol(rol);
        ct.EditarUsuario(sus);
        response.sendRedirect("SV_Usuario");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
=======

package servlets;

import Logica.Control;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SV_EditarUsuarios", urlPatterns = {"/SV_EditarUsuarios"})
public class SV_EditarUsuarios extends HttpServlet {
Control ct  = new Control();

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int id = Integer.parseInt(request.getParameter("id"));
       Usuario sus = new Usuario();
       sus = ct.trUnoUsuario(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("UsuEditar",sus);
        response.sendRedirect("EditarUsuarios.jsp");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nm = request.getParameter("nombreusu");
        String cont = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        Usuario sus = (Usuario) request.getSession().getAttribute("UsuEditar");
        sus.setNombreUsuario(nm);
        sus.setContrasenia(cont);
        sus.setRol(rol);
        ct.EditarUsuario(sus);
        response.sendRedirect("SV_Usuario");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
