package Semana07;

public class Clase02ListaEnlazadas {

    public static void main(String[] args) {

        Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("Hola");

        primer.enlazarSiguiente(segundo);
        primer.obtenerSiguiente().enlazarSiguiente(tercer);

        System.out.println(
                primer
                        .obtenerSiguiente()
                        /* .obtenerSiguiente() */
                        .obtenerValor()
                        .toString()
        );
    }
}
