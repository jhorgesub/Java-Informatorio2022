import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> listaNum = new ArrayList<>();
        System.out.println("Por favor ingrese dos números. Recuerde que el primer valor debe ser menor al segundo");
        System.out.println("Ingrese el primer valor");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo valor");
        int num2 = s.nextInt();
        System.out.println(fizzBuzzFunction(num1,num2, listaNum));
    }

    private static List<String> fizzBuzzFunction(int n1, int n2, List<String> listaNum) {
        for (int i = n1; i < n2 ; ++i) {
            String l = String.valueOf(i);
            if (i % 2 == 0 && i % 3 == 0 ) {
                l = "FizzBuzz";
            } else if (i % 2 == 0) {
                l = "Fizz";
            } else if ( i % 3 == 0) {
                l = "Buzz";
            }
            listaNum.add(l);
        }
        return listaNum;
    }
}
