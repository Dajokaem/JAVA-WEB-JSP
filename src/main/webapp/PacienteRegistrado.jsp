<%-- 
    Document   : PacienteRegistrado
    Created on : 14/02/2024, 23:41:55
    Author     : jos56
--%>

<%@page import="Logica.Paciente"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <%
        Paciente pac = (Paciente) request.getSession().getAttribute("reg");

    %>
    <h1>Asigna el Turno al paciente ya registrado</h1>

    <form class="user" action="SV_PacienteRegistrado" method="POST">

        <div class="form-group row">   
            <div class="col-sm-6 mb-3 mb-sm-0">


                <input type="text" class="form-control form-control-user"
                       id="esp" placeholder="Afeccion" name="afe">
            </div>
            <p class="col-sm-6">Nombre: <%= pac.getNombre()%></p>
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
            <label for="hora">Selecciona la hora de la cita</label>
            <input type="time" class="form-control form-control-user"
                   id="hora" list="listahoras" placeholder="" name="HR_Turno">
        </div>

        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <label for="fechaturno">Selecciona la fecha de la cita</label>
                <input type="date" class="form-control form-control-user"
                       id="fechaturno" placeholder="" name="fecturn">
            </div>
            <div class="col-sm-6">
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
                <input type="hidden" name="idpac" value="<%= pac.getId()%>">
                <button class="btn btn-primary btn-user btn-block" type="submit">
                    Registrar
                </button>
            </div>
        </div>


    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>