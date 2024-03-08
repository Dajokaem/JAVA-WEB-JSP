package Logica;

import Logica.Responsable;
import Logica.Turno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-02-15T16:01:34")
=======
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-28T17:39:39")
>>>>>>> ec5676e7b056ec0444e503c17fc43d3e7e55ab55
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, Boolean> obra;
    public static volatile SingularAttribute<Paciente, String> Sangre;
    public static volatile SingularAttribute<Paciente, Responsable> unResponsable;
    public static volatile ListAttribute<Paciente, Turno> listaTurnos;

}