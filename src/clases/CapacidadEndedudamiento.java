package clases;

public class CapacidadEndedudamiento {
    int ingresosTotales;
    int gastosFijos;
    int gastoVaribales;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase
    public CapacidadEndedudamiento(int arg1, int arg2, int arg3 ){
        ingresosTotales = arg1;
        gastosFijos = arg2;
        gastoVaribales = arg3;
    }

    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public String getCapacidadEndeudamiento() {
        return String.valueOf((ingresosTotales - gastosFijos - gastoVaribales) * POR_FIJO);
    }
}
