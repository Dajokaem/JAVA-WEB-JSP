<<<<<<< HEAD

package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona implements Serializable {
   
    private String tipo_resp;

    public Responsable() {
    }

    public Responsable(String tipo_resp, int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.tipo_resp = tipo_resp;
    }

 




    public String getTipo_resp() {
        return tipo_resp;
    }

    public void setTipo_resp(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }
    
}
=======

package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona implements Serializable {
   
    private String tipo_resp;

    public Responsable() {
    }

    public Responsable(String tipo_resp, int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        super(id, Nombre, DNI, Tel, Direccion, fecha_Nac);
        this.tipo_resp = tipo_resp;
    }

 




    public String getTipo_resp() {
        return tipo_resp;
    }

    public void setTipo_resp(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
