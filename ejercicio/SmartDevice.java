package ejercicio;

public class SmartDevice {
    /* Definir la estructura
        1. Atributos
        2. Constructores
        3. Metodos (comportamiento)
    */

    // 1. Atributos
    String marca;
    String modelo;
    int duracionBateria;
    
    //2. Constructores
    public SmartDevice(){}

    public SmartDevice(String marca, String modelo, int duracionBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.duracionBateria = duracionBateria;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ". Modelo: " + modelo + ". Duracion de la bateria: " + duracionBateria;  
    }
}
