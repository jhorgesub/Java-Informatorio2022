import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ej5 {

    public static void main(String[] args) {

        LocalDate fechaNac;
        Period periodo = Period.between(LocalDate.parse("1983-12-04"), LocalDate.now());

        List<Alumno> alumnos = List.of(
                new Alumno("Simpson", "Bart", LocalDate.parse("1983-12-04")),
                new Alumno("Gomez", "Cecilia", LocalDate.parse("1982-09-05")),
                new Alumno("Sanchez", "Raul", LocalDate.parse("1999-02-14")),
                new Alumno("Leiva", "Cesar", LocalDate.parse("2002-01-30")),
                new Alumno("Garcia", "Francisco", LocalDate.parse("1998-04-29"))
        );

        Map<String, Integer> salida = alumnos.stream()
                .collect(Collectors
                        .toMap(key -> key.getApellido() + " " + key.getNombre(),
                                value -> Period.between(value.getFechaNac(),LocalDate.now()).getYears()));
        System.out.println(salida);
    }

    private static class Alumno {
        String apellido;
        String nombre;
        LocalDate fechaNac;

        public Alumno(String apellido, String nombre, LocalDate fechaNac) {
            this.apellido = apellido;
            this.nombre = nombre;
            this.fechaNac = fechaNac;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public LocalDate getFechaNac() {
            return fechaNac;
        }

        public void setFechaNac(LocalDate fechaNac) {
            this.fechaNac = fechaNac;
        }
    }
}
