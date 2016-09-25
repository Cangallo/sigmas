/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import pe.sigmas.conexion.DBConnection;
import pe.sigmas.presentacion.frminicio;

/**
 *
 * @author Elle Lawliet
 */
public class GenericReporte {

    public void reporteusuario(String nvParamReporte) throws SQLException, JRException, ClassNotFoundException {
        frminicio inicio = new frminicio();
        Connection cn = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            String ubicaionReporte = System.getProperty("user.dir") + "/src/pe/sigmas/reporte/" + nvParamReporte + ".jasper";
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(ubicaionReporte);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, cn);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(inicio, ex.getMessage());
        }
    }
}
