package Semana03;
import java.util.Arrays;
import java.util.Scanner;

//Del ejercicio N°1, quiero que realice el mismo
//procedimiento, pero ahora que ingrese los números,
//para que luego me muestre el arreglo ordenado.

public class Clase02ArrayUni {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // Solicitar el tamaño del arreglo
        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamaño=scanner.nextInt();

        // Declarar e inicializar el arreglo
        int[] numeros=new int[tamaño];

        // Solicitar los elementos del arreglo
        System.out.println("Ingresa "+tamaño+" numeros:");

        for (int i=0; i<tamaño; i++) {
            System.out.print("Numero en la posicion "+(i + 1) +" es: ");
            numeros[i]=scanner.nextInt();
        }

        // Ordenar el arreglo
        Arrays.sort(numeros);

        // Mostrar los elementos del arreglo ordenado
        System.out.println("Arreglo ordenado: "+Arrays.toString(numeros));
        
        scanner.close();
    }
}
