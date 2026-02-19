package Semana06;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase04ArrayLista {

    public static void main(String[] args) {

        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner=new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero=scanner.nextInt();

        // Crear un ArrayList para almacenar los cuadrados
        ArrayList<Integer> listaCuadrados=new ArrayList<>();

        // Calcular los cuadrados de los números desde 1 hasta el número ingresado
        for (int i=1; i<=numero; i++) {
            listaCuadrados.add(i * i); // Añadir el cuadrado de i a la lista
        }

        // Mostrar el contenido de la lista
        System.out.println("Los cuadrados de los números desde 1 hasta "+numero+" son:");

        for (int i=1; i<=numero; i++) {
            System.out.println(i+ "^2 = " +listaCuadrados.get(i - 1));   //Si tu contador empieza en 1 y la lista empieza en 0 → usa i - 1.
         
        scanner.close();
        }
    }
}
