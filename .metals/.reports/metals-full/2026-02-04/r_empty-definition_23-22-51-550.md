error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase06ArregloBidi.java:java/util/Scanner#nextInt().
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase06ArregloBidi.java
empty definition using pc, found symbol in pc: java/util/Scanner#nextInt().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 643
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase06ArregloBidi.java
text:
```scala
package Semana04;

import java.util.Scanner;

public class Clase06ArregloBidi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo
        int tamaño = 3;

        // Crear un arreglo unidimensional para almacenar los números
        int[] numeros = new int[tamaño];

        // Solicitar al usuario que ingrese los números
        System.out.println("Ingrese " + tamaño + " números enteros:");

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.next@@Int();
        }

        // Calcular la suma
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += numeros[i];
        }

        // Calcular el promedio
        double promedio = (double) suma / tamaño;

        // Mostrar los resultados
        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        System.out.println("Suma de los números: " + suma);
        System.out.println("Promedio de los números: " + promedio);

        scanner.close(); // Cerrar el Scanner
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#nextInt().