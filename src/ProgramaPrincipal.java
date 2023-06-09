import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ProgramaPrincipal {
    //probar las clases creadas

    public static void main(String[] args) {

        // leer archivos en java


        System.out.println("\n********************************");
        System.out.println("Prueba de archivos:\n");

        // primer caso para el archivo resultados
        String rutaPartidos = "Archivos/Partidos.txt";

        Path obtenerResultados = Paths.get(rutaPartidos);

        Ronda ronda1 = new Ronda("1");
        try {
            List<String> lines = Files.readAllLines(obtenerResultados);
            for (String line : lines) {
                String[] parts = line.split(" ");

                //obtener los datos del primer equipo y guardarlos en un objeto
                String primerEquipo = parts[0];
                int golesPrimerEquipo = Integer.parseInt(parts[1]);
                Equipo equipo1 = new Equipo(primerEquipo);

                //obtener los datos del segundo equipo y guardarlos en un objeto
                String segundoEquipo = parts[3];
                int golesSegundoEquipo = Integer.parseInt(parts[2]);
                Equipo equipo2 = new Equipo(segundoEquipo);

                //crear un objeto partido
                Partido partido = new Partido(equipo1, equipo2, golesPrimerEquipo, golesSegundoEquipo);

                //agregar el partido a la ronda
                ronda1.addPartido(partido);
            }
        } catch (IOException error) {
            System.out.println("Ha ocurrido un error:" + error);
        }


        //segundo caso se trata sobre el archivo pronosticos


        String RutaPronostico = "Archivos/Pronosticos.txt";
        Path obtenerPronostico = Paths.get(RutaPronostico);


        int puntos = 0;
        System.out.println("** PRONOSTICO **");

        try {
            List<String> lines = Files.readAllLines(obtenerPronostico);

            for (String line : lines) {
                String[] parts = line.split(" ");

                Pronostico pronostico = new Pronostico();

                //tomo la decision de agarrar el primer equipo para guardar el pronostico
                String primerEquipo = parts[0];

                //agrego el string a un nuevo objeto de tipo equipo
                Equipo equipo1 = new Equipo(primerEquipo);

                //agrego el equipo al pronostico
                pronostico.setEquipo(equipo1);

                //guardar el resultado del partido
                if (parts[1].equals("1")) {
                    pronostico.setResultado(ResultadoEnum.GANADOR);
                } else if (parts[3].equals("1")) {
                    pronostico.setResultado(ResultadoEnum.PERDEDOR);
                } else {
                    pronostico.setResultado(ResultadoEnum.EMPATE);
                }

                for (int i = 0; i < ronda1.size(); i++) {
                    if (ronda1.getPartidos().get(i).getEquipo1().getNombre().equals(pronostico.getEquipo().getNombre())) {
                        if (ronda1.getPartidos().get(i).resultado(ronda1.getPartidos().get(i).getEquipo1()).equals(pronostico.getResultado())) {
                            System.out.println("El usuario ha acertado");
                            puntos++;
                        } else {
                            System.out.println("El usuario ha fallado");
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "El usuario ha acertado: " + puntos + " veces respecto a los resultados de la ronda 1");

        } catch (IOException error) {
            System.out.println("Ha ocurrido un error:" + error);
        }


    }
}
