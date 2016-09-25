/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.util;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class ConfigSeguridad {

    public boolean readParametros() {
        File file = new File("security.dll");
        if (file.exists()) {

            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(file);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);

                try {
                    ParametrosSeguridad.setRuta(dataInputStream.readUTF());
                    ParametrosSeguridad.setHora(dataInputStream.readInt());
                    ParametrosSeguridad.setMinuto(dataInputStream.readInt());
                    ParametrosSeguridad.setActivo(dataInputStream.readBoolean());

                    dataInputStream.close();
                    return true;
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error en la lectura del fichero de seguridad", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se encuentra el fichero de seguridad", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean writeParametros(String ruta, int hora, int minuto, boolean activo) {
        File file = new File("security.dll");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            try {
                dataOutputStream.writeUTF(ruta);
                dataOutputStream.writeInt(hora);
                dataOutputStream.writeInt(minuto);
                dataOutputStream.writeBoolean(activo);

                dataOutputStream.close();
                return true;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error en la escritura del fichero de seguridad", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en la lectura del fichero de seguridad", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void backupMysql() {

    }
}
