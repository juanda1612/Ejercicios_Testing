package ejerciciosCajaNegra.ejercicio2;

public class HarryPotter {
    public String nombre (String casa){
        if (casa.equalsIgnoreCase("gryffindor")){
            return "valentia";
        } else if (casa.equalsIgnoreCase("hufflepuff")) {
            return "lealtad";
        }else if (casa.equalsIgnoreCase("slytherin")){
            return "astucia";
        } else if (casa.equalsIgnoreCase("ravenclaw")) {
            return "intelecto";
        }else {
            return "No es una casa valida";
        }
    }
}
