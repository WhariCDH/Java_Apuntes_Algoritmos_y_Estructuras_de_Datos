package Semana08;
import java.util.Scanner;

public class Clase02prueba {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese la nota: ");
            nota=scanner.nextInt();
        } 
        while (nota < 0 || nota > 20);

        scanner.close();

    }
}
