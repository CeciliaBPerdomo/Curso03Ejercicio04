package clases;
import herencia.Camion;
import herencia.Coche;
import herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        // Clase identificador = new Clase()

        // Crear un objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        // Crear un objeto utilizando el constructor con parametros
        Motor motorGTI = new Motor("GIT", 190, 459.0, 6);
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, motorGTI);
        
        System.out.println(fordMondeo.year);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.velocidad);

        // Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        //kawasakiNinja.fabricante = "Kawasaki";

        // Polimorfismo
        Vehiculo vehiculo; 
        
        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // Clases abstractas: no se pueden instanciar, solo instancias las clases hijas
    }
}