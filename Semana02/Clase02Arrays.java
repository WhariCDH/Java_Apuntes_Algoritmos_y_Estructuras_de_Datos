package Semana02;
// Realizar un programa que muestre los primeros 5 números pares.

public class Clase02Arrays {

    public static void main(String[] args) {

        int i;  //i es variable que se usa en los bucles for
        int cont=2;  //El bucle enpieza en 2
        int[] pares=new int[5];  //Array entero 

        System.out.println("Imprima los primeros 5 numeros pares");

        //Primer for para llenar
        for (i=0; i<pares.length; i++) {
            pares[i]=cont;  //guarda el número par
            cont=cont+2;    //Aumenta en 2 en 2 
        }

        //Segundo for para mostrar
        for (i=0; i<pares.length; i++) {
            System.out.println(pares[i]);  //Muestra la salida de los numeros 
        }
    }
}
