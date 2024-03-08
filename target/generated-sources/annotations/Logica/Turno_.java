package Logica;

import Logica.Odontologo;
import Logica.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-02-15T16:01:34")
=======
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-28T17:39:39")
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> afeccion;
    public static volatile SingularAttribute<Turno, Odontologo> odonto;
    public static volatile SingularAttribute<Turno, Integer> id_Turno;
    public static volatile SingularAttribute<Turno, String> hora_turno;
    public static volatile SingularAttribute<Turno, Paciente> Pac;
    public static volatile SingularAttribute<Turno, Date> fecha_turno;

}