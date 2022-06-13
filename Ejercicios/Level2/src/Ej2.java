import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese cinco números");
        for (int i = 0; i < 5; i++) {
            numeros.add(s.nextInt());
        }
        System.out.println(" ");
        int antes = numeros.size();
        System.out.println("Ingrese un número. Se agregará al principio de la lista ");
        numeros.add(0, s.nextInt());
        System.out.println("Ingrese un número al final de la lista ");
        numeros.add(s.nextInt());
        int despues = numeros.size();
        System.out.println();
        System.out.println("Lista de números");
        for (int j = 0; j < numeros.size(); j++) {
            System.out.print(numeros.get(j) + " ");
        }
        System.out.println();
        System.out.println("Cantidad de elementos antes: " + antes);
        System.out.println("Cantidad de elementos después " + despues);
    }
}
