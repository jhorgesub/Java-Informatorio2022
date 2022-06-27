import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ej4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,4,4);
        List<Long> factorial = numeros.stream().distinct().map(n -> LongStream.rangeClosed(1,n)
                .reduce(1,(long a, long b) -> a * b))
                .collect(Collectors.toList());
    System.out.println(factorial);
    }
}
