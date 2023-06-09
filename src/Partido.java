import java.util.Objects;

public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    //Constructor por defecto
    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    //Setter y getter de mi clase
    public Equipo getEquipo1(){
        return this.equipo1;
    }

    public Equipo getEquipo2(){
        return this.equipo2;
    }

    public int getGolesEquipo1(){
        return this.golesEquipo1;
    }


    public int getGolesEquipo2(){
        return this.golesEquipo2;
    }

    public void setEquipo1(Equipo equipo1){
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2){
        this.equipo2 = equipo2;
    }

    public void setGolesEquipo1(int golesEquipo1){
        this.golesEquipo1 = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2){
        this.golesEquipo2 = golesEquipo2;
    }

    //Metodo para mostrar el resultado del partido

    public ResultadoEnum resultado( Equipo equipo){
        if (golesEquipo1 > golesEquipo2){
            if (equipo == equipo1){
                return ResultadoEnum.GANADOR;
            }else{
                return ResultadoEnum.PERDEDOR;
            }
        }else if (golesEquipo1 < golesEquipo2){
            if (equipo == equipo2){
                return ResultadoEnum.GANADOR;
            }else{
                return ResultadoEnum.PERDEDOR;
            }
        }else{
            return ResultadoEnum.EMPATE;
        }
    }


}
