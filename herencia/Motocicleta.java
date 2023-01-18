package herencia;
import clases.Motor;
import clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;

    public Motocicleta(){ }
    
    public Motocicleta(String fabricante, String modelo, Double cc, int year, boolean sport, Motor motor, boolean baul){
        // Metodo super, permite acceder a los atributos de la clase de la que se extiende.
        super(fabricante, modelo, cc, year, sport, motor);
        this.baul = baul;
    }
}
