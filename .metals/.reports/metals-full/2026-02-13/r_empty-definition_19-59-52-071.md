error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase04V2Pila.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase04V2Pila.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 180
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase04V2Pila.java
text:
```scala
package Semana11;

public class Clase04V2Pila {
    
}
package Semana11;

import java.util.Scanner;
import java.util.Stack;

public class Clase04V2Pila {
    public stat@@ic void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<String> pila = new Stack<>(); // Pila usando la clase Stack
        int opcion;

        do {
            System.out.println("\n--- Menu del Navegador ---");
            System.out.println("1. Visitar nueva pagina web");
            System.out.println("2. Retroceder a la pagina anterior");
            System.out.println("3. Mostrar pagina actual");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la URL de la página: ");
                    String url = scanner.nextLine();

                    pila.push(url); // PUSH
                    System.out.println("Visitando: " + url);
                    break;

                case 2:
                    if (pila.isEmpty()) {
                        System.out.println("No hay más páginas a las que retroceder.");
                    } else {
                        String paginaAnterior = pila.pop(); // POP
                        System.out.println("Retrocediendo desde: " + paginaAnterior);
                    }
                    break;

                case 3:
                    if (pila.isEmpty()) {
                        System.out.println("No hay páginas abiertas.");
                    } else {
                        System.out.println("Página actual: " + pila.peek()); // PEEK
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del navegador...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 