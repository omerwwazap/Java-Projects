package javaprocjt;

import java.util.ArrayList;


public class AddStudentFrame extends javax.swing.JFrame {
int index;
Project pro;
    public AddStudentFrame() {
        initComponents();
        jPanel2.setVisible(false);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        nameField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        crsMessageLabel = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        cNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        yesRB = new javax.swing.JRadioButton();
        noRB = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");
        getContentPane().setLayout(null);

        jLabel1.setText("ID: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 80, 30);

        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 70, 30);
        getContentPane().add(idField);
        idField.setBounds(130, 20, 140, 30);

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(20, 240, 100, 30);

        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(150, 240, 110, 30);

        closeButton.setText("CLOSE");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(360, 560, 100, 30);
        getContentPane().add(messageLabel);
        messageLabel.setBounds(30, 140, 250, 20);
        getContentPane().add(nameField1);
        nameField1.setBounds(130, 60, 140, 30);
        getContentPane().add(nameField2);
        nameField2.setBounds(130, 100, 140, 30);

        jLabel3.setText("Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 70, 30);

        jPanel2.setLayout(null);

        jLabel6.setText("Procejt Name:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 30, 120, 30);

        jLabel7.setText("Project Desc");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 190, 110, 30);
        jPanel2.add(crsMessageLabel);
        crsMessageLabel.setBounds(150, 140, 220, 30);

        addButton1.setText("Add Project");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(addButton1);
        addButton1.setBounds(300, 10, 120, 30);

        clearButton1.setText("Clear");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton1);
        clearButton1.setBounds(300, 50, 120, 30);
        jPanel2.add(cNameField);
        cNameField.setBounds(160, 30, 120, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 330, 180);

        yesRB.setText("Yes");
        yesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRBActionPerformed(evt);
            }
        });
        jPanel2.add(yesRB);
        yesRB.setBounds(70, 110, 60, 29);

        noRB.setText("NO");
        jPanel2.add(noRB);
        noRB.setBounds(150, 110, 70, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Help?");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 110, 50, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(400, 110, 450, 440);

        jCheckBox1.setText("Do you want to add a project?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(30, 170, 270, 29);

        setSize(new java.awt.Dimension(913, 713));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try{
        if (!(idField.getText().isEmpty() 
                    || nameField1.getText().isEmpty() 
                    || nameField2.getText().isEmpty()
                    )) {
        int id;
        String name,mail;
        id = Integer.parseInt(idField.getText());
        name = nameField1.getText();
        mail=nameField2.getText();
        
        Contact list=new Contact(id, mail, true, null);
        
        
        boolean val;
        val = BilkentSYS.checkRedundancy(id);
        if (val) {
            messageLabel.setText("This id already added!");
        } else {
           
            Students stu = new Students(id, name, name, id, list, pro);
            BilkentSYS.getStudents().add(stu);   
            messageLabel.setText("Student added!");
        }
        }else messageLabel.setText("Fields are empty!!!!!!!");
        messageLabel.setText("Successfully Added!!");
        }catch(NumberFormatException ex) {
           messageLabel.setText("Number Format Exception!!!!!!!");
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        idField.setText("");
        nameField1.setText("");
        messageLabel.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jPanel2.setVisible(true);
        }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void yesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesRBActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed

        crsMessageLabel.setText("");

    }//GEN-LAST:event_clearButton1ActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        boolean help=false;
        if (yesRB.isSelected()) {
            help = true;
        }
        if (noRB.isSelected()) {
            help=false;
        }
        Students stu =(Students) BilkentSYS.getAcademicUnits().get(index);
        //(String title, String field,String Shortdesc, boolean needhelp) {
        pro = new Project(stu.project.getTitle(), cNameField.getText(), jTextArea1.getText(), help);

        
    }//GEN-LAST:event_addButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JTextField cNameField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearButton1;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel crsMessageLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField nameField2;
    private javax.swing.JRadioButton noRB;
    private javax.swing.JRadioButton yesRB;
    // End of variables declaration//GEN-END:variables
}
