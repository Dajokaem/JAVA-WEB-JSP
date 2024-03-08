<<<<<<< HEAD

package Logica;
    
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private String DNI;
    private String Tel;
    private String Direccion;
    @Temporal(TemporalType.DATE)
    private Date fecha_Nac;

    public Persona() {
    }

    public Persona(int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        this.id = id;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Tel = Tel;
        this.Direccion = Direccion;
        this.fecha_Nac = fecha_Nac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFecha_Nac() {
        return fecha_Nac;
    }

    public void setFecha_Nac(Date fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }
            
}
=======

package Logica;
    
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private String DNI;
    private String Tel;
    private String Direccion;
    @Temporal(TemporalType.DATE)
    private Date fecha_Nac;

    public Persona() {
    }

    public Persona(int id, String Nombre, String DNI, String Tel, String Direccion, Date fecha_Nac) {
        this.id = id;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Tel = Tel;
        this.Direccion = Direccion;
        this.fecha_Nac = fecha_Nac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFecha_Nac() {
        return fecha_Nac;
    }

    public void setFecha_Nac(Date fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }
            
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
