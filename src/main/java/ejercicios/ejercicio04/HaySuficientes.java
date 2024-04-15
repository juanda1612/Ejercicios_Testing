package ejercicios.ejercicio04;


public class HaySuficientes {
        public static boolean calcularSiHaySuficientes(int uvas, int comensales) {
            if (uvas >= comensales * 12) {
                return true;
            } else {
                return  false;
            }
        }
}

