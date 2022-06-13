import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nombre;
        List<String> estudiantes = new ArrayList<>();
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        System.out.println("Ingrese 12 nombres de estudiantes");
        System.out.println();
        for (int i = 0; i < 13; i++) {
            System.out.print("Nombre: ");
            nombre = s.nextLine();
            estudiantes.add(nombre);
        }
        System.out.println();
        dividirLista(s,estudiantes, lista1, lista2, lista3);

    }

    private static void dividirLista(Scanner s, List<String> estudiantes, List<String> lista1, List<String> lista2, List<String> lista3) {
        lista1 = estudiantes.subList(0, 4);
        mostrar(1, lista1);
        lista2 = estudiantes.subList(4, 8);
        mostrar(2, lista2);
        lista3 = estudiantes.subList(8, 12);
        mostrar(3, lista3);
    }

    private static void mostrar(int num, List<String> lista) {
        System.out.println("** Curso " + num + " **"  );
        for (String alumno: lista) {
            System.out.print(alumno + " ");
        }
        System.out.println();
        System.out.println();
    }
}
