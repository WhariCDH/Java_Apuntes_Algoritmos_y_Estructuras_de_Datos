error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07_Practica/ClasePersonalPractica02.java:java/util/ArrayList#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07_Practica/ClasePersonalPractica02.java
empty definition using pc, found symbol in pc: java/util/ArrayList#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 292
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07_Practica/ClasePersonalPractica02.java
text:
```scala
package Semana07_Practica;
import java.util.ArrayList;
import java.util.Scanner;

public class ClasePersonalPractica02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> peliculas=new ArrayList<>();
        ArrayLi@@st<Double> calificacion=new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n*******Menu*******");
            System.out.println("1. Registrar Pelicula.");
            System.out.println("2. Mostrar lista de Peliculas.");
            System.out.println("3. Mostrar el promedio de las calificaciones.");
            System.out.println("4. Mostrar la pelicula mejor calificada.");
            System.out.println("5. Salir del programa.");
            System.out.println();
            System.out.print("Elija una opción: ");

            opcion=scanner.nextInt();
            scanner.nextLine(); //Limpiar buffo

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuantas peliculas desea ingresar?");
                    int cantidad=scanner.nextInt();
                    scanner.nextLine();

                    for (int i=0; i<cantidad; i++) {
                        System.out.print("Ingrese el nombre de la pelicula: ");
                        String nombre=scanner.nextLine();
                        Double nota;

                        do {
                            System.out.println("Ingrese su calificacion del (0 a 10): ");
                            nota=scanner.nextDouble();

                            if (nota<0 || nota>10) {
                                System.out.println("La calificación es invalidad.");
                            }
                            
                        } while (nota<0 || nota>10);
                        scanner.nextLine();

                        peliculas.add(nombre);
                        calificacion.add(nota);
                    }
                    System.out.println("Pelicula registradas correctamente.");
                    break;

                case 2: //mostrar
                    if (peliculas.isEmpty()){
                        System.out.println("No hay peliculas registradas.");
                    }
                    else {
                        for(int i=0; i<peliculas.size(); i++){
                            System.out.println(peliculas.get(i)+ " - " +calificacion.get(i));

                        }

                    }
                    System.out.println("Su lista actual de peliculas y calificaciones.");
                    break;
                
                case 3:
                    if (calificacion.isEmpty()){
                        System.out.println("No hay calificaciones registradas.");
                    }
                    else {
                        double suma=0;
                        for(double c : calificacion){
                            suma=suma+c;
                        }
                        double promedio=suma/calificacion.size();
                        System.out.println("El promedio: " +promedio);

                    }
                    break;
                
                case 4:
                    if (peliculas.isEmpty()){
                        System.out.println("No hay peliculas registradas para calificar. ");
                    }
                    else {
                        double mayor=calificacion.get(0);
                        int indice=0;

                        for (int i=0; i<calificacion.size(); i++){
                            if (calificacion.get(i) > mayor){
                                mayor=calificacion.get(i);
                                indice=i;
                            }
                        }

                        System.out.println("Mejor pelicula: " +peliculas.get(indice)+ " con " +mayor);

                    }
                    break;


                case 5:
                    System.out.println("Usted esta saliendo del programa....");
                    break;
            
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
            
        } while (opcion != 5);
        scanner.close();

    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/ArrayList#