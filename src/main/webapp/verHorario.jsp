<%-- 
    Document   : verHorario
    Created on : 29/01/2024, 22:19:20
    Author     : jos56
--%>

<%@page import="Logica.Control"%>
<%@page import="Logica.Horario"%>
<%@page import="Logica.Horario"%>
<%@page import="Logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <%
        Odontologo odon = (Odontologo) request.getSession().getAttribute("odon");
        Horario hora = odon.getHora();
        String jr = "";
        switch (hora.getId_Horario()) {
            case 1:
                jr = "Matutina";
                break;
            case 2:
                jr = "Media";
                break;
            case 3:
                jr = "Cierre";
                break;
        }

    %>

    <p>Este es el Horario del Odontologo <%= odon.getNombre()%> </p>

    <div class="form-group row" >
        <div class="col-sm-6 mb-3 mb-sm-0">
            <p>Jornada: <%= jr%></p>
            <p>Hora Inicio: </p>
            <p><%= hora.getHora_Fin()%> </p>
            <p>Hora Salida: </p> 
            <p><%= hora.getHora_inicial()%></p>
        </div>

        <a  class="btn btn-primary btn-user btn-block" href="SV_Odontologo" style="margin-right:1000px; margin-left: 50px">
            Regresar a la lista de Odontologos
        </a>
    </div>

    <%@include file="Components/bodyfinal.jsp"%>
</html>