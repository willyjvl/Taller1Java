package com.company;

import clases.CapacidadEndedudamiento;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean esNumero;
        String datoEntrada = null;

        String entrada = "SI";
        while (entrada.equals("SI")) {
            System.out.println("Ingrese sus ingresos mensuales");
            datoEntrada = in.next();
            esNumero = isNumeric(datoEntrada);
            if (esNumero){
                break;
            }else{
                System.out.println("Valor debe ser numerico");
            }
        }
        int ingMesuales = Integer.parseInt(datoEntrada);

        while (entrada.equals("SI")) {
            System.out.println("Ingrese sus gastos fijos");
            datoEntrada = in.next();
            esNumero = isNumeric(datoEntrada);
            if (esNumero){
                break;
            }else{
                System.out.println("Valor debe ser numerico");
            }
        }
        int gastosF = Integer.parseInt(datoEntrada);

        while (entrada.equals("SI")) {
            System.out.println("Ingrese sus gastos variable");
            datoEntrada = in.next();
            esNumero = isNumeric(datoEntrada);
            if (esNumero) {
                break;
            }else{
                System.out.println("Valor debe ser numerico");
            }
        }
        int gastosV = Integer.parseInt(datoEntrada);

        CapacidadEndedudamiento capacidad1 = new CapacidadEndedudamiento(ingMesuales, gastosF, gastosV);
        System.out.println("La capacidad de Endeudamiento es " + capacidad1.getCapacidadEndeudamiento() + " COP");

    }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
        try {
            Double.parseDouble(value);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
