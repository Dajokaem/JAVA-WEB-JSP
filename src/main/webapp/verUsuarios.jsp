<%-- 
    Document   : verUsuarios
    Created on : 17/01/2024, 23:06:42
    Author     : jos56
--%>

<%@page import="java.io.IOException"%>
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
        }
        List<Usuario> listaUsuario = new ArrayList<Usuario>();
    %>
    <!-- Begin Page Content -->
    <div class="container-fluid">

        <!-- Page Heading -->
        <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
        <p class="mb-4">Se mostraran los usuarios</p>

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
                                <th>Id</th>
                                <th>Nombre de Usuario</th>
                                <th>Rol</th>
                                <th style="width: 200px ">Acciones</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Id</th>
                                <th>Nombre de Usuario</th>
                                <th>Rol</th>
                                <th style="width:auto">Acciones</th>
                            </tr>
                        </tfoot>
                        <tbody>
                            <%
                                try {
                                    listaUsuario = (List) request.getSession().getAttribute("listaUsuarios");
                            %>
                            <% for (Usuario usu : listaUsuario) {%>
                            <tr>

                                <td><%= usu.getId_Usuario()%></td>
                                <td><%= usu.getNombreUsuario()%></td>
                                <td><%= usu.getRol()%></td>
<<<<<<< HEAD
                                <td style="display: flex; width: 220px">
                                    <div class="form-group row">

                                        <form name="eliminar" action="SV_EliminarUsuarios" method="POST">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-left: 5px"><!-- comment -->
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </button>
                                            <input type="hidden" name="id" value="<%= usu.getId_Usuario()%>">
                                        </form>


                                        <form name="editar" action="SV_EditarUsuarios" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px; margin-top: 10px"><!-- comment -->
                                                <i class="fas fa-trash-alt"></i> Editar
                                            </button>
                                            <input type="hidden" name="id" value="<%= usu.getId_Usuario()%>">
                                        </form>
                                    </div>
                                    <div class="form-group row">

                                        <form name="asignar" action="SV_AsignarUsuario" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:greenyellow; margin-left: -7px"><!-- comment -->
                                                <i class="fas fa-regular fa-calendar"></i> Asignar Usuario
                                            </button>
                                            <input type="hidden" name="idusu" value="<%= usu.getId_Usuario()%>">
                                        </form><!--
                                        <form name="asignar" action="SV_VerHorario" method="GET">
                                            <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-right:10px; margin-left: 10px">
                                                <i class="fas fa-regular fa-calendar"></i> Ver Horario
                                            </button>
                                            <input type="hidden" name="id" value="">
                                        </form>-->

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
                                    <form name="eliminar" action="SV_EliminarUsuarios" method="POST">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:red; margin-right:5px"><!-- comment -->
                                            <i class="fas fa-trash-alt"></i> Eliminar
                                        </button>
                                        <input type="hidden" name="id" value="<%= usu.getId_Usuario()%>">
                                    </form>
                                    <form name="editar" action="SV_EditarUsuarios" method="GET">
                                        <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left:5px"><!-- comment -->
                                            <i class="fas fa-trash-alt"></i> Editar
                                        </button>
                                        <input type="hidden" name="id" value="<%= usu.getId_Usuario()%>">
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
