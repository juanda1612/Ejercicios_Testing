import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        assertEquals(4, Calculadora.sumar(2,2)); // caso de prueba
    }
}