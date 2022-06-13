import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int continuar = 1;
        while (continuar == 1) {
            System.out.println("Ingrese un número");
            int num1 = s.nextInt();
            System.out.println("Ingrese otro número");
            int num2 = s.nextInt();
            int resul = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resul);
            resul = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + resul );
            resul = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + resul );
            resul = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + resul );
            resul = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + resul );
            System.out.println("Presione 1 para continuar. Otro número para terminar");
            continuar = s.nextInt();
        }
        System.out.println("Programa finalizado. Adios!!");
        s.close();
    }
}
