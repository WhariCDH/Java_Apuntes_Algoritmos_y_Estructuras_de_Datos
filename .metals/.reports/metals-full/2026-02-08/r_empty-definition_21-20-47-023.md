error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase02ListaEnlazadaSimple.java:java/util/LinkedList#addLast().
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase02ListaEnlazadaSimple.java
empty definition using pc, found symbol in pc: java/util/LinkedList#addLast().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1110
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase02ListaEnlazadaSimple.java
text:
```scala
package Semana08;

import java.util.LinkedList;
import java.util.Scanner;
public class Clase02ListaEnlazadaSimple {


public static void main(String[] args) {
// Creamos una lista enlazada de enteros
LinkedList<Integer> lista = new LinkedList<>();
Scanner scanner = new Scanner(System.in);

System.out.print("¿Cuantos valores desea ingresar?: ");
int n = scanner.nextInt();

for (int i = 0; i < n; i++) {
System.out.print("Ingrese el valor " + (i + 1) + ": ");
int valor = scanner.nextInt();

if (i == 0 || i == 1) {
// Los primeros dos valores se añaden automáticamente al final
lista.addLast(valor);

} else {
// A partir del tercer valor, preguntar si agregar al inicio o al final
System.out.println("¿Desea agregar este valor al inicio o al final?");
System.out.println("1. Inicio");
System.out.println("2. Final");
int opcion = scanner.nextInt();


switch (opcion) {
case 1 ->
lista.addFirst(valor); // Agrega al inicio
case 2 ->
lista.addLast(valor); // Agrega al final
default -> {
System.out.println("Opción no valida. Se agregara al final por defecto.");
lista.ad@@dLast(valor);
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/LinkedList#addLast().