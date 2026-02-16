error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13_2/Clase02ArbolBinario.java:java/lang/System#out.
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13_2/Clase02ArbolBinario.java
empty definition using pc, found symbol in pc: java/lang/System#out.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 557
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13_2/Clase02ArbolBinario.java
text:
```scala
package Semana13_2;

public class Clase02ArbolBinario {

    public static void main(String[] args) {

        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Recorrido en orden:");
        arbol.gato(); // 20 30 40 50 60 70 80

        System.out.println("\n\nBusqueda de valores:");
        System.ou@@t.println("¿Existe el valor 40? " + arbol.buscar(40)); // true
        System.out.println("¿Existe el valor 25? " + arbol.buscar(25)); // false
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#out.