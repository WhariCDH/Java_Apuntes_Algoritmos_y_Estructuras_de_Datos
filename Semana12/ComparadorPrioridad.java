package Semana12;

import java.util.Comparator;

public class ComparadorPrioridad implements Comparator<Paciente> {

    @Override
    public int compare(Paciente p1, Paciente p2) {
        return Integer.compare(nivelPrioridad(p2.prioridad), nivelPrioridad(p1.prioridad));
    }

    private int nivelPrioridad(String prioridad) {
        switch (prioridad) {
            case "crítica":
                return 3;
            case "grave":
                return 2;
            case "leve":
                return 1;
            default:
                return 0;
        }
    }
}
