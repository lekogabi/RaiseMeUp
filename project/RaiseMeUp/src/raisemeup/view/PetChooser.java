/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raisemeup.view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import raisemeup.control.RaiseMeUp;
import raisemeup.model.beans.Pet;

/**
 *
 * @author Andras
 */
public class PetChooser extends javax.swing.JFrame {

    /**
     * Creates new form PetChooser
     */
    public PetChooser() {
        initComponents();
        myInit();
    }
    
    private void myInit() {
        panPets.setLayout(new GridLayout());
        
        Map<Integer, Pet> pets = new HashMap<>();
        pets = RaiseMeUp.listPets();
        List<Pet> currentpets = new ArrayList();
        for(Map.Entry<Integer, Pet> pet : pets.entrySet()) {
            if(pet.getValue().getOwner() == RaiseMeUp.getCurrentUser().getId()) {
                currentpets.add(pet.getValue());
            }
        }
        
        for(int i=0; i<currentpets.size(); i++) {
            PanPetElement element = new PanPetElement(currentpets.get(i));
            panPets.add(element);
            element.setLocation(i*176, 0);
        }
        
        panPets.repaint();
        panPets.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butBack = new javax.swing.JButton();
        butCreateNewPet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panPets = new javax.swing.JPanel();
        butSettings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pet Chooser");
        setSize(new java.awt.Dimension(0, 0));

        butBack.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        butBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackButton.png"))); // NOI18N
        butBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        butCreateNewPet.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        butCreateNewPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CreateNewPetButton.png"))); // NOI18N
        butCreateNewPet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butCreateNewPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCreateNewPetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPetsLayout = new javax.swing.GroupLayout(panPets);
        panPets.setLayout(panPetsLayout);
        panPetsLayout.setHorizontalGroup(
            panPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panPetsLayout.setVerticalGroup(
            panPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panPets);

        butSettings.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        butSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SettingsButton.png"))); // NOI18N
        butSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCreateNewPet))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCreateNewPet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed
        RaiseMeUp.setLogin(new Login());
        this.setVisible(false);
        RaiseMeUp.getLogin().setVisible(true);
    }//GEN-LAST:event_butBackActionPerformed

    private void butCreateNewPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCreateNewPetActionPerformed
        RaiseMeUp.setPetCreator(new PetCreator());
        this.setVisible(false);
        RaiseMeUp.getPetCreator().setVisible(true);
    }//GEN-LAST:event_butCreateNewPetActionPerformed

    private void butSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSettingsActionPerformed
        RaiseMeUp.setUserSettings(new UserSettings());
        this.setVisible(false);
        RaiseMeUp.getUserSettings().setVisible(true);
    }//GEN-LAST:event_butSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(PetChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBack;
    private javax.swing.JButton butCreateNewPet;
    private javax.swing.JButton butSettings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panPets;
    // End of variables declaration//GEN-END:variables
}
