<<<<<<< HEAD

package Logica;

import java.io.Serializable;
import javax.persistence.*;



@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Horario;
    private String Hora_inicial;
    private String Hora_Fin;

    public Horario() {
    }

    public Horario(int id_Horario, String Hora_inicial, String Hora_Fin) {
        this.id_Horario = id_Horario;
        this.Hora_inicial = Hora_inicial;
        this.Hora_Fin = Hora_Fin;
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public String getHora_inicial() {
        return Hora_inicial;
    }

    public void setHora_inicial(String Hora_inicial) {
        this.Hora_inicial = Hora_inicial;
    }

    public String getHora_Fin() {
        return Hora_Fin;
    }

    public void setHora_Fin(String Hora_Fin) {
        this.Hora_Fin = Hora_Fin;
    }
    
    
}
=======

package Logica;

import java.io.Serializable;
import javax.persistence.*;



@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Horario;
    private String Hora_inicial;
    private String Hora_Fin;

    public Horario() {
    }

    public Horario(int id_Horario, String Hora_inicial, String Hora_Fin) {
        this.id_Horario = id_Horario;
        this.Hora_inicial = Hora_inicial;
        this.Hora_Fin = Hora_Fin;
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public String getHora_inicial() {
        return Hora_inicial;
    }

    public void setHora_inicial(String Hora_inicial) {
        this.Hora_inicial = Hora_inicial;
    }

    public String getHora_Fin() {
        return Hora_Fin;
    }

    public void setHora_Fin(String Hora_Fin) {
        this.Hora_Fin = Hora_Fin;
    }
    
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
