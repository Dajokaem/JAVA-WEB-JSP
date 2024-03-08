<%-- 
    Document   : Horario
    Created on : 29/01/2024, 16:19:37
    Author     : jos56
--%>

<%@page import="Logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <%
        Odontologo odon = (Odontologo) request.getSession().getAttribute("odon");
    %>
    <h1>Asignar Horario</h1>
    <p>Se asignara el horario al Odontologo <%= odon.getNombre()%> </p>
    <form class="user" action="SV_AsignarHorario" method="POST">
        
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <select class="form-control" name="op">
                    <option value="mat" type="text">Matutino</option>
                    <option value="med" type="text">Medio</option><!-- comment -->
                    <option value="cie" type="text">Cierre</option>
                </select>
            </div>
            <input type="hidden" name="id_odon" value="<%= odon.getId()%>">
        </div>
        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Regsitrar
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>