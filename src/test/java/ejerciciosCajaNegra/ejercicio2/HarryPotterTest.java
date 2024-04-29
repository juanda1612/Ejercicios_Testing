package ejerciciosCajaNegra.ejercicio2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarryPotterTest {
    HarryPotter harryPotter = new HarryPotter();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Prueba1:gryffindor")
    void nombre11() {
        assertEquals("valentia",harryPotter.nombre("gryffindor") );
    }
    @Test
    @DisplayName("Prueba1:GRYFFINDOR")
    void nombre12() {
        assertEquals("valentia",harryPotter.nombre("GRYFFINDOR") );
    }
    @Test
    @DisplayName("Prueba2:hufflepuff")
    void nombre21() {
        assertEquals("lealtad", harryPotter.nombre("hufflepuff"));
    }
    @Test
    @DisplayName("Prueba2:HUFFLEPUFF")
    void nombre22() {
        assertEquals("lealtad", harryPotter.nombre("HUFFLEPUFF"));
    }
    @Test
    @DisplayName("Prueba3:slytherin")
    void nombre31() {
        assertEquals("astucia", harryPotter.nombre("slytherin"));
    }
    @Test
    @DisplayName("Prueba3:SLYTHERIN")
    void nombre32() {
        assertEquals("astucia", harryPotter.nombre("SLYTHERIN"));
    }
    @Test
    @DisplayName("Prueba4:ravenclaw")
    void nombre41() {
        assertEquals("intelecto",harryPotter.nombre("ravenclaw"));
    }
    @Test
    @DisplayName("Prueba4:RAVENCLAW")
    void nombre42() {
        assertEquals("intelecto",harryPotter.nombre("RAVENCLAW"));
    }
    @Test
    @DisplayName("Prueba5:cuchicuchi")
    void nombre5() {
        assertEquals("No es una casa valida",harryPotter.nombre("cuchicuchi"));
    }
}