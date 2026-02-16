package Semana12;

public class Paciente {

    String nombre;
    int edad;
    String prioridad;

    // Constructor
    public Paciente(String nombre, int edad, String prioridad) {
        this.nombre = nombre;
        this.edad = edad;
        this.prioridad = prioridad;
    }

    // Para imprimir bonito
    @Override
    public String toString() {
        return "Paciente: " + nombre + ", Edad: " + edad + ", Prioridad: " + prioridad;
    }
}
