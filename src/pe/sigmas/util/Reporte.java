/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.sigmas.util;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import pe.sigmas.conexion.DBConnection;
import pe.sigmas.presentacion.frminicio;

/**
 *
 * @author Elle Lawliet
 */
public class Reporte {
    private Map parametros;
    private String nombreReporte;
    private String pathReporte;
   

    public Reporte(Map parametros, String nombreReporte) {
        this.parametros = parametros;
        this.nombreReporte = nombreReporte;
        
        obtenerPathReporte();
    }

    public Reporte() {     
        obtenerPathReporte();
    }

    //REPORTE GENERADO DIRECTAMENTE POR SENTENCIA SQL
    private JasperPrint generarReporte() {
        try {
            JasperPrint pri = JasperFillManager.fillReport(pathReporte + nombreReporte, parametros,   DBConnection.getInstance().openConnection());
            return pri;
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            
        }
    }

    //REPORTE GENERADO DESDE CODIGO JAVA
    private JasperPrint generarReporte(JRDataSource dataSource) {
        try {
            JasperPrint pri = JasperFillManager.fillReport(pathReporte + nombreReporte, parametros, dataSource);
            return pri;
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //VISTA PREVIA DE REPORTE EN PDF
    public void mostrarReportePdf() {
        JasperPrint print = null;
        print = generarReporte();
        if (print != null) {
            ReporteView view = new ReporteView(print);
            JInternalFrame viewInternal = new JInternalFrame("VISTA PREVIA");
            viewInternal.setClosable(true);
            viewInternal.setResizable(true);
            viewInternal.setMaximizable(true);
            viewInternal.setIconifiable(true);
            viewInternal.setSize(700, 500);
            viewInternal.add(view);
            frminicio.escritorio.add(viewInternal);
            viewInternal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "EL REPORTE NO TIENE DATA", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mostrarReportePdf(JRDataSource dataSource) {
        JasperPrint print = null;
        print = generarReporte(dataSource);
        if (print != null) {
            ReporteView view = new ReporteView(print);
            JInternalFrame viewInternal = new JInternalFrame("VISTA PREVIA");
            viewInternal.setClosable(true);
            viewInternal.setResizable(true);
            viewInternal.setMaximizable(true);
            viewInternal.setIconifiable(true);
            viewInternal.setSize(700, 500);
            viewInternal.add(view);
            frminicio.escritorio.add(viewInternal);
            viewInternal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "EL REPORTE NO TIENE DATA", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //MOSTRAR REPORTE EN EXCEL
    public void mostrarReporteExcel() {
        JasperPrint print = null;
        print = generarReporte();
        if (print != null) {
            JRXlsExporter exporterXLS = new JRXlsExporter();

            exporterXLS.setParameter(JRXlsExporterParameter.JASPER_PRINT, print);
            try {
                exporterXLS.exportReport();
            } catch (JRException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "EL REPORTE NO TIENE DATA", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }


    }

    public void imprimirReporte() {
        JasperPrint print = null;
        print = generarReporte();
        if (print != null) {
            //  JOptionPane.showMessageDialog(null, "imprimiendo reporte por impresora");
            PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
            PrintService impresoraPredeterminada = PrintServiceLookup.lookupDefaultPrintService();

            /*
             * Los métodos getPageWidth y getPageHeight devuelven en pixeles, de
             * forma que hay que transformar dividiendo x 72
             */
            //  float w = print.getPageWidth() / 72f;
            //  float h = print.getPageHeight() / 72f;

            // Busco el tamaño de papel de la impresora más parecido
            //   printRequestAttributeSet.add(MediaSize.findMedia(w, h, MediaSize.INCH));

            // Configuro el area de impresión
            //  int unidad = MediaPrintableArea.INCH;
            //   printRequestAttributeSet.add(new MediaPrintableArea(0, 0, w, h, unidad));

            // Orientación
//        OrientationRequested orientation = OrientationRequested.PORTRAIT;
//        if (jasperPrint.getO== JRReport.ORIENTATION_LANDSCAPE) {
//            orientation = OrientationRequested.LANDSCAPE;
//        }
//        printRequestAttributeSet.add(orientation);
            PrintService service = impresoraPredeterminada;

            JRExporter exporter = new JRPrintServiceExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE, service);
            exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
            try {
                exporter.exportReport();
            } catch (JRException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Termino de imprimir en impresora");
        } else {
            JOptionPane.showMessageDialog(null, "EL REPORTE NO TIENE DATA", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void obtenerPathReporte() {
        pathReporte = System.getProperty("user.dir") + "/src/pe/sigmas/reporte/";
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getPathReporte() {
        return pathReporte;
    }

    public void setPathReporte(String pathReporte) {
        this.pathReporte = pathReporte;
    }

    public Map getParametros() {
        return parametros;
    }

    public void setParametros(Map parametros) {
        this.parametros = parametros;
    }
}
