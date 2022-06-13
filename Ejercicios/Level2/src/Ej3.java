import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> barajas = new ArrayList<>();
        cargar(s, barajas);
        int opcion;
        do {
            System.out.println();
            System.out.println("Seleccione opción. 1-Mezclar 2-Reverso 0-Salir");
            opcion = s.nextInt();
            if (opcion == 1) {
                mezclar(s,barajas);
            } else if(opcion == 2) {
                reverso(s,barajas);
            } else {
                System.out.println("Opción no válida");
                System.out.println("Debe ingresar 1-Mezclar 2-Reverso 0-Salir");
            }
        } while (opcion != 0);
        System.out.println("Adiós!!");
    }

    private static void mostrar(Scanner s, ArrayList<Integer> barajas) {
        for (Integer baraja: barajas) {
            System.out.print(baraja + " ");
        }
    }

    private static void reverso(Scanner s, ArrayList<Integer> barajas) {
        Collections.sort(barajas);
        Collections.reverse(barajas);
        System.out.println("** Barajas mostradas en reverso **");
        mostrar(s, barajas);
        System.out.println();
    }

    private static void ordenar(Scanner s, ArrayList<Integer> barajas) {
        Collections.sort(barajas);
    }

    private static void mezclar(Scanner s, ArrayList<Integer> barajas) {
        Collections.shuffle(barajas);
        System.out.println("** Barajas mezcladas **");
        mostrar(s,barajas);
        System.out.println();
    }

    private static void cargar(Scanner s, ArrayList<Integer> barajas) {
        System.out.println("Ingrese 13 números para cargar la baraja");
        for (int i = 0; i < 13; i++) {
            barajas.add(s.nextInt());
        }
        System.out.println("** Barajas cargadas **");
        ordenar(s,barajas);
        mostrar(s,barajas);
        System.out.println();
    }
}
