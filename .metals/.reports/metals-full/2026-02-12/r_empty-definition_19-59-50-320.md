error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase02Pila.java:java/util/Stack#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase02Pila.java
empty definition using pc, found symbol in pc: java/util/Stack#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 422
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase02Pila.java
text:
```scala
package Semana11;
import java.util.Scanner;   
import java.util.Stack;   //importar clase pila 

//Crear un programa en Java que
//permita gestionar una pila de 4
//números enteros, utilizando las
//operaciones básicas de una pila:
//agregar, eliminar y consultar elementos.

public class Clase02Pila {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        S@@tack<Integer> pila=new Stack<>();

        System.out.println("Ingrese 4 números para agregar a la pila:");

        for (int i=0; i<4; i++) {
            System.out.print("Número " +(i + 1)+ ": ");
            int numero=scanner.nextInt();
            pila.push(numero);  //el valor guardado en "numero" se agregara en la pila
        }

        System.out.println("\nElemento en la cima: " +pila.peek());
        System.out.println("Elemento eliminado: " +pila.pop()); // Muestra y elimina el último número ingresado
        System.out.println("Pila después de eliminar un elemento: " +pila);

        scanner.close(); // Cerrar el Scanner
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Stack#