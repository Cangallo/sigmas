/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.presentacion;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import pe.sigmas.entity.regobligacionBean;
import pe.sigmas.entity.regpagoBean;
import pe.sigmas.logica.regobligacionBL;
import pe.sigmas.logica.regpagoBL;
import pe.sigmas.util.Generic;
import pe.sigmas.util.GenericEstiloTabla;
import pe.sigmas.util.GenericTableModel;
import pe.sigmas.util.SeguridadApp;
import pe.sigmas.util.validator;

/**
 *
 * @author Elle Lawliet
 */
public class frmpago extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmpago
     */
    GenericTableModel modeloTabla;
    TableColumnModel modeloColumna;
    String[] columnanes = {"ID", "EJERCICIO", "VENCIMIENTO", "CONCEPTO DE PAGO", "SUB TOTAL"};
    boolean[] editable = {false, false, false, false, false};
    boolean[] columnCheck = {false, false, false, false, false};

    public frmpago() {
        initComponents();
        modeloTabla = new GenericTableModel(columnanes, columnCheck, editable);
        jTable1.setModel(modeloTabla);
        modeloColumna = jTable1.getColumnModel();
        ajustarColumna();
        estiloTabla();
        hideColumnTable();
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
        jPanel2 = new javax.swing.JPanel();
        numeroRecibo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        totalinsoluto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contribuyente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ADMINISTRACION DE PAGOS DE USUARIOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por Numero de Recibo"));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(numeroRecibo, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Deuda Del Contribuyente"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        totalinsoluto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("TOTAL INSOLUTO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalinsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalinsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_lblBuscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/exit_min.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_btnCalcDeuda.png"))); // NOI18N
        jButton3.setText("Pagar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion Contribuyente"));
        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("CONTRIBUYENTE:");
        jPanel4.add(jLabel1);

        contribuyente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(contribuyente);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("CATEGORIA:");
        jPanel4.add(jLabel3);

        categoria.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(categoria);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(1, 1, 1))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            if (numeroRecibo.getText().isEmpty() || numeroRecibo.getText().length() > 6) {
                JOptionPane.showInternalMessageDialog(this, "Ingrese el numero de recibo para continuar", "Error", JOptionPane.ERROR_MESSAGE);
                numeroRecibo.requestFocus();
                numeroRecibo.selectAll();
            } else {
                if (!validator.validarInteger(numeroRecibo.getText())) {
                    JOptionPane.showInternalMessageDialog(this, "NUMERO DE RECIBO INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    numeroRecibo.selectAll();
                    numeroRecibo.requestFocus();
                    return;
                }
                cargarDeuda(6);
                cargarInformacionPersona(5);
            }
        } catch (Exception ex) {
            Logger.getLogger(frmpago.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if (numeroRecibo.getText().isEmpty() || numeroRecibo.getText().length() > 6) {
                JOptionPane.showInternalMessageDialog(this, "Ingrese el numero de recibo para continuar", "Error", JOptionPane.ERROR_MESSAGE);
                numeroRecibo.requestFocus();
                numeroRecibo.selectAll();
            } else {
                registrarpago(1);

            }
        } catch (Exception ex) {
            Logger.getLogger(frmpago.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel contribuyente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numeroRecibo;
    private javax.swing.JLabel totalinsoluto;
    // End of variables declaration//GEN-END:variables

    private void cargarDeuda(int iOps) throws Exception {
        deleteRows();
        regobligacionBean oregobligacionBean = new regobligacionBean();
        oregobligacionBean.setIOps(iOps);
        oregobligacionBean.setBEstado(true);
        oregobligacionBean.setBiIdRegRecibo(Integer.parseInt(numeroRecibo.getText()));
        List lista = Generic.getInstance(regobligacionBL.class).fnGridregobligacionBean(oregobligacionBean);
        lista.stream().forEach((object) -> {
            modeloTabla.addRow((Object[]) object);
        });
    }

    private void estiloTabla() {
        for (int i = 0; i < modeloColumna.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(new GenericEstiloTabla());
        }
    }

    private void hideColumnTable() {
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
    }

    private void ajustarColumna() {
        modeloColumna.getColumn(0).setPreferredWidth(0);
        modeloColumna.getColumn(1).setPreferredWidth(50);
        modeloColumna.getColumn(2).setPreferredWidth(100);
        modeloColumna.getColumn(3).setPreferredWidth(200);
        modeloColumna.getColumn(4).setPreferredWidth(50);
    }

    private void deleteRows() {
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
    }

    private void cargarInformacionPersona(int iOps) throws Exception {
        regobligacionBean oregobligacionBean = new regobligacionBean();
        oregobligacionBean.setIOps(iOps);
        oregobligacionBean.setBEstado(true);
        oregobligacionBean.setBiIdRegRecibo(Integer.parseInt(numeroRecibo.getText()));
        oregobligacionBean = Generic.getInstance(regobligacionBL.class).fnGetregobligacionBean(oregobligacionBean);

        if (oregobligacionBean.getCCodRegContribuyente() != null && !oregobligacionBean.getCCodRegContribuyente().isEmpty()) {
            contribuyente.setText(oregobligacionBean.getCCodMaeEstaObligacion());
            categoria.setText(oregobligacionBean.getCCodRegContribuyente());
            totalinsoluto.setText(oregobligacionBean.getNvObservacion());
        } else {
            JOptionPane.showInternalMessageDialog(this, "El Contribuyente no tiene Deuda", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            numeroRecibo.requestFocus();
            numeroRecibo.selectAll();
        }

    }

    private void registrarpago(int iOps) throws Exception {
        regpagoBean oregpagoBean = new regpagoBean();
        oregpagoBean.setIOps(iOps);
        oregpagoBean.setBEstado(true);
        oregpagoBean.setCCodMaeEstaPago("00001");
        oregpagoBean.setDeMontRecibido(0);
        oregpagoBean.setDeMontVuelto(0);
        SeguridadApp segApp = new SeguridadApp();
        oregpagoBean.setNvIp(segApp.IpMaquina());
        oregpagoBean.setNvNombPc(segApp.NombreMaquina());
        oregpagoBean.setIIdRegUsuaRegistra(frminicio.IdUsuario);
        oregpagoBean.setBiIdRegRecibo(Integer.parseInt(numeroRecibo.getText()));
        boolean result = Generic.getInstance(regpagoBL.class).fnInsertarregpagoBean(oregpagoBean);
        if (result) {
            JOptionPane.showInternalMessageDialog(this, "Pago correctamente realizado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            numeroRecibo.requestFocus();
            numeroRecibo.selectAll();
        } else {
            JOptionPane.showInternalMessageDialog(this, "Error al momento de pagar el recibo", "Error", JOptionPane.ERROR_MESSAGE);
            numeroRecibo.requestFocus();
            numeroRecibo.selectAll();
        }
    }

}
