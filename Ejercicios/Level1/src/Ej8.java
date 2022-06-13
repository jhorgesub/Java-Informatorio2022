import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dato;
        LinkedList<String> datos = new LinkedList<>();
        System.out.println("Ingrese su nombre y apellido");
        ingresarDato(datos, s);
        System.out.println("Ingrese edad");
        ingresarDato(datos, s);
        System.out.println("Ingrese dirección");
        ingresarDato(datos, s);
        System.out.println("Ingrese ciudad");
        ingresarDato(datos, s);
        Iterator x = datos.descendingIterator();
        while (x.hasNext()) {
            System.out.print(x.next() + " ");
        }
    }
    private static void ingresarDato(LinkedList lista, Scanner scan) {
        String dato = scan.nextLine();
        lista.add(dato);
    }
}
