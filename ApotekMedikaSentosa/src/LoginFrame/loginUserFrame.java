/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginFrame;

import DashboardFrame.dashboardUserFrame;
import RegisterFrame.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import macamKoneksi.sessionLogin;

/**
 *
 * @author mac
 */
public class loginUserFrame extends javax.swing.JFrame {

    /**
     * Creates new form BackFrame
     */
    
    public loginUserFrame() {
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

        bgPanel2 = new LoginFrame.bgPanel();
        logoLabel = new javax.swing.JLabel();
        backFormPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        passKet2 = new javax.swing.JLabel();
        unameField = new javax.swing.JTextField();
        passKet3 = new javax.swing.JLabel();
        loginpassField = new javax.swing.JPasswordField();
        registerLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        createAccount = new javax.swing.JLabel();
        loginAsAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginFrame/Tablet login-amico.png"))); // NOI18N

        backFormPanel.setBackground(new java.awt.Color(3, 166, 44));

        formPanel.setBackground(new java.awt.Color(3, 166, 44));
        formPanel.setMinimumSize(new java.awt.Dimension(168, 301));
        formPanel.setLayout(new java.awt.GridLayout(4, 0, 10, 5));

        passKet2.setFont(new java.awt.Font("LEMON MILK", 0, 13)); // NOI18N
        passKet2.setForeground(new java.awt.Color(255, 255, 255));
        passKet2.setText("USERNAME");
        formPanel.add(passKet2);

        unameField.setMaximumSize(new java.awt.Dimension(168, 25));
        unameField.setPreferredSize(new java.awt.Dimension(168, 25));
        formPanel.add(unameField);

        passKet3.setFont(new java.awt.Font("LEMON MILK", 0, 13)); // NOI18N
        passKet3.setForeground(new java.awt.Color(255, 255, 255));
        passKet3.setText("PASSWORD");
        formPanel.add(passKet3);

        loginpassField.setToolTipText("");
        loginpassField.setMaximumSize(new java.awt.Dimension(168, 25));
        loginpassField.setMinimumSize(new java.awt.Dimension(168, 25));
        formPanel.add(loginpassField);

        registerLabel.setBackground(new java.awt.Color(3, 166, 44));
        registerLabel.setFont(new java.awt.Font("LEMON MILK", 3, 18)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("LOGIN");
        registerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        loginButton.setFont(new java.awt.Font("LEMON MILK", 0, 13)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 153, 0));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forgot password?");

        createAccount.setForeground(new java.awt.Color(255, 255, 255));
        createAccount.setText("Don't have an account? ");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });

        loginAsAdmin.setForeground(new java.awt.Color(255, 255, 255));
        loginAsAdmin.setText("Login As Admin");
        loginAsAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginAsAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backFormPanelLayout = new javax.swing.GroupLayout(backFormPanel);
        backFormPanel.setLayout(backFormPanelLayout);
        backFormPanelLayout.setHorizontalGroup(
            backFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(backFormPanelLayout.createSequentialGroup()
                .addGroup(backFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backFormPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(backFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(loginAsAdmin)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backFormPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(createAccount))
                    .addGroup(backFormPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backFormPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        backFormPanelLayout.setVerticalGroup(
            backFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backFormPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(registerLabel)
                .addGap(33, 33, 33)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginAsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgPanel2Layout = new javax.swing.GroupLayout(bgPanel2);
        bgPanel2.setLayout(bgPanel2Layout);
        bgPanel2Layout.setHorizontalGroup(
            bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(backFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgPanel2Layout.setVerticalGroup(
            bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        // TODO add your handling code here:
        RegisterFrame buatAkun = new RegisterFrame();
        buatAkun.show();
        dispose();
    }//GEN-LAST:event_createAccountMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String userName = unameField.getText();
        String password = loginpassField.getText();
        try{
            Connection konekDatabase = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_apotikMedikaSentoasa", "root", "kadekmontana050703");
            
            PreparedStatement konekstatement = (PreparedStatement) konekDatabase.prepareStatement("Select user_name, pass_user from tb_user where user_name=? and pass_user=?");
            
            konekstatement.setString(1, userName);
            konekstatement.setString(2, password);
            ResultSet hasilKonek = konekstatement.executeQuery();
            if (hasilKonek.next()) {
                JOptionPane.showMessageDialog(null, "You have successfully logged in");
                sessionLogin.set_nama(userName);
                dispose();
                dashboardUserFrame masukDashboard = new dashboardUserFrame();
                masukDashboard.show();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username & Password");
            }
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginAsAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginAsAdminMouseClicked
        // TODO add your handling code here:
        loginAdminFrame adminLogin = new loginAdminFrame();
        adminLogin.show();
        dispose();
    }//GEN-LAST:event_loginAsAdminMouseClicked

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
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new loginUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backFormPanel;
    private LoginFrame.bgPanel bgPanel2;
    private javax.swing.JLabel createAccount;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginAsAdmin;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField loginpassField;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel passKet2;
    private javax.swing.JLabel passKet3;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JTextField unameField;
    // End of variables declaration//GEN-END:variables
}
