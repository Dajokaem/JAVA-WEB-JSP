<%-- 
    Document   : SeleccionTipo
    Created on : 10/02/2024, 15:59:13
    Author     : jos56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <%
        Usuario usu = (Usuario) request.getSession().getAttribute("usuario");
    %>
    <h1>Elige, Odontologo o Secretario</h1>

    <form class="user" action="SV_AsignarTipo" method="GET">

        <div class="form-group row">   
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="hidden" name="usuario" value="<%=usu.getId_Usuario()%>">
                <select class="form-control" name="tipo" id="tipo">
                    <option value="1">1. Secretario</option>
                    <option value="2">2. Odontologo</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-6">
                <button class="btn btn-primary btn-user btn-block" type="submit">
                    Enviar
                </button>
            </div>
        </div>


    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>
