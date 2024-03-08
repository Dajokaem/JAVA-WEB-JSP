<%-- 
    Document   : altaTurnos
    Created on : 29/01/2024, 15:54:52
    Author     : jos56
--%>

<%@page import="Logica.Odontologo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Turno"%>
<%@page import="Logica.Paciente"%>
<%@page import="Logica.Control"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Control ct = new Control();
    Paciente pac = (Paciente) request.getSession().getAttribute("pac");
    Turno turn = (Turno) request.getSession().getAttribute("turn");
    List<Odontologo> odons = ct.traerOdons();
    String subHoraTurno = turn.getHora_turno().substring(0, 2);
    String subHoraOdonIn = "";
    String subHoraOdonFin = "";
    int sbt = Integer.parseInt(subHoraTurno);
    int sboi, sbofin;
%>
<!DOCTYPE html>
<html lang="en">
    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <h1>Registrar el turno</h1>

    <form class="user" align="center" action="SV_Turno" method="POST" >

        <div class="form-group row">
            <div class="col-sm-6 mb-3 mb-sm-0">
                <label for="Odontologo"> Seleccione al odontologo disponible a las <%= turn.getHora_turno()%></label>
                <select class="form-control" id="Odontologo" name="Odontologo">
                    <%
                      //comprueba y muestra a los odontologos disponibles dependiendo de la hora de la cita y el horario del odontologo
                        for (Odontologo odon : odons) {
                            subHoraOdonIn = odon.getHora().getHora_inicial().substring(0, 2);
                            subHoraOdonFin = odon.getHora().getHora_Fin().substring(0, 2);
                            sboi = Integer.parseInt(subHoraOdonIn);
                            sbofin = Integer.parseInt(subHoraOdonFin);
                            
                            if ((sboi <= sbt) && (sbofin > sbt)) {
                    %><option value="<%= odon.getId()%>" type="text"><%=odon.getNombre()%></option><%
                                    }

                                }
                    %>
                </select>
            </div>

        </div>


        <button  class="btn btn-primary btn-user btn-block mb-sm-0" action="submit">
            Regsitrar
        </button>
        <hr>

    </form>
    <%@include file="Components/bodyfinal.jsp"%>
</html>
