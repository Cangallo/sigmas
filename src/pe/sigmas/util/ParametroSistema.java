/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.util;

/**
 *
 * @author Administrador
 */
public class ParametroSistema {

    private static String driver = "";
    private static String url = "";
    private static String user = "";
    private static String password = "";
    private static String pathReport= "";
    private static String pgDump="";
    private static String host="";
    private static String port="";
    private static String baseDatos="";
    private static String sistema="";
    private static String fondo="";

    public static String getPgDump() {
        return pgDump;
    }

    public static void setPgDump(String apgDump) {
        pgDump = apgDump;
    }

    public static String getDriver() {
        return driver;
    }

    public static void setDriver(String aDriver) {
        driver = aDriver;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String aUrl) {
        url = aUrl;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String aUser) {
        user = aUser;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String aPassword) {
        password = aPassword;
    }

    public static String getPathReport() {
        return pathReport;
    }

    public static void setPathReport(String aPathReport) {
        pathReport = aPathReport;
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String aHost) {
        host = aHost;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String aPort) {
        port = aPort;
    }

    public static String getBaseDatos() {
        return baseDatos;
    }

    public static void setBaseDatos(String aBaseDatos) {
        baseDatos = aBaseDatos;
    }

    public static String getSistema() {
        return sistema;
    }

    public static void setSistema(String aSistema) {
        sistema = aSistema;
    }

    public static String getFondo() {
        return fondo;
    }

    public static void setFondo(String aFondo) {
        fondo = aFondo;
    }

}
