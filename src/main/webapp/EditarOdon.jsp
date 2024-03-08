<%-- 
    Document   : EditarOdon
    Created on : 28/01/2024, 17:11:11
    Author     : jos56
--%>

<%@page import="Logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Editar Odontologo</h1>
    <% Odontologo odon = (Odontologo) request.getSession().getAttribute("UnOdon"); %>
    <form class="user" action="SV_EditarOdon" method="POST">
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user" id="dpi"
                       placeholder="DPI" name="dpi" value="<%= odon.getDNI()%>">
            </div>
            <div class="col-sm-6">
                <input type="text" class="form-control form-control-user" id="nm"
                       placeholder="Nombre" name="nm"value="<%= odon.getNombre()%>">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user"
                       id="esp" placeholder="Especialidad" name="esp"value="<%= odon.getEspe()%>">
            </div>
            <div class="col-sm-6">
                <input type="text" class="form-control form-control-user"
                       id="tel" placeholder="Telefono" name="tel"value="<%= odon.getTel()%>">
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user"
                       id="dir" placeholder="Direccion" name="dir"value="<%= odon.getDireccion()%>">
            </div>
            <div class="col-sm-6">
                <input type="date" class="form-control form-control-user"
                       id="fac" placeholder="Fecha de Nacimiento" name="fac"value="<%= odon.getFecha_Nac()%>">
            </div>
        </div>
       
        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Regsitrar Cambios
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>
