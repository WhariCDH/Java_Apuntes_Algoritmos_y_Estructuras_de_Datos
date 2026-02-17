package Semana06_Practica;
import java.util.ArrayList;

public class ClasePersonalRaid {
    public static void main(String[] args) {
        ArrayList<Personal> GT=new ArrayList<>();

        GT.add(new Personal("Whavi", 30, 70984662, "Chile", 948523431));
        GT.add(new Personal("Behreel", 32, 70984662, "Argentina", 948523431));
        GT.add(new Personal("Aqueron", 27, 70984662, "Peru", 948523431));
        GT.add(new Personal("UWU", 25, 70984662, "Mexico", 948523431));
        GT.add(new Personal("Elizabe", 32, 70984662, "Chile", 948523431));
        GT.add(new Personal("Limon", 23, 70984662, "Mexico", 948523431));

        for (Personal raid : GT ){ 
        System.out.println("El jugador: " +raid.Nombre+ " tiene " +raid.Edad+ " vive en " +raid.Pais+ " y su telefono es " +raid.Telefono);
        }

    }
}
