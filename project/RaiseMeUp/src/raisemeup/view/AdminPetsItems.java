/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raisemeup.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import raisemeup.control.RaiseMeUp;
import raisemeup.model.beans.Food;
import raisemeup.model.beans.Item;
import raisemeup.model.beans.Pet;
import raisemeup.model.beans.Upgrade;
import raisemeup.model.beans.User;

/**
 *
 * @author lekogabor
 */
public class AdminPetsItems extends javax.swing.JFrame {

    Pet pet = new Pet();
    Map<Integer, Food> foods = new HashMap<Integer, Food>();
    Map<Integer, Upgrade> upgrades = new HashMap<Integer, Upgrade>();
    /**
     * Creates new form AdminPetsItems
     */
    public AdminPetsItems(Pet pet) {
        this.pet = pet;
        initComponents();
        myInit();
    }
    
    private void myInit(){
        
        listFoodAndUpgrade();
        
        foods = RaiseMeUp.listFoods();
        upgrades = RaiseMeUp.listUpgrades();
        
        for (Map.Entry<Integer, Food> food : foods.entrySet()){
            comboFoods.addItem(food.getValue().getName());
        }
        for (Map.Entry<Integer, Upgrade> upgrades : upgrades.entrySet()){
            comboUpgrades.addItem(upgrades.getValue().getName());
        }
    }

    
    private void listFoodAndUpgrade (){
        DefaultTableModel modelFood = (DefaultTableModel) tableFoods.getModel();
        modelFood.setRowCount(0);
        DefaultTableModel modelUpgrade = (DefaultTableModel) tableUpgrades.getModel();
        modelUpgrade.setRowCount(0);
        
        for (Map.Entry<Item, Integer> item : pet.getOwneditems().entrySet()){
            //System.out.println(i.getValue().getUsername());
            if (item.getKey() instanceof Food){
                modelFood.addRow(new Object[]{((Food)item.getKey()).getName(), item.getValue()});
                System.out.println(((Food)item.getKey()).getName());
            } else {
                modelUpgrade.addRow(new Object[]{((Upgrade)item.getKey()).getName(), item.getValue()});
                System.out.println(((Upgrade)item.getKey()).getName());
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUpgrades = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFoods = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        butSetFood = new javax.swing.JButton();
        comboFoods = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        butSetUpgrade = new javax.swing.JButton();
        comboUpgrades = new javax.swing.JComboBox();
        spinPieceFood = new javax.swing.JSpinner();
        spinPieceUpgrade = new javax.swing.JSpinner();
        butBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        jLabel1.setText("Pet's Items");

        tableUpgrades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "piece"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUpgrades);

        tableFoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "piece"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableFoods);

        jLabel2.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jLabel2.setText("Pet's Foods");

        jLabel3.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jLabel3.setText("Pet's Upgrades");

        butSetFood.setFont(new java.awt.Font("Hobo Std", 0, 12)); // NOI18N
        butSetFood.setText("Set");
        butSetFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSetFoodActionPerformed(evt);
            }
        });

        comboFoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFoodsActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Hobo Std", 0, 12)); // NOI18N
        jLabel19.setText("Set the owned foods");

        jLabel20.setFont(new java.awt.Font("Hobo Std", 0, 12)); // NOI18N
        jLabel20.setText("Set the owned upgrades");

        butSetUpgrade.setFont(new java.awt.Font("Hobo Std", 0, 12)); // NOI18N
        butSetUpgrade.setText("Set");
        butSetUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSetUpgradeActionPerformed(evt);
            }
        });

        spinPieceFood.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        spinPieceUpgrade.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        butBack.setFont(new java.awt.Font("Hobo Std", 0, 12)); // NOI18N
        butBack.setText("Back");
        butBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butSetUpgrade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboUpgrades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinPieceUpgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butSetFood)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFoods, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinPieceFood, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butBack, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2)))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(comboFoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSetFood)
                    .addComponent(spinPieceFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(butSetUpgrade)
                    .addComponent(comboUpgrades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinPieceUpgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(butBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSetFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSetFoodActionPerformed
        boolean foundFood = false;
        
        for (Map.Entry<Item, Integer> item : pet.getOwneditems().entrySet()){
            if (item.getKey().getName().equals(comboFoods.getSelectedItem().toString())){
                System.out.println("spinvalue: " + spinPieceFood.getValue().toString());
                
                foundFood = true;
                if (Integer.parseInt(spinPieceFood.getValue().toString()) == 0){
                    RaiseMeUp.removeFoodOwned(pet, (Food)item.getKey());
                    pet.getOwneditems().remove((Food)item.getKey());
                } else {
                    item.setValue(Integer.parseInt(spinPieceFood.getValue().toString()));
                    RaiseMeUp.updateFoodOwned(pet, (Food)item.getKey(), item.getValue());
                }
                break;
            }
        }
        if (!foundFood){
            for (Map.Entry<Integer, Food> food : foods.entrySet()){
                if (food.getValue().getName().equals(comboFoods.getSelectedItem().toString()) &&
                        Integer.parseInt(spinPieceFood.getValue().toString()) != 0){
                    pet.getOwneditems().put(food.getValue(), Integer.parseInt(spinPieceFood.getValue().toString()));
                    RaiseMeUp.newFoodOwned(pet, food.getValue(), Integer.parseInt(spinPieceFood.getValue().toString()));
                    break;
                }
            }
        }
        listFoodAndUpgrade();

        System.out.println(comboFoods.getSelectedItem().toString());
    }//GEN-LAST:event_butSetFoodActionPerformed

    private void butSetUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSetUpgradeActionPerformed
        boolean foundUpgrade = false;
        
        for (Map.Entry<Item, Integer> item : pet.getOwneditems().entrySet()){
            if (item.getKey().getName().equals(comboUpgrades.getSelectedItem().toString())){
                System.out.println("spinvalue: " + spinPieceUpgrade.getValue().toString());
                
                foundUpgrade = true;
                if (Integer.parseInt(spinPieceUpgrade.getValue().toString()) == 0){
                    RaiseMeUp.removeUpgradeOwned(pet, (Upgrade)item.getKey());
                    pet.getOwneditems().remove((Upgrade)item.getKey());
                } else {
                    item.setValue(Integer.parseInt(spinPieceUpgrade.getValue().toString()));
                    RaiseMeUp.updateUpgradeOwned(pet, (Upgrade)item.getKey(), item.getValue());
                }
                break;
            }
        }
        if (!foundUpgrade){
            for (Map.Entry<Integer, Upgrade> upgrade : upgrades.entrySet()){
                if (upgrade.getValue().getName().equals(comboUpgrades.getSelectedItem().toString()) &&
                        Integer.parseInt(spinPieceUpgrade.getValue().toString()) != 0){
                    pet.getOwneditems().put(upgrade.getValue(), Integer.parseInt(spinPieceUpgrade.getValue().toString()));
                    RaiseMeUp.newUpgradeOwned(pet, upgrade.getValue(), Integer.parseInt(spinPieceUpgrade.getValue().toString()));
                    break;
                }
            }
        }
        listFoodAndUpgrade();
        
        System.out.println(comboUpgrades.getSelectedItem().toString());
    }//GEN-LAST:event_butSetUpgradeActionPerformed

    private void butBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBackActionPerformed
        RaiseMeUp.setAdminPets(new AdminPets());
        this.setVisible(false);
        RaiseMeUp.getAdminPets().setVisible(true);
    }//GEN-LAST:event_butBackActionPerformed

    private void comboFoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFoodsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPetsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPetsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPetsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPetsItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPetsItems(new Pet()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBack;
    private javax.swing.JButton butSetFood;
    private javax.swing.JButton butSetUpgrade;
    private javax.swing.JComboBox comboFoods;
    private javax.swing.JComboBox comboUpgrades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinPieceFood;
    private javax.swing.JSpinner spinPieceUpgrade;
    private javax.swing.JTable tableFoods;
    private javax.swing.JTable tableUpgrades;
    // End of variables declaration//GEN-END:variables
}
