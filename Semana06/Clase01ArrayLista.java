package Semana06;
import java.util.ArrayList;

//El programa permite crear un ArrayList con
//diferentes valores (3 nombres con sus edades).

public class Clase01ArrayLista {
    public static void main(String[] args) {

        ArrayList<Persona> valores=new ArrayList<>();

        valores.add(new Persona("Juan",20));
        valores.add(new Persona("Mawina", 27));
        valores.add(new Persona("Morrian", 30));
        valores.add(new Persona("Deysi", 16));

        for (Persona p : valores) {
            System.out.println(p.nombre+ " - " +p.edad);
        }
    }
}