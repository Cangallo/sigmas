/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.util;

/**
 *
 * @author Administrador
 */
public class ParametrosSeguridad {
    private static String ruta="";
    private static int hora=0;
    private static int minuto=0;
    private static boolean activo=false;

    public static String getRuta() {
        return ruta;
    }

    public static void setRuta(String aRuta) {
        ruta = aRuta;
    }

    public static int getHora() {
          return hora;
    }

    public static void setHora(int aHora) {
        hora = aHora;
    }

    public static int getMinuto() {
        return minuto;
    }

    public static void setMinuto(int aMinuto) {
        minuto = aMinuto;
    }

    public static boolean isActivo() {
        return activo;
    }

    public static void setActivo(boolean aActivo) {
        activo = aActivo;
    }


}
