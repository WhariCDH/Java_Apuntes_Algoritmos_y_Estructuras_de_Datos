package Semana07_Practica;
import java.util.Scanner;
import java.util.ArrayList;

public class ClasePersonalPractica01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> Nota=new ArrayList<>();
        int opcion;
        
        do {

            System.out.println("\n********MENU DE ENTRADA********");
            System.out.println("1. Ingrese las notas del curso de JavaScript");
            System.out.println("2. Mostrar el promedio de sus notas");
            System.out.println("3. Mostrar la nota mayor que obtuvo durante este ciclo");
            System.out.println("4. Cerrar el programa de notas del curso de JavaScript");
            System.out.println();
            System.out.print("Elija una opcion: ");

            opcion=scanner.nextInt();

            switch (opcion) {
                case 1:
                    Nota.clear();
                    System.out.println();
                    System.out.print("¿Cuantas notas desea ingresar?: ");
                    int cantidadNotas=scanner.nextInt();

                    for (int i=0; i<cantidadNotas; i++) {
                        Double nota;

                        do{
                            System.out.print("Ingrese la nota " +(i + 1)+ " (entre 0 y 20): ");
                            nota=scanner.nextDouble();

                            if (nota<0 || nota>20) {
                                System.out.println("Error: La nota debe estar entre 0 y 20.");
                                
                            }
                            
                        } while(nota<0 || nota>20);  //condición para repetir 

                        Nota.add(nota);

                    }
                    System.out.println();
                    System.out.println("Las notas fueron ingresaras correptamente. ");
                    break;

                case 2:
                    if(Nota.isEmpty()) {
                        System.out.println("Usted no a ingresaro notas en el sistema....");
                    }
                    else {
                        double suma=0;
                        
                        for (double nota : Nota) {
                            suma=suma+nota;

                        }
                        double promedioNotas=suma/Nota.size();
                        System.out.println("El promedio de su nota del curso de JavaScript es de " +promedioNotas);
                    }
                    break;
                
                case 3:
                    if (Nota.isEmpty()){
                        System.out.println("Usted no a ingresado notas en el sistema....");
                    }
                    else {
                        double mayorNota=Nota.get(0);

                        for (double nota : Nota){
                                
                            if (nota > mayorNota) {
                                mayorNota=nota;
                                    
                            }
                        }
                        System.out.println("Tu mayor nota en este ciclo es de: " +mayorNota);
                    }
                    break;

                case 4:
                    System.out.println("Usted esta saliendo del programa de notas de la utp.....");
                    break;
            
                default:
                    System.out.println("Esa opción es inválidad o no existe.....");
                    break;
            }
            
        } while (opcion !=4);
        scanner.close();
    }
    
}
