package ejerciciosCajaNegra.ejercicio1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionTest {

    Excursion e;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("precio alumno: 100 alumnos")
    void calcularPrecioAlumno1() {
        e = new Excursion(100);
        assertEquals(65, e.calcularPrecioAlumno());
    }
    @Test
    @DisplayName("precio alumno: 50 alumnos")
    void calcularPrecioAlumno2() {
        e = new Excursion(50);
        assertEquals(70, e.calcularPrecioAlumno());
    }
    @Test
    @DisplayName("precio alumno: 30 alumnos")
    void calcularPrecioAlumno3() {
        e = new Excursion(30);
        assertEquals(95, e.calcularPrecioAlumno());
    }
    @Test
    @DisplayName("precio alumno: 29 alumnos")
    void calcularPrecioAlumno4() {
        e = new Excursion(29);
        assertEquals(4000/29, e.calcularPrecioAlumno());
    }

    @Test
    @DisplayName("total: 100 alumnos")
    void calcularCosteExcursion1() {
        e = new Excursion(100);
        assertEquals(6500, e.calcularCosteExcursion());
    }
    @Test
    @DisplayName("total: 50 alumnos")
    void calcularCosteExcursion2() {
        e = new Excursion(50);
        assertEquals(3500, e.calcularCosteExcursion());
    }
    @Test
    @DisplayName("total: 30 alumnos")
    void calcularCosteExcursion3() {
        e = new Excursion(30);
        assertEquals(2850, e.calcularCosteExcursion());
    }
    @Test
    @DisplayName("total: 29 alumnos")
    void calcularCosteExcursion4() {
        e = new Excursion(29);
        assertEquals(4000, e.calcularCosteExcursion());
    }
}