<%-- 
    Document   : altaPacientes
    Created on : 29/01/2024, 15:50:38
    Author     : jos56
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Registrar cita a un Paciente</h1>

    <form class="user" action="SV_Paciente" method="POST">
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
                       id="esp" placeholder="Afeccion" name="afe">
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
        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user"
                       id="dir" placeholder="Tipo de Sangre" name="sangre">
            </div>
            <div class="col-sm-6 mb-3 mb-sm-0">
                <label for="Obra">El paciente tiene obra social?</label>
                <input type="checkbox" class="form-control form-control-user"
                       id="Obra" placeholder="" name="obra" value="True">
            </div>
            <div class="col-sm-6 mb-3 mb-sm-0">
                <label for="hora">Selecciona la hora de la cita</label>
                <input type="time" class="form-control form-control-user"
                       id="hora" list="listahoras" placeholder="" name="HR_Turno">
            </div>
            <div class="col-sm-6 mb-3 mb-sm-0">
                <label for="fechaturno">Selecciona la fecha de la cita</label>
                <input type="date" class="form-control form-control-user"
                       id="fechaturno" placeholder="" name="fecturn">
            </div>
        </div>
        <datalist id="listahoras">
            <%
                for (int i = 6; i < 22; i++) {
                    if (i < 10) {
            %><<option value="0<%= i%>:00"></option><%
                }
                if (i >= 10) {
            %><option value="<%= i%>:00"></option><%
                    }
                }
                %>
        </datalist>
        <button  class="btn btn-primary btn-user btn-block" action="submit">
            Regsitrar
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>