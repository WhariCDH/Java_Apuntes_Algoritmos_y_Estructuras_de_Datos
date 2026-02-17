error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13_3Ejemplo/ClaseEjemploArbol.java:java/lang/System#out.
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13_3Ejemplo/ClaseEjemploArbol.java
empty definition using pc, found symbol in pc: java/lang/System#out.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 538
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13_3Ejemplo/ClaseEjemploArbol.java
text:
```scala
package Semana13_3Ejemplo;

public class ClaseEjemploArbol {
    
    public static void main(String[] args) {

        ArbolBinarioEjemplo arbol=new ArbolBinarioEjemplo();

        arbol.insertar(20);
        arbol.insertar(15);
        arbol.insertar(100);
        arbol.insertar(67);
        arbol.insertar(10);
        arbol.insertar(55);

        System.out.println("Recorido en orden de los valores:");
        arbol.recorridoEnOrden();

        System.out.println("\n\nBusqueda de los valores");
        System.o@@ut.println("¿Existe el valor 20?" +arbol.buscar(20));
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#out.