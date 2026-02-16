package Semana12;

import java.util.PriorityQueue;

public class Clase04Cola {

    public static void main(String[] args) {

        // Crear cola de prioridad usando el comparador
        PriorityQueue<Paciente> colaPacientes=new PriorityQueue<>(new ComparadorPrioridad());

        // Agregar pacientes
        colaPacientes.add(new Paciente("Juan", 65, "crítica"));
        colaPacientes.add(new Paciente("Maria", 50, "grave"));
        colaPacientes.add(new Paciente("Luis", 30, "leve"));

        // Atender pacientes por prioridad
        while (!colaPacientes.isEmpty()) {
            System.out.println("Atendiendo a: " + colaPacientes.poll());
        }
    }
}
