<<<<<<< HEAD
package Logica;

import Persistencia.*;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPersistencia {

    HorarioJpaController horaJPA = new HorarioJpaController();
    OdontologoJpaController OdontoJPA = new OdontologoJpaController();
    PacienteJpaController PacienteJPA = new PacienteJpaController();
    PersonaJpaController PersonaJPA = new PersonaJpaController();
    ResponsableJpaController RespoJPA = new ResponsableJpaController();
    SecretarioJpaController SecreJPA = new SecretarioJpaController();
    UsuarioJpaController UsuJPA = new UsuarioJpaController();
    TurnoJpaController TurnoJPA = new TurnoJpaController();

    public ControlPersistencia() {
    }

    public void CrearUsuario(Usuario a) {
        UsuJPA.create(a);
    }

    public List<Usuario> getUsuarios() {
        return UsuJPA.findUsuarioEntities();
    }

    public void EliminarUsuario(int i) {
        try {
            UsuJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario trUnoUsuario(int a) {
        Usuario b = UsuJPA.findUsuario(a);
        return b;
    }

    public void EditarUsuario(Usuario sus) {
        try {
            UsuJPA.edit(sus);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean ValidarUsuario(Usuario a) {
        boolean x = false;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = UsuJPA.findUsuarioEntities();
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(a.getNombreUsuario()) && (usu.getContrasenia().equals(a.getContrasenia()))) {
                x = true;
            }
        }
        return x;
    }

    public Usuario traerIdUsu(String nm) {
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = UsuJPA.findUsuarioEntities();
        Usuario b = new Usuario();
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(nm)) {
                b = usu;
            }
        }
        return b;
    }

    public void crearOdon(Odontologo odon) {
        OdontoJPA.create(odon);
    }

    public List<Odontologo> getOdons() {
        return OdontoJPA.findOdontologoEntities();
    }

    public void EliminarOdon(int i) {
        try {
            OdontoJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Odontologo traerOdon(int id) {
        Odontologo odon = OdontoJPA.findOdontologo(id);
        return odon;
    }

    public void EditarOdon(Odontologo odon) {
        try {
            OdontoJPA.edit(odon);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Horario traerHora(int id_hora) {
        Horario hora = new Horario();
        hora = horaJPA.findHorario(id_hora);
        return hora;
    }

    public void asignarHoraOdon(Odontologo odon) {
        try {
            OdontoJPA.edit(odon);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Odontologo> traerOdons() {
        List<Odontologo> odons = new ArrayList<Odontologo>();
        odons = OdontoJPA.findOdontologoEntities();
        return odons;
    }

    public void crearPaciente(Paciente pac) {
        PacienteJPA.create(pac);
    }

    public int traerIdPaciente(Paciente pac) {
        List<Paciente> listaPaciente = new ArrayList<Paciente>();
        listaPaciente = PacienteJPA.findPacienteEntities();
        Paciente b = new Paciente();
        for (Paciente pp : listaPaciente) {
            if (pp.getDNI().equals(pac.getDNI())) {
                b = pp;
            }
        }
        return b.getId();
    }

    public void EditarPaciente(Paciente pac) {
        try {
            PacienteJPA.edit(pac);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Turno> traerTurnos() {
        List<Turno> turns = new ArrayList<Turno>();
        turns = TurnoJPA.findTurnoEntities();
        return turns;
    }

    public List<Paciente> traerPacientes() {
        List<Paciente> pac = PacienteJPA.findPacienteEntities();
        return pac;
    }

    public String traerNombreOdon(int id) {
        List<Odontologo> odons = new ArrayList<Odontologo>();
        odons = OdontoJPA.findOdontologoEntities();
        Odontologo b = new Odontologo();
        for (Odontologo odon : odons) {
            if (odon.getId() == id) {
                b = odon;
            }
        }
        return b.getNombre();
    }

    public List<Turno> traerTurnosPac(int idTurn) {
        List<Turno> turns = new ArrayList<Turno>();
        List<Turno> revision = TurnoJPA.findTurnoEntities();
        for (Turno turn : revision) {
            if (turn.getPac().getId() == idTurn) {
                turns.add(turn);
            }
        }
        return turns;
    }

    public List<Secretario> traerSecretarios() {
        List<Secretario> secs = SecreJPA.findSecretarioEntities();
        return secs;
    }

    public void crearSecre(Secretario secre) {
        SecreJPA.create(secre);
    }

    public List<Secretario> traerSecres() {
        List<Secretario> secres = SecreJPA.findSecretarioEntities();
        return secres;
    }

    public Secretario traerSecre(int idsecre) {
        Secretario secre = SecreJPA.findSecretario(idsecre);
        return secre;
    }

    public void EditarSecretario(Secretario secre) {
        try {
            SecreJPA.edit(secre);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Turno> traerTurnosPacOdon(int idpac, int idodon) {
        List<Turno> turns = new ArrayList<Turno>();
        List<Turno> revision = TurnoJPA.findTurnoEntities();
        for (Turno turn : revision) {
            if ((turn.getPac().getId() == idpac)&&(turn.getOdon().getId()==idodon)) {
                turns.add(turn);
            }
        }
        return turns;
    }

    public Paciente traerPacDpi(String DPI) {
        List<Paciente> pacs = PacienteJPA.findPacienteEntities();
        Paciente p = new Paciente();
        for(Paciente pac : pacs){
            if(pac.getDNI().equals(DPI)){
                p=pac;
                
            }
        }
        return p;
    }

    public Paciente traerPaciente(int idpac) {
        Paciente pac = PacienteJPA.findPaciente(idpac);
        return pac;
    }

    public void EliminarSecre(int i) {
        try {
            SecreJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   public void EliminarPaciente(int i) {
        try {
            PacienteJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
=======

package Logica;

import Persistencia.*;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlPersistencia {
    HorarioJpaController horaJPA = new HorarioJpaController();
    OdontologoJpaController OdontoJPA = new OdontologoJpaController();
    PacienteJpaController PacienteJPA = new PacienteJpaController();
    PersonaJpaController PersonaJPA = new PersonaJpaController();
    ResponsableJpaController RespoJPA = new ResponsableJpaController();
    SecretarioJpaController SecreJPA = new SecretarioJpaController();
    UsuarioJpaController UsuJPA = new  UsuarioJpaController();

    public ControlPersistencia() {
    }
    
    public void CrearUsuario(Usuario a){
        UsuJPA.create(a);
    }

    public List<Usuario> getUsuarios() {
       return UsuJPA.findUsuarioEntities();
    }

    public void EliminarUsuario(int i) {
        try {
            UsuJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario trUnoUsuario(int a) {
        Usuario b = UsuJPA.findUsuario(a);
        return b;
    }

    public void EditarUsuario(Usuario sus) {
        try {
            UsuJPA.edit(sus);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean ValidarUsuario(Usuario a) {
       boolean x = false;
       List<Usuario> listaUsuarios = new ArrayList<Usuario>();
       listaUsuarios = UsuJPA.findUsuarioEntities();
       for(Usuario usu:listaUsuarios){
           if(usu.getNombreUsuario().equals(a.getNombreUsuario())&&(usu.getContrasenia().equals(a.getContrasenia()))){
               x = true;
           }
       }
       return x;
    }
    public Usuario traerIdUsu(String nm){
       List<Usuario> listaUsuarios = new ArrayList<Usuario>();
       listaUsuarios = UsuJPA.findUsuarioEntities();
       Usuario b = new Usuario();
       for(Usuario usu:listaUsuarios){
           if(usu.getNombreUsuario().equals(nm)){
               b = usu;
           }
       }
       return b;
    }

    public void crearOdon(Odontologo odon) {
        OdontoJPA.create(odon);
    }

    public List<Odontologo> getOdons() {
        return OdontoJPA.findOdontologoEntities();
    }

    public void EliminarOdon(int i) {
        try {
            OdontoJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Odontologo traerOdon(int id) {
        Odontologo odon = OdontoJPA.findOdontologo(id);
        return odon;
    }

    public void EditarOdon(Odontologo odon) {
        try {
            OdontoJPA.edit(odon);
        } catch (Exception ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
