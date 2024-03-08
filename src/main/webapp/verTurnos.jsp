<%-- 
    Document   : verTurnos
    Created on : 10/02/2024, 13:10:58
    Author     : jos56
--%>

<%@page import="Logica.Turno"%>
<%@page import="Logica.Paciente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <% boolean brol = (srol != "admin") ? true : false;
        if (!brol) {
            System.out.println(String.valueOf(brol));
            response.sendRedirect("Acceso_Denegado.jsp");
        }
       List<Turno> turns = (List) request.getSession().getAttribute("turnos");
    %>
    <!-- Begin Page Content -->
    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Turnos</h1>
        <p class="mb-4">Se muestran los turnos del paciente</p>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Fecha</th>
                                <th>Hora</th>
                                <th>Odontologo</th>
                                <th style="width: 200px ">Acciones</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Fecha</th>
                                <th>Hora</th>
                                <th>Odontologo</th>
                                <th style="width:auto">Acciones</th>
                            </tr>
                        </tfoot>
                        <tbody>
                            
                            <% for (Turno turn : turns) {%>
                            <tr>

                                <td><%= turn.getFecha_turno()%></td>
                                <td><%= turn.getHora_turno()%></td>
                                <td><%=turn.traerNombreOdon()%></td>
                                <td style="display: flex; width: 230px">
                                    <form name="verturnos" action="SV_Turnos" method="GET">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:5px">
                                            <i class="fas fa-calendar"></i> Eliminar Turno
                                        </button>
                                        <input type="hidden" name="id" value="<%=turn.getId_Turno()%>">
                                    </form><!--
                                    <form name="editar" action="SV_EditarUsuarios" method="GET">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px">
                                            <i class="fas fa-trash-alt"></i> Editar
                                        </button>
                                        <input type="hidden" name="id" value="">
                                    </form>-->
                                </td>
                            </tr>
                            <%}
                               

                            %>              
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include file="Components/bodyfinal.jsp"%>

</html>

