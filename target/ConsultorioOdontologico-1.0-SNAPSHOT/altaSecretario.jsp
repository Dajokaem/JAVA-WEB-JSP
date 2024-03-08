<%-- 
    Document   : altaSecretario
    Created on : 14/02/2024, 17:51:16
    Author     : jos56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Registrar Secretarios</h1>

    <form class="user" action="SV_Secretario" method="POST">
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                
                <input type="text" class="form-control form-control-user" id="dpi"
                       placeholder="DPI" name="dpi">
            </div>
            <div class="col-sm-6">
                <input type="text" class="form-control form-control-user" id="nm"
                       placeholder="Nombre" name="nm">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user"
                       id="esp" placeholder="Sector" name="sector">
            </div>
            <div class="col-sm-6">
                <input type="text" class="form-control form-control-user"
                       id="tel" placeholder="Telefono" name="tel">
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user"
                       id="dir" placeholder="Direccion" name="dir">
            </div>
            <div class="col-sm-6">
                <input type="date" class="form-control form-control-user"
                       id="fac" placeholder="Fecha de Nacimiento" name="fac">
            </div>
        </div>
       
        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Regsitrar
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>