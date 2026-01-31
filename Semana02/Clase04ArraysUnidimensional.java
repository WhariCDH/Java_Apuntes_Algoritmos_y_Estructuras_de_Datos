package Semana02;

public class Clase04ArraysUnidimensional {

    public static void main(String[] args) {

        int[] numeros=new int[4];      
        String[] premio=new String[4];

        numeros[0]=99;
        numeros[1]=33;
        numeros[2]=23;
        numeros[3]=-89;

        premio[0]="PS5";
        premio[1]="Labadora";
        premio[2]="Laptop";
        premio[3]="Gorra";


        System.out.println("El valor en la posición 0 del arreglo es " + numeros[0]);
        System.out.println("El valor en la posición 1 del arreglo es " + numeros[1]);
        System.out.println("El valor en la posición 2 del arreglo es " + numeros[2]);
        System.out.println("El valor en la posición 3 del arreglo es " + numeros[3]);

        System.out.println("**********************************************");

        System.out.println("El premio de la posición 0 es una "+premio[0]);
        System.out.println("El premio de la posición 1 es una "+premio[1]);
        System.out.println("El premio de la posición 2 es una "+premio[2]);
        System.out.println("El premio de la posición 3 es una "+premio[3]);

        System.out.println("**********************************************");
        System.out.println("Fin del sistema....");

    }
}
