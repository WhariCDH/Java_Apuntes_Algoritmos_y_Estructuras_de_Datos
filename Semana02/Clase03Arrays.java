package Semana02;

import java.util.Scanner;

public class Clase03Arrays {

    public static void main(String[] args) {

        float[] notas=new float[4];   //float es un tipo de dato numérico que sirve para números con decimales.
        float suma=0;   //Empiesa en 0 el bucle del array
        float promedio;
        int cant=0;

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduzca la cantidad de notas a ingresar:");
        cant=entrada.nextInt();

        System.out.println("Introduzca notas:");
        System.out.println("**********************************************");

        for (int i=1; i<=cant; i++) {
            System.out.print("Ingrese la nota "+i+"del estudiante: ");
            notas[i]=entrada.nextInt();
            suma=suma+notas[i];
        }

        promedio=suma/cant;

        System.out.println("**********************************************");
        System.out.println("Tu promedio es: "+promedio);

        if (promedio>10) {
            System.out.println("Estas aprobado");
            System.out.println("**********************************************");
        } 
        else {
            System.out.println("No estas desaprobado");
            System.out.println("**********************************************");
        }
    }
}
