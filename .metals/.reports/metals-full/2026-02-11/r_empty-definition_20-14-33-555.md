error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana10/Pregunta02.java:java/util/ArrayList#size().
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana10/Pregunta02.java
empty definition using pc, found symbol in pc: java/util/ArrayList#size().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 4366
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana10/Pregunta02.java
text:
```scala
package Semana10;

import java.util.ArrayList;
import java.util.Scanner;

public class Pregunta02 {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> notas=new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n-- Menu --");
            System.out.println("1. Ingrese notas");
            System.out.println("2. Mostrar promedio de las notas");
            System.out.println("3. Mostrar la nota mayor");
            System.out.println("4. Mostrar la nota menor");
            System.out.println("5. Editar nota");
            System.out.println("6. Buscar nota");
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");

            opcion=scanner.nextInt();

            switch (opcion) {

                case 1:
                    notas.clear();   //Elimina los elementos antes establecidos de la lista
                    System.out.print("¿Cuántas notas desea ingresar?: ");
                    int cantidadNotas=scanner.nextInt();  //Guardamos en "cantidadNotas" los numeros establecidos 

                    for (int i=0; i<cantidadNotas; i++) {  //Mensaje que repetira las cantidades de veces que se coloco 
                        double nota;

                        do {
                            System.out.print("Ingrese la nota " +(i + 1)+ " (entre 0 y 20): ");
                            nota=scanner.nextDouble();  //Se guarda las notas establecidas en "nota"

                            if (nota<0 || nota>20) {
                                System.out.println("Error: La nota debe estar entre 0 y 20.");
                            }

                        } while (nota<0 || nota>20);
                        notas.add(nota);  //la nota se guarda en la lista "notas"
                    }

                    System.out.println("Notas ingresadas correctamente.");
                    break;

                case 2:
                    if (notas.isEmpty()) { //"isEmpty" Devuelve true si la lista está vacía
                        System.out.println("Primero debe ingresar las notas.");
                    } else {

                        double suma=0;

                        for (double nota : notas) {
                            suma=suma+nota;
                        }

                        double promedio=suma/notas.size();  //"notas.size()" Dice cuántos elementos hay
                        System.out.println("El promedio de las notas es: " +promedio);
                    }
                    break;

                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        double notaMayor=notas.get(0);

                        for (double nota : notas) {
                            if (nota>notaMayor) {
                                notaMayor=nota;
                            }
                        }

                        System.out.println("La nota mayor es: "+notaMayor);
                    }
                    break;

                case 4:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        double notaMenor=notas.get(0);  //Asumimos que la primera nota es menor "get"

                        for (double nota : notas) {  //"nota" toma cada nota de notas 1 en 1
                            if (nota<notaMenor) {
                                notaMenor=nota;
                            }
                        }

                        System.out.println("La nota menor es: " +notaMenor);
                    }
                    break;

                case 5:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        System.out.print("Ingrese el índice de la nota que desea editar (0 a "+ (notas.size() - 1) + "): ");

                        int index=scanner.nextInt();  //guardamos en "index"

                        if (index>=0 && index<notas.siz@@e()) {

                            double nuevaNota;

                            do {
                                System.out.print("Ingrese la nueva nota (entre 0 y 20): ");
                                nuevaNota=scanner.nextDouble();

                                if (nuevaNota<0 || nuevaNota>20) {
                                    System.out.println("Error: La nota debe estar entre 0 y 20.");
                                }

                            } while (nuevaNota<0 || nuevaNota>20);

                            notas.set(index, nuevaNota);
                            System.out.println("Nota actualizada correctamente.");

                        } else {
                            System.out.println("Índice no válido.");
                        }
                    }
                    break;

                case 6:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        System.out.print("Ingrese la nota que desea buscar: ");
                        double notaABuscar = scanner.nextDouble();

                        if (notas.contains(notaABuscar)) {
                            int posicion = notas.indexOf(notaABuscar);
                            System.out.println("La nota " + notaABuscar
                                    + " se encuentra en el índice " + posicion + ".");
                        } else {
                            System.out.println("La nota " + notaABuscar + " no fue encontrada.");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Gracias por usar el sistema. Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/ArrayList#size().