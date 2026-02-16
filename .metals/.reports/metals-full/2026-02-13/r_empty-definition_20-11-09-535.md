error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase03Pila.java:java/util/Vector#isEmpty().
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase03Pila.java
empty definition using pc, found symbol in pc: java/util/Vector#isEmpty().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1559
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase03Pila.java
text:
```scala
package Semana11;

import java.util.Scanner;
import java.util.Stack;

public class Clase03Pila {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Stack<String> pila=new Stack<>();  //"string" almacena texto 
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
            scanner.nextLine();        //Para limpiar el buffer

            switch (opcion) {

                case 1:
                    System.out.print("¿Cuantos elementos desea agregar?: ");
                    int cantidad=scanner.nextInt();
                    scanner.nextLine();

                    for (int i=1; i<=cantidad; i++) {
                        System.out.print("Ingrese el valor " +i+ ": ");
                        String valor=scanner.nextLine();
                        System.out.println("Elemento " +i+ " agregado: " +valor);
                        pila.push(valor);   //"valor" se agrega con push a "pila"
                    } 
                    break;

                case 2: // Pop
                    if (!pila.i@@sEmpty()) {  //"Si la pila NO está vacía..."
                        String elementoEliminado=pila.pop();  //"pop" devuelve el elelemtno de la cima y lo elimina de la pila
                        System.out.println("Elemento eliminado: " +elementoEliminado);
                    } else {
                        System.out.println("La pila esta vacía, no se puede eliminar ningún elemento.");
                    }
                    break;

                case 3: // Peek
                    if (!pila.isEmpty()) {
                        System.out.println("Elemento en la cima: " +pila.peek());  //"peek" muestra el elemento que esta en la cima de la pila
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 4: // Recorrer pila
                    if (!pila.isEmpty()) {    //isEmpty() devuelve true si está vacía
                        System.out.println("Elementos en la pila:");
                        for (String elemento : pila) {   //elemento va tomando los valores de pila uno por uno, automáticamente
                            System.out.println(elemento);  //imprime cada elemento uno por uno.
                        }
                    } else {
                        System.out.println("La pila esta vacia.");
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

empty definition using pc, found symbol in pc: java/util/Vector#isEmpty().