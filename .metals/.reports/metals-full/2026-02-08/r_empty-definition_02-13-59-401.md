error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase01ListaEnlazadaSimple.java:java/lang/System#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase01ListaEnlazadaSimple.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 3924
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana08/Clase01ListaEnlazadaSimple.java
text:
```scala
package Semana08;
import java.util.ArrayList;
import java.util.Scanner;

public class Clase01ListaEnlazadaSimple {

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion, i;
        do {
            System.out.println("Menú");
            System.out.println("1. Ingresar notas");
            System.out.println("2. Mostrar promedios");
            System.out.println("3. Mostrar nota mayor");
            System.out.println("4. Mostrar nota meyor");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    notas.clear();
                    System.out.println("¿Cuántas notas "
                            + "deseas ingresar? : ");
                    int cantidadNotas = scanner.nextInt();
                    for (i = 0; i < cantidadNotas; i++) {
                        double nota;
                        do {
                            System.out.println("Ingresar nota" + (i + 1) + "[Entre 0 y 20]");
                            nota = scanner.nextDouble();
                            if (nota < 0 || nota > 20) {
                                System.out.println("Error, fuera de rango!, ingrese entre [0 y 20]");
                            }
                        } while (nota < 0 || nota > 20);
                        notas.add(nota);
                    }
                    System.out.println("Notas ingresadas correctamente");
                    break;
                case 2:
                    if (notas.isEmpty()) {
                        System.out.println("Primero "
                                + "debe de ingresar la notas");
                    } else {
                        double suma = 0;
                        for (double nota : notas) {
                            suma += nota;
                        }
                        double promedio = suma / notas.size();
                        System.out.println("El promedio de las notas es: " + promedio);
                    }
                    break;
                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debes "
                                + "de ingresar las notas");
                    } else {
                        double notaMayor = notas.get(0);
                        for (double nota : notas) {
                            if (nota > notaMayor) {
                                notaMayor = nota;
                            }
                        }
                        System.out.println("La nota "
                                + "mayor es: " + notaMayor);
                    }
                    break;
                case 4:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debes "
                                + "de ingresar las notas");
                    } else {
                        double notaMenor = notas.get(0);
                        for (double nota : notas) {
                            if (nota < notaMenor) {
                                notaMenor = nota;
                            }
                        }
                        System.out.println("La nota "
                                + "menor es: " + notaMenor);
                    }
                    break;
                case 5:
                    if (notas.isEmpty()) {
                        System.out.println("Primero debe ingresar las notas.");
                    } else {
                        System.out.println("Notas actuales: " + notas);
                        Syst@@em.out.print("Ingrese el índice de la "
                                + "nota que desea eliminar (1 a " + notas.size() + "): ");
                        int indiceEliminar = scanner.nextInt();
                        
                        // Validamos que el índice esté dentro del rango válido
                        if (indiceEliminar > 0 && indiceEliminar <= notas.size()) {
                            notas.remove(indiceEliminar - 1); // Restamos 1 para que coincida con el índice 0-based
                            System.out.println("Nota eliminada correctamente.");
                        } else {
                            System.out.println("Índice no válido.");
                        }
                    }
                    break;   
                    
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no válida, intente de nuevo.");
            }
        } while (opcion != 5);
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#