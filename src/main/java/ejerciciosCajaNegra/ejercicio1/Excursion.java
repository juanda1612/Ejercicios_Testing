package ejerciciosCajaNegra.ejercicio1;

public class Excursion {
    private int numeroAlumnos;

    public Excursion(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    // metodos de instancia
    public double calcularPrecioAlumno(){
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
    public double calcularCosteExcursion(){
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
