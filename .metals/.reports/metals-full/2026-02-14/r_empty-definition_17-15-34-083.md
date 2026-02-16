error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase01Cola.java:java/lang/String#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase01Cola.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 254
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase01Cola.java
text:
```scala
package Semana12;

import java.util.LinkedList;  //Clase que implementa Queue
import java.util.Queue;       //Interfaz (define comportamiento de cola)

public class Clase01Cola {

    public static void main(String[] args) {

        Queue<Strin@@g> colaProcesos=new LinkedList<>();

        colaProcesos.add("Proceso A");
        colaProcesos.add("Proceso B");
        colaProcesos.add("Proceso C");

        while (!colaProcesos.isEmpty()) {
            System.out.println("Ejecutando: " +colaProcesos.poll());
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#