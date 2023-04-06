import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramaPrincipal {
    //probar las clases creadas

    public static void main(String[] args) {

        // leer archivos en java


        System.out.println("\n********************************");
        System.out.println("Prueba de archivos:\n");

        // primer caso para los resultados
        String rutaPartidos= "Archivos/Partidos.txt";

        Path obtenerResultados= Paths.get(rutaPartidos);

        System.out.println("** RESULTADOS **");
        Ronda ronda1= new Ronda("1");
        try (BufferedReader reader = Files.newBufferedReader(obtenerResultados)){
            String line;
            while((line= reader.readLine())!= null){
                String[] parts=line.split(" ");

                //obtener los datos del primer equipo y guardarlos en un objeto
                String primerEquipo= parts[0];
                int golesPrimerEquipo=Integer.parseInt(parts[1]);
                Equipo equipo1= new Equipo(primerEquipo);

                //obtener los datos del segundo equipo y guardarlos en un objeto
                String segundoEquipo=parts[3];
                int golesSegundoEquipo=Integer.parseInt(parts[2]);
                Equipo equipo2= new Equipo(segundoEquipo);

                //crear un objeto partido
                Partido partido= new Partido(equipo1,equipo2,golesPrimerEquipo,golesSegundoEquipo);

                //agregar el partido a la ronda
                ronda1.addPartido(partido);

                //probar el metodo resultado
                System.out.println(partido.resultado(equipo1));

            }

        } catch (IOException error){
            System.out.println("Ha ocurrido un error:" +error);
        }


        //segundo caso se trata sobre el pronostico

        String RutaPronostico= "Archivos/Pronosticos.txt";
        Path obtenerPronostico=Paths.get(RutaPronostico);

        System.out.println("** PRONOSTICO **");

        try (BufferedReader reader=Files.newBufferedReader(obtenerPronostico)){
            String line;
            while((line=reader.readLine())!=null){

                String[] parts=line.split(" ");

                Pronostico pronostico= new Pronostico();

                //tomo la decision de agarrar el primer equipo para guardar el pronostico
                String primerEquipo=parts[0];

                //agrego el string a un nuevo objeto de tipo equipo
                Equipo equipo1= new Equipo(primerEquipo);




            }

        } catch (IOException error){
            System.out.println("Ha ocurrido un error:" +error);

        }

    }

}
