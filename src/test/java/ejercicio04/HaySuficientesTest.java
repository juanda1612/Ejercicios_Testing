package ejercicio04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HaySuficientesTest {

    @Test
    @DisplayName("12 uvas, 1 comensal")
    void prueba1() {
        assertEquals(true, HaySuficientes.calcularSiHaySuficientes(12, 1));
    }

    @Test
    @DisplayName("36 uvas, 2 comensales")
    void prueba2() {
        assertEquals(true, HaySuficientes.calcularSiHaySuficientes(36, 2));
    }

    @Test
    @DisplayName("36 uvas, 4 comensales")
    void prueba3() {
        assertEquals(false, HaySuficientes.calcularSiHaySuficientes(12, 12));
    }
}