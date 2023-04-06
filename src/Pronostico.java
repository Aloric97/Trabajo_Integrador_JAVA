public class Pronostico {

    private Partido partido;
    private Equipo equipo;

    private String resultado;


    //Constructor por defecto
    public Pronostico(){

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

    public String getResultado(){
        return resultado;
    }

    public void setResultado(String resultado){
        this.resultado = resultado;
    }

    //metodo para guardar calcular el resultado del partido



    public String toString(){
        return "Pronostico: " + partido + " " + equipo;
    }


}
