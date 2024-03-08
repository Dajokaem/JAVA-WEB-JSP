<%-- 
    Document   : altaUsuarios
    Created on : 17/01/2024, 20:34:56
    Author     : jos56
--%>

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Edicion de Usuarios</h1>
    <p>Desde aqui editaras los datos de los usuarios</p>
    <% Usuario sus = (Usuario) request.getSession().getAttribute("UsuEditar");%>
    <form class="user" action="SV_EditarUsuarios" method="POST">
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                       placeholder="Nombre Usuario" value="<%= sus.getNombreUsuario()%>">
            </div>
            <div class="col-sm-6">
                <input type="text" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                       placeholder="Contrasenia" value="<%= sus.getContrasenia()%>">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user" name="rol"
                       id="rol" placeholder="Rol" value="<%= sus.getRol()%>">
            </div>

        </div>
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Guardar Modificacion
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>