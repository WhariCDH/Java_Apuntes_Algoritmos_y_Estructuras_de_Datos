package Semana04;

//Realizar un programa que muestre una matriz de
//enteros de 3*3.

public class Clase01ArregloBidi {
    public static void main(String[] args) {

        int[][] matriz={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz
        System.out.println("Matriz:");

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print("["+i+"]["+j+"]= "+matriz[i][j]+ " ");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}

