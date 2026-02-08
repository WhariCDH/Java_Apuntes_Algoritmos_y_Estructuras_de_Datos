package Semana07;
import java.util.ArrayList;
import java.util.Scanner;

//Desarrolla un menú con 4 opciones: En la primera 
// opción me pide que ingrese n números de notas en 
// un rango de 0 a 20, en la segunda opción que muestre 
// el promedio de las notas, en la tercera opción que muestre 
// la nota mayor y en la cuarta opción salir.

public class Clase03ListaEnlazada {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> notas=new ArrayList<>();
        int opcion;

        do{             //"do-while" El menú se repite hasta que el usuario elija la opción 4 (Salir).
            System.out.println("\n--- Menú ---");     //"\n" antes de mostrar menu exista una linea en blanco parte arriba 
            System.out.println("1. Ingresar notas");  //"println" imprime con salto de linea 
            System.out.println("2. Mostrar promedio de las notas");
            System.out.println("3. Mostrar la nota mayor");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");   //"print" imprime sin salto de linea para escribir una opción 

            opcion=scanner.nextInt();  //"opcion" guarda los numerales en lista 

            switch(opcion) { //Segun la opción elegida 

                case 1:
                    notas.clear(); //Borra notas anteriores para empezar de nuevo.
                    System.out.print("¿Cuántas notas desea ingresar?: ");
                    int cantidadNotas=scanner.nextInt();  //pide cuantas notas se ingresaran 

                    for (int i=0; i<cantidadNotas; i++) {   //"for" se usa cuando sabemos cuántas veces se repetirá algo.
                        double nota;
                        do{    //"do" se usa cuando necesitamos que el código se ejecute al menos una vez
                            System.out.print("Ingrese la nota "+(i+1)+" (entre 0 y 20): ");
                            nota=scanner.nextDouble();

                            if(nota<0 || nota>20) {   //"if" se usa para tomar decisiones
                                System.out.println("Error: la nota debe estar entre 0 y 20.");
                            }
                        //"while" se usa para repetir algo mientras una condición sea verdadera (regresa al Do si no cumple)
                        }while (nota<0 || nota>20);  //nota debe estar entre 0 y 20 si no vuelve a pedir

                        notas.add(nota); //guarda la nota en el arrayList
                    }

                    System.out.println("Notas ingresadas correctamente.");
                    break;

                case 2:
                    if (notas.isEmpty()) {   //Verifica si hay notas ingresadas.   //if → valida que existan datos
                        System.out.println("No hay notas ingresadas.");
                    } 
                    else {  //else → ejecuta el cálculo
                        double suma=0;

                        for (double nota : notas) {   //for-each → recorre la lista y suma las notas
                            suma=suma+nota;
                        }

                        double promedio=suma/notas.size(); //Suma todas las notas y divide entre la cantidad.
                        System.out.println("El promedio de las notas es: " +promedio);
                    }
                    break;

                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("No hay notas ingresadas.");
                    } else {
                        double mayor=notas.get(0);  //Tomar la primera nota como “la mayor” no sinifica realmente que sea la mayor 

                        for (double nota : notas) {  //recorre cada elemento de la lista notas 
                            if (nota>mayor) {   //¿La nota actual es mayor que la que tengo guardada como mayor?”
                                mayor=nota;     //Si nota es mayor → reemplaza a mayor     Si no → mayor se queda igual
                            }
                        }

                        System.out.println("La nota mayor es: " +mayor);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        }while (opcion !=4);

        scanner.close();
    }
}
