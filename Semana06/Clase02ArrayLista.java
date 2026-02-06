package Semana06;
import java.util.ArrayList;

//El programa permite crear un ArrayList para
//almacenar los cuadrados de los 10 primeros
//números. Crear la clase llamada: cuadrado

public class Clase02ArrayLista {

    public static void main(String[] args) {

        // Crear un ArrayList para almacenar los cuadrados de los números
        ArrayList<String> listaCuadrados=new ArrayList<>();  //"ArrayList<String>" almacena texto 

        // Calcular los diez primeros cuadrados y almacenarlos en el ArrayList
        for (int i=1; i<=10; i++) {    //El contador va de i va de 1 a 10 
            listaCuadrados.add("El cuadrado de "+i+" es: "+i * i); // Añadir el cuadrado de i a la lista
        }

        // Mostrar el contenido de la lista
        System.out.println("Los diez primeros cuadrados son: ");

        // For-each: recorre el ArrayList y muestra los cuadrados almacenados
        for (String cuadrado : listaCuadrados) {   //Toma el valor de listaCuadrado y lo c¿guarda en cuadrado 
            System.out.println(cuadrado);          //Imprime 
        }
    }
}
