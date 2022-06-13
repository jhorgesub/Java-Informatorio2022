import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        System.out.println("Ingrese sus ciudades favoritas - Presione 0 para terminar");
        int opcion = 1;
        int cont = 1;
            do {
                System.out.println("Ingrese ciudad");
                String ciudad = s.nextLine();
                ciudades.add(ciudad);
                System.out.println("1- Continuar  0- Salir");
                opcion = s.nextInt();
                s.nextLine();
            } while (opcion != 0);
            System.out.println();
        for (String ciudad: ciudades) {
            System.out.println("#" + cont + " - " + ciudad);
            cont++;
        }
    }
}
