<<<<<<< HEAD

package Logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Usuario;
    private String NombreUsuario;
    private String Contrasenia;
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_Usuario, String NombreUsuario, String Contrasenia, String rol) {
        this.id_Usuario = id_Usuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasenia = Contrasenia;
        this.rol = rol;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contraseña) {
        this.Contrasenia = Contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
=======

package Logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_Usuario;
    private String NombreUsuario;
    private String Contrasenia;
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_Usuario, String NombreUsuario, String Contrasenia, String rol) {
        this.id_Usuario = id_Usuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasenia = Contrasenia;
        this.rol = rol;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contraseña) {
        this.Contrasenia = Contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
