package makigasJunit5.catalogo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregar() {
    }

    @Test
    void testCantidad() {
        // para probar el metodo cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        Producto p1 = new Producto("Coco", 400);
        Producto p2 = new Producto("Canela", 200);

        System.out.println("Prueba antes de meter productos");
        Pedido p = new Pedido();
        assertEquals(0, p.cantidad());

        System.out.println("Prueba despues de meter 1 productos");
        p.agregar(p1);
        assertEquals(1, p.cantidad());

        System.out.println("Prueba despues de meter 2 productos");
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