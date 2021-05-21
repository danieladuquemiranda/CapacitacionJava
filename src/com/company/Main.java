package com.company;
import clases.CapacidadEndeudamiento;
import clases.MensajesAutomaticos;

import java.util.Scanner;

public class Main {
    private static String entradaWhile = "SI";
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try {

            while (entradaWhile.equalsIgnoreCase("SI")) {
                System.out.println(MensajesAutomaticos.BIENVENIDA);

                int gananciasTotales = getEnteroConsola(MensajesAutomaticos.GANANCIAS_TOTALES);
                int gastosFijos = getEnteroConsola(MensajesAutomaticos.GASTOS_FIJOS);
                int gastosVariables = getEnteroConsola(MensajesAutomaticos.GASTOS_VARIABLES);

                CapacidadEndeudamiento capacidadEndeudamientoObject = new CapacidadEndeudamiento(gananciasTotales,gastosFijos,gastosVariables);
                System.out.println(MensajesAutomaticos.CAPACIDAD + capacidadEndeudamientoObject.getCapacidadEndeudamiento());

                System.out.println(MensajesAutomaticos.CONDICIONAL_SALIDA);
                entradaWhile = scanner.next();
                if (entradaWhile.equalsIgnoreCase("NO")) {
                    System.out.println(MensajesAutomaticos.GRACIAS);
                }
            }
        } catch (Exception e){
            System.out.println(MensajesAutomaticos.GRACIAS);
        }
    }

    public static int getEnteroConsola(String cadena) throws Exception {
        System.out.println(cadena);
        while (!entradaWhile.equalsIgnoreCase("NO")){
            entradaWhile = scanner.next();
            try{
                return Integer.parseInt(entradaWhile);
            }catch(Exception e){
                if (!entradaWhile.equalsIgnoreCase("NO")){
                    System.out.println(MensajesAutomaticos.REPETIR_CICLO);
                }
            }
        }
        throw new Exception();
    }
}
