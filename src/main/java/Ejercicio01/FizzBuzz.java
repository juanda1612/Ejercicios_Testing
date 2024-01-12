package Ejercicio01;

public class FizzBuzz {
    public static String fizzBuzz(){
        String cadena = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                cadena = cadena + "\nfizzbuzz";
            } else if (i % 5 == 0) {
                cadena = cadena + "\nbuzz";
            } else if (i % 3 == 0) {
                cadena = cadena + "\nfizz";
            } else {
                cadena = cadena + "\n" + String.valueOf(i);
            }
        }
        return cadena;
    }
}
