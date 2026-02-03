package Semana03;
import java.util.Scanner;

//Del ejercicio N°03, Realizar el mismo
//procedimiento, pero ahora Ud. Debe de ingresar
//los números por teclado, y el número a buscar

public class Clase04ArrayUni {

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
            System.out.print("Numero en la posicion "+(i + 1)+" es: ");
            numeros[i]=scanner.nextInt();
        }

        // Solicitar el número a buscar
        System.out.print("Ingresa el numero que deseas buscar: ");
        int buscar=scanner.nextInt();

        // Variable para indicar si se encontró el elemento
        boolean encontrado=false;

        // Bucle para buscar el elemento en el arreglo
        for (int numero:numeros) {
            if (numero==buscar) {
                encontrado=true;
                break;
            }
        }

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El numero "+buscar+" fue encontrado en el arreglo.");
        } 
        else {
            System.out.println("El numero "+buscar+" no fue encontrado en el arreglo.");
        }
    }
}
