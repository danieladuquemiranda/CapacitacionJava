package com.company;
import clases.CapacidadEndedudamiento;
import clases.MensajesAutomaticos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CapacidadEndedudamiento capacidadEndeudamientoObject = new CapacidadEndedudamiento();
        MensajesAutomaticos mesajesAutomaticosObject = new MensajesAutomaticos();

        Scanner scanner = new Scanner(System.in);

        String entradaWhile = "NO";
        while (entradaWhile.equals("NO")){
            System.out.println(mesajesAutomaticosObject.getBIENVENIDA());
            System.out.println(mesajesAutomaticosObject.getGANANCIAS_TOTALES());
            capacidadEndeudamientoObject.setIngresosTotales(scanner.nextInt());

            System.out.println(mesajesAutomaticosObject.getGASTOS_FIJOS());
            capacidadEndeudamientoObject.setGastosFijos(scanner.nextInt());

            System.out.println(mesajesAutomaticosObject.getGASTOS_VARIABLES());
            capacidadEndeudamientoObject.setGastosVariables(scanner.nextInt());

            System.out.println(capacidadEndeudamientoObject.getCapacidadEndeudamiento(
                    capacidadEndeudamientoObject.getIngresosTotales(),
                    capacidadEndeudamientoObject.getGastosFijos(),
                    capacidadEndeudamientoObject.getGastosVariables(),
                    capacidadEndeudamientoObject.getPOR_FIJO())
            );
            System.out.println(mesajesAutomaticosObject.getCONDICIONAL_SALIDA());
            entradaWhile = scanner.next();
            if( entradaWhile.equals("SI")){
                System.out.println(mesajesAutomaticosObject.getGRACIAS());
            }
        }

    }

}
