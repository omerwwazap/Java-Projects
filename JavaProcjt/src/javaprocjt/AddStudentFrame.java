package javaprocjt;


public class AddStudentFrame extends javax.swing.JFrame {

    public AddStudentFrame() {
        initComponents();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");
        getContentPane().setLayout(null);

        jLabel1.setText("ID: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 80, 30);

        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 70, 30);
        getContentPane().add(idField);
        idField.setBounds(130, 20, 140, 30);
        getContentPane().add(nameField);
        nameField.setBounds(130, 60, 140, 30);

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(30, 110, 100, 30);

        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(160, 110, 110, 30);

        closeButton.setText("CLOSE");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton);
        closeButton.setBounds(100, 160, 100, 30);
        getContentPane().add(messageLabel);
        messageLabel.setBounds(20, 210, 250, 20);

        setSize(new java.awt.Dimension(303, 291));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int id;
        String name;
        id = Integer.parseInt(idField.getText());
        name = nameField.getText();

        boolean val;
        val = BilkentSYS.checkRedundancy(id);
        if (val) {
            messageLabel.setText("This id already added!");
        } else {
            //(double cgpa, String courses, int gradyear, String FullName, String deapertmentName, int idNumber) {
            Students stu = new Students(0.0," ", 0, name, " ", id);
            BilkentSYS.getStudents().add(stu);   
            messageLabel.setText("Student added!");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        idField.setText("");
        nameField.setText("");
        messageLabel.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
