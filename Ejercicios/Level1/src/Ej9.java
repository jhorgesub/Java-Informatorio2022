import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = s.nextLine();
        System.out.println("Ingrese una letra");
        char letra = s.next().charAt(0);
        int i = 0;
        int cont = 0;
        while (i < frase.length()) {
            if (frase.charAt(i) == letra) {
                cont++;
            }
            i++;
        }
        if (cont == 0) {
            System.out.println("No existen palabras con la letra " + letra);
        } else {
            System.out.println("La cantidad de letras " + letra + " es " + cont);
        }
    }
}
