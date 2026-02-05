error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase01ArregloBidi.java:_empty_/Array#length.
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase01ArregloBidi.java
empty definition using pc, found symbol in pc: _empty_/Array#length.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 445
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase01ArregloBidi.java
text:
```scala
package Semana04;

//Realizar un programa que muestre una matriz de
//enteros de 3*3.

public class Clase01ArregloBidi {
    public static void main(String[] args) {

        int[][] matriz={   //matris de enteros que contiene 3 filas y 3 columnas
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz
        System.out.println("Matriz:");

        for (int i=0; i<matriz@@.length; i++) {              //i representa la fila y matriz.length devuelve el número de filas (3).
            for (int j=0; j<matriz[i].length; j++) { 
                System.out.print("["+i+"]["+j+"]= "+matriz[i][j]+" ");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Array#length.