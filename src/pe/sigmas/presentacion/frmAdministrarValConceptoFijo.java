/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.presentacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import pe.sigmas.entity.maecategoriaBean;
import pe.sigmas.entity.maeconceptoBean;
import pe.sigmas.entity.valconceptoBean;
import pe.sigmas.logica.maecategoriaBL;
import pe.sigmas.logica.maeconceptoBL;
import pe.sigmas.logica.valconceptoBL;
import pe.sigmas.util.Generic;
import pe.sigmas.util.GenericEstiloTabla;
import pe.sigmas.util.GenericTableModel;

/**
 *
 * @author Elle Lawliet
 */
public class frmAdministrarValConceptoFijo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmAdministrarValConcepto
     */
    private static int IdPersona = 0;
    GenericTableModel modeloTabla;
    TableColumnModel modeloColumna;
    String[] columnanes = {"ID", "CONCEPTO", "CATEGORIA", "IMPORTE"};
    boolean[] editable = {false, false, false, false};
    boolean[] columnCheck = {false, false, false, false};
    boolean nuevo = true;

    HashMap<String, maecategoriaBean> mapaCategoria;
    HashMap<String, maeconceptoBean> mapaConcepto;

    public frmAdministrarValConceptoFijo() {
        initComponents();
        mapaCategoria = new HashMap<>();
        mapaConcepto = new HashMap<>();

        modeloTabla = new GenericTableModel(columnanes, columnCheck, editable);
        jTable1.setModel(modeloTabla);
        modeloColumna = jTable1.getColumnModel();
        try {
            cargarCombo();
            iniciarGrilla(4);
            ajustarColumna();
            estiloTabla();
            hideColumnTable();
            activarBotones(true, true, true, false, false);
            activarCampos(true, false);
        } catch (Exception ex) {
            Logger.getLogger(frmAdministrarValConceptoFijo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel3 = new javax.swing.JLabel();
        cbConcepto = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbcategoria = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        busquedaUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ADMINISTRACION DE VALORES FIJOS DE USUARIO");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrar Valores por Concepto"));

        jLabel3.setText("Concepto");

        cbConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Categoria");

        cbcategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Importe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Usuarios Con Valor"));
        jPanel3.setLayout(new java.awt.BorderLayout());

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Por concepto"));
        jPanel4.setLayout(new java.awt.BorderLayout());

        busquedaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busquedaUsuarioMouseClicked(evt);
            }
        });
        busquedaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaUsuarioKeyTyped(evt);
            }
        });
        jPanel4.add(busquedaUsuario, java.awt.BorderLayout.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_lblBuscar.png"))); // NOI18N
        jPanel4.add(jLabel1, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/exit_min.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_btnCancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_btnEliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_btnModificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_btnSave.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/sigmas/files/01_btnNuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar)
                        .addComponent(btnNuevo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar)
                        .addComponent(btnEliminar)
                        .addComponent(btnModificar)))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (modeloTabla.getRowCount() > 0) {
            int index = jTable1.getSelectedRow();
            if (index > -1) {
                try {
                    String dat = modeloTabla.getValueAt(index, 0).toString();
                    valconceptoBean ovalconceptoBean = new valconceptoBean();
                    ovalconceptoBean.setIOps(2);
                    ovalconceptoBean.setIIdValConcepto(Integer.parseInt(dat));
                    ovalconceptoBean = Generic.getInstance(valconceptoBL.class).fnGetvalconceptoBean(ovalconceptoBean);
                    cbConcepto.setSelectedItem(mapaConcepto.get(ovalconceptoBean.getCCodMaeConcepto()));
                    cbcategoria.setSelectedItem(mapaCategoria.get(ovalconceptoBean.getNvObservacion()));
                    txtImporte.setText("" + ovalconceptoBean.getDeTotaInsoluto());
                    nuevo = false;
                    activarBotones(false, false, false, true, true);
                    activarCampos(false, true);
                } catch (Exception ex) {
                    Logger.getLogger(frmAdministrarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (modeloTabla.getRowCount() > 0) {
            int index = jTable1.getSelectedRow();
            if (index > -1) {
                try {
                    int i = JOptionPane.showInternalConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL VALOR", "MENSAJE", JOptionPane.OK_CANCEL_OPTION);
                    String dat = modeloTabla.getValueAt(index, 0).toString();
                    valconceptoBean ovalconceptoBean = new valconceptoBean();
                    ovalconceptoBean.setIIdRegUsuaRegistra(frminicio.IdUsuario);
                    ovalconceptoBean.setIOps(2);
                    if (i == 0) {
                        ovalconceptoBean.setIIdValConcepto(Integer.parseInt(dat));
                        boolean result = Generic.getInstance(valconceptoBL.class).fnActualizarvalconceptoBean(ovalconceptoBean);
                        if (result) {
                            iniciarGrilla(4);
                            limpiarCampos();
                            activarBotones(true, true, true, false, false);
                            JOptionPane.showInternalMessageDialog(this, "Eliminacion correcta del Valor", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showInternalMessageDialog(this, "Fallo al Eliminar el Valor", "Mensaje", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (Exception ex) {
                    Logger.getLogger(frmAdministrarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        activarBotones(true, true, true, false, false);
        activarCampos(true, false);
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        valconceptoBean ovalconceptoBean = new valconceptoBean();
        try {
            //validar el ingreso de datos 

            ovalconceptoBean.setCCodMaeConcepto(((maeconceptoBean) cbConcepto.getSelectedItem()).getCCodMaeConcepto());
            ovalconceptoBean.setNvObservacion(((maecategoriaBean) cbcategoria.getSelectedItem()).getCCodMaeCategoria());

            ovalconceptoBean.setDeTotaInsoluto(Double.parseDouble(txtImporte.getText()));
            ovalconceptoBean.setIIdRegUsuaRegistra(frminicio.IdUsuario);

            if (nuevo) {
                ovalconceptoBean.setIOps(2);
                boolean result = Generic.getInstance(valconceptoBL.class).fnInsertarvalconceptoBean(ovalconceptoBean);
                if (result) {
                    JOptionPane.showInternalMessageDialog(this, "Registro correcto del Valor", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showInternalMessageDialog(this, "Fallo al registrar el Valor", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                int index = jTable1.getSelectedRow();
                String dat = modeloTabla.getValueAt(index, 0).toString();
                ovalconceptoBean.setIIdValConcepto(Integer.parseInt(dat));
                ovalconceptoBean.setIOps(3);
                boolean result = Generic.getInstance(valconceptoBL.class).fnActualizarvalconceptoBean(ovalconceptoBean);
                if (result) {
                    JOptionPane.showInternalMessageDialog(this, "Actualizacion correcta del Valor", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showInternalMessageDialog(this, "Fallo al Actualizar el Valor", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
            activarBotones(true, true, true, false, false);
            activarCampos(true, false);
            limpiarCampos();
            busquedaUsuario.requestFocus();
            busquedaUsuario.selectAll();
            iniciarGrilla(4);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        activarBotones(false, false, false, true, true);
        activarCampos(false, true);
        limpiarCampos();
        nuevo = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (modeloTabla.getRowCount() > 0) {
            int index = jTable1.getSelectedRow();
            if (index > -1) {
                try {
                    String dat = modeloTabla.getValueAt(index, 0).toString();
                    valconceptoBean ovalconceptoBean = new valconceptoBean();
                    ovalconceptoBean.setIOps(2);
                    ovalconceptoBean.setIIdValConcepto(Integer.parseInt(dat));
                    ovalconceptoBean = Generic.getInstance(valconceptoBL.class).fnGetvalconceptoBean(ovalconceptoBean);
                    cbConcepto.setSelectedItem(mapaConcepto.get(ovalconceptoBean.getCCodMaeConcepto()));
                    cbcategoria.setSelectedItem(mapaCategoria.get(ovalconceptoBean.getNvObservacion()));
                    txtImporte.setText("" + ovalconceptoBean.getDeTotaInsoluto());
                } catch (Exception ex) {
                    Logger.getLogger(frmAdministrarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void busquedaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busquedaUsuarioMouseClicked
        // TODO add your handling code here:
        busquedaUsuario.selectAll();
    }//GEN-LAST:event_busquedaUsuarioMouseClicked

    private void busquedaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaUsuarioKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (busquedaUsuario.isEditable()) {
            if (evt.getKeyCode() == 40) {
                if (modeloTabla.getRowCount() > 0) {
                    jTable1.setRowSelectionInterval(0, 0);
                    jTable1.requestFocus();
                    //  mostrarDetalle(listaUnidadMedida.get(0));
                    activarBotones(true, true, true, false, false);
                }

            } else {
                try {
                    iniciarGrilla(3);
                } catch (Exception ex) {
                    Logger.getLogger(frmAdministrarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }//GEN-LAST:event_busquedaUsuarioKeyReleased

    private void busquedaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaUsuarioKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }//GEN-LAST:event_busquedaUsuarioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField busquedaUsuario;
    private javax.swing.JComboBox cbConcepto;
    private javax.swing.JComboBox cbcategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables

    private void iniciarGrilla(int iOps) throws Exception {
        deleteRows();
        valconceptoBean ovalconceptoBean = new valconceptoBean();
        ovalconceptoBean.setIOps(iOps);
        ovalconceptoBean.setBEstado(true);
        ovalconceptoBean.setNvObservacion(busquedaUsuario.getText());
        List lista = Generic.getInstance(valconceptoBL.class).fnGetListvalconceptoBean(ovalconceptoBean);

        lista.stream().forEach((list) -> {
            modeloTabla.addRow((Object[]) list);
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
        modeloColumna.getColumn(1).setPreferredWidth(100);
        modeloColumna.getColumn(2).setPreferredWidth(50);
        modeloColumna.getColumn(3).setPreferredWidth(20);
    }

    private void deleteRows() {
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
    }

    private void activarBotones(boolean nuevo, boolean modificar, boolean eliminar, boolean guardar, boolean cancelar) {
        btnGuardar.setEnabled(guardar);
        btnCancelar.setEnabled(cancelar);
        btnEliminar.setEnabled(eliminar);
        btnModificar.setEnabled(modificar);
        btnNuevo.setEnabled(nuevo);
    }

    private void activarCampos(boolean izquierda, boolean derecha) {
        busquedaUsuario.setEditable(izquierda);
        jTable1.setEnabled(izquierda);
        txtImporte.setEditable(derecha);
        cbConcepto.setEnabled(derecha);
        cbcategoria.setEnabled(derecha);
    }

    private void limpiarCampos() {
        busquedaUsuario.setText("");
        txtImporte.setText("");
        IdPersona = 0;
        cbConcepto.setSelectedIndex(0);
        cbcategoria.setSelectedIndex(0);
    }

    private void cargarCombo() throws Exception {
        cbConcepto.removeAllItems();
        cbcategoria.removeAllItems();

        maeconceptoBean omaeconceptoBean = new maeconceptoBean();
        maecategoriaBean omaecategoriaBean = new maecategoriaBean();
        omaeconceptoBean.setIOps(2);
        omaecategoriaBean.setIOps(2);
        ArrayList<maeconceptoBean> lista1 = Generic.getInstance(maeconceptoBL.class).fnAutocompletemaeconceptoBean(omaeconceptoBean);
        ArrayList<maecategoriaBean> lista2 = Generic.getInstance(maecategoriaBL.class).fnAutocompletemaecategoriaBean(omaecategoriaBean);

        lista1.stream().map((v) -> {
            cbConcepto.addItem(v);
            return v;
        }).forEach((v) -> {
            mapaConcepto.put(v.getCCodMaeConcepto(), v);
        });
        lista2.stream().map((v) -> {
            cbcategoria.addItem(v);
            return v;
        }).forEach((v) -> {
            mapaCategoria.put(v.getCCodMaeCategoria(), v);
        });

    }
}
