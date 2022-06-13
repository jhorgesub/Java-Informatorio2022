import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo número");
        int b = scan.nextInt();
        int cont = 1;
        double pot = a;
        boolean band = false;
        boolean error = false;
        scan.close();
        if (a == 0 && b == 0) {
            System.out.println("ERROR. Indeterminado");
            error = true;
        } else if ( b < 0) {
            b = b * -1;
            band = true;
        } else if (a == 0 ) {
            System.out.println("La potencia es " + 0);
        } else if (b == 0) {
            System.out.println("La potencia es " + 1);
        }
        if (!error) {
            while (cont < b) {
                pot *= a;
                cont += 1;
            }
            if (band) {
                System.out.println("La potencia es " + 1/pot);
            } else {
                System.out.println("La potencia es " + pot);
            }
        }
    }
}
