error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana02/Clase03Arrays.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana02/Clase03Arrays.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 97
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana02/Clase03Arrays.java
text:
```scala
package Semana02;

public class Clase03Arrays {
    
import java.util.Scanner;
public static@@ void main(String[] args) {
float[] notas = new float[4];
float suma = 0, promedio;
int cant = 0;
Scanner entrada = new Scanner(System.in);
System.out.println("Introduzca la cantidad de notas a ingresar:");
cant = entrada.nextInt();
System.out.println("Introduzca notas:");
System.out.println("**********************************************");
for (int i = 1; i <= cant; i++) {
System.out.print("Ingrese la nota " + i + " del estudiante: ");
notas[i] = entrada.nextInt();
suma += notas[i];
}
promedio = suma / cant;
System.out.println("**********************************************");
System.out.println("Tu promedio es: " + promedio);
if (promedio > 10) {
System.out.println("Estas aprobado");
System.out.println("**********************************************");
} else {
System.out.println("No estas desaprobado");
System.out.println("**********************************************");
}
}
}
CIERRE
¿Que hemos aprendido el día de hoy?
```


#### Short summary: 

empty definition using pc, found symbol in pc: 