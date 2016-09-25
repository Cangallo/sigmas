package pe.sigmas.util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ConfigSistema {

    public boolean readParametros() {
        File file = new File("system.dll");
        if (file.exists()) {

            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(file);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);

                try {
                    ParametroSistema.setDriver(dataInputStream.readUTF());
                    ParametroSistema.setUrl(dataInputStream.readUTF());
                    ParametroSistema.setUser(dataInputStream.readUTF());
                    ParametroSistema.setPassword(dataInputStream.readUTF());
                    ParametroSistema.setHost(dataInputStream.readUTF());
                    ParametroSistema.setPort(dataInputStream.readUTF());
                    ParametroSistema.setBaseDatos(dataInputStream.readUTF());
                    ParametroSistema.setPathReport(dataInputStream.readUTF());
                    ParametroSistema.setPgDump(dataInputStream.readUTF());
                    ParametroSistema.setSistema(dataInputStream.readUTF());
                    ParametroSistema.setFondo(dataInputStream.readUTF());

                    dataInputStream.close();
                    return true;
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error en la lectura del fichero de conexion", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se encuentra el fichero de configuración", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean writeParametros(String driver, String url, String user,
            String password, String host, String port, String baseDatos,
            String pathReport, String pgDump, String sistema, String fondo) {
        File file = new File("system.dll");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            try {
                dataOutputStream.writeUTF(driver);
                dataOutputStream.writeUTF(url);
                dataOutputStream.writeUTF(user);
                dataOutputStream.writeUTF(password);
                dataOutputStream.writeUTF(host);
                dataOutputStream.writeUTF(port);
                dataOutputStream.writeUTF(baseDatos);
                dataOutputStream.writeUTF(pathReport);
                dataOutputStream.writeUTF(pgDump);
                dataOutputStream.writeUTF(sistema);
                dataOutputStream.writeUTF(fondo);

                dataOutputStream.close();
                return true;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error en la escritura del fichero de conexion", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en la lectura del fichero de conexion", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
