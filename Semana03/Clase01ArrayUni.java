package Semana03;
import java.util.Arrays;

//Realizar un programa que muestre el ordenar un
//arreglo (utilizando el método Arrays.sort)

public class Clase01ArrayUni {
    public static void main(String[] args) {

        int[] numeros={8, 5, 3, 1, 4, 2, 6};   //Arreglo unidemencional de tipo entero desordenado 

        // Ordenar el arreglo de menor a mayor 
        Arrays.sort(numeros); 

        // Mostrar los elementos del arreglo ordenado
        System.out.println("Arreglo ordenado: "+Arrays.toString(numeros));  //+Arrays.toString(numeros) combierte el arreglo en texto 
    }
}