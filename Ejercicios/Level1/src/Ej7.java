import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = s.nextLine();
        s.close();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            int valor = (int) letra;    /*a = 97 z = 122   A = 65 Z = 90 */
            if (valor >= 97 && valor <= 122) {
                valor = valor - 32;
            }
            letra = (char) valor;
            System.out.print(letra);
        }
    }
}
