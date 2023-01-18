package clases;

public class Vehiculo {
    /* Definir la estructura
        1. Atributos
        2. Constructores
        3. Metodos (comportamiento)
    */

    // 1. Atributos
    protected String modelo;
    protected String fabricante;
    protected Double cc;
    protected int year;
    protected boolean sport;
    protected int velocidad;
    
    // Encapasulamiento
    protected Motor motor;


    // 2. Constructor
    public Vehiculo() {}

    // Sobrecarga
    public Vehiculo(String fabricante, String modelo, Double cc, int year, boolean sport, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo; 
        this.cc = cc; 
        this.year = year; 
        this.sport = sport;
        this.velocidad = 0;
        this.motor = motor;
    }


    // 3. Metodos
    public void acelerar(int cantidad){
        if (cantidad <= 120 && cantidad > 0 ){
            this.velocidad += cantidad;
        } else {
            System.out.println("La velocidad no esta dentro del rango");
        }
    }


}
