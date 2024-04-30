package ejerciciosCajaNegra.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public int cacularFactorial() throws Exception {
        Scanner teclado = new Scanner(System.in);
        try {
            int numero = teclado.nextInt();
            if (numero < 0) {
                throw new Exception("No se puede calcular el factorial de un negativo");
            } else if (numero == 0) {
                return 1;
            } else {
                int factorial = 1;
                for (int i = 1; i <= numero; i++) {
                    factorial = factorial * i;
                }
                return factorial;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException(e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
