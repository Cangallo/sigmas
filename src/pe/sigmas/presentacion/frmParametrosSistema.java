
package pe.sigmas.presentacion;



import javax.swing.JOptionPane;
import pe.sigmas.util.ConfigSistema;
import pe.sigmas.util.ParametroSistema;


public class frmParametrosSistema extends javax.swing.JInternalFrame {

    /** Creates new form ParametrosSistemaView */
    public frmParametrosSistema() {
        super("PARAMETROS DE SISTEMA", false, true);
        initComponents();
        mostrarDetalle();
        jTFDriver.setEditable(false);
        JTFUrl.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JTFUrl = new javax.swing.JTextField();
        jTFDriver = new javax.swing.JTextField();
        JTFPgDump = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        JTFReporte = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTFHost = new javax.swing.JTextField();
        JTFPort = new javax.swing.JTextField();
        JTFBaseDatos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JTFSistema = new javax.swing.JTextField();
        JTFondo = new javax.swing.JTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("PASSWORD :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("PATH REPORTES:");

        JTFUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFUser.setText("root");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("USER :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("DRIVER:");

        JTFUrl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFUrl.setText("jdbc:postgresql://localhost:5432/");
        JTFUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFUrlActionPerformed(evt);
            }
        });

        jTFDriver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFDriver.setText("com.mysql.jdbc.Driver");

        JTFPgDump.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("PATH PG_DUMP:");

        JTFPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFPasswordFocusGained(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("URL:");

        JTFReporte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFReporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFReporteFocusGained(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/exit_min.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setPreferredSize(new java.awt.Dimension(90, 23));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_btnNuevo.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setPreferredSize(new java.awt.Dimension(90, 23));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("PORT:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("HOST:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("BASE DE DATOS:");

        JTFHost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFHost.setText("localhost");
        JTFHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFHostKeyReleased(evt);
            }
        });

        JTFPort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFPort.setText("3306");
        JTFPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFPortKeyReleased(evt);
            }
        });

        JTFBaseDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTFBaseDatos.setText("bd");
        JTFBaseDatos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFBaseDatosFocusGained(evt);
            }
        });
        JTFBaseDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFBaseDatosKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("SISTEMA:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("FONDO:");

        JTFSistema.setText("SIGMAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFUrl))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFPassword)
                            .addComponent(JTFUser)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                                .addComponent(JTFPgDump)
                                .addComponent(JTFReporte))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFBaseDatos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFDriver)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JTFHost, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JTFPort, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JTFUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPgDump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JTFSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONFIGURACION DE SISTEMA", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // Guardar los cambios
        ConfigSistema oConfigSistema = new ConfigSistema();
        oConfigSistema.writeParametros(
                jTFDriver.getText(),
                JTFUrl.getText(),
                JTFUser.getText(),
                String.valueOf(JTFPassword.getPassword()),
                JTFHost.getText(),
                JTFPort.getText(),
                JTFBaseDatos.getText(),
                JTFReporte.getText(),
                JTFPgDump.getText(),
                JTFSistema.getText(),
                JTFondo.getText()
                );
        JOptionPane.showInternalMessageDialog(this, "SE GUARDARON LOS CAMBIOS \nVUELVA A INGRESAR AL SISTEMA POR FAVOR", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        this.setVisible(false);
        System.exit(0);
}//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Cancelar
        if (ParametroSistema.getDriver().equals("")) {
            this.dispose();
            this.setVisible(false);
            System.exit(0);
        } else {
            this.dispose();
            this.setVisible(false);
        }
}//GEN-LAST:event_jButton1MouseClicked

    private void JTFHostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFHostKeyReleased
        // HOST
        construirUrl();
    }//GEN-LAST:event_JTFHostKeyReleased

    private void JTFPortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFPortKeyReleased
        // PORT
        construirUrl();
    }//GEN-LAST:event_JTFPortKeyReleased

    private void JTFBaseDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBaseDatosKeyReleased
        // BASE DE DATOS
        construirUrl();

    }//GEN-LAST:event_JTFBaseDatosKeyReleased

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // ENTER EN ACEPTAR
        if (evt.getKeyCode() == 10) {
            jButton2MouseClicked(null);
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // ENTER EN CANCELAR
        if (evt.getKeyCode() == 10) {
            jButton1MouseClicked(null);
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void JTFBaseDatosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFBaseDatosFocusGained
        // BD
        JTFBaseDatos.selectAll();
    }//GEN-LAST:event_JTFBaseDatosFocusGained

    private void JTFPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFPasswordFocusGained
        // PASSWORD
        JTFPassword.selectAll();
    }//GEN-LAST:event_JTFPasswordFocusGained

    private void JTFReporteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFReporteFocusGained
        // REPORTE
        JTFReporte.requestFocus();
    }//GEN-LAST:event_JTFReporteFocusGained

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // OPONED WINDOW
        JTFHost.requestFocus();
        JTFHost.selectAll();
    }//GEN-LAST:event_formInternalFrameOpened

    private void JTFUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFUrlActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFBaseDatos;
    private javax.swing.JTextField JTFHost;
    private javax.swing.JPasswordField JTFPassword;
    private javax.swing.JTextField JTFPgDump;
    private javax.swing.JTextField JTFPort;
    private javax.swing.JTextField JTFReporte;
    private javax.swing.JTextField JTFSistema;
    private javax.swing.JTextField JTFUrl;
    private javax.swing.JTextField JTFUser;
    private javax.swing.JTextField JTFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFDriver;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void mostrarDetalle() {
        if (ParametroSistema.getDriver().equals("") == false) {
            jTFDriver.setText(ParametroSistema.getDriver());
            JTFUrl.setText(ParametroSistema.getUrl());
            JTFUser.setText(ParametroSistema.getUser());
            JTFPassword.setText(ParametroSistema.getPassword());
            JTFHost.setText(ParametroSistema.getHost());
            JTFPort.setText(ParametroSistema.getPort());
            JTFBaseDatos.setText(ParametroSistema.getBaseDatos());
            JTFReporte.setText(ParametroSistema.getPathReport());
            JTFPgDump.setText(ParametroSistema.getPgDump());
            JTFSistema.setText(ParametroSistema.getSistema());
            JTFondo.setText(ParametroSistema.getFondo());
        }
    }

    private void construirUrl() {
        JTFUrl.setText("jdbc:mysql://" + JTFHost.getText() + ":" + JTFPort.getText() + "/" + JTFBaseDatos.getText());
    }
}
