package Semana10;

import java.util.ArrayList;
import java.util.Scanner;

public class Pregunta03 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ingresar paciente");
            System.out.println("2. Editar paciente");
            System.out.println("3. Eliminar paciente");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Cuantos pacientes desea ingresar: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Nombre del paciente " + (i + 1) + ": ");
                        String nombre = scanner.nextLine();
                        lista.add(nombre);
                        System.out.println("Paciente agregado.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Pacientes Registrados ---");

                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("Índice " + i + ": " + lista.get(i));
                    }

                    System.out.print("Ingrese el índice del paciente a editar: ");
                    int indexEdit = scanner.nextInt();
                    scanner.nextLine();

                    if (indexEdit >= 0 && indexEdit < lista.size()) {
                        System.out.print("Nuevo nombre del paciente: ");
                        String nuevoNombre = scanner.nextLine();
                        lista.set(indexEdit, nuevoNombre);
                        System.out.println("Paciente editado correctamente.");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el índice del paciente que desea eliminar: ");
                    int indexRemove = scanner.nextInt();
                    scanner.nextLine();

                    if (indexRemove >= 0 && indexRemove < lista.size()) {
                        lista.remove(indexRemove);
                        System.out.println("Paciente eliminado correctamente.");
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
