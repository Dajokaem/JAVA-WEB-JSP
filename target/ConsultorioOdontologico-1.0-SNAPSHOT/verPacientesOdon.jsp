<%-- 
    Document   : verPacientesOdon
    Created on : 14/02/2024, 22:14:48
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
        List<Paciente> pacs = (List) request.getSession().getAttribute("pacs");
        int idusu = usuario.getId_Usuario();


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
                                <th style="width: 200px ">Acciones</th>
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

                            <% for (Paciente pac : pacs) {
                                    for (Turno turn : pac.getListaTurnos()) {
                                        if (turn.getOdon().getUsu().getId_Usuario() == idusu) {
                            %>                            <tr>

                                <td><%= pac.getDNI()%></td>
                                <td><%= pac.getNombre()%></td>
                                <td><%= pac.getTel()%></td>
                                <td style="display: flex; width: 230px">
                                    <form name="verturnos" action="SV_PacienteOdon" method="POST">
                                        <input type="hidden" name="idpac" value="<%= pac.getId()%>">
                                        <input type="hidden" name="idodon" value="<%= turn.getOdon().getId()%>">
                                         <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:blue; margin-right:5px">
                                             <i class="fas fa-calendar"></i> Ver Turnos
                                         </button>
                                         
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
