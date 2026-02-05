package Semana04;
import java.util.Scanner;

//Realizar un programa que pida
//ingresar 3 números enteros, luego debe
//de imprimir los 3 números ingresado, la
//suma y promedio de los números.

public class Clase06ArregloBidi {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // Definir el tamaño del arreglo
        int tamaño=3;

        // Crear un arreglo unidimensional para almacenar los números
        int[] numeros=new int[tamaño];

        // Solicitar al usuario que ingrese los números
        System.out.println("Ingrese "+tamaño+" números enteros:");

        for (int i=0; i<tamaño; i++) {
            System.out.print("Número "+(i + 1)+": ");
            numeros[i]=scanner.nextInt();
        }

        // Calcular la suma
        int suma=0;
        for (int i=0; i<tamaño; i++) {
            suma=suma+numeros[i];
        }

        // Calcular el promedio
        double promedio=(double) suma/tamaño;

        // Mostrar los resultados
        System.out.println("\nNúmeros ingresados:");
        for (int i=0; i<tamaño; i++) {
            System.out.println("Número "+(i+1)+": " +numeros[i]);
        }

        System.out.println("Suma de los números: "+suma);
        System.out.println("Promedio de los números: "+promedio);

        scanner.close(); // Cerrar el Scanner
    }
}
