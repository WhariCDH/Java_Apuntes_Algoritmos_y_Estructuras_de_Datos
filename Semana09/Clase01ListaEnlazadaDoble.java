package Semana09;

import java.util.LinkedList;
import java.util.Scanner;

public class Clase01ListaEnlazadaDoble {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        String valor;

        // Preguntar cuántos valores desea ingresar
        System.out.print("¿Cuántos valores desea ingresar?: ");
        int cantidadValores = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Ingreso de valores iniciales
        for (int i = 0; i < cantidadValores; i++) {
            System.out.print("Ingresa el valor #" + (i + 1) + ": ");
            valor = scanner.nextLine();
            lista.add(valor);
        }

        do {
            // Mostrar lista actual
            System.out.println("\n--- Lista Actual ---");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Índice " + i + ": " + lista.get(i));
            }

            // Menú de opciones
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar valor");
            System.out.println("2. Buscar valor");
            System.out.println("3. Editar valor");
            System.out.println("4. Eliminar valor");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el valor a agregar: ");
                    valor = scanner.nextLine();
                    lista.add(valor);
                    System.out.println("Valor agregado.");
                    break;

                case 2:
                    System.out.println("\n--- Buscar Valor ---");
                    System.out.print("Ingresa el valor a buscar: ");
                    valor = scanner.nextLine();

                    if (lista.contains(valor)) {
                        int indice = lista.indexOf(valor);
                        System.out.println(
                            "El valor '" + valor + "' se encuentra en el índice " + indice + "."
                        );
                    } else {
                        System.out.println("El valor '" + valor + "' no se encontró.");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el valor a editar: ");
                    valor = scanner.nextLine();

                    if (lista.contains(valor)) {
                        int indice = lista.indexOf(valor);
                        System.out.println(
                            "El valor '" + valor + "' se encuentra en el índice " + indice + "."
                        );
                        System.out.print("Ingresa el nuevo valor: ");
                        String nuevoValor = scanner.nextLine();
                        lista.set(indice, nuevoValor);
                        System.out.println("Valor editado.");
                    } else {
                        System.out.println("El valor '" + valor + "' no se encontró.");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa el valor a eliminar: ");
                    valor = scanner.nextLine();

                    if (lista.remove(valor)) {
                        System.out.println("Valor eliminado.");
                    } else {
                        System.out.println("El valor '" + valor + "' no se encontró.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
