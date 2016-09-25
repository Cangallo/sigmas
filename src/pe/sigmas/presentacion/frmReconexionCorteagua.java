/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.sigmas.presentacion;

import java.sql.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pe.sigmas.entity.regCorteBean;
import pe.sigmas.entity.regcontribuyenteBean;
import pe.sigmas.entity.regpersonaBean;
import pe.sigmas.logica.regpersonaBL;
import pe.sigmas.util.Generic;

/**
 *
 * @author Core i7
 */
public class frmReconexionCorteagua extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmReconexionCorteagua
     */
    public frmReconexionCorteagua() {
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
        jPanel2 = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cTipo = new javax.swing.JComboBox();
        Mora = new javax.swing.JLabel();
        tmora = new javax.swing.JTextField();
        bgenerarReconexion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tObservacion = new javax.swing.JTextArea();
        jBSalir = new javax.swing.JButton();
        bBuscarContribuyente = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Contribuyente"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("Codigo:");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar Tipo"));

        cTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Corte", "Reconexion" }));
        cTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTipoActionPerformed(evt);
            }
        });

        Mora.setText("Mora:");

        tmora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmoraActionPerformed(evt);
            }
        });

        bgenerarReconexion.setText("Generar");
        bgenerarReconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgenerarReconexionActionPerformed(evt);
            }
        });

        jLabel2.setText("Observacion:");

        tObservacion.setColumns(20);
        tObservacion.setRows(5);
        jScrollPane1.setViewportView(tObservacion);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bgenerarReconexion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalir)
                .addGap(42, 42, 42))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Mora)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmora, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mora)
                    .addComponent(tmora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(bgenerarReconexion))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        bBuscarContribuyente.setText("Buscar");
        bBuscarContribuyente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarContribuyenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(bBuscarContribuyente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscarContribuyente)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void bgenerarReconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgenerarReconexionActionPerformed
        // TODO PARA EL CORTE
        
        int codigo1;
        String tipo;
        double mora1;
        String observacion;
        regCorteBean corteReconexion=new regCorteBean();
        
        try {
            codigo1= Integer.parseInt(codigo.getText());
            tipo=cTipo.getSelectedItem().toString();
            
            observacion=tObservacion.getText();
           //JOptionPane.showInternalMessageDialog(this, "Ingrese la Mora"+fecha, "Error", JOptionPane.ERROR_MESSAGE);
            
           if(tipo.equals("Corte"))
               { 
                cargarCorte(tipo,codigo1,0.00,observacion);
                limpiar();
               } 
           else 
               { mora1=Double.parseDouble(tmora.getText());
                cargarReconexion(tipo,codigo1,mora1,observacion);
                 limpiar();
               } 
            }
            //JOptionPane.showInternalMessageDialog(this, "Ingrese la Mora"+observacion, "Error", JOptionPane.ERROR_MESSAGE);
             
          catch (NumberFormatException nfe){
		JOptionPane.showInternalMessageDialog(this, "Ingrese la Mora", "Error", JOptionPane.ERROR_MESSAGE);
	}
          catch (Exception ex) {
            Logger.getLogger(frmpago.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_bgenerarReconexionActionPerformed

    private void bBuscarContribuyenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarContribuyenteActionPerformed
        // TODO add your handling code here:
         int codigo1;
          try {
               codigo1= Integer.parseInt(codigo.getText());          
                cargarCodicoContribuyente(codigo1);
               // cargarDeuda(6);
               // cargarInformacionPersona(5);
            
        } 
          catch (NumberFormatException nfe){
		JOptionPane.showInternalMessageDialog(this, "Ingrese un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
	}
          catch (Exception ex) {
            Logger.getLogger(frmpago.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_bBuscarContribuyenteActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void cTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTipoActionPerformed
        // TODO add your handling code here:
        
        if(cTipo.getSelectedItem().toString().equals("Corte"))
            tmora.disable();
        if(cTipo.getSelectedItem().toString().equals("Reconexion"))
            tmora.enable();
    }//GEN-LAST:event_cTipoActionPerformed

    private void tmoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mora;
    private javax.swing.JButton bBuscarContribuyente;
    private javax.swing.JButton bgenerarReconexion;
    private javax.swing.JComboBox cTipo;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextArea tObservacion;
    private javax.swing.JTextField tmora;
    // End of variables declaration//GEN-END:variables
 private void cargarCodicoContribuyente(int codContribuyente) throws Exception {
     String opersona=null;
      opersona = Generic.getInstance(regpersonaBL.class).fnBuscarPersona(codContribuyente);
      jlNombre.setText(opersona);
      
}
 
 private void cargarCorte(String tipo,int codigo1,double mora1,String observacion) throws Exception {
 Calendar fech=Calendar.getInstance();
 String fecha;
 fecha=(fech.get(fech.YEAR))+"/"+(fech.get(fech.MONTH)+1)+"/"+fech.get(fech.DATE);
 String resultado;
 resultado=Generic.getInstance(regpersonaBL.class).fnInsertarCorte(codigo1,mora1,observacion);
 JOptionPane.showInternalMessageDialog(this,resultado , "Confrimación", JOptionPane.INFORMATION_MESSAGE);
 
     //String opersona=null;
      //opersona = Generic.getInstance(regpersonaBL.class).fnBuscarPersona(codContribuyente);
 }
  private void cargarReconexion(String tipo,int codigo1,double mora1,String observacion) throws Exception {
     //String opersona=null;
     // opersona = Generic.getInstance(regpersonaBL.class).fnBuscarPersona(codContribuyente);
 String resultado02;
 resultado02=Generic.getInstance(regpersonaBL.class).fnInsertarReconexion(codigo1,mora1,observacion);
 JOptionPane.showInternalMessageDialog(this,resultado02 , "Confirmación", JOptionPane.INFORMATION_MESSAGE); 
      
 }
private void limpiar()
{
 codigo.setText("");
 jlNombre.setText("");
 tmora.setText("");
 tObservacion.setText("");
}
 }