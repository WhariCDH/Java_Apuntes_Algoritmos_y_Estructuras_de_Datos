package Semana07;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Clase01ListaEnlazadas {

    // ArrayList simple
    ArrayList<String> miAL=new ArrayList<>();

    public static void main(String[] args) {
        Clase01ListaEnlazadas obA=new Clase01ListaEnlazadas();
        obA.menu();
    }

    public void menu() {
        String op;

        do{
            op = JOptionPane.showInputDialog(null,
                    "1. Introducir datos\n"
                  + "2. Modificar datos\n"
                  + "3. Eliminar datos\n"
                  + "4. Buscar datos\n"
                  + "5. Mostrar datos\n"
                  + "6. Salir"
            );

            switch (op) {

                case "1": // Introducir datos
                    String a=JOptionPane.showInputDialog(null, "Digite dato a ingresar: ");
                    miAL.add(a);
                    break;

                case "2": // Modificar datos
                    String b, c;
                    int indice;

                    b = JOptionPane.showInputDialog(null, "Ingrese el dato a modificar: ");

                    if (miAL.contains(b)) {
                        indice=miAL.indexOf(b);
                        c = JOptionPane.showInputDialog(null, "Ingrese el nuevo dato: ");
                        miAL.set(indice, c);
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "No existe el dato a modificar!",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                    break;

                case "3": // Eliminar datos
                    b = JOptionPane.showInputDialog(null, "Ingrese el dato a eliminar: ");

                    for (int i=0; i<miAL.size(); i++) {
                        if (miAL.get(i).equals(b)) {
                            miAL.remove(i);
                        }
                    }
                    break;

                case "4": // Buscar datos
                    String mostrarBus = "No se ha encontrado nada!";

                    c = JOptionPane.showInputDialog(null, "Ingrese el dato a buscar: ");

                    for (int i = 0; i < miAL.size(); i++) {
                        if (miAL.get(i).equals(c)) {
                            mostrarBus = "Dato en posición " + i + " : " + miAL.get(i);
                        }
                    }
                    JOptionPane.showMessageDialog(null, mostrarBus);
                    break;

                case "5": // Mostrar datos
                    String salida = "";

                    for (int i = 0; i < miAL.size(); i++) {
                        salida += "Número posición " + i + " : " + miAL.get(i) + "\n";
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    break;

                case "6": // Salir
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida!");
                    break;
            }

        } while (!op.equals("6"));
    }
}
