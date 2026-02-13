error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase01Pila.java:java/util/Stack#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase01Pila.java
empty definition using pc, found symbol in pc: java/util/Stack#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 134
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase01Pila.java
text:
```scala
package Semana11;

import java.util.Stack;

public class Clase01Pila {

    public static void main(String[] args) {

        @@Stack<Integer> pila=new Stack<>();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        // Mostrar el elemento superior de la pila
        System.out.println("Elemento en la cima: " + pila.peek());

        // Retirar el elemento superior de la pila
        System.out.println("Elemento eliminado: " + pila.pop());

        // Mostrar la pila después de eliminar
        System.out.println("Pila después de eliminar un elemento: " +pila);
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Stack#