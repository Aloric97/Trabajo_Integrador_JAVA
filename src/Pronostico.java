import java.util.Objects;

public class Pronostico {

    private Partido partido;
    private Equipo equipo;

    private ResultadoEnum resultado;


    //Constructor por defecto
    public Pronostico(){

    }

    //Setter y getter de mi clase

    public Equipo getEquipo(){
        return equipo;
    }


    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado(){
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado){
        this.resultado = resultado;
    }


    //sumar punto por cada acierto

}
