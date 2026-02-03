package Semana03;
public class Clase03ArrayUni {

//Este programa busca un número específico dentro de un
//arreglo unidimensional. Recorre cada elemento del arreglo y
//compara si alguno de ellos coincide con el número que estamos buscando.

    public static void main(String[] args) {

        int[] numeros={1, 2, 3, 4, 5};      //Arreglo unidimencional de enteros 
        int buscar=6;                       //Numero que se buscara 
        boolean encontrado=false;           //boolean es un tipo de dato que solo puede tener true o false
                                            //Enpieza con "false" por que aun no encontro nada

        // Bucle for-each para recorrer el arreglo
        //boolean aca es donde pasa de false a true

        //Es lo mismo for (int numero : numeros) { que
        //for (int i = 0; i < numeros.length; i++) {
        //int numero = numeros[i];

        for (int numero:numeros) {          //Recorre uno x uno en el bucle numeros pero se guarda en la variable numero
            if (numero==buscar) {           //Compara el número actual del arreglo con el número que se está buscando (condicion).
                encontrado=true;            //Encontrado cambia a true (Cambia de estado)
                break;                      //Detiene el bucle 
            }
        }

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El numero "+buscar+" fue encontrado en el arreglo.");
        } 
        else {
            System.out.println("El numero "+buscar+" no fue encontrado en el arreglo.");
        }
    }
}