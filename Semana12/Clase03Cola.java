package Semana12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;  //sirve para general numeros enteros aleatorios 

public class Clase03Cola {

    public static void main(String[] args) {

        Queue<Cliente> colaClientes=new LinkedList<>();
        Random random=new Random();

        // Agregar clientes a la cola
        colaClientes.add(new Cliente("Cliente 1", random.nextInt(10) + 1));
        colaClientes.add(new Cliente("Cliente 2", random.nextInt(10) + 1));
        colaClientes.add(new Cliente("Cliente 3", random.nextInt(10) + 1));
        colaClientes.add(new Cliente("Cliente 4", random.nextInt(10) + 1));

        int tiempoTotalEspera = 0;

        // Procesar cada cliente en la cola
        while (!colaClientes.isEmpty()) {

            Cliente clienteActual = colaClientes.poll(); // Desencolar cliente

            System.out.println("Atendiendo a: " + clienteActual.nombre);
            System.out.println("Tiempo de atención estimado: " +clienteActual.tiempoAtencion+ " minutos");

            System.out.println("Tiempo total de espera para " +clienteActual.nombre+ ": " +tiempoTotalEspera+ " minutos");

            tiempoTotalEspera += clienteActual.tiempoAtencion; // Actualizar espera
            System.out.println();
        }

        System.out.println("Todos los clientes han sido atendidos."); 
    }

    // Clase Cliente
    static class Cliente {
        String nombre;
        int tiempoAtencion;

        public Cliente(String nombre, int tiempoAtencion) {
            this.nombre=nombre;
            this.tiempoAtencion=tiempoAtencion;
        }
    }
}
