<%-- 
    Document   : SeleccionListaRegistrados
    Created on : 14/02/2024, 20:11:14
    Author     : jos56
--%>

<%@page import="Logica.Secretario"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <%
        Usuario usu = (Usuario) request.getSession().getAttribute("usuario");
        int tipo = (int) request.getSession().getAttribute("tipo");
        switch (tipo) {
            case 1:
                List<Secretario> secres = (List) request.getSession().getAttribute("lista");
    %>
    <h1>Asignar Usuario</h1>

    <form class="user" action="SV_AsignarUsuario" method="POST">
        <h2> Seleccione al secretario</h2>
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <select class="form-control" name="Secretario">
                <%
                    for(Secretario secre: secres){
                %>
                
                    <option value="<%=secre.getId()%>" type="text"><%=secre.getNombre()%></option>

                
                <%
                    }
                %>
                
                </select>
                <input type="hidden" value="<%= tipo%>" name="tipo">
                <input type="hidden" value="<%= usu.getId_Usuario()%>" name="usur">
            </div>
            
        </div>
            <hr><!-- comment -->
            <hr>
        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Asignar
        </button>
        <hr>

    </form>
    <%
            break;
        case 2:
            List<Odontologo> odons = (List) request.getSession().getAttribute("lista");
    %>
    <h1>Asignar Usuario</h1>

    <form class="user" action="SV_AsignarUsuario" method="POST">
        <h2> Seleccione al secretario</h2>
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <select class="form-control" name="Odontologo">
                <%
                    for(Odontologo odon:odons){
                %>
                
                    <option value="<%=odon.getId()%>" type="text"><%=odon.getNombre()%></option>

                
                <%
                    }
                %>
                </select>
                <input type="hidden" value="<%= usu.getId_Usuario()%>" name="usur">
                <input type="hidden" value="<%= tipo%>" name="tipo">
            </div>
            
        </div>
            <hr><!-- comment -->
            <hr>
        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Asignar
        </button>
        <hr>

    </form>
    <%
                break;
        }
    %>

    <%@include file="Components/bodyfinal.jsp"%>
</html>