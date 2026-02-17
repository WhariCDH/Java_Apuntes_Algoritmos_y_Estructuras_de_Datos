error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana02/Clase05ArraysUnidimensional.java:java/util/Scanner#nextInt().
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana02/Clase05ArraysUnidimensional.java
empty definition using pc, found symbol in pc: java/util/Scanner#nextInt().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 838
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana02/Clase05ArraysUnidimensional.java
text:
```scala
package Semana02;
import java.util.Scanner;
//Realice el diagrama de flujo de un array con 6 elementos. El cuál le permitirá
//ingresar 6 números (estos pueden ser positivos, negativos y cero), hallar la media
//de los valores positivos y negativos.

public class Clase05ArraysUnidimensional {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] numeros=new int[6];
        int pos=0, neg=0;            //Contadores de positivos y negativos
        int i;
        double sumaPos=0, sumaNeg=0; //Suma de positivos y negativos

        //Lectura de los valores del array
        System.out.println("Lectura de los elementos del array:");
        for (i=0; i<numeros.length; i++){
            System.out.print("numeros[" +i+ "] = ");
            numeros[i]=sc.nextInt@@();
        }

        //Recorrer el array para sumar positivos y negativos
        for (i=0; i<numeros.length; i++){
            if (numeros[i]>0){                //sumar positivos
                sumaPos=sumaPos+numeros[i];
                pos++;
            } 
            else if (numeros[i]<0){           //Sumar negativos
                sumaNeg=sumaNeg+numeros[i];
                neg++;
            }
        }

        // Mostrar resultados
        if (pos!=0){
            System.out.println("Media de los valores positivos: "+(sumaPos/pos));
        } 
        else{
            System.out.println("No ha introducido números positivos");
        }

        if (neg!=0){
            System.out.println("Media de los valores negativos: "+(sumaNeg/neg));
        } 
        else{
            System.out.println("No ha introducido números negativos");
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#nextInt().