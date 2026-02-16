package Semana11;

import java.util.Scanner;
import java.util.Stack;

public class Clase05Pila {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Stack<String> pila=new Stack<>();
        int opcion;

        do {
            System.out.println("\n--- Menu de opciones ---");
            System.out.println("1. Agregar elementos (push)");
            System.out.println("2. Eliminar elemento (pop)");
            System.out.println("3. Mostrar elemento en la cima (peek)");
            System.out.println("4. Recorrer pila (mostrar elementos)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion=scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("¿Cuantos elementos desea agregar?: ");
                    int cantidad=scanner.nextInt();
                    scanner.nextLine();

                    for (int i=1; i<=cantidad; i++) {
                        System.out.print("Ingrese el valor " +i+ ": ");
                        String valor=scanner.nextLine();
                        pila.push(valor);  //Estamos agregando "valor" en la pila 
                        System.out.println("Elemento " +i+ " agregado: " +valor);
                    }
                    break;

                case 2: // Pop
                    if (!pila.isEmpty()) {  //Si la pila no esta vacia 
                        String elementoEliminado=pila.pop();  //"pop" devuleve el elemento de la cima y lo retira
                        System.out.println("Elemento eliminado: " +elementoEliminado);
                    } else {
                        System.out.println("La pila está vacía, no se puede eliminar ningún elemento.");
                    }
                    break;

                case 3: // Peek
                    if (!pila.isEmpty()) {
                        System.out.println("Elemento en la cima: " +pila.peek());  //"peek" devuelve el elemento de la cima sin retirarlo 
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 4: // Recorrer
                    if (!pila.isEmpty()) {
                        System.out.println("Elementos en la pila:");
                        for (String elemento : pila) {
                            System.out.println(elemento);
                        }
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
