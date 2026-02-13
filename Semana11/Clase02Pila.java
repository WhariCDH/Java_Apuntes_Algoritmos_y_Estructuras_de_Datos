package Semana11;
import java.util.Scanner;   
import java.util.Stack;   //importar clase pila 

//Crear un programa en Java que
//permita gestionar una pila de 4
//números enteros, utilizando las
//operaciones básicas de una pila:
//agregar, eliminar y consultar elementos.

public class Clase02Pila {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Stack<Integer> pila=new Stack<>();  //"Integer" la verción primitiva de int 

        System.out.println("Ingrese 4 números para agregar a la pila:");

        for (int i=0; i<4; i++) {
            System.out.print("Número " +(i + 1)+ ": ");
            int numero=scanner.nextInt();
            pila.push(numero);  //el valor guardado en "numero" se agregara en la pila
        }

        System.out.println("\nElemento en la cima: " +pila.peek());
        System.out.println("Elemento eliminado: " +pila.pop()); // Muestra y elimina el último número ingresado
        System.out.println("Pila después de eliminar un elemento: " +pila);

        scanner.close(); // Cerrar el Scanner
    }
}
