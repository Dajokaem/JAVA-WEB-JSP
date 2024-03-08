<<<<<<< HEAD
package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Odontologo extends Persona implements Serializable {

    private String espe;
    @OneToMany(mappedBy = "odonto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> turnos;
    @OneToOne
    private Usuario usu;
    @OneToOne
    private Horario hora;

    public Odontologo(String espe, List<Turno> turnos, Usuario usu, Horario hora, int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.espe = espe;
        this.turnos = turnos;
        this.usu = usu;
        this.hora = hora;
    }

    public Odontologo() {
    }

    public List<Turno> getTurnos() {
        return turnos;
    }
    public void agregarTurno(Turno t){
        if (turnos == null) {
            turnos = new ArrayList<>();
        }
        turnos.add(t);
        t.setOdontologo(this);
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Horario getHora() {
        return hora;
    }

    public void setHora(Horario hora) {
        this.hora = hora;
    }

    public String getEspe() {
        return espe;
    }

    public void setEspe(String espe) {
        this.espe = espe;
    }
    public Turno TraerTurno(){
        int i = turnos.size();
        Turno t = turnos.get(i-1);
        return t;
    }
}
=======

package Logica;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Odontologo extends Persona implements Serializable{
    
    private String espe;
    @OneToMany(mappedBy="odonto")
    private List<Turno> turnos;
    @OneToOne
    private Usuario usu;
    @OneToOne
    private Horario hora;

    public Odontologo(String espe, List<Turno> turnos, Usuario usu, Horario hora, int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.espe = espe;
        this.turnos = turnos;
        this.usu = usu;
        this.hora = hora;
    }




    public Odontologo() {
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Horario getHora() {
        return hora;
    }

    public void setHora(Horario hora) {
        this.hora = hora;
    }


    public String getEspe() {
        return espe;
    }

    public void setEspe(String espe) {
        this.espe = espe;
    }
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
