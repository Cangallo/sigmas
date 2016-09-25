/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.sigmas.util;

import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author Elle Lawliet
 */
public class validator {
  //48->57 = Numeros      46=punto
    private static final int[] caracteresValidosI = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final double[] cantidadesVenta = {0.0, 0.25, 0.50, 0.75};

    public static boolean validarDouble(String numero) {
        if (numero.length() > 0) {
            int contadorEnteros = 0;
            int contadorPuntos = 0;
            char[] array = new char[numero.length()];
            array = numero.toCharArray();

            //contamos los puntos
            for (int i = 0; i < array.length; i++) {
                if (array[i] == (char) 46) {
                    contadorPuntos++;
                }
            }
            //contamos los enteros
            for (int i = 0; (i < array.length); ++i) {
                for (int j = 0; (j < caracteresValidosI.length); ++j) {
                    if (caracteresValidosI[j] == array[i]) {
                        contadorEnteros++;
                    }
                }
            }
            if ((contadorEnteros + contadorPuntos == array.length) && (contadorPuntos < 2) && (contadorEnteros > 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean validarInteger(String numero) {
        if (numero.length() > 0) {
            int contador = 0;

            char[] array = new char[numero.length()];

            array = numero.toCharArray();

            for (int i = 0; (i < array.length); ++i) {

                for (int j = 0; (j < caracteresValidosI.length); ++j) {
                    if (caracteresValidosI[j] == array[i]) {
                        contador++;
                    }
                }
            }
            if (contador == array.length) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static double redondear(double numero, int decimales) {
        return Math.rint(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }

    public static String generarSerie(int numero, int longitud) {
        String numeroDoc = "" + numero;
        String ceros = "0";
        if (longitud >= numeroDoc.length()) {
            ceros = "";
            int diferencia = longitud - numeroDoc.length();
            for (int i = 0; i < diferencia; ++i) {
                ceros += "0";
            }
            ceros += numeroDoc;
        }
        return ceros;
    }

  
    public static int compararFechas(Date fechaBase, Date fechaComparar) {
        //fechaBase>fechaComparar ->1
        //fechaBase<fechaComparar ->-1
        //fechaBase==fechaComparar ->0
        return fechaBase.compareTo(fechaComparar);
    }   

    public static String formatoDecimalJava(double valor) {

        DecimalFormat formateador = new DecimalFormat("###,###,####.##");
        formateador.setMinimumFractionDigits(2);
        String valorFormateado = formateador.format(valor);
        String[] partesNumero = valorFormateado.split(",");
        int parteEntera = (int) valor;
        return parteEntera + "." + partesNumero[1];
    }
    public static String formatoDecimalMoneda(double valor) {
        
        DecimalFormat formateador = new DecimalFormat("###,###,###.##");
        formateador.setMinimumFractionDigits(2);
        String valorFormateado = formateador.format(valor);
        String[] partesNumero = valorFormateado.split(",");
        return partesNumero[0].replace('.', ',') + "." + partesNumero[1];
    }  
}
