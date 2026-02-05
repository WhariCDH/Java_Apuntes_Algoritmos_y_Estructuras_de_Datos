package Semana04;
import java.util.Scanner;

//Realizar un programa que muestre una matriz de enteros de 3*3.

public class Clase05ArregloBidi {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // Definir el tamaño de la matriz
        int tamaño=3;

        // Crear una matriz de 3x3
        int[][] matriz=new int[tamaño][tamaño];

        // Ingresar los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz 3x3:");

        for (int i=0; i<tamaño; i++) {
            for (int j=0; j<tamaño; j++) {
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j]=scanner.nextInt();
            }
        }

        // Imprimir la matriz original
        System.out.println("\nMatriz Original:");
        imprimirMatriz(matriz);

        // Calcular la matriz traspuesta
        int[][] matrizTraspuesta=calcularTraspuesta(matriz);

        // Imprimir la matriz traspuesta
        System.out.println("\nMatriz Traspuesta:");
        imprimirMatriz(matrizTraspuesta);

        // Verificar si la matriz es simétrica
        if (esSimetrico(matriz)) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz es asimétrica.");
        }

        scanner.close(); // Cerrar el Scanner
    }

    // Método para imprimir los elementos de una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea por fila
        }
    }

    // Método para calcular la matriz traspuesta
    public static int[][] calcularTraspuesta(int[][] matriz) {
        int tamaño=matriz.length;
        int[][] traspuesta=new int[tamaño][tamaño];

        for (int i=0; i<tamaño; i++) {
            for (int j=0; j<tamaño; j++) {
                traspuesta[j][i]=matriz[i][j];
            }
        }
        return traspuesta;
    }

    // Método que verifica si una matriz es simétrica
    public static boolean esSimetrico(int[][] matriz) {
        int tamaño=matriz.length;

        for (int i=0; i<tamaño; i++) {
            for (int j=0; j<tamaño; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false; // No es simétrica
                }
            }
        }
        return true; // Sí es simétrica
    }
}
