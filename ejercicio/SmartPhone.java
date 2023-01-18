package ejercicio;

public class SmartPhone extends SmartDevice{
    double largo;
    double ancho; 

    public SmartPhone(){}

    public SmartPhone(String marca, String modelo, int duracionBateria, double largo, double ancho){
        super(marca, modelo, duracionBateria);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ". Modelo: " + modelo + ". Duracion de la bateria: " + duracionBateria + " hrs. Largo: " + largo + ". Ancho: " + ancho + ".";  
    }
}
