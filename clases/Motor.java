package clases;

public class Motor {
    String modeloMotor;
    int caballos;
    double rm; 
    int numCilindros;    

    public Motor() {

    }

    public Motor(String modeloMotor, int caballos, double rm, int numCilindros){
        this.modeloMotor = modeloMotor;
        this.caballos = caballos;
        this.rm = rm;
        this.numCilindros = numCilindros;
    }
}
