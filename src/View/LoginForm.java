/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Helper.CurrentUser;
import Model.Login;
import ModelDAO.LoginDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    public LoginForm() {
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

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        senhaLabel = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginButton = new java.awt.Button();
        entrarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 22, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seringa.png"))); // NOI18N
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 480));

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(57, 113, 117));
        idLabel.setText("ID:");
        jPanel2.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txt_id.setBackground(new java.awt.Color(32, 33, 35));
        txt_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setToolTipText("");
        txt_id.setBorder(null);
        txt_id.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel2.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 350, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 350, -1));

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(57, 113, 117));
        senhaLabel.setText("SENHA:");
        jPanel2.add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txt_senha.setBackground(new java.awt.Color(32, 33, 35));
        txt_senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_senha.setForeground(new java.awt.Color(255, 255, 255));
        txt_senha.setBorder(null);
        txt_senha.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 350, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 350, -1));

        loginButton.setBackground(new java.awt.Color(149, 178, 165));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setLabel("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 300, 60));

        entrarLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        entrarLabel.setForeground(new java.awt.Color(57, 113, 117));
        entrarLabel.setText("ENTRAR:");
        jPanel2.add(entrarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 430, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginDAO loginDAO = new LoginDAO();
        Login login = new Login();

        try {
            login = loginDAO.getOne(txt_senha.getText(), txt_id.getText());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (login.getId() != null) {
            new CurrentUser(txt_id.getText());
            HomeForm frm = new HomeForm();
            frm.setVisible(true);
            this.hide();
        } else {
            JOptionPane.showMessageDialog(this, "Cadastro Inválido!");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Button loginButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTextField txt_id;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
