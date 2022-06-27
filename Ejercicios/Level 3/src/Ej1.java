import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ej1 {
    public static void main(String[] args) {

        List<String> listaPalabras = new ArrayList<>();
        listaPalabras.add("Bienvenido");
        listaPalabras.add("");
        listaPalabras.add(null);
        listaPalabras.add("al");
        listaPalabras.add(null);
        listaPalabras.add("Informatorio");
        listaPalabras.add("2022");
        System.out.println(filtrarPalabras(listaPalabras));
    }
    private static List<String> filtrarPalabras(List<String> lista) {
        return lista.stream()
                .filter(Objects::nonNull)
                .filter(Ej1::isNotEmpty)
                .collect(Collectors.toList());
    }
    private static boolean isNotEmpty(String valor) {
        return !valor.isEmpty();
    }
}
