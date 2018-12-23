package javaprocjt;


public class AddProjcetFrame extends javax.swing.JFrame {

    int index;

    public AddProjcetFrame() {
        initComponents();
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearIdButton = new javax.swing.JButton();
        stuMessageLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crsMessageLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        pCodeField = new javax.swing.JTextField();
        cNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        yesRB = new javax.swing.JRadioButton();
        noRB = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Course");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setText("Student ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 30);
        jPanel1.add(idField);
        idField.setBounds(110, 20, 110, 30);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton);
        searchButton.setBounds(253, 20, 80, 30);

        clearIdButton.setText("Clear ID");
        clearIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearIdButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearIdButton);
        clearIdButton.setBounds(253, 60, 80, 30);
        jPanel1.add(stuMessageLabel);
        stuMessageLabel.setBounds(20, 60, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 380, 100);

        jPanel2.setLayout(null);

        jLabel2.setText("Project Code");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 30);

        jLabel3.setText("Procejt Name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 50, 100, 30);

        jLabel4.setText("Project Desc");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 190, 80, 30);
        jPanel2.add(crsMessageLabel);
        crsMessageLabel.setBounds(150, 140, 220, 30);

        addButton.setText("Add Project");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton);
        addButton.setBounds(250, 20, 110, 30);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton);
        clearButton.setBounds(250, 60, 110, 30);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(closeButton);
        closeButton.setBounds(250, 100, 110, 30);
        jPanel2.add(pCodeField);
        pCodeField.setBounds(110, 10, 120, 30);
        jPanel2.add(cNameField);
        cNameField.setBounds(110, 50, 120, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 330, 180);

        buttonGroup1.add(yesRB);
        yesRB.setText("Yes");
        yesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRBActionPerformed(evt);
            }
        });
        jPanel2.add(yesRB);
        yesRB.setBounds(70, 110, 50, 25);

        buttonGroup1.add(noRB);
        noRB.setText("NO");
        jPanel2.add(noRB);
        noRB.setBounds(130, 110, 50, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Help?");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 110, 50, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 120, 380, 440);

        setSize(new java.awt.Dimension(411, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        int id = Integer.parseInt(idField.getText());

        boolean val;
        val = BilkentSYS.checkRedundancy(id);
        int tid;

        AcademicUnits tmp;
        if (val) {
            for (int i = 0; i < BilkentSYS.getStudents().size(); i++) {
                tmp = BilkentSYS.getStudents().get(i);
                tid = tmp.getIdNumber();
                if (tid == id) {
                    index = i;
                }
            }
            stuMessageLabel.setText("Student Exists!");
        } else {
            stuMessageLabel.setText("No Student Record!");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearIdButtonActionPerformed
        idField.setText("");
    }//GEN-LAST:event_clearIdButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        boolean help=false;
        if (yesRB.isSelected()) {
            help = true;
        }
        if (noRB.isSelected()) {
            help=false;
        }
        
        int credit;
        String cname, ccode;
        cname = cNameField.getText();
        ccode = pCodeField.getText();
        
        Students stu =(Students) BilkentSYS.getAcademicUnits().get(index);
        
      
       boolean val;
       val = stu.checkProjcet(Integer.parseInt(pCodeField.getText()));
        if (val) {
            crsMessageLabel.setText("This course is already added!");
        } else {
            //String title, String field, String owner, String Shortdesc, boolean needhelp
            Project  pro = new Project(cname, ccode,Integer.parseInt(idField.getText()),jTextArea1.getText(),help);
            stu.addProject(pro);
            
            crsMessageLabel.setText("Course added!");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        stuMessageLabel.setText("");
        crsMessageLabel.setText("");
        pCodeField.setText("");
        cNameField.setText("");
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void yesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesRBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cNameField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearIdButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel crsMessageLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton noRB;
    private javax.swing.JTextField pCodeField;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel stuMessageLabel;
    private javax.swing.JRadioButton yesRB;
    // End of variables declaration//GEN-END:variables
}
