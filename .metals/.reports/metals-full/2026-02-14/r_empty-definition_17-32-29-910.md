error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase02Cola.java:java/util/LinkedList#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase02Cola.java
empty definition using pc, found symbol in pc: java/util/LinkedList#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1231
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase02Cola.java
text:
```scala
package Semana12;

import java.util.LinkedList;
import java.util.Queue;

public class Clase02Cola {

    public static void main(String[] args) {

        Queue<String> cola1=new LinkedList<>();

        System.out.println("Insertamos tres elementos en la cola: Juan, Ana y Luis");

        cola1.add("Juan");
        cola1.add("Ana");
        cola1.add("Luis");

        System.out.println("Cantidad de elementos en la cola: " + cola1.size()); //"size" muestra la cantidad de elementos 

        System.out.println("Extraemos un elemento de la cola: " + cola1.poll()); //"poll" devuelve y elimina el primero 

        System.out.println("Cantidad de elementos en la cola: " + cola1.size());

        System.out.println("Consultamos el primer elemento de la cola sin extraerlo: " + cola1.peek());  //"peek" devuelve el primer elemento sin eliminarlo 

        System.out.println("Cantidad de elementos en la cola: " + cola1.size());

        System.out.println("Extraemos uno a uno cada elemento de la cola mientras no esté vacía:");

        while (!cola1.isEmpty()) {
            System.out.print(cola1.poll());
        }

        System.out.println();

        Queue<Integer> cola2 = new Linke@@dList<>();

        cola2.add(70);
        cola2.add(120);
        cola2.add(6);

        System.out.println("\n=============================");
        System.out.println("Imprimimos la cola de enteros");

        for (Integer elemento : cola2) {
            System.out.print(elemento + "-");
        }

        System.out.println();

        System.out.println("Borramos toda la cola");

        cola2.clear();

        System.out.println("Cantidad de elementos en la cola de enteros: " + cola2.size());
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/LinkedList#