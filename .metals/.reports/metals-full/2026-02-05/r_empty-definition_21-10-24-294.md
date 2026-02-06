error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase04ArregloBidi.java:java/lang/System#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase04ArregloBidi.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1072
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana04/Clase04ArregloBidi.java
text:
```scala
package Semana04;

//Construya un arreglo de nombre c de
//2x6, cárguelo de tal manera que cada
//elemento de sus tres primeras columnas
//almacenen el valor cero y el resto de sus
//columnas el valor -1. Muestre el arreglo.

public class Clase04ArregloBidi {

    public static void main(String[] args) {

        // Crear un arreglo de 2 filas y 6 columnas
        int[][] c=new int[2][6];

        // Cargar el arreglo según la condición dada
        for (int i=0; i<2; i++) {          // Recorrer las filas
            for (int j=0; j<6; j++) {      // Recorrer las columnas
                if (j<3) {
                    c[i][j]=0;              // Las tres primeras columnas
                } else {
                    c[i][j]=-1;             // El resto de las columnas
                }
            }
        }

        // Mostrar el arreglo
        System.out.println("Arreglo c:");

        for (int i=0; i<2; i++) {
            for (int j=0; j<6; j++) {
                System.out.print(c[i][j]+ " ");
            }
            @@System.out.println();              // Salto de línea al final de cada fila
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#