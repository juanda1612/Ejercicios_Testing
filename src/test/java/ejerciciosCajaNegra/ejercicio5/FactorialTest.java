package ejerciciosCajaNegra.ejercicio5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("Entrada 0")
    void cacularFactorial0() {
        Factorial f = new Factorial();
        // Simular la entrada estándar System.in
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        try {
            assertEquals(1,f.cacularFactorial());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    @DisplayName("Entrada 1")
    void cacularFactorial1() {
        Factorial f = new Factorial();
        // Simular la entrada estándar System.in
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        try {
            assertEquals(1,f.cacularFactorial());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Entrada 10")
    void cacularFactorial10() {
        Factorial f = new Factorial();
        // Simular la entrada estándar System.in
        String input = "10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        try {
            assertEquals(3628800,f.cacularFactorial());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}