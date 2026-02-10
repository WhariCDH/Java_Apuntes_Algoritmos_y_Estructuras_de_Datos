error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase01ListaEnlazadaSimple.java:java/io/PrintStream#println(+8).
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase01ListaEnlazadaSimple.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1537
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase01ListaEnlazadaSimple.java
text:
```scala
package Semana08;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase01ListaEnlazadaSimple {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> notas=new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Ingresar notas");
            System.out.println("2. Mostrar promedio");
            System.out.println("3. Mostrar nota mayor");
            System.out.println("4. Mostrar nota menor");
            System.out.println("5. Eliminar nota");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            opcion=scanner.nextInt();  //permite que el usuario indique un numero entero 

            switch (opcion) {  //"Switch" segun la opción elegida 

                case 1:
                    notas.clear();    //elimina notas introducidas antes para almacenar nuevas 
                    System.out.print("¿Cuántas notas deseas ingresar?: ");
                    int cantidadNotas=scanner.nextInt();

                    for (int i=0; i<cantidadNotas; i++) {
                        double nota;
                        do {
                            System.out.print("Ingrese nota " + (i + 1) + " [0 - 20]: ");
                            nota=scanner.nextDouble();

                            if (nota<0 || nota>20) {
                                System.out.@@println("Error: la nota debe estar entre 0 y 20.");
                            }
                        } while (nota<0 || nota>20);

                        notas.add(nota);  //guarda la nota
                    }
                    System.out.println("Notas ingresadas correctamente.");
                    break;

                case 2:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        double suma = 0;
                        for (double nota : notas) {
                            suma += nota;
                        }
                        double promedio = suma / notas.size();
                        System.out.println("El promedio es: " + promedio);
                    }
                    break;

                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        double notaMayor = notas.get(0);
                        for (double nota : notas) {
                            if (nota > notaMayor) {
                                notaMayor = nota;
                            }
                        }
                        System.out.println("La nota mayor es: " + notaMayor);
                    }
                    break;

                case 4:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        double notaMenor = notas.get(0);
                        for (double nota : notas) {
                            if (nota < notaMenor) {
                                notaMenor = nota;
                            }
                        }
                        System.out.println("La nota menor es: " + notaMenor);
                    }
                    break;

                case 5:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        System.out.println("Notas actuales: " + notas);
                        System.out.print("Ingrese el número de la nota a eliminar (1 a "
                                + notas.size() + "): ");

                        int indiceEliminar = scanner.nextInt();

                        if (indiceEliminar >= 1 && indiceEliminar <= notas.size()) {
                            notas.remove(indiceEliminar - 1);
                            System.out.println("Nota eliminada correctamente.");
                        } else {
                            System.out.println("Índice no válido.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).