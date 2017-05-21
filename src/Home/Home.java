/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;


import Business.Business;
import Login.Login;
import Micas.MenuMicas;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author LEO
 */
public class Home extends javax.swing.JFrame implements Runnable{
    Login lg;
    Thread h1;
    Business bs;
     String hora, minutos, segundos, ampm;
    public Home() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        URL url = getClass().getResource("/img/logo2.png");
        ImageIcon img = new ImageIcon(url);
        setIconImage(img.getImage());
        setLocationRelativeTo(null);
        setTitle("Menú Principal");
        setExtendedState(this.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/settings.png"))); // NOI18N
        jButton1.setToolTipText("Configuración");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 60, 60));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/cerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setToolTipText("Cerrar Sesión");
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 60, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/chat.png"))); // NOI18N
        jButton4.setToolTipText("Chat");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 60, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/notificaciones.png"))); // NOI18N
        jButton5.setToolTipText("Notificaciones");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 70, 60));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/proveedor.png"))); // NOI18N
        jButton6.setToolTipText("Proveedores");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 60, 60));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/screenP.png"))); // NOI18N
        jButton8.setToolTipText("Compartir Pantalla");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 60, 60));

        lblUserSession.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserSession.setForeground(new java.awt.Color(204, 0, 0));
        lblUserSession.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserSession.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(lblUserSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 40, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/cambioUser.png"))); // NOI18N
        jLabel3.setToolTipText("Usuario en Conexión");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, 50));

        lblReloj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 60));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/images/fondoadminmenu1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        try {
            lg=new Login();
        lg.setVisible(true);
        this.dispose();
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al cargar la ventana siguiente "+ e);
        }
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuMicas mc = null;
        try {
            mc = new MenuMicas();
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblReloj;
    public static final javax.swing.JLabel lblUserSession = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
public void run() {
    Thread ct = Thread.currentThread();
        while (ct == h1) {
            bs=new Business();
           lblReloj=bs.CalculaHora(lblReloj);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

