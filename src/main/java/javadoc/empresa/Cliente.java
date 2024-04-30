package javadoc.empresa;

import java.time.LocalDate;

/**
 * Clase Cliente, que
 * hereda también de Persona y tiene el atributo propio String telefonoDeContacto. De esta clase no hereda ninguna otra.
 * También sobreescribe el método mostrar de la misma forma que la clase anterior.
 * Su constructor recibe todos los atributos como parámetros.
 * AÑADIR COMPROBACIÓN PARA EL TELÉFONO (9 CIFRAS) -> si no se cumple esto, teléfono = "Desconocido"
 * AÑADIR UN CONSTRUCTOR CON DOS PARÁMETROS PARA EL CASO EN QUE EL CLIENTE NO TENGA TELÉFONO.
 * Si EL CLIENTE NO TIENE TELÉFONO, EL ATRIBUTO CORRESPONDIENTE GUARDARÁ “Desconocido”.
 * @author Ana
 * @version 1.0
 *
 */

public class Cliente extends Persona{
    /**
     * teléfono del cliente
     */
    private String telefono;

    /**
     * Constructor con todos los parámetros
     * @param nombre
     * @param fechaNacimiento
     * @param telefono
     */
    public Cliente(String nombre, LocalDate fechaNacimiento, String telefono) {
        super(nombre, fechaNacimiento);
        int cifras = 0;
        // debemos validar
        if (telefono.length() == 9) {
            // si teléfono tiene 9 caracteres debemos comprobar que todos ellos son números
            for (int i = 0; i < telefono.length(); i++) {
                if (Character.isDigit(telefono.charAt(i))) {
                    cifras++;
                }
            }
        }

        if (cifras == 9) {
            this.telefono = telefono;
        } else {
            this.telefono = "Desconocido";
        }
    }

    /**
     * Si el cliente no tiene teléfono se le asigna el valor "desconocido"
     * @param nombre
     * @param fechaNacimiento
     */
    public Cliente(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        //Si EL CLIENTE NO TIENE TELÉFONO, EL ATRIBUTO CORRESPONDIENTE GUARDARÁ “Desconocido”.
        this.telefono = "Desconocido";
    }

    /**
     * Sobreescribe el método toString() de la clase Object
     * @return datos del cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                '}';
    }

    /**
     * Muestra por consola los datos del cliente
     */
    @Override
    public void mostrar() {
        System.out.println("\n\nDATOS DEL CLIENTE: ");
        System.out.println("Esto de Persona: ");
        System.out.println(super.toString());
        System.out.println("Y esto del cliente: ");
        System.out.println(this.toString());

    }
}
