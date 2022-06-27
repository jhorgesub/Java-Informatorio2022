import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ej3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = s.nextLine();
        List<String> palabras = List.of("bart", "Batman", "Homero","Joker","belén");
        //List<String> salida = palabras.stream().filter(e -> letra.equalsIgnoreCase(String.valueOf(e.charAt(0))));
        List<String> salida = palabras.stream()
                .filter(e -> e.startsWith(letra.toLowerCase()) || e.startsWith(letra.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println(salida);
    }
}
