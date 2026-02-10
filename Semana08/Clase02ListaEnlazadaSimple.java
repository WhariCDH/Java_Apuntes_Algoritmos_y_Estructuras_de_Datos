package Semana08;

import java.util.LinkedList;
import java.util.Scanner;

public class Clase02ListaEnlazadaSimple {

    public static void main(String[] args) {

        // Creamos una lista enlazada de enteros
        LinkedList<Integer> lista=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.print("¿Cuántos valores desea ingresar?: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();

            // Los dos primeros valores se agregan automáticamente al final
            if (i == 0 || i == 1) {
                lista.addLast(valor);
            } else {
                // A partir del tercer valor se pregunta dónde insertar
                System.out.println("¿Desea agregar este valor al inicio o al final?");
                System.out.println("1. Inicio");
                System.out.println("2. Final");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> lista.addFirst(valor);
                    case 2 -> lista.addLast(valor);
                    default -> {
                        System.out.println("Opción no válida. Se agregará al final por defecto.");
                        lista.addLast(valor);
                    }
                }
            }

            // Mostrar la lista después de cada inserción
            System.out.println("Lista actual: " + lista);
        }

        System.out.println("Valores finales en la lista enlazada: " + lista);
        scanner.close();
    }
}
