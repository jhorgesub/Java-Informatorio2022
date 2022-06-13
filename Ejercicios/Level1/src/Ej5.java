import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scan.nextInt();
        scan.close();
        int res = 0;
        int desc = num2;
        if (desc < 0) {
            desc = desc * -1;
        }
        if (num1 == 0 || num2 == 0) {
            System.out.println("El producto es igual a " + 0 );
        } else {
            while (desc > 0) {
                res = res + num1;
                desc = desc - 1;
            }
            if (num2 < 0){
                res = res * -1;
            }
            System.out.println("El producto es igual a " + res );
        }
    }
}
