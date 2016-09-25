/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Elle Lawliet
 */
public class GenericEstiloTabla extends DefaultTableCellRenderer {

    Color background;
    Color foreground;
    private int aling;

    public GenericEstiloTabla(Color background, Color foreground) {
        super();
        this.background = background;
        this.foreground = foreground;
        this.aling = SwingConstants.CENTER;
    }

    public GenericEstiloTabla(Color background, int aling) {
        super();
        this.background = background;
        this.foreground = new Color(0, 0, 0);
        this.aling = aling;
    }

    public GenericEstiloTabla() {
        super();
        this.background = new Color(94, 102, 116);
        this.foreground = new Color(255, 255, 255);
        this.aling = SwingConstants.CENTER;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        comp.setBackground(background);
        comp.setForeground(foreground);
        this.setHorizontalAlignment(getAling());
        return comp;
    }

    public int getAling() {
        return aling;
    }

    public void setAling(int aling) {
        this.aling = aling;
    }

}
