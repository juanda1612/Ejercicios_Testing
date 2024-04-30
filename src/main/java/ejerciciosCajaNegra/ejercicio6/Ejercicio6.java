package ejerciciosCajaNegra.ejercicio6;

public class Ejercicio6 {
    /*public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(validarDni("00023000T"));

    }*/


    public static boolean validarDni(String dni) {
        if (!contiene8numerosyletra(dni)) {
            return false;
        } else if (!comprobarLetraNumero(dni)){
            return false;
        }
        return true;
    }

    private static boolean contiene8numerosyletra(String dni) {

        if (!comprobarLongitud(dni)) {
            return false;
        }

        for (int i = 0; i < dni.length() - 1; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }

        if (!Character.isLetter(dni.charAt(dni.length() - 1))) {
            return false;
        }

        return true;
    }

    private static boolean comprobarLongitud(String dni) {
        return dni.length() == 9;
    }

    private static boolean comprobarLetraNumero(String dni) {
        String letra = dni.substring(8,9).toUpperCase();
        int numero = Integer.parseInt(dni.substring(0,8));
        switch (letra) {
            case "T" -> {
                return numero % 23 == 0;
            }
            case "R" -> {
                return numero % 23 == 1;
            }
            case "W" -> {
                return numero % 23 == 2;
            }
            case "A" -> {
                return numero % 23 == 3;
            }
            case "G" -> {
                return numero % 23 == 4;
            }
            case "M" -> {
                return numero % 23 == 5;
            }
            case "Y" -> {
                return numero % 23 == 6;
            }
            case "F" -> {
                return numero % 23 == 7;
            }
            case "P" -> {
                return numero % 23 == 8;
            }
            case "D" -> {
                return numero % 23 == 9;
            }
            case "X" -> {
                return numero % 23 == 10;
            }
            case "B" -> {
                return numero % 23 == 11;
            }
            case "N" -> {
                return numero % 23 == 12;
            }
            case "J" -> {
                return numero % 23 == 13;
            }
            case "Z" -> {
                return numero % 23 == 14;
            }
            case "S" -> {
                return numero % 23 == 15;
            }
            case "Q" -> {
                return numero % 23 == 16;
            }
            case "V" -> {
                return numero % 23 == 17;
            }
            case "H" -> {
                return numero % 23 == 18;
            }
            case "L" -> {
                return numero % 23 == 19;
            }
            case "C" -> {
                return numero % 23 == 20;
            }
            case "K" -> {
                return numero % 23 == 21;
            }
            case "E" -> {
                return numero % 23 == 22;
            }
            default -> {
                return false;
            }
        }

    }
}
