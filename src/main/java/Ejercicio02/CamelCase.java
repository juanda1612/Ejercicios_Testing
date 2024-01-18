package Ejercicio02;
/*
Camel Case
Completa el método de manera que convierta palabras delimitadas por guiones/barras bajas en notación camel case.

La primera palabra en la salida debe estar en mayúsculas solo si la palabra original estaba en mayúsculas (conocido como Upper Camel Case, también a menudo referido como Pascal case). Las palabras que vengan después siempre deben comenzar en mayúscula.

Ejemplos: Examples "el-guerrero-sigiloso" se convierte en "elGuerreroSigiloso"

"El-Guerrero_Sigiloso" se convierte en "ElGuerreroSigiloso"

"El_Guerrero_Sigiloso" se convierte en "ElGuerreroSigiloso"
 */

import java.util.Scanner;

public class CamelCase {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // solución
       String palabra = teclado.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.contains("-")){
                palabra.replace("-", " ");
            }
        }
        System.out.println(palabra);


    }

    public static String camelCase(String texto){
        // escribe en este método la solución
        String cadena = "";


        return cadena;
    }


}
