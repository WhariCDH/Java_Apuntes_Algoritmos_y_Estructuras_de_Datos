package Semana12;

import java.util.LinkedList;
import java.util.Queue;

public class Clase02Cola {

    public static void main(String[] args) {

        Queue<String> cola1=new LinkedList<>();

        System.out.println("Insertamos tres elementos en la cola: Juan, Ana y Luis");

        cola1.add("Juan");
        cola1.add("Ana");
        cola1.add("Luis");

        System.out.println("Cantidad de elementos en la cola: " + cola1.size()); //"size" muestra la cantidad de elementos 

        System.out.println("Extraemos un elemento de la cola: " + cola1.poll()); //"poll" devuelve y elimina el primero 

        System.out.println("Cantidad de elementos en la cola: " + cola1.size());

        System.out.println("Consultamos el primer elemento de la cola sin extraerlo: " + cola1.peek());  //"peek" devuelve el primer elemento sin eliminarlo 

        System.out.println("Cantidad de elementos en la cola: " + cola1.size());

        System.out.println("Extraemos uno a uno cada elemento de la cola mientras no esté vacía:");

        while (!cola1.isEmpty()) {
            System.out.print(cola1.poll() +"-");
        }

        System.out.println();  //salto de linea 

        Queue<Integer> cola2=new LinkedList<>();

        cola2.add(70);
        cola2.add(120);
        cola2.add(6);

        System.out.println("\n=============================");
        System.out.println("Imprimimos la cola de enteros");

        for (Integer elemento : cola2) {
            System.out.print(elemento + "-");
        }

        System.out.println(); //salto de linea 

        System.out.println("Borramos toda la cola");

        cola2.clear();  //"clear" limpia todos los elementos

        System.out.println("Cantidad de elementos en la cola de enteros: " + cola2.size());

        System.out.println(); //salto de linea 

        Queue<String> cola3=new LinkedList<>();

        cola3.add("Mawina");
        cola3.add("Veronica");
        cola3.add("Morrian");
        cola3.add("Deysi");
        cola3.add("Veronica");

        System.out.println("\n**************************");
        System.out.println("Imprimimos personal de GT");
        int posicion=1;
        
        for (String gt : cola3) {
            System.out.println("Orden de personajes que me gusta de GT "+posicion+": "+gt);
            posicion++;
        }
    }
}
