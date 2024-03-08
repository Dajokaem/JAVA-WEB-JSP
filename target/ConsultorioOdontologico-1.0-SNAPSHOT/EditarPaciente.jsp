<%-- 
    Document   : EditarPaciente
    Created on : 15/02/2024, 15:33:43
    Author     : jos56
--%>

<%@page import="Logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <%
        Paciente pac = (Paciente) request.getSession().getAttribute("UnPac");
    %>
    <h1>Registrar cita a un Paciente</h1>

    <form class="user" action="SV_EditarPaciente" method="POST">
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <label id="dpi">DPI:</label>
                <input type="text" class="form-control form-control-user" id="dpi"
                       placeholder="DPI" name="dpi" value="<%= pac.getDNI()%>">
            </div>
            <div class="col-sm-6">
                <label id="nm">Nombre</label>
                <input type="text" class="form-control form-control-user" id="nm"
                       placeholder="Nombre" name="nm" value="<%= pac.getNombre()%>">
            </div>
        </div>

        <div class="form-group row">

            <div class="col-sm-6">
                <label id="tel">Telefono:</label>
                <input type="text" class="form-control form-control-user"
                       id="tel" placeholder="Telefono" name="tel" value="<%= pac.getTel()%>">
            </div>


            <div class="col-sm-6 mb-3 mb-sm-0">
                <label id="dir">Direccion:</label>
                <input type="text" class="form-control form-control-user"
                       id="dir" placeholder="Direccion" name="dir" value="<%= pac.getDireccion()%>">
            </div>
        </div>
        <div class="form-group row"> 
            <div class="col-sm-6">
                <label id="fac">Fecha de Naciemiento:</label>
                <input type="date" class="form-control form-control-user"
                       id="fac" placeholder="Fecha de Nacimiento" name="fac" value="<%= pac.getFecha_Nac()%>">
            </div>


            <div class="col-sm-6 mb-3 mb-sm-0">
                <label id="san">Sangre:</label>
                <input type="text" class="form-control form-control-user"
                       id="san" placeholder="Tipo de Sangre" name="sangre" value="<%= pac.getSangre()%>">
            </div>
        </div>




        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Regsitrar
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>