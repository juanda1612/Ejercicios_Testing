package ejerciciosCajaNegra.ejercicio1;

public class ExcursionMetodosEstaticos {
    public static double calcularPrecioAlumno(int numeroAlumnos){
        if (numeroAlumnos >= 100){
            return 65;
        }else if (numeroAlumnos >= 50 && numeroAlumnos <= 99){
            return 70 ;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            return 95;
        }else {
            return 4000/numeroAlumnos;
        }
    }

    public static double calcularCosteExcursion(int numeroAlumnos){
        if (numeroAlumnos >= 100){
            return 100 *65;
        }else if (numeroAlumnos >= 50 && numeroAlumnos <= 99){
            return 50 *70 ;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            return 30 *95;
        }else {
            return 4000;
        }
    }
}
