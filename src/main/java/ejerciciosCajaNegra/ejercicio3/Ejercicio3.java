package ejerciciosCajaNegra.ejercicio3;

import java.util.stream.Stream;

public class Ejercicio3 {
    public static int sumarDel1al10() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce(0, (a, b) -> a + b);
    }
}
