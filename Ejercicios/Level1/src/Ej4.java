import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Ingrese un número para calcular su factorial");
        int num = s.nextInt();
        if (num < 0) {
            do {
                System.out.println("ERROR. Por favor sólo ingrese número mayor o igual a 0");
                num = s.nextInt();
            } while (num < 0);
        }
        if (num >= 0) {
            System.out.println();
            System.out.println("Factorial: " + factorial(num));
            s.close();
        }
    }
    public static int factorial (int numero) {
        int res = numero;
        if (numero != 1 && numero !=0) {
            res = numero * factorial (numero - 1);
        }
        if (numero == 0) {
            return 1;
        }
        return res;
    }
}
