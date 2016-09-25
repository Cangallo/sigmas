/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.sigmas.presentacion;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import pe.sigmas.util.Reporte;

/**
 *
 * @author Core i7
 */
public class frmIngresoVencimiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmIngresoVencimiento
     */
    public frmIngresoVencimiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ejercicioIngresoVencimiento = new javax.swing.JTextField();
        ReporteIngresoVencimiento = new javax.swing.JButton();
        jBIngresoVencimiento = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte Ingreso por vencimiento"));

        jLabel1.setText("Ejercicio");

        ReporteIngresoVencimiento.setText("Reporte");
        ReporteIngresoVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteIngresoVencimientoActionPerformed(evt);
            }
        });

        jBIngresoVencimiento.setText("Salir");
        jBIngresoVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresoVencimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ejercicioIngresoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ReporteIngresoVencimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBIngresoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ejercicioIngresoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteIngresoVencimiento)
                    .addComponent(jBIngresoVencimiento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReporteIngresoVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteIngresoVencimientoActionPerformed
              
        try
            {
            int ejercicio=Integer.parseInt(ejercicioIngresoVencimiento.getText());
            Map parametros = new HashMap();
            parametros.put("ejerciciov", ejercicio);
            Reporte reporteController = new Reporte(parametros, "rptReporteVencimiento.jasper");
            reporteController.mostrarReportePdf();
            System.out.println("SI  LLEGA HASTA AQUI");     
            }
    	 catch (NumberFormatException nfe){
             
	JOptionPane.showInternalMessageDialog(this, "Ingrese la Mora", "Error", JOptionPane.ERROR_MESSAGE);	
	}
    }//GEN-LAST:event_ReporteIngresoVencimientoActionPerformed

    private void jBIngresoVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresoVencimientoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBIngresoVencimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReporteIngresoVencimiento;
    private javax.swing.JTextField ejercicioIngresoVencimiento;
    private javax.swing.JButton jBIngresoVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}