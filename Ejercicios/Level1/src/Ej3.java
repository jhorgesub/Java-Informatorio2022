import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = s.nextInt();
        System.out.println();
        s.close();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        for ( int i = 1; i <= num; i++ ){
            for ( int j = 0; j < numeros.size(); j++) {
                System.out.print(numeros.get(j) + " ");
            }
            System.out.println();
            numeros.add(i + 1);
        }
    }
}
