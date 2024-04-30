package javadoc.empresa;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase Directivo, que
 * hereda de Empleado.
 * Tiene el atributo categoría, que es un tipo enumerado cuyos valores obtendremos de la siguiente URL: https://economipedia.com/definiciones/directivo.html
 * También sobreescribe el método mostrar con los valores de todos los atributos heredados más el atributo categoría.
 * Su constructor recibe todos los atributos como parámetros
 * @author Ana
 * @version 1.0
 * @since abril-2024
 */

public class Directivo extends Empleado{
    /**
     * categoría del directivo
     */
    private Categoria categoria;

    /**
     * Constructor con todos los parámetros
     * @param nombre
     * @param fechaNacimiento
     * @param sueldoBruto
     * @param categoria
     */

    public Directivo(String nombre, LocalDate fechaNacimiento, double sueldoBruto, Categoria categoria) {
        super(nombre, fechaNacimiento, sueldoBruto);
        this.categoria = categoria;
    }

    /**
     * sobreescribe el método de la superclase
     *
     * @return String con los datos del directivo
     */
    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                ", sueldoBruto=" + sueldoBruto +
                '}';
    }

    /**
     * muestra los datos del directivo
     */
    @Override
    public void mostrar() {
        System.out.println("\n\nDATOS DEL DIRECTIVO: ");
        super.mostrar();
        System.out.println(this.toString());
    }

    // : AÑADIR MÉTODOS: ASIGNAR PLUS, QUE INCREMENTA EL SALARIO BRUTO EN EL PLUS QUE PIDAMOS POR TECLADO (PEDIRLO EN OTRO MÉTODO: PEDIRPLUS(): DOUBLE). SOBREESCRIBIR EL MÉTODO CALCULAR SALARIO NETO PORQUE POR INGENIERÍA FINANCIERA SÓLO SE DESCUENTAN UN 5% DEL SALARIO BRUTO.

    /**
     * LOS DIRECTIVOS COBRAN UN PLUS POR EL HECHO DE SERLO. SE PIDE POR TECLADO
     */
    public void asignarPlus() {
        double plus = pedirPlus();
        sueldoBruto = sueldoBruto + plus;
    }

    // PIDAMOS POR TECLADO (PEDIRLO EN OTRO MÉTODO: PEDIRPLUS(): DOUBLE)
    // private porque solamente quiero que sea llamado dentro de esta clase, desdel el método asignarPlus()

    /**
     * Pide el plus en euros que recibirá el directivo
     * @return el plus que recibirá
     */
    private double pedirPlus() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce plus: ");
        return teclado.nextDouble();
    }

    // CALCULAR SALARIO NETO PORQUE POR INGENIERÍA FINANCIERA SÓLO SE DESCUENTAN UN 5% DEL SALARIO BRUTO.

    /**
     * CALCULAR SALARIO NETO PORQUE POR INGENIERÍA FINANCIERA SÓLO SE DESCUENTAN UN 5% DEL SALARIO BRUTO.
     * @return el salario neto tras descontar el 5%
     */
    @Override
    public double calcularSalarioNeto() {
        double salarioNeto = sueldoBruto - sueldoBruto * 5 / 100;
        return salarioNeto;
    }
}
