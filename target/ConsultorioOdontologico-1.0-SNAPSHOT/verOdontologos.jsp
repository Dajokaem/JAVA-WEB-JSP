<%-- 
    Document   : verOdontologos
    Created on : 28/01/2024, 16:22:07
    Author     : jos56
--%>

<%@page import="Logica.Odontologo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <%@ include file="Components/header.jsp"%>
    <%@ include file="Components/bodyprimeraparte.jsp"%>
    <% boolean brol = (srol != "admin") ? true : false;
        if (!brol) {
            System.out.println(String.valueOf(brol));
            response.sendRedirect("Acceso_Denegado.jsp");
<<<<<<< HEAD
            return;
=======
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
        }
        List<Odontologo> listaOdontologo = new ArrayList<Odontologo>();
    %>
    <!-- Begin Page Content -->
    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Odontologos</h1>
        <p class="mb-4">Se mostraran los Odontologos registrados</p>

        <!-- DataTales Example -->
        <div class="card shadow mb-4">
            <div class="card-header py-3">
<<<<<<< HEAD
                <h6 class="m-0 font-weight-bold text-primary">Odontologos</h6>
=======
                <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
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
                                <th>Especialidad</th>
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
                                <th>Especialidad</th>
                                <th>Fecha de Nacimiento</th>
                                <th>Direccion</th>
                                <th style="width:auto">Acciones</th>
                            </tr>
                        </tfoot>
                        <tbody>
                            <%
                                try {
                                    listaOdontologo = (List) request.getSession().getAttribute("listaOdon");
                            %>
                            <% for (Odontologo odon : listaOdontologo) {%>
                            <tr>

                                <td><%= odon.getId()%></td>
                                <td><%= odon.getNombre()%></td>
                                <td><%= odon.getDNI()%></td>
                                <td><%= odon.getTel()%></td>
                                <td><%= odon.getEspe()%></td>
                                <td><%= odon.getFecha_Nac()%></td>
                                <td><%= odon.getDireccion()%></td>
<<<<<<< HEAD
                                <td style="display: flex; width: 300px">
                                    <div class="form-group row">
                                        <form name="eliminar" action="SV_EliminarOdon" method="POST">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:5px; margin-left:5px; margin-bottom:5px"><!-- comment -->
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </button>
                                            <input type="hidden" name="id" value="<%= odon.getId()%>">
                                        </form>
                                        <form name="editar" action="SV_EditarOdon" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px"><!-- comment -->
                                                <i class="fas fa-solid fa-pen"></i> Editar
                                            </button>
                                            <input type="hidden" name="id" value="<%= odon.getId()%>">
                                        </form>
                                    </div>
                                    <div class="form-group row">

                                        <form name="asignar" action="SV_AsignarHorario" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:greenyellow; margin-right:10px; margin-left: 10px; margin-bottom: 5px"><!-- comment -->
                                                <i class="fas fa-regular fa-calendar"></i> Asignar Horario
                                            </button>
                                            <input type="hidden" name="id" value="<%= odon.getId()%>">
                                        </form>
                                        <form name="asignar" action="SV_VerHorario" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-right:10px; margin-left: 10px"><!-- comment -->
                                                <i class="fas fa-regular fa-calendar"></i> Ver Horario
                                            </button>
                                            <input type="hidden" name="id" value="<%= odon.getId()%>">
                                        </form>

                                    </div>
                                </td>
                            </tr>
                            <%}
                                } catch (NullPointerException ex) {
                                    System.out.println(ex);
                                    response.sendRedirect("Acceso_Denegado.jsp");
                                }
=======
                                <td style="display: flex; width: 230px">
                                    <form name="eliminar" action="SV_EliminarOdon" method="POST">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:5px"><!-- comment -->
                                            <i class="fas fa-trash-alt"></i> Eliminar
                                        </button>
                                        <input type="hidden" name="id" value="<%= odon.getId()%>">
                                    </form>
                                    <form name="editar" action="SV_EditarOdon" method="GET">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px"><!-- comment -->
                                            <i class="fas fa-trash-alt"></i> Editar
                                        </button>
                                        <input type="hidden" name="id" value="<%= odon.getId()%>">
                                    </form>
                                </td>
                            </tr>
                            <%}
                                }catch(NullPointerException ex){
                                System.out.println(ex);
                                response.sendRedirect("Acceso_Denegado.jsp");
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
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
