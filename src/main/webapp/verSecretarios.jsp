<%-- 
    Document   : verSecretarios
    Created on : 14/02/2024, 19:30:37
    Author     : jos56
--%>

<%@page import="Logica.Secretario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <% boolean brol = (srol != "admin") ? true : false;
        if (!brol) {
            System.out.println(String.valueOf(brol));
            response.sendRedirect("Acceso_Denegado.jsp");
        }
        List<Secretario> secres= new ArrayList<Secretario>();
    %>
    <!-- Begin Page Content -->
    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Secretario</h1>
        <p class="mb-4">Se mostraran los Secretario registrados</p>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Secretarios</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>DPI</th>
                                <th>Telefono</th>
                                <th>Sector</th>
                                <th>Fecha de Nacimiento</th>
                                <th>Direccion</th>
                                <th style="width: 200px ">Acciones</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Id</th>
                                <th>Nombre</th>
                                <th>DPI</th>
                                <th>Telefono</th>
                                <th>Sector</th>
                                <th>Fecha de Nacimiento</th>
                                <th>Direccion</th>
                                <th style="width:auto">Acciones</th>
                            </tr>
                        </tfoot>
                        <tbody>
                            <%
                                try {
                                    secres = (List) request.getSession().getAttribute("Secres");
                            %>
                            <% for (Secretario secre : secres) {%>
                            <tr>

                                <td><%= secre.getId()%></td>
                                <td><%= secre.getNombre()%></td>
                                <td><%= secre.getDNI()%></td>
                                <td><%= secre.getTel()%></td>
                                <td><%= secre.getSector()%></td>
                                <td><%= secre.getFecha_Nac()%></td>
                                <td><%= secre.getDireccion()%></td>
                                <td style="display: flex; width: 250px">
                                    <div class="form-group row">
                                        <form name="eliminar" action="SV_EliminarSecre" method="POST">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red"><!-- comment -->
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </button>
                                            <input type="hidden" name="id" value="<%= secre.getId()%>">
                                        </form>
                                        <form name="editar" action="SV_EditarSecre" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px"><!-- comment -->
                                                <i class="fas fa-solid fa-pen"></i> Editar
                                            </button>
                                            <input type="hidden" name="id" value="<%= secre.getId()%>">
                                        </form>
                                    </div>
                                    
                                </td>
                            </tr>
                            <%}
                                } catch (NullPointerException ex) {
                                    System.out.println(ex);
                                    response.sendRedirect("Acceso_Denegado.jsp");
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
