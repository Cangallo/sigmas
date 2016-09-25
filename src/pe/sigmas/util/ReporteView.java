/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.sigmas.util;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author Elle Lawliet
 */
public class ReporteView extends JRViewer{

    public ReporteView(JasperPrint jrPrint) {
        super(jrPrint);
    }

}
