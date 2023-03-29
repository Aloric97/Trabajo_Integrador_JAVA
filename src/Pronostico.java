public class Pronostico {

    private Partido partido;
    private Equipo equipo;


    //Constructor por defecto
    public Pronostico(Partido partido, Equipo equipo){
        this.partido = partido;
        this.equipo = equipo;
    }

    //Setter y getter de mi clase
    public Partido getPartido(){
        return partido;
    }

    public Equipo getEquipo(){
        return equipo;
    }

    public void setPartido(Partido partido){
        this.partido = partido;
    }

    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }

    public String toString(){
        return "Pronostico: " + partido + " " + equipo;
    }
}
