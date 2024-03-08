<%-- 
    Document   : accionPacientes
    Created on : 19/01/2024, 22:18:19
    Author     : jos56
--%>


<li class="nav-item">
    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
       aria-expanded="true" aria-controls="collapseUtilities">
        <i class="fas fa-solid fa-users"></i>
        <span>Pacientes</span>
    </a>
    <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
         data-parent="#accordionSidebar">
        <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Acciones</h6>
            <form action="SV_PacienteOdon" method="GET">
                
                <button class="collapse-item" style="border-color:blank" >Ver Pacientes</button>
            </form>
        </div>
    </div>
</li>
