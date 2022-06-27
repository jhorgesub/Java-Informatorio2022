import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(2,4,5,6);
        List<Integer> potencia = numeros.stream().map(numero -> (numero * numero))
        .collect(Collectors.toList());
        System.out.println(potencia);
    }
}
