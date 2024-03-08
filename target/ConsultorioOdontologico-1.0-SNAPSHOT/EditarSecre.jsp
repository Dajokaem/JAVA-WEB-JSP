<%-- 
    Document   : EditarSecre
    Created on : 15/02/2024, 15:02:06
    Author     : jos56
--%>

<%@page import="Logica.Secretario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Editar Odontologo</h1>
    <% Secretario secre = (Secretario) request.getSession().getAttribute("UnSecre"); %>
    <form class="user" action="SV_EditarSecre" method="POST">
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user" id="dpi"
                       placeholder="DPI" name="dpi" value="<%= secre.getDNI()%>">
            </div>
            <div class="col-sm-6">
                <input type="text" class="form-control form-control-user" id="nm"
                       placeholder="Nombre" name="nm"value="<%= secre.getNombre()%>">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user"
                       id="esp" placeholder="Especialidad" name="esp"value="<%= secre.getSector()%>">
            </div>
            <div class="col-sm-6">
                <input type="text" class="form-control form-control-user"
                       id="tel" placeholder="Telefono" name="tel"value="<%= secre.getTel()%>">
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user"
                       id="dir" placeholder="Direccion" name="dir"value="<%= secre.getDireccion()%>">
            </div>
            <div class="col-sm-6">
                <input type="date" class="form-control form-control-user"
                       id="fac" placeholder="Fecha de Nacimiento" name="fac"value="<%= secre.getFecha_Nac()%>">
            </div>
        </div>
       
        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Regsitrar Cambios
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>