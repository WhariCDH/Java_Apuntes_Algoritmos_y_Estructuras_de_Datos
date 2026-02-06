error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase03ListaEnlazada.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase03ListaEnlazada.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 112
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase03ListaEnlazada.java
text:
```scala
package Semana07;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase03ListaEnlazada@@ {
public static void main(String[] args) {
ArrayList<Double> notas = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
int opcion;
do {
System.out.println("\n--- Menu ---");
System.out.println("1. Ingresar notas");
System.out.println("2. Mostrar promedio de
las notas");
System.out.println("3. Mostrar la nota
mayor");
System.out.println("4. Salir");
System.out.print("Elija una opcion: ");
opcion = scanner.nextInt()

switch (opcion) {
case 1:
notas.clear(); // Limpiamos la lista antes de ingresar nuevas notas
System.out.print("¿Cuantas notas desea ingresar?: ");
int cantidadNotas = scanner.nextInt();
for (int i = 0; i < cantidadNotas; i++) {
double nota;
do {
System.out.print("Ingrese la nota " + (i + 1) + " (entre 0 y 20): ");
nota = scanner.nextDouble();
if (nota < 0 || nota > 20) {
System.out.println("Error: la nota debe estar entre 0 y 20.");
}
} while (nota < 0 || nota > 20); // Validar que la nota esté en el rango
notas.add(nota);
}
System.out.println("Notas ingresadas correctamente.");
break;
case 2:
```


#### Short summary: 

empty definition using pc, found symbol in pc: 