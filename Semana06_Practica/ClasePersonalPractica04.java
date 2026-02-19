package Semana06_Practica;
import java.util.ArrayList;
public class ClasePersonalPractica04 {
    public static void main(String[] args) {
        ArrayList<String> RPG=new ArrayList<>();

        RPG.add("Marina");
        RPG.add("Veronica");
        RPG.add("Deysi");
        RPG.add("Morrian");
        RPG.add("Paimon");

        System.out.println("Orden de personajes de GT: ");

        System.out.println("Lista de personajes de GT en orden: " +RPG);

        //Añadir personajes      "add"
        RPG.add(0, "Angie");
        RPG.add(1, "Dohwa");

        System.out.println("Lista de personajes de GT actualizado : " +RPG);

        //Eliminar un personaje "remove"
        RPG.remove("Paimon");

        System.out.println("Lista de personajes de GT actualizado : " +RPG);

        //Tambien se elimina con el numero
        RPG.remove(0);

        System.out.println("Lista de personajes de GT actualizado : " +RPG);

        
    }
    
}
