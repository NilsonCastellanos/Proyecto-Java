/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


@SuppressWarnings("serial")
class Lamina extends JPanel {

    private Image img = null;
    private ImageIcon icono;

// Metodo constructor
    public Lamina(String urlFondo) {
        icono = new ImageIcon(urlFondo);
        img = icono.getImage();
    }

    public void cambiarImagen(String urlFondo) {
        icono = new ImageIcon(urlFondo);
        img = icono.getImage();
    }

    public void update(Graphics g) {
        paint(g);
    }

    protected void paintComponent(Graphics g) {
        g.drawImage(img, 1, 1, getWidth(), getHeight(), this);
        setOpaque(false);
    }
}
