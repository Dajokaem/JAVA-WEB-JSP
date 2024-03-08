

<<<<<<< HEAD
<%@page import="Logica.Control"%>
=======
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body id="page-top">
    <% HttpSession misesion = request.getSession();
        Usuario usuario = (Usuario) request.getSession().getAttribute("Usuario");
        if (usuario == null) {
            response.sendRedirect("login.jsp");

        }

<<<<<<< HEAD
        
=======

>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
    %>

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.jsp">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-regular fa-tooth"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Consultorio Odontologico</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">
                    <i class="fas fa-solid fa-bars"></i>
                    <span>Menu</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">

            </div>
            <% String srol = (usuario != null) ? usuario.getRol() : "";%>
            <!-- Nav Item - Pages Collapse Menu -->
            <% switch (srol) {
                    case "admin":%>
            <%@include file="accionO.jsp"%>
<<<<<<< HEAD
            <%@include file="accionSecre.jsp"%>
            
            <%@include file="accionPacientes.jsp"%>
            <%@include file="accionUsuarios.jsp"%>
            
            
            <% break;
                case "odontologo":%>
            <%@include file="accionPacientesOdon.jsp"%> 
          
=======
            <%@include file="turnos.jsp"%>
            <%@include file="accionPacientes.jsp"%>
            <%@include file="accionUsuarios.jsp"%>
            
            <% break;
                case "odontologo":%>
            <%@include file="accionPacientesOdon.jsp"%> 
            <%@include file="turnos.jsp"%>
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
            <% break;
                case "secretario":%>
            <%@include file="accionPacientes.jsp"%>
            <% break;
                default: %>
            <%@include file="accionUsuarios.jsp"%>
            <%break;

                } %>
            <!-- Nav Item - Utilities Collapse Menu -->
            <!-- Heading -->


            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

            <!-- Sidebar Message -->


        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Search -->


                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">



                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <% String a = (usuario != null) ? usuario.getNombreUsuario() : "";%>
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small"><%=a%></span>
                                <img class="img-profile rounded-circle"
                                     src="img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                 aria-labelledby="userDropdown">


                                <button class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Cerrar Sesion
                                </button>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Clinica Odontologica</h1>

                    </div>

                </div>
