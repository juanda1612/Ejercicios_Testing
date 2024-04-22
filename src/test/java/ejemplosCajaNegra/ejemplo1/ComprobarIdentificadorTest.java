package ejemplosCajaNegra.ejemplo1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarIdentificadorTest {
    ComprobarIdentificador prueba = new ComprobarIdentificador();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Cobertura 1, 4, 6, 9, 11 + identificador valido")
    void validarIdentificador1() {
        prueba.setIdentificador("Progra--mador-1");
        assertTrue(prueba.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 2 + identificador no valido")
    void validarIdentificador2() {
        prueba.setIdentificador("Prog");
        assertFalse(prueba.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 3 + identificador no valido")
    void validarIdentificador3() {
        prueba.setIdentificador("Progra--mador-112");
        assertFalse(prueba.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 5 + identificador no valido")
    void validarIdentificador4() {
        prueba.setIdentificador("$$$###_?");
        assertFalse(prueba.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 7 + identificador no valido")
    void validarIdentificador5() {
        prueba.setIdentificador("-Progra--mador");
        assertFalse(prueba.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 8 + identificador no valido")
    void validarIdentificador6() {
        prueba.setIdentificador("Progra--mador-");
        assertFalse(prueba.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 10 + identificador no valido")
    void validarIdentificador7() {
        prueba.setIdentificador("12345--6789");
        assertFalse(prueba.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 12 + identificador no valido")
    void validarIdentificador8() {
        prueba.setIdentificador("boolean");
        assertFalse(prueba.validarIdentificador());
    }
}