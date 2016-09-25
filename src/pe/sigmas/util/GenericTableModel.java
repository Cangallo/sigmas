/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.util;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elle Lawliet
 */
public class GenericTableModel extends DefaultTableModel {

    private final boolean columnCheck[];
    private final String columnNames[];
    private final boolean editable[];

    public GenericTableModel(String columnNames[], boolean columnCheck[], boolean editable[]) {
        this.columnCheck = columnCheck;
        this.columnNames = columnNames;
        this.editable = editable;
        this.setColumnIdentifiers(columnNames);
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnCheck[columnIndex]) {
            return Boolean.class;
        } else {
            return super.getColumnClass(columnIndex);
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (editable[column]) {
            return true;
        } else {
            return false;
        }
    }
}
