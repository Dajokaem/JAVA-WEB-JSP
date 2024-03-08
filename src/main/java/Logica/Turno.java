<<<<<<< HEAD

package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Turno;
    @Temporal(TemporalType.DATE)
    private Date fecha_turno;
    private String hora_turno;
    private String afeccion;
    @ManyToOne
    @JoinColumn(name="id_odonto")
    private Odontologo odonto;
    @ManyToOne
    @JoinColumn(name="id_Pac")
    private Paciente Pac;
    
    public Turno() {
    }

    public Turno(int id_Turno, Date fecha_turno, String hora_turno, String afeccion) {
        this.id_Turno = id_Turno;
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
        this.afeccion = afeccion;
    }

    public int getId_Turno() {
        return id_Turno;
    }

    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }

    public void setOdontologo(Odontologo odon) {
        this.odonto = odon;
    }

    public void setPaciente(Paciente pac) {
        this.Pac = pac;
    }
    public String traerNombreOdon(){
        return this.odonto.getNombre();
    }
    public Odontologo getOdon(){
        return this.odonto;
    }
    public Paciente getPac(){
        return this.Pac;
    }
    
}
=======

package Logica;

import java.util.Date;
import javax.persistence.*;
@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Turno;
    @Temporal(TemporalType.DATE)
    private Date fecha_turno;
    private String hora_turno;
    private String afeccion;
    @ManyToOne
    @JoinColumn(name="id_odonto")
    private Odontologo odonto;
    @ManyToOne
    @JoinColumn(name="id_Pac", insertable= false, updatable = false)
    private Paciente Pac;

    public Turno() {
    }

    public Turno(int id_Turno, Date fecha_turno, String hora_turno, String afeccion) {
        this.id_Turno = id_Turno;
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
        this.afeccion = afeccion;
    }

    public int getId_Turno() {
        return id_Turno;
    }

    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
