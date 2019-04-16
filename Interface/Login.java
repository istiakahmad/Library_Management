/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblu = new javax.swing.JLabel();
        lblp = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btncncl = new javax.swing.JButton();
        txtpwd = new javax.swing.JPasswordField();
        loginbackgroung = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblu.setBackground(new java.awt.Color(204, 204, 204));
        lblu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblu.setForeground(new java.awt.Color(0, 204, 0));
        lblu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginu.png"))); // NOI18N
        lblu.setText("Username");
        lblu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblu.setOpaque(true);
        getContentPane().add(lblu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 163, 38));

        lblp.setBackground(new java.awt.Color(204, 204, 204));
        lblp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblp.setForeground(new java.awt.Color(102, 204, 0));
        lblp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginp.png"))); // NOI18N
        lblp.setText("Password");
        lblp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblp.setOpaque(true);
        getContentPane().add(lblp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 163, 42));

        txtuname.setBackground(new java.awt.Color(204, 204, 204));
        txtuname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtuname.setToolTipText("");
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 199, 38));

        btnlogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login32.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, -1));

        btncncl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncncl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel32.png"))); // NOI18N
        btncncl.setText("Cancel");
        btncncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncnclActionPerformed(evt);
            }
        });
        getContentPane().add(btncncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        txtpwd.setBackground(new java.awt.Color(204, 204, 204));
        txtpwd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 199, 42));

        loginbackgroung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/libraryloginimage.jpg"))); // NOI18N
        getContentPane().add(loginbackgroung, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncnclActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncnclActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        
        String uname = txtuname.getText();
        String pwd = txtpwd.getText();
        
        if(uname.equals("admin") && pwd.equals("13579")){
            Home home = new Home();
            home.setVisible(true);
        }
        
        else
            JOptionPane.showMessageDialog(rootPane, "Invalid Username or password");
    }//GEN-LAST:event_btnloginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncncl;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lblp;
    private javax.swing.JLabel lblu;
    private javax.swing.JLabel loginbackgroung;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
