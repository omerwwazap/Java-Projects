/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

/**
 *
 * @author leven
 */
public class BilkentFrame extends javax.swing.JFrame {

    /**
     * Creates new form BilkentFrame
     */
    
   
   MasteraddFrame ad =new MasteraddFrame();
   StudentFrame Sstu =new StudentFrame();
   AddAdmin admin=new AddAdmin();
  ShowINS showins2 =new ShowINS();
  AdminDisplayFrom admindisplay=new AdminDisplayFrom();
    
    public BilkentFrame() {
        initComponents();
        showpanel.setVisible(false);
       AddPanel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        addadta = new javax.swing.JToggleButton();
        showdata = new javax.swing.JToggleButton();
        allpanale = new javax.swing.JPanel();
        AddPanel = new javax.swing.JPanel();
        AddAdmin = new javax.swing.JButton();
        AddStu = new javax.swing.JButton();
        showpanel = new javax.swing.JPanel();
        showstu = new javax.swing.JButton();
        showins = new javax.swing.JButton();
        showadminn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(addadta);
        addadta.setText("Add Data");
        addadta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addadtaActionPerformed(evt);
            }
        });

        buttonGroup1.add(showdata);
        showdata.setText("Display");
        showdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdataActionPerformed(evt);
            }
        });

        allpanale.setLayout(new javax.swing.OverlayLayout(allpanale));

        AddAdmin.setText("Administration Personel");
        AddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminActionPerformed(evt);
            }
        });

        AddStu.setText("Students and Academic Personel");
        AddStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddStu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(245, 245, 245))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddStu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddAdmin)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        allpanale.add(AddPanel);

        showstu.setText("Show Students");
        showstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showstuActionPerformed(evt);
            }
        });

        showins.setText("Show Academic Personel");
        showins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showinsActionPerformed(evt);
            }
        });

        showadminn.setText("Show Adminisrtator");
        showadminn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showadminnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showpanelLayout = new javax.swing.GroupLayout(showpanel);
        showpanel.setLayout(showpanelLayout);
        showpanelLayout.setHorizontalGroup(
            showpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(showpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showstu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showadminn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showpanelLayout.setVerticalGroup(
            showpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showpanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(showstu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showadminn)
                .addGap(83, 83, 83))
        );

        allpanale.add(showpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addadta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(showdata, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(allpanale, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addadta)
                    .addComponent(showdata))
                .addGap(45, 45, 45)
                .addComponent(allpanale, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStuActionPerformed
        // TODO add your handling code here:
        ad.setVisible(true);
        
    }//GEN-LAST:event_AddStuActionPerformed

    private void addadtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addadtaActionPerformed
        // TODO add your handling code here:
        
        if(addadta.isSelected()){
            AddPanel.setVisible(true);
            showpanel.setVisible(false);
        }
    }//GEN-LAST:event_addadtaActionPerformed

    private void showdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdataActionPerformed
        // TODO add your handling code here:
        
        if(showdata.isSelected()){
            AddPanel.setVisible(false);
            showpanel.setVisible(true);
        }
    }//GEN-LAST:event_showdataActionPerformed

    private void showstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showstuActionPerformed
        // TODO add your handling code here:
        
        Sstu.setVisible(true);
    }//GEN-LAST:event_showstuActionPerformed

    private void showinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showinsActionPerformed
        // TODO add your handling code here:
        showins2.setVisible(true);
    }//GEN-LAST:event_showinsActionPerformed

    private void AddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminActionPerformed
     admin.setVisible(true);
    }//GEN-LAST:event_AddAdminActionPerformed

    private void showadminnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showadminnActionPerformed
        // TODO add your handling code here:
        admindisplay.setVisible(true);
        
    }//GEN-LAST:event_showadminnActionPerformed
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
            java.util.logging.Logger.getLogger(BilkentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BilkentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BilkentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BilkentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BilkentFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAdmin;
    private javax.swing.JPanel AddPanel;
    private javax.swing.JButton AddStu;
    private javax.swing.JToggleButton addadta;
    private javax.swing.JPanel allpanale;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton showadminn;
    private javax.swing.JToggleButton showdata;
    private javax.swing.JButton showins;
    private javax.swing.JPanel showpanel;
    private javax.swing.JButton showstu;
    // End of variables declaration//GEN-END:variables
}
