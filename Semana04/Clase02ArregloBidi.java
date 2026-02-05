package Semana04;

import java.util.Scanner;

public class Clase02ArregloBidi {

    public static void main(String[] args) {


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
        System.out.println("\nMatriz ingresada:");  // "\n" salto de linea 

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("["+i+"]["+j+"]="+matriz[i][j]+ "\t"); // "\t" espacio horizontal 
            }
            System.out.println(); // Salto de línea al final de cada fila 
        }

        scanner.close(); // Cerrar el Scanner
    }
}
