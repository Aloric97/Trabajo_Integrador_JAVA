public class ProgramaPrincipal {
    //probar las clases creadas

    public static void main(String[] args) {
        //Crear un equipo

        Equipo equipo1 = new Equipo("Argentina", "Messi campeon del mundo");
        Equipo equipo2 = new Equipo("Francia", "segundo francia");

        //Crear un partido
        Partido partido1 = new Partido(equipo1, equipo2, 3, 2);

        System.out.printf(partido1.toString());
    }

}
