package Semana03;
import java.util.Arrays;

public class Clase05ArrayUni {

    public static void main(String[] args) {

        // Declarar e inicializar tres arreglos
        int[] arreglo1 = {3, 5, 7, 9, 11, 18};
        int[] arreglo2 = {3, 5, 7, 9, 11, 18};
        int[] arreglo3 = {3, 5, 8, 9, 11, 4};

        // Comparar si dos arreglos son iguales
        boolean sonIguales1y2 = Arrays.equals(arreglo1, arreglo2);
        boolean sonIguales1y3 = Arrays.equals(arreglo1, arreglo3);

        // Mostrar los resultados de la comparación
        System.out.println("¿Son iguales arreglo1 y arreglo2? " + sonIguales1y2);
        System.out.println("¿Son iguales arreglo1 y arreglo3? " + sonIguales1y3);

        // Comparar elementos uno a uno entre arreglo1 y arreglo3
        System.out.println("\nComparacion de elementos entre arreglo1 y arreglo3:");

        for (int i = 0; i < arreglo1.length; i++) {

            if (arreglo1[i] == arreglo3[i]) {
                System.out.println("Elemento " + i + ": Igual (" + arreglo1[i] + ")");
            } else if (arreglo1[i] > arreglo3[i]) {
                System.out.println("Elemento " + i + ": Mayor (" + arreglo1[i] + " > " + arreglo3[i] + ")");
            } else {
                System.out.println("Elemento " + i + ": Menor (" + arreglo1[i] + " < " + arreglo3[i] + ")");
            }
        }
    }
}
