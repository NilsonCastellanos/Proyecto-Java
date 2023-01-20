/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Carolina
 */
public class Window {

    private static final Color COLOR_APP = new Color(50, 50, 50);
    private JFrame ventana;
    private ArrayList<Lamina> listImg;
    private JPanel nav;
    private JPanel contendorBotones;
    private Lamina foto;

    public Window() {
        listImg = new ArrayList<Lamina>();
        configuracionVentana();
        configuracionConponentes();
        ventana.setVisible(true);
    }

    private void configuracionVentana() {
        ventana = new JFrame();
        ventana.setSize(1200, 600);
        ventana.setTitle("Gallería de fotos");
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().setBackground(COLOR_APP);
    }

    private void configuracionConponentes() {

        contendorBotones = new JPanel(new GridLayout(10, 1));
        JScrollPane scrol = new JScrollPane(contendorBotones);

        JButton btnAlegria = new JButton();
        btnAlegria.setText("H.Premium");
        btnAlegria.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btnAlegria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/1.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btnAlegria);

        JButton btnAmigos = new JButton();
        btnAmigos.setText("H.Plus");
        btnAmigos.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btnAmigos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/2.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btnAmigos);

        JButton btnCielo = new JButton();
        btnCielo.setText("Pileta Interna");
        btnCielo.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btnCielo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/3.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btnCielo);

        JButton btnSonrisa = new JButton();
        btnSonrisa.setText("H.Premium");
        btnSonrisa.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btnSonrisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/4.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btnSonrisa);
        ventana.add(scrol, BorderLayout.LINE_START);

        foto = new Lamina("src/views/gallery/0.jpg");// imagen de la pantalla principal
        foto.setBorder(BorderFactory.createMatteBorder(15, 15, 15, 15, COLOR_APP));
        ventana.add(foto, BorderLayout.CENTER);

        JButton btn5 = new JButton();
        btn5.setText("Baño");
        btn5.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/5.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn5);
        ventana.add(scrol, BorderLayout.LINE_START);

        JButton btn6 = new JButton();
        btn6.setText("L.Comedor");
        btn6.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/6.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn6);
        ventana.add(scrol, BorderLayout.LINE_START);

        JButton btn7 = new JButton();
        btn7.setText("Almohadas");
        btn7.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/7.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn7);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        JButton btn8 = new JButton();
        btn8.setText("Vino");
        btn8.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/8.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn8);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        JButton btn9 = new JButton();
        btn9.setText("Desayuno");
        btn9.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/9.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn9);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        
        JButton btn10 = new JButton();
        btn10.setText("Blanco");
        btn10.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/10.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn10);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        
        JButton btn11 = new JButton();
        btn11.setText("Restaurant");
        btn11.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/11.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn11);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        JButton btn12 = new JButton();
        btn12.setText("Vino");
        btn12.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/12.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn12);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        JButton btn13 = new JButton();
        btn13.setText("Blanquería");
        btn13.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/13.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn13);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        JButton btn14 = new JButton();
        btn14.setText("Spa");
        btn14.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/14.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn14);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        JButton btn15 = new JButton();
        btn15.setText("Bañera");
        btn15.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/15.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn15);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        
        JButton btn16 = new JButton();
        btn16.setText("Jacuzzi");
        btn16.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/16.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn16);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        
        JButton btn17 = new JButton();
        btn17.setText("Gimnasio");
        btn17.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/17.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn17);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        JButton btn18 = new JButton();
        btn18.setText("H.Standar");
        btn18.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/18.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn18);
        ventana.add(scrol, BorderLayout.LINE_START);

        
        
        
        
        JButton btn19 = new JButton();
        btn19.setText("Entrada");
        btn19.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/19.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn19);
       

        
        
        
        
        JButton btn20 = new JButton();
        btn20.setText("Desayuno");
        btn20.setForeground(Color.GRAY);
        ///*---->Evento Local<------ */
        btn20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                foto.cambiarImagen("src/views/gallery/20.jpg");
                ventana.paintComponents(ventana.getGraphics());
            }
        });
        contendorBotones.add(btn20);
        ventana.add(scrol, BorderLayout.LINE_START);

    }

}
