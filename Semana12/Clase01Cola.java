package Semana12;
import java.util.LinkedList;  //es una clase que implementa Queue
import java.util.Queue;       //es una interfaz que define el comportamiento de una cola (FIFO).

//Programa que permita utilizar
//la interfaz Queue y mediante la
//clase LinkedList administre la lista
//colaProcesos, para imprimir
//según el orden que se agregado.

public class Clase01Cola {

    public static void main(String[] args) {

        Queue<String> colaProcesos=new LinkedList<>();

        colaProcesos.add("Proceso A");
        colaProcesos.add("Proceso B");
        colaProcesos.add("Proceso C");

        while (!colaProcesos.isEmpty()) {  //"while" Mientras la cola no esté vacía, se ejecuta el bloque
            System.out.println("Ejecutando: " +colaProcesos.poll());  //"poll" Devuelve el primer elemento y Lo elimina de la cola.
        }
    }
}
