package Semana06;
import java.util.ArrayList;

//El programa permite crear un ArrayList con
//diferentes valores (3 nombres con sus edades).

public class Clase01ArrayLista {
    public static void main(String[] args) {

        ArrayList valores=new ArrayList();

        valores.add("Juan");   //"valores.add" agrega valores al array en el orden que se agrega 
        valores.add(20);
        valores.add("Pedro");
        valores.add(18);
        valores.add("Carla");
        valores.add(30);

        for (int i=0; i<valores.size(); i++) {   //"valores.size" devuelve los valores al array
            System.out.println(valores.get(i));  //"valores.get(i)" obtiene el elemento en la posición i
        }
    }
}