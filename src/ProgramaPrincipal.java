import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramaPrincipal {
    //probar las clases creadas

    public static void main(String[] args) {
        //Crear un equipo

        Equipo equipo1 = new Equipo("Argentina", "Messi campeon del mundo");
        Equipo equipo2 = new Equipo("Francia", "segundo francia");

        //Crear un partido
        Partido partido1 = new Partido(equipo1, equipo2, 3, 2);

        System.out.printf(partido1.toString());

        // leer archivos en java


        System.out.println("\n********************************");
        System.out.println("Prueba de archivos:\n");

        // primer caso para los resultados
        String rutaPartidos= "Archivos/Partidos.txt";

        Path obtenerResultados= Paths.get(rutaPartidos);

        System.out.println("** RESULTADOS **");

        try (BufferedReader reader = Files.newBufferedReader(obtenerResultados)){
            String line;
            while((line= reader.readLine())!= null){
                System.out.println(line);
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
                System.out.println(line);
            }

        } catch (IOException error){
            System.out.println("Ha ocurrido un error:" +error);

        }

    }

}
