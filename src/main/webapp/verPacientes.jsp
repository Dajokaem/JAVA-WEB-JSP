<%-- 
    Document   : verPacientes
    Created on : 10/02/2024, 12:52:33
    Author     : jos56
--%>

<%@page import="Logica.Paciente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <% boolean brol = (srol == "odontologo") ? true : false;

        List<Paciente> pacs = (List) request.getSession().getAttribute("pacs");
    %>
    <!-- Begin Page Content -->
    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Pacientes</h1>
        <p class="mb-4">Se mostraran los pacientes registrados</p>

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
                                <th>DNI</th>
                                <th>Nombre</th>
                                <th>Telefono</th>
                                <th style="width: 220px ">Acciones</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>DNI</th>
                                <th>Nombre</th>
                                <th>Telefono</th>
                                <th style="width:auto">Acciones</th>
                            </tr>
                        </tfoot>
                        <tbody>

                            <% for (Paciente pac : pacs) {%>
                            <tr>

                                <td><%= pac.getDNI()%></td>
                                <td><%= pac.getNombre()%></td>
                                <td><%= pac.getTel()%></td>
                                <td style="display: flex; width: 250px">
                                    <div class="form-group row">
                                        <form name="verturnos" action="SV_Turno" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:blue; margin-right:5px; margin-left:5px">
                                                <i class="fas fa-calendar"></i> Ver Turnos
                                            </button>
                                            <input type="hidden" name="id" value="<%=pac.getId()%>">
                                        </form>
                                        <%
                                            if (!brol) {


                                        %>
                                        <form name="editar" action="SV_EditarPaciente" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px; margin-top:5px">
                                                <i class="fas fa-trash-alt"></i> Editar
                                            </button>
                                            <input type="hidden" name="id" value="<%=pac.getId()%>">
                                        </form>
                                    </div>
                                        
                                    <form name="eliminar" action="SV_EliminarPaciente" method="POST">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red"><!-- comment -->
                                            <i class="fas fa-trash-alt"></i> Eliminar
                                        </button>
                                        <input type="hidden" name="id" value="<%= pac.getId()%>">
                                    </form>
                                </td>
                            </tr>
                            <%
                                    }
                                }


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

