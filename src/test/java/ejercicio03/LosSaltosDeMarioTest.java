package ejercicio03;

import ejercicios.ejercicio03.LosSaltosDeMario;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LosSaltosDeMarioTest {


    @Test
    void prueba1() {
        int[] alturas = {1, 4, 2, 2, 3, 5, 3, 4};
        assertEquals("4 2", LosSaltosDeMario.saltos(alturas));
        System.out.println("Primera prueba: ");
        System.out.println("==============");
        System.out.println("Entrada: " + Arrays.toString(alturas));
        System.out.println("Salida: " + LosSaltosDeMario.saltos(alturas));
    }

    @Test
    void prueba2() {
        int[] alturas = {9, 9};
        assertEquals("0 0", LosSaltosDeMario.saltos(alturas));
        System.out.println("\nSegunda prueba: ");
        System.out.println("==============");
        System.out.println("Entrada: " + Arrays.toString(alturas));
        System.out.println("Salida: " + LosSaltosDeMario.saltos(alturas));
    }

    @Test
    void prueba3() {
        int[] alturas = {1, 2, 3, 4, 5};
        assertEquals("4 0", LosSaltosDeMario.saltos(alturas));
        System.out.println("\nTercera prueba: ");
        System.out.println("==============");
        System.out.println("Entrada: " + Arrays.toString(alturas));
        System.out.println("Salida: " + LosSaltosDeMario.saltos(alturas));
    }


}