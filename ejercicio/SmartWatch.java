package ejercicio;

public class SmartWatch extends SmartDevice {
    String forma;

    public SmartWatch(){}

    public SmartWatch(String marca, String modelo, int duracionBateria, String forma){
        super(marca, modelo, duracionBateria);
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ". Modelo: " + modelo + ". Duracion de la bateria: " + duracionBateria + " hrs. Forma: " + forma + ".";  
    }
}
