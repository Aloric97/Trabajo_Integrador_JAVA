public class Equipo {
    private String nombre;
    private String descripcion;

    //Constructor por defecto
    public Equipo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Setter y getter de mi clase
    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String toString(){
        return "Equipo: " + nombre + " " + descripcion;
    }
}
