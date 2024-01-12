import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolaMundoTest {

    @Test
    void prueba1() {
        assertEquals("CARLOS", HolaMundo.holaMundo("carlos"));
    }

    @Test
    void prueba2() {
        assertEquals("KAMILLY", HolaMundo.holaMundo("KaMiLlY"));
    }
}