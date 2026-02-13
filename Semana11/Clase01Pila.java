package Semana11;
import java.util.Stack;    //clase pila

//Crear un programa en Java que
//permita gestionar una pila de
//números enteros, utilizando las
//operaciones básicas de una pila: agregar, consultar y eliminar elementos.

public class Clase01Pila {

    public static void main(String[] args) {

        Stack<Integer> pila=new Stack<>();   //"<Integer>" verción primitiva de int 

        // Agregar elementos a la pila
        pila.push(10);   //"push" agrega elementos a la pila 
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(80);
        pila.push(50);    

        // Mostrar el elemento superior de la pila
        System.out.println("Elemento en la cima: " + pila.peek());   //"peek" agrega el elemento que esta en la cima de la pila

        // Retirar el elemento superior de la pila
        System.out.println("Elemento eliminado: " + pila.pop());     //"pop" devuelve el elemento superior de la pila y lo retira 

        // Mostrar la pila después de eliminar
        System.out.println("Pila después de eliminar un elemento: " +pila);
    }
}
