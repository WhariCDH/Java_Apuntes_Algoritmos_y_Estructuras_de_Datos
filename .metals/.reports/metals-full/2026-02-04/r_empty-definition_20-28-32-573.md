error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase02ArregloBidi.java:java/lang/String#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase02ArregloBidi.java
empty definition using pc, found symbol in pc: java/lang/String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 117
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase02ArregloBidi.java
text:
```scala
package Semana04;

import java.util.Scanner;

public class Clase02ArregloBidi {

    public static void main(St@@ring[] args) {

        Scanner scanner=new Scanner(System.in);

        // Crear una matriz de enteros de 3x3
        int[][] matriz=new int[3][3];

        // Ingresar los elementos de la matriz por teclado
        System.out.println("Ingrese los elementos de la matriz 3x3:");

        for (int i=0; i<3; i++) {                 // Recorrer las filas
            for (int j=0; j<3; j++) {             // Recorrer las columnas
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j]=scanner.nextInt();   // Leer el elemento desde el teclado
            }
        }

        // Mostrar la matriz ingresada
        System.out.println("\nMatriz ingresada:");

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j] + "\t"); // Tabulación entre elementos
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        scanner.close(); // Cerrar el Scanner
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#