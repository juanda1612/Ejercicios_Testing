package ejemplosSueltos;

import java.util.Scanner;

public class SaliendoDeLaCrisis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroLinea = teclado.nextInt(); teclado.nextLine();

        if (numeroLinea >= 3){
            while (numeroLinea != 0){
               String[] numero = new String[numeroLinea];

               String cadena = teclado.nextLine();
               numero = cadena.split(" ");

                int[] numerosInt = new int[numero.length];

                for (int i = 0; i < numero.length; i++) {
                    numerosInt [i] = Integer.parseInt(numero[i]);
                }

                for (int i = 0; i < numerosInt.length -1; i++) {
                    if (numerosInt[i] < numerosInt[i+1]){
                        System.out.println("NO");
                    }else {
                        System.out.println("SI");
                    }
                }
                numeroLinea = teclado.nextInt();
            }
        }else {
            System.out.println("numero no valido");
        }
    }
}
