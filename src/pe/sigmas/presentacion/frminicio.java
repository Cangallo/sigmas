package pe.sigmas.presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import pe.sigmas.util.MyDeskTopPane;
import pe.sigmas.util.Reporte;

public class frminicio extends javax.swing.JFrame {

    MyDeskTopPane deskTopPane;
    Dimension pantalla;
    public static int IdUsuario;

    public frminicio() {
        initComponents();
        this.setExtendedState(frminicio.MAXIMIZED_BOTH);
        menuApp.setVisible(false);
        this.setTitle("Sistema de Gestios de Agua y Saneamiento");
        this.setLocationRelativeTo(null);
        pantalla = new Dimension();
        pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        frmLogin form = new frmLogin();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new MyDeskTopPane();
        menuApp = new javax.swing.JMenuBar();
        mnusigmas = new javax.swing.JMenu();
        mnudeuda = new javax.swing.JMenu();
        mnuGeneracionDeuda = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        individual = new javax.swing.JMenuItem();
        CorteReconexion = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuusuarios = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnuseguridad = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        mnuemision = new javax.swing.JMenu();
        mnuImprimirDeuda = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        mnureportes = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        UsusariosMorosos = new javax.swing.JMenuItem();
        UsuariosPuntuales = new javax.swing.JMenuItem();
        IngresoVencimiento = new javax.swing.JMenuItem();
        mnuayuda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menusuario = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        escritorio.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(escritorio, java.awt.BorderLayout.CENTER);

        mnusigmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/inicio.fw.png"))); // NOI18N
        mnusigmas.setMnemonic('f');
        mnusigmas.setText("Sigmas");
        mnusigmas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuApp.add(mnusigmas);

        mnudeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_menuAdministrarPago.png"))); // NOI18N
        mnudeuda.setText("Generar Deuda");
        mnudeuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuGeneracionDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_menuMasiva.png"))); // NOI18N
        mnuGeneracionDeuda.setText("Generar Deuda Masiva");
        mnuGeneracionDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGeneracionDeudaActionPerformed(evt);
            }
        });
        mnudeuda.add(mnuGeneracionDeuda);
        mnudeuda.add(jSeparator4);

        individual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_menuIndividual.png"))); // NOI18N
        individual.setText("Generar Deuda Individual");
        individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualActionPerformed(evt);
            }
        });
        mnudeuda.add(individual);

        CorteReconexion.setText("Corte o Reconexion");
        CorteReconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorteReconexionActionPerformed(evt);
            }
        });
        mnudeuda.add(CorteReconexion);

        menuApp.add(mnudeuda);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_adminMenuPagos.png"))); // NOI18N
        jMenu1.setText("Pagos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_adminPagos.png"))); // NOI18N
        jMenuItem4.setText("Administrar Pagos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menuApp.add(jMenu1);

        mnuusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/menuusu.fw.png"))); // NOI18N
        mnuusuarios.setMnemonic('h');
        mnuusuarios.setText("Usuarios");
        mnuusuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_adminUsuario.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Administrar usuarios");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        mnuusuarios.add(contentMenuItem);
        mnuusuarios.add(jSeparator2);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_adminValorVariable.png"))); // NOI18N
        jMenuItem10.setText("Administrar Valor por Usuario");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        mnuusuarios.add(jMenuItem10);
        mnuusuarios.add(jSeparator3);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_adminValorFijo.png"))); // NOI18N
        jMenuItem9.setText("Administrar Valores Fijos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnuusuarios.add(jMenuItem9);

        menuApp.add(mnuusuarios);

        mnuseguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/menuSeguridad.fw.png"))); // NOI18N
        mnuseguridad.setText("Seguridad");
        mnuseguridad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/Personal_min.png"))); // NOI18N
        jMenuItem1.setText("Administrar Personal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuseguridad.add(jMenuItem1);
        mnuseguridad.add(jSeparator1);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_menuAdministrarUsuarios.png"))); // NOI18N
        jMenuItem8.setText("Administrar Usuarios");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnuseguridad.add(jMenuItem8);

        menuApp.add(mnuseguridad);

        mnuemision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/Imprimir.png"))); // NOI18N
        mnuemision.setText("Emision");
        mnuemision.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuImprimirDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_admmenuRecibo.png"))); // NOI18N
        mnuImprimirDeuda.setText("Emitir Recibos");
        mnuImprimirDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImprimirDeudaActionPerformed(evt);
            }
        });
        mnuemision.add(mnuImprimirDeuda);
        mnuemision.add(jSeparator5);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_menuduplicarRecibo.png"))); // NOI18N
        jMenuItem7.setText("Emitir Recibo Individual");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnuemision.add(jMenuItem7);

        menuApp.add(mnuemision);

        mnureportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/pdfolder 40.png"))); // NOI18N
        mnureportes.setText("Reportes");
        mnureportes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setText("Reporte Usuarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnureportes.add(jMenuItem5);

        jMenuItem6.setText("Reporte Pago");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnureportes.add(jMenuItem6);

        UsusariosMorosos.setText("Usuarios Morosos");
        UsusariosMorosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsusariosMorososActionPerformed(evt);
            }
        });
        mnureportes.add(UsusariosMorosos);

        UsuariosPuntuales.setText("Usuarios Puntuales");
        UsuariosPuntuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosPuntualesActionPerformed(evt);
            }
        });
        mnureportes.add(UsuariosPuntuales);

        IngresoVencimiento.setText("Ingresos Vencimiento");
        IngresoVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoVencimientoActionPerformed(evt);
            }
        });
        mnureportes.add(IngresoVencimiento);

        menuApp.add(mnureportes);

        mnuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/ayuda_min.png"))); // NOI18N
        mnuayuda.setText("Ayuda");
        mnuayuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/contacts_min.png"))); // NOI18N
        jMenuItem2.setText("Acerca de ...");
        mnuayuda.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/help_min.png"))); // NOI18N
        jMenuItem3.setText("Manual");
        mnuayuda.add(jMenuItem3);

        menuApp.add(mnuayuda);

        menusuario.setForeground(new java.awt.Color(51, 51, 255));
        menusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/02_menuAdministrarUsuarios.png"))); // NOI18N
        menusuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        menuApp.add(menusuario);

        setJMenuBar(menuApp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed

        frmAdministrarUsuarios form = new frmAdministrarUsuarios();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnuGeneracionDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGeneracionDeudaActionPerformed
        // TODO add your handling code here:
        frmgenerardeuda form = new frmgenerardeuda();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_mnuGeneracionDeudaActionPerformed

    private void individualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_individualActionPerformed
        // TODO add your handling code here:
        frmgenerarDeudaIndividual form = new frmgenerarDeudaIndividual();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_individualActionPerformed

    private void mnuImprimirDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImprimirDeudaActionPerformed
        // TODO add your handling code here:        
        Map parametros = new HashMap();
        String pathReporte = System.getProperty("user.dir") + "/src/pe/sigmas/reporte/";
        parametros.put("SUBREPORT_DIR", pathReporte);
        Reporte reporteController = new Reporte(parametros, "rptReciboAgua.jasper");

        reporteController.mostrarReportePdf();
    }//GEN-LAST:event_mnuImprimirDeudaActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        frmEmitirReciboIndividual form = new frmEmitirReciboIndividual();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        frmAdministrarValConcepto form = new frmAdministrarValConcepto();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        frmAdministrarValConceptoFijo form = new frmAdministrarValConceptoFijo();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        frmpago form = new frmpago();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        frmAdministrarUser form = new frmAdministrarUser();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void UsusariosMorososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsusariosMorososActionPerformed
        // TODO add your handling code here:
         frmReporteMorosos form = new frmReporteMorosos();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_UsusariosMorososActionPerformed

    private void UsuariosPuntualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosPuntualesActionPerformed
        // TODO add your handling code here:
         frmReportePuntuales form = new frmReportePuntuales();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_UsuariosPuntualesActionPerformed

    private void IngresoVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoVencimientoActionPerformed
        // TODO add your handling code here:
         frmIngresoVencimiento form = new frmIngresoVencimiento();
        escritorio.add(form);
        Dimension ventana = form.getSize();
        form.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2 - 100);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_IngresoVencimientoActionPerformed

    private void CorteReconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorteReconexionActionPerformed
        // TODO add your handling code here:
        frmReconexionCorteagua form=new frmReconexionCorteagua();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_CorteReconexionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CorteReconexion;
    private javax.swing.JMenuItem IngresoVencimiento;
    private javax.swing.JMenuItem UsuariosPuntuales;
    private javax.swing.JMenuItem UsusariosMorosos;
    private javax.swing.JMenuItem contentMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem individual;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private static javax.swing.JMenuBar menuApp;
    private static javax.swing.JMenu menusuario;
    private javax.swing.JMenuItem mnuGeneracionDeuda;
    private javax.swing.JMenuItem mnuImprimirDeuda;
    private javax.swing.JMenu mnuayuda;
    private javax.swing.JMenu mnudeuda;
    private javax.swing.JMenu mnuemision;
    private javax.swing.JMenu mnureportes;
    public static javax.swing.JMenu mnuseguridad;
    private javax.swing.JMenu mnusigmas;
    public static javax.swing.JMenu mnuusuarios;
    // End of variables declaration//GEN-END:variables

    static void loginCorrecto(int idUser, String Usuario) {
        menuApp.setVisible(true);
        menusuario.setText(Usuario);
        IdUsuario = idUser;
    }
}
