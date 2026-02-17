package Semana13_3Ejemplo;

public class ClaseEjemploArbol {
    
    public static void main(String[] args) {

        ArbolBinarioEjemplo arbol=new ArbolBinarioEjemplo();

        arbol.insertar(20);
        arbol.insertar(15);
        arbol.insertar(100);
        arbol.insertar(67);
        arbol.insertar(10);
        arbol.insertar(55);

        System.out.println("Recorido en orden de los valores:");
        arbol.recorridoEnOrden();

        System.out.println("\n\nBusqueda de los valores");
        System.out.println("¿Existe el valor 20? " +arbol.buscar(20));
        System.out.println("¿Existe el valor 100? " +arbol.buscar(100));
        System.out.println("¿Existe el valor 67? " +arbol.buscar(67));
        System.out.println("¿Existe el valor 55? " +arbol.buscar(55));
        System.out.println("¿Existe el valor 120? " +arbol.buscar(120));
        System.out.println("¿Existe el valor 10? " +arbol.buscar(10));
    }
}
