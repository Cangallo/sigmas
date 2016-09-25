/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sigmas.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Administrador
 */
public class MyDeskTopPane extends JDesktopPane {

    private Image image;

    public MyDeskTopPane() {
        super();
        image = new ImageIcon(getClass().getResource("/pe/sigmas/files/FondoInicio3.fw.png")).getImage();
        setBackground(new Color(69, 64, 92));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int h = (int) image.getHeight(null) / 2;
        int w = (int) (image.getWidth(null) / 2);
        g.drawImage(image, (int) getWidth() / 2 - w, (int) getHeight() / 2 - h, null);
    }

}
