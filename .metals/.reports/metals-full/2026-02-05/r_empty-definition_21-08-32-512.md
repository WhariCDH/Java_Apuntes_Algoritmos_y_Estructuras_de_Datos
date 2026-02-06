error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06/Clase02ArrayLista.java:java/lang/System#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06/Clase02ArrayLista.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 902
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06/Clase02ArrayLista.java
text:
```scala
package Semana06;
import java.util.ArrayList;

public class Clase02ArrayLista {

    public static void main(String[] args) {

        // Crear un ArrayList para almacenar los cuadrados de los números
        ArrayList<String> listaCuadrados=new ArrayList<>();  //"ArrayList<String>" almacena texto 

        // Calcular los diez primeros cuadrados y almacenarlos en el ArrayList
        for (int i=1; i<=10; i++) {    //El contador va de i va de 1 a 10 
            listaCuadrados.add("El cuadrado de "+i+" es: "+i * i); // Añadir el cuadrado de i a la lista
        }

        // Mostrar el contenido de la lista
        System.out.println("Los diez primeros cuadrados son: ");

        // For-each: recorre el ArrayList y muestra los cuadrados almacenados
        for (String cuadrado : listaCuadrados) {   //Toma el valor de listaCuadrado y lo c¿guarda en cuadrado 
            @@System.out.println(cuadrado);          //Imprime 
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#