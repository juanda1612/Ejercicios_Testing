package makigasJunit5.catalogo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    Producto p1,p2;
    Pedido p;
    @BeforeEach
    void setUp() {
        p1 = new Producto("Coco", 400);
        p2 = new Producto("Canela", 200);
        p = new Pedido();
    }

    @AfterEach
    void tearDown() {
        p.vaciar();
    }

    @Test
    void agregar() {
    }

    @Test
    @DisplayName("Con 0 productos")
    void testCantidad1() {
        // para probar el metodo cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        assertEquals(0, p.cantidad());
    }

    @Test
    @DisplayName("Con 1 productos")
    void testCantidad2() {
        // para probar el metodo cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        p.agregar(p1);
        assertEquals(1, p.cantidad());
    }

    @Test
    @DisplayName("Con 2 productos")
    void testCantidad3() {
        // para probar el metodo cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        p.agregar(p1);

        p.agregar(p2);
        assertEquals(2, p.cantidad());
    }
    @Test
    void total() {
    }

    @Test
    void vaciar() {
    }

    @Test
    void pagar() {
    }
}