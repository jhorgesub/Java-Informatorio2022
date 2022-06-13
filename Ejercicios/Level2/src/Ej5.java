import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int total = 0;
        cargarHoras(s, horasTrabajadas);
        cargarValores(s,valorPorHora);
        cargarTotales(horasTrabajadas, valorPorHora, totales);
        System.out.println(totales);
        for (Integer item : totales) {
            total += item;
        }
        System.out.println("Total Final :" + total);
    }

    public static void cargarHoras(Scanner scan, List<Integer> array1) {
        System.out.println("Ingrese 5 horas trabajadas");
        for (int i = 0; i < 5 ; i++){
            int horas = scan.nextInt ();
            array1.add(horas);
        }
    }

    public static void cargarValores(Scanner scan, List<Integer> array2) {
        System.out.println("Ingrese 5 valores por hora");
        int valor;
        for (int i = 0; i < 5 ; i++){
            valor = scan.nextInt ();
            array2.add(valor);
        }
    }

    public static void cargarTotales(List<Integer> array1, List<Integer> array2, List<Integer> array3) {
        int sum = 0;
        int totalDia = 0;
        for (int i = 0; i < array1.size(); i++) {
            totalDia = (array1.get(i) * array2.get(i));
            array3.add(totalDia);
            sum += totalDia;
        }
    }
}
