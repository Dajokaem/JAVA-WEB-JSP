<<<<<<< HEAD
package Logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Paciente extends Persona {

    private boolean obra;
    private String Sangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy = "Pac", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> listaTurnos;

    public Paciente(boolean obra, String Sangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.obra = obra;
        this.Sangre = Sangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Paciente() {
    }

    public boolean isObra() {
        return obra;
    }

    public void setObra(boolean obra) {
        this.obra = obra;
    }

    public String getSangre() {
        return Sangre;
    }

    public void setSangre(String Sangre) {
        this.Sangre = Sangre;
    }

    public void agregarTurno(Turno t) {
        if (listaTurnos == null) {
            listaTurnos = new ArrayList<>();
        }
        listaTurnos.add(t);
        t.setPaciente(this);
    }
}
=======

package Logica;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Entity
public class Paciente extends Persona{

    private boolean obra;
    private String Sangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy="Pac")
    private List<Turno> listaTurnos;

    public Paciente(boolean obra, String Sangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.obra = obra;
        this.Sangre = Sangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }





    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
   

    public Paciente() {
    }



    public boolean isObra() {
        return obra;
    }

    public void setObra(boolean obra) {
        this.obra = obra;
    }

    public String getSangre() {
        return Sangre;
    }

    public void setSangre(String Sangre) {
        this.Sangre = Sangre;
    }

    
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
