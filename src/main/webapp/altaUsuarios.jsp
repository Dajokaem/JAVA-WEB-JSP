<%-- 
    Document   : altaUsuarios
    Created on : 17/01/2024, 20:34:56
    Author     : jos56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Alta Usuarios</h1>
    <p>Aqui se crearan nuevos usuarios</p>
    <form class="user" action="SV_Usuario" method="POST">
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control " id="nombreusu" name="nombreusu"
                       placeholder="Nombre Usuario">
            </div>
            <div class="col-sm-6">
                <input type="password" class="form-control " id="contrasenia" name="contrasenia"
                       placeholder="Contrasenia">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <select class="form-control" name="rol">
                    <option value="admin" type="text">Administrador</option>
                    <option value="odontologo" type="text">Odontologo</option><!-- comment -->
                    <option value="secretario" type="text">Secretario</option>
                </select>
            </div>

        </div>
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Usuario
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>