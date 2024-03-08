package Logica;

import Logica.Horario;
import Logica.Turno;
import Logica.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-02-15T16:01:34")
=======
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-28T17:39:39")
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Persona_ {

    public static volatile SingularAttribute<Odontologo, Usuario> usu;
    public static volatile SingularAttribute<Odontologo, Horario> hora;
    public static volatile ListAttribute<Odontologo, Turno> turnos;
    public static volatile SingularAttribute<Odontologo, String> espe;

}