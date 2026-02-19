package Semana06_Practica;
import java.util.ArrayList;

public class ClasePersonalPractica01 {
    public static void main(String[] args) {
        ArrayList<String> numerocuadrado=new ArrayList<>();

        for (int i=1; i<=20; i++) {
            numerocuadrado.add("El numero de la posición " +i+ " es al cuadrado: " +i*i);

        System.out.println("Los primeros 20 numeros al cuadrado son los iguientes: ");

        for (String cuadrado : numerocuadrado){
            System.err.println(cuadrado);
        }

        }
    }
    
}
