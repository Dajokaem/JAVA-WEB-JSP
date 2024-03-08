<<<<<<< HEAD

package Logica;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Secretario extends Persona {
    
    private String Sector;
    @OneToOne
    private Usuario usus;

    public Secretario() {
    }

    public Secretario(String Sector, Usuario usus, int id,String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.Sector = Sector;
        this.usus = usus;
    }


    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    public Usuario getUsus() {
        return usus;
    }

    public void setUsus(Usuario usus) {
        this.usus = usus;
    }
    
}
=======

package Logica;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Secretario extends Persona {
    
    private String Sector;
    @OneToOne
    private Usuario usus;

    public Secretario() {
    }

    public Secretario(String Sector, Usuario usus, int id,String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.Sector = Sector;
        this.usus = usus;
    }


    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    public Usuario getUsus() {
        return usus;
    }

    public void setUsus(Usuario usus) {
        this.usus = usus;
    }
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
