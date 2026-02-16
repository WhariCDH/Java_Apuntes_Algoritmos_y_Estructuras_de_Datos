error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase05Pila.java:java/lang/String#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase05Pila.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1200
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase05Pila.java
text:
```scala
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
                        @@String valor=scanner.nextLine();
                        System.out.println("Elemento " + i + " agregado: " +valor);
                        pila.push(valor);  //Estamos agregando "valor" en la pila 
                    }
                    break;

                case 2: // Pop
                    if (!pila.isEmpty()) {
                        String elementoEliminado = pila.pop();
                        System.out.println("Elemento eliminado: " + elementoEliminado);
                    } else {
                        System.out.println("La pila está vacía, no se puede eliminar ningún elemento.");
                    }
                    break;

                case 3: // Peek
                    if (!pila.isEmpty()) {
                        System.out.println("Elemento en la cima: " + pila.peek());
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

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#