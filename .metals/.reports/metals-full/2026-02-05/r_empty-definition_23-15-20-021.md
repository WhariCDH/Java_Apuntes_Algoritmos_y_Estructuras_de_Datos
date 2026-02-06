error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase02ListaEnlazadas.java:_empty_/Nodo#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase02ListaEnlazadas.java
empty definition using pc, found symbol in pc: _empty_/Nodo#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 126
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase02ListaEnlazadas.java
text:
```scala
package Semana07;

public class Clase02ListaEnlazadas {
    
public static void main(String[] args) {
Nodo primer = new N@@odo("Ejemplo");
Nodo segundo = new Nodo(45);
Nodo tercer = new Nodo("Hola");
primer.enlazarSiguiente(segundo);
primer.obtenerSiguiente().enlazarSiguiente(tercer);
System.out.println(primer
.obtenerSiguiente()
/* .obtenerSiguiente()*/
.obtenerValor().toString());
}
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Nodo#