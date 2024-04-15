import ejemplosSueltos.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        assertEquals(4, Calculadora.sumar(2,2)); // caso de prueba
    }

    @Test
    void sumar2() {
        assertEquals(0, Calculadora.sumar(2,-2)); // caso de prueba
    }

    @Test
    void restar() {
        assertEquals(-14000,Calculadora.restar(1000,15000));
    }

    @Test
    void restar2() {
        assertEquals(-33,Calculadora.restar(-3,30));
    }



    @Test
    void multiplicar() {
        assertEquals(0, Calculadora.multiplicar(0,5));
    }
    @Test
    void multiplicar2() {
        assertEquals(1000, Calculadora.multiplicar(1000,1));
    }

    @Test
    void dividir(){
        assertEquals(0, Calculadora.dividir(0,5));
    }
    @Test
    void dividir2(){
        assertEquals(0.1, Calculadora.dividir(1,10));
    }


}