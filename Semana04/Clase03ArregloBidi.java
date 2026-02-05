package Semana04;

//Realizar un programa que muestre
//una matriz de enteros de 3*3, del
//ejercicio anterior, ahora muestre la
//suma de cada fila y columna.

public class Clase03ArregloBidi {

    public static void main(String[] args) {

        int[][] matriz= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz
        System.out.println("Matriz:");

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print("["+i+"]["+j+"]=" +matriz[i][j]+ " ");
            }
            System.out.println();  //salto de linea 
        }

        // Suma de cada fila
        for (int i=0; i<matriz.length; i++) {
            int sumaFila=0;

            for (int j=0; j<matriz[i].length; j++) {
                sumaFila=sumaFila+matriz[i][j];
            }

            System.out.println("Suma de la fila "+(i + 1)+": " +sumaFila);
        }

        // Suma de cada columna
        for (int j=0; j<matriz[0].length; j++) {
            int sumaColumna=0;

            for (int i=0; i<matriz.length; i++) {
                sumaColumna=sumaColumna+matriz[i][j];
            }

            System.out.println("Suma de la columna "+(j + 1)+": " +sumaColumna);
        }
    }
}
