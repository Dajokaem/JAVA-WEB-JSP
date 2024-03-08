<%-- 
    Document   : espacioOcupado
    Created on : 2/02/2024, 01:47:11
    Author     : jos56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <div class="form-group row">
        <div class="col-sm-6">
             <h1> El espacio esta ocupado</h1><!-- comment -->
        </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-6">
            <a class="btn btn-primary btn-user btn-block" href="altaPacientes.jsp">Regresar al Registro de Pacientes</a>
        </div>
    </div>

    <%@include file="Components/bodyfinal.jsp"%>
</html>