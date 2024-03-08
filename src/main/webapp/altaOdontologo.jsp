<%-- 
    Document   : Altas
    Created on : 17/01/2024, 16:03:49
    Author     : jos56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Registrar Odontologos</h1>

    <form class="user" action="SV_Odontologo" method="POST">
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
<<<<<<< HEAD
                
=======
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
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
                       id="esp" placeholder="Especialidad" name="esp">
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