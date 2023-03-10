/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cliente;

import Controllers.Controller;
import InicioSesion.Login;
import Metodos_sql.ConexionBD;
import views.Window;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
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
public class InicioRestringido extends javax.swing.JFrame {

    /**
     * Creates new form Inicio1
     */
    public InicioRestringido() {
        initComponents();
        this.setLocationRelativeTo(null); 
        getContentPane().setBackground(new Color(139, 0, 0));
        this.setTitle("Sistema de reservas de habitaciones y ventas -Hotel Medrano");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioRestringido = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(47, 79, 79));
        escritorioRestringido.add(jPanel1);
        jPanel1.setBounds(70, 20, 1110, 630);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Galeria ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        escritorioRestringido.add(jButton1);
        jButton1.setBounds(0, 40, 72, 22);

        getContentPane().add(escritorioRestringido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1180, 650));

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\CopiaSegura\\build\\classes\\imagenes\\building-regular-36.png")); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\CopiaSegura\\build\\classes\\imagenes\\menu-regular-36.png")); // NOI18N
        jMenu2.setText("SERVICIOS");
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Nuestras Habitaciones ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Nuestros Productos ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\CopiaSegura\\build\\classes\\imagenes\\dish-regular-36.png")); // NOI18N
        jMenu4.setText("RESERVAR");
        jMenu4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Realiza tu reserva ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\CopiaSegura\\build\\classes\\imagenes\\door-open-regular-36.png")); // NOI18N
        jMenu7.setText("SALIR");
        jMenu7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           try {
                    
      FormularioVistaHabitacion lh =new FormularioVistaHabitacion();
        escritorioRestringido.add(lh);
        lh.toFront();
        lh.setVisible(true);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
                  try {
                    
        FormularioVistaProducto lh =new FormularioVistaProducto();
        escritorioRestringido.add(lh);
        lh.toFront();
        lh.setVisible(true);
            
        } catch (Exception e) {
        
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
                   try {
                    
        FormularioReserva lh =new FormularioReserva ();
        escritorioRestringido.add(lh);
        lh.toFront();
        lh.setVisible(true);
            
        } catch (Exception e) {
        
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
 Login l = new Login();
       l.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               try { 
            Controller c = new Controller();
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioRestringido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioRestringido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioRestringido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioRestringido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioRestringido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorioRestringido;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
