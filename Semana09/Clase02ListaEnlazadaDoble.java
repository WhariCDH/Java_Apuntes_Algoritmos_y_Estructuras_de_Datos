package Semana09;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase02ListaEnlazadaDoble {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> valores=new ArrayList<>();

        int opcion;
        int n;

        do {
            // Mostrar el menú de opciones
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ingresar los valores");
            System.out.println("2. Sumar los valores");
            System.out.println("3. Restar los valores");
            System.out.println("4. Multiplicar los valores");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            opcion=scanner.nextInt();   //Se guardara en opcion lo escrito en la consola 

            switch (opcion) {

                case 1:
                    valores.clear(); // Limpiar lista antes de ingresar nuevos valores

                    System.out.print("¿Cuantos valores deseas ingresar?: ");
                    n=scanner.nextInt();  //Guarda la cantidad de numeros que queremos ingresar 

                    // Ingresar los "n" valores
                    for (int i=0; i<n; i++) {
                        System.out.print("Ingresa el valor " + (i+1) + ": ");
                        double valor=scanner.nextDouble();  //el valor escrito se guarda en "valor"
                        valores.add(valor); // Lo guardado en "valor" se guarda en la lista "valores" 
                    }

                    System.out.println("Valores ingresados correctamente.");
                    break;

                case 2:
                    if (valores.isEmpty()) {   //"isEmpty()" verifica si la lista esta vacia 
                        System.out.println("Primero debes ingresar los valores (opción 1).....");
                    } else {   //Si la lista no esta vacia 
                        // Sumar todos los valores en la lista
                        double suma=0;  //Se crea una variable llamada "suma" que empieza en 0
                        for (double valor : valores) {  //for toma uno a uno de cada valor que esta dentro de la variable "valores" que se ira guardando uno en uno en "valor"
                            suma=suma+valor; //se sumara uno en uno cada variable de valor hasta tener toda la suma
                        }
                        System.out.println("La suma de los valores es: " +suma);
                    }
                    break;

                case 3:
                    if (valores.isEmpty()) {
                        System.out.println("Primero debes ingresar los valores (opción 1).");
                    } else {
                        // Restar los valores en secuencia
                        double resta=valores.get(0);
                        for (int i=1; i<valores.size(); i++) {
                            resta=resta-valores.get(i);
                        }
                        System.out.println("La resta de los valores es: " + resta);
                    }
                    break;

                case 4:
                    if (valores.isEmpty()) {
                        System.out.println("Primero debes ingresar los valores (opción 1).");
                    } else {
                        // Multiplicar todos los valores en la lista
                        double multiplicacion=1;  //por 1 por que si multiplica *0 todo sale 0
                        for (double valor : valores) {
                            multiplicacion= multiplicacion*valor;
                        }
                        System.out.println("La multiplicacion de los valores es: " + multiplicacion);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no valida, por favor intenta de nuevo.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
