<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jos56
 */
public class Control {
    ControlPersistencia ct = new ControlPersistencia();
    public void CrearUsuario( String nombreUsu, String contra, String rol){
       Usuario sus = new Usuario();
       sus.setNombreUsuario(nombreUsu);
       sus.setContrasenia(contra);
       sus.setRol(rol);
       ct.CrearUsuario(sus);
        
    }

    public List<Usuario> getUsuarios() {
        return ct.getUsuarios();
    }

    public void EliminarUsuario(int i) {
        ct.EliminarUsuario(i);
    }

    public Usuario trUnoUsuario(int a) {
       Usuario b =  ct.trUnoUsuario(a);
        return b;
    }

    public void EditarUsuario(Usuario sus) {
        ct.EditarUsuario(sus);
    }
    public Usuario traerIdUsu(String nm){
        Usuario a = new Usuario();
        a = ct.traerIdUsu(nm);
        return a;
    }

    public boolean Validar(String nm, String contra) {
        Usuario a = new Usuario();
        boolean x = false;
        a.setNombreUsuario(nm);
        a.setContrasenia(contra);
        x = ct.ValidarUsuario(a);
        return x;
    }

    public void crearOdon(Odontologo odon) {
        ct.crearOdon(odon);
    }

    public List<Odontologo> getOdons() {
       return ct.getOdons();
    }

    public void EliminarOdon(int i) {
        ct.EliminarOdon(i);
    }

    public Odontologo traerOdon(int id) {
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id);
        return odon;
    }
    public List<Odontologo> traerOdons(){
        List<Odontologo> odons = new ArrayList<Odontologo>();
        odons=ct.traerOdons();
        return odons;
    }
    public void EditarOdon(Odontologo odon) {
        ct.EditarOdon(odon);
    }

    

    public Horario traerHora(int id_hora) {
        Horario hora = new Horario();
        hora = ct.traerHora(id_hora);
        return hora;
    }

    public void asignarHoraOdon(Odontologo odon) {
        ct.asignarHoraOdon(odon);
    }

    public void crearPaciente(Paciente pac) {
        ct.crearPaciente(pac);
    }

    public int traerIdPaciente(Paciente pac) {
        int i = ct.traerIdPaciente(pac);
        return i;
    }

    public void EditarPaciente(Paciente pac) {
        ct.EditarPaciente(pac);
    }

    public List<Turno> traerTurnos() {
        List<Turno> turns = new ArrayList<Turno>();
        turns = ct.traerTurnos();
        return turns;
    }

    public List<Paciente> traerPacientes() {
        List<Paciente> pac = ct.traerPacientes();
        return pac;
    }

    public String traerNombreOdon(int id) {
        String nm = ct.traerNombreOdon(id);
        return nm;
    }

    public List<Turno> traerTurnosPac(int idTurn) {
        List<Turno> turns = ct.traerTurnosPac(idTurn);
        return turns;
    }

    public Usuario traerUsuario(int idusu) {
        Usuario usu = ct.trUnoUsuario(idusu);
        return usu;
    }

    public List<Secretario> traerSecretarios() {
        List<Secretario> secs = ct.traerSecretarios();
        return secs;
    }

    public void crearSecre(Secretario secre) {
        ct.crearSecre(secre);
    }

    public List<Secretario> traerSecres() {
        List<Secretario> secres = new ArrayList<Secretario>();
        secres = ct.traerSecres();
        return secres;
    }

    public Secretario traerSecre(int idsecre) {
        Secretario secre = ct.traerSecre(idsecre);
        return secre;
    }

    public void EditarSecretario(Secretario secre) {
        ct.EditarSecretario(secre);
    }

    public List<Turno> traerTurnosPacOdon(int idpac, int idodon) {
        List<Turno> turns = ct.traerTurnosPacOdon(idpac,idodon);
        return turns;
    }

    public Paciente traerPacDpi(String DPI) {
       Paciente reg = ct.traerPacDpi(DPI);
       return reg;
    }

    public Paciente traerPaciente(int idpac) {
        Paciente pac = ct.traerPaciente(idpac);
        return pac;
    }

    public void EliminarSecre(int i) {
        ct.EliminarSecre(i);
    }

    public void EditarSecre(Secretario secre) {
        ct.EditarSecretario(secre);
    }

    public void EliminarPaciente(int i) {
     ct.EliminarPaciente(i);   
    }

    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jos56
 */
public class Control {
    ControlPersistencia ct = new ControlPersistencia();
    public void CrearUsuario( String nombreUsu, String contra, String rol){
       Usuario sus = new Usuario();
       sus.setNombreUsuario(nombreUsu);
       sus.setContrasenia(contra);
       sus.setRol(rol);
       ct.CrearUsuario(sus);
        
    }

    public List<Usuario> getUsuarios() {
        return ct.getUsuarios();
    }

    public void EliminarUsuario(int i) {
        ct.EliminarUsuario(i);
    }

    public Usuario trUnoUsuario(int a) {
       Usuario b =  ct.trUnoUsuario(a);
        return b;
    }

    public void EditarUsuario(Usuario sus) {
        ct.EditarUsuario(sus);
    }
    public Usuario traerIdUsu(String nm){
        Usuario a = new Usuario();
        a = ct.traerIdUsu(nm);
        return a;
    }

    public boolean Validar(String nm, String contra) {
        Usuario a = new Usuario();
        boolean x = false;
        a.setNombreUsuario(nm);
        a.setContrasenia(contra);
        x = ct.ValidarUsuario(a);
        return x;
    }

    public void crearOdon(Odontologo odon) {
        ct.crearOdon(odon);
    }

    public List<Odontologo> getOdons() {
       return ct.getOdons();
    }

    public void EliminarOdon(int i) {
        ct.EliminarOdon(i);
    }

    public Odontologo traerOdon(int id) {
        Odontologo odon = new Odontologo();
        odon = ct.traerOdon(id);
        return odon;
    }

    public void EditarOdon(Odontologo odon) {
        ct.EditarOdon(odon);
    }
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
