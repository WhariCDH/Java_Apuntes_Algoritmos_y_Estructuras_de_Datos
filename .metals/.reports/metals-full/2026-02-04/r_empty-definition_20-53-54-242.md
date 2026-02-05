error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase03ArregloBidi.java:java/lang/System#out.
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase03ArregloBidi.java
empty definition using pc, found symbol in pc: java/lang/System#out.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 518
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase03ArregloBidi.java
text:
```scala
package Semana04;

public class Clase03ArregloBidi {

    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz
        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]=" + matriz[i][j] + " ");
            }
            System.@@out.println();
        }

        // Suma de cada fila
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }

            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }

        // Suma de cada columna
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;

            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }

            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#out.