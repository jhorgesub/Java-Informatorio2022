import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ej6 {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet();
        Map<Integer,Integer> sueldo = new HashMap();
        Empleado emp1 = new Empleado(30445367, "Jorge Subeldia", 45, 500);
        empleados.add(emp1);
        Empleado emp2 = new Empleado(31274327, "Cecilia Gomez", 33, 400);
        empleados.add(emp2);
        Empleado emp3 = new Empleado(33457189, "Manuel Avila", 36, 400);
        empleados.add(emp3);
        for (Empleado empleado : empleados) {
            int sueldoTotal = empleado.getValorHora() * empleado.getHorasTrabajadas();
            sueldo.put(empleado.getDni(), sueldoTotal);
            System.out.println("Empleado: " + empleado.getNombre() + " - DNI: " + empleado.getDni() + " - Sueldo: " + sueldoTotal);
        }
    }

    static class Empleado {
        private int dni;
        private String nombre;
        private int horasTrabajadas;
        private int valorHora;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora) {
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }
        public int getDni() {
            return dni;
        }
        public String getNombre() {
            return nombre;
        }
        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }
        public int getValorHora() {
            return valorHora;
        }
    }
}
