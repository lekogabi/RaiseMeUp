/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raisemeup.view;

import java.util.Arrays;
import java.util.regex.Pattern;
import raisemeup.control.RaiseMeUp;

/**
 *
 * @author Kicsi Andras
 */
public class Register extends javax.swing.JFrame {

    private static final Pattern rfc2822 = Pattern.compile(
        "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$"
    );
    
    /**
     * Creates new form Register
     */
    public Register() {
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

        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butBack = new javax.swing.JButton();
        butConfirm = new javax.swing.JButton();
        butLogin2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwfRegister = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        pwfRegister2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Raise Me Up Registration");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SignMeUp.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel2.setText("Password:");

        butBack.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        butBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackButton.png"))); // NOI18N
        butBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        butConfirm.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        butConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ConfirmButton.png"))); // NOI18N
        butConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConfirmActionPerformed(evt);
            }
        });

        butLogin2.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        butLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ExitButtonWide.png"))); // NOI18N
        butLogin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLogin2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel1.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N

        pwfRegister.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel3.setText("Password again:");

        pwfRegister2.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel4.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(pwfRegister, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pwfRegister2)
                    .addComponent(txtEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(butLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwfRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwfRegister2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed
        RaiseMeUp.setLogin(new Login());
        this.setVisible(false);
        RaiseMeUp.getLogin().setVisible(true);
    }//GEN-LAST:event_butBackActionPerformed

    private void butLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLogin2ActionPerformed
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_butLogin2ActionPerformed

    private void butConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConfirmActionPerformed
        
        if(!new String(pwfRegister.getPassword()).equals(new String(pwfRegister2.getPassword())))
        {
            RaiseMeUp.setErrorMessage(new ErrorMessage("The two passwords aren't matching!"));
            RaiseMeUp.getErrorMessage().setVisible(true);
        }
        else if("".equals(txtUsername.getText()) || "".equals(txtEmail.getText()) || "".equals(new String(pwfRegister.getPassword()))) {
            RaiseMeUp.setErrorMessage(new ErrorMessage("You didn't fill all the fields!"));
            RaiseMeUp.getErrorMessage().setVisible(true);
        }
        else if(!rfc2822.matcher(txtEmail.getText()).matches()) {
            RaiseMeUp.setErrorMessage(new ErrorMessage("This is not a valid e-mail adress!"));
            RaiseMeUp.getErrorMessage().setVisible(true);
        }
        else if(RaiseMeUp.doesUserExist(txtUsername.getText())) {
            RaiseMeUp.setErrorMessage(new ErrorMessage("This username already exists!"));
            RaiseMeUp.getErrorMessage().setVisible(true);
        }
        else {
            RaiseMeUp.newUser(0, txtEmail.getText(), txtUsername.getText(), new String(pwfRegister.getPassword()));
            RaiseMeUp.setLogin(new Login());
            this.setVisible(false);
            RaiseMeUp.getLogin().setVisible(true);
        }
        
    }//GEN-LAST:event_butConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBack;
    private javax.swing.JButton butConfirm;
    private javax.swing.JButton butLogin2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField pwfRegister;
    private javax.swing.JPasswordField pwfRegister2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
