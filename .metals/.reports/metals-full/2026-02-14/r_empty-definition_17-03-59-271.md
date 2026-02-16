error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase01Cola.java:java/util/Queue#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase01Cola.java
empty definition using pc, found symbol in pc: java/util/Queue#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 164
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase01Cola.java
text:
```scala
package Semana12;

import java.util.LinkedList;
import java.util.Queue;

public class Clase01Cola {

    public static void main(String[] args) {

        @@Queue<String> colaProcesos=new LinkedList<>();

        colaProcesos.add("Proceso A");
        colaProcesos.add("Proceso B");
        colaProcesos.add("Proceso C");

        while (!colaProcesos.isEmpty()) {
            System.out.println("Ejecutando: " + colaProcesos.poll());
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Queue#