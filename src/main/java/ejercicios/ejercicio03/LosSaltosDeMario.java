package ejercicios.ejercicio03;

public class LosSaltosDeMario {

    public static String saltos(int[] alturas) {
        String resultado = "";
        int contadorA = 0;
        int contadorB = 0;
        for (int i = 0; i < alturas.length - 1; i++) {
            if (alturas[i] > alturas[i+1]){
                contadorA++;
            } else if (alturas[i] < alturas[i+1]) {
                contadorB++;
            }
        }
        resultado = String.valueOf(contadorB + " " + contadorA);
        // escribe lo necesario para producir el resultado

        return resultado;
    }
}

