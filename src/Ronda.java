public class Ronda {
    private String nro;
    private Partido[] partidos;

    //Constructor por defecto
    public Ronda(String nro, Partido[] partidos){
        this.nro = nro;
        this.partidos = partidos;
    }

    //Setter y getter de mi clase
    public String getNro(){
        return nro;
    }

    public Partido[] getPartidos(){
        return partidos;
    }

    public void setNro(String nro){
        this.nro = nro;
    }

    public void setPartidos(Partido[] partidos){
        this.partidos = partidos;
    }

    public String toString(){
        return "Ronda: " + nro + " " + partidos;
    }
}
