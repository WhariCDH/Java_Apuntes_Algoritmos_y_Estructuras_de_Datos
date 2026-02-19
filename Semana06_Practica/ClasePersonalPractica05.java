package Semana06_Practica;
import java.util.Scanner;
import java.util.ArrayList;

public class ClasePersonalPractica05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> valor=new ArrayList<>();

        System.out.print("Escribia los numero de loteria que quisieras del 1 al 10: ");
        int loteria=scanner.nextInt();

        for (int i=1; i<loteria; i++){
            valor.add(i);
            System.out.println("El numero de loteria " +i+ " no es el ganador...");
        }

        System.out.println("Sigue intentando....");
        scanner.close();
    }
    
}
