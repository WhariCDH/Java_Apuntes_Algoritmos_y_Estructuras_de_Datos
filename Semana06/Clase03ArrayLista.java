package Semana06;
import java.util.ArrayList;

//El programa permite mostrar un ArrayList
//con diferentes valores, donde se puede
//agregar, eliminar y Crear 

public class Clase03ArrayLista {

    public static void main(String[] args) {

        // Creación de una lista ArrayList de elementos de tipo String
        ArrayList<String> lista=new ArrayList<>();

        // Adición de elementos a la lista
        lista.add("Juan");
        lista.add("Maria");
        lista.add("Liset");
        lista.add("Jose");

        // Despliegue de los elementos de la lista
        System.out.println("La lista tiene los siguientes elementos: "+lista);

        // Añadir elementos en índices específicos
        lista.add(0, "Raul");                  //Agregar "Lista.add(posicion , "nuevo nombre")
        lista.add(1, "Justina");
        System.out.println("La lista actual agregando es: "+lista);

        // Eliminar elementos de la lista por valor
        lista.remove("Maria");                             //Para eliminar "lista.remove("nombre que se quiere eliminar")
        lista.remove("Liset");
        System.out.println("La lista actual eliminando es: "+lista);

        // Eliminar el elemento del índice dado
        lista.remove(1);                               //Tambien se puede eliminar con la posición del nombre 
        lista.remove(2);
        System.out.println("La lista actual es: "+lista);

        //Añadimos elemtos 
        lista.add(0, "Mawina");
        lista.add(1, "Deysi");
        System.out.println("La lista final agregando es: "+lista);
    }
}
