import java.util.ArrayList;
import java.util.List;

public class Ronda {
    private String nro;
    private List<Partido> partidos = new ArrayList<Partido>();

    //Constructor por defecto
    public Ronda(String nro){
        this.nro = nro;
    }

    //Setter y getter de mi clase
    public String getNro(){
        return this.nro;
    }


    public void setNro(String nro){
        this.nro = nro;
    }

    public List<Partido> getPartidos(){
        return this.partidos;
    }

    public void setPartidos(List<Partido> partidos){
        this.partidos = partidos;
    }

    public void addPartido(Partido partido){
        partidos.add(partido);
    }

    public String toString(){
        return "Ronda: " + nro + "\n " + partidos;
    }

    //obtener el tamaño
    public int size(){
        return partidos.size();
    }

}
