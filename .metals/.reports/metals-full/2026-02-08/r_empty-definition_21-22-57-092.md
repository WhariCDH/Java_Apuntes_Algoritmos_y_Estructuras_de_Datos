error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase02ListaEnlazadaSimple.java:java/lang/System#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase02ListaEnlazadaSimple.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1283
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase02ListaEnlazadaSimple.java
text:
```scala
package Semana08;

import java.util.LinkedList;
import java.util.Scanner;

public class Clase02ListaEnlazadaSimple {

    public static void main(String[] args) {

        // Creamos una lista enlazada de enteros
        LinkedList<Integer> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

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
                        Syste@@m.out.println("Opción no válida. Se agregará al final por defecto.");
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

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#