/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.MiniCalculator;

/**
 *
 * @author marcu
 */
import javax.swing.JOptionPane;
public class MainGUI extends javax.swing.JFrame {

   
    public MainGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Subtract = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        Results = new javax.swing.JTextField();
        Rem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mini Calculator");

        Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Add.setText("+");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        Subtract.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Subtract.setText("-");
        Subtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubtractMouseClicked(evt);
            }
        });

        Multiply.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Multiply.setText("x");
        Multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiplyMouseClicked(evt);
            }
        });

        Divide.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Divide.setText("/");
        Divide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DivideMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Enter First Number:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter Second Number:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Results");

        n1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        n2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Results.setEditable(false);
        Results.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Results.setForeground(new java.awt.Color(0, 51, 255));

        Rem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Rem.setText("Rem");
        Rem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Results, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Subtract)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Multiply)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Divide)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(n2))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Subtract)
                    .addComponent(Multiply)
                    .addComponent(Divide)
                    .addComponent(Rem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Results, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        //Check if the numbers are valid
        if (!isValidNumber(n1.getText())){
            JOptionPane.showMessageDialog(null, "The first number must have only digits");
        }
        if (!isValidNumber(n2.getText())){
            JOptionPane.showMessageDialog(null, "The second number must have only digits");
        }
        
        if (n1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The first number cannot be blank");
        }
        
        if (n2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The second number cannot be blank");
        }
        
        //Convert String to Double
        double number1 = Double.parseDouble(n1.getText());
        double number2 = Double.parseDouble(n2.getText());
        

        // Perform the addition operation
        double result = number1 + number2;

        // Display the result in the Results text field
        Results.setText(String.valueOf(result));
    }//GEN-LAST:event_AddMouseClicked

    private void SubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubtractMouseClicked
        // TODO add your handling code here:
        //Check if the numbers are valid
        if (!isValidNumber(n1.getText())){
            JOptionPane.showMessageDialog(null, "The first number must have only digits");
        }
        if (!isValidNumber(n2.getText())){
            JOptionPane.showMessageDialog(null, "The second number must have only digits");
        }
        if (n1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The first number cannot be blank");
        }
        
        if (n2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The second number cannot be blank");
        }
        
        //Convert String to Double
        double number1 = Double.parseDouble(n1.getText());
        double number2 = Double.parseDouble(n2.getText());

        // Perform the subtraction operation
        double result = number1 - number2;

        // Display the result in the Results text field
        Results.setText(String.valueOf(result));

    }//GEN-LAST:event_SubtractMouseClicked

    private void MultiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplyMouseClicked
        // TODO add your handling code here:
        //Check if the numbers are valid
        if (!isValidNumber(n1.getText())){
            JOptionPane.showMessageDialog(null, "The first number must have only digits");
        }
        if (!isValidNumber(n2.getText())){
            JOptionPane.showMessageDialog(null, "The second number must have only digits");
        }
        if (n1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The first number cannot be blank");
        }
        if (n2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The second number cannot be blank");
        }
        
        //Convert String to Double
        double number1 = Double.parseDouble(n1.getText());
        double number2 = Double.parseDouble(n2.getText());

        // Perform the multiply operation
        double result = number1 * number2;

        // Display the result in the Results text field
        Results.setText(String.valueOf(result));
    }//GEN-LAST:event_MultiplyMouseClicked

    private void DivideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivideMouseClicked
        // TODO add your handling code here:
        //Check if the numbers are valid
        if (!isValidNumber(n1.getText())){
            JOptionPane.showMessageDialog(null, "The first number must have only digits");
        }
        if (!isValidNumber(n2.getText())){
            JOptionPane.showMessageDialog(null, "The second number must have only digits");
        }
        if (n1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The first number cannot be blank");
        }
        if (n2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The second number cannot be blank");
        }
        
        //Convert String to Double
        double number1 = Double.parseDouble(n1.getText());
        double number2 = Double.parseDouble(n2.getText());

        // Perform the divide operation
        double result = number1 / number2;
        
        //Check if number 2 is zero
        if (number2 == 0){
            JOptionPane.showMessageDialog(null, "Cannot divide by zero, change the second number");
        }

        // Display the result in the Results text field
        Results.setText(String.valueOf(result));
    }//GEN-LAST:event_DivideMouseClicked

    private void RemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemMouseClicked
        // TODO add your handling code here:
        //Check if the numbers are valid
        if (!isValidNumber(n1.getText())){
            JOptionPane.showMessageDialog(null, "The first number must have only digits");
        }
        if (!isValidNumber(n2.getText())){
            JOptionPane.showMessageDialog(null, "The second number must have only digits");
        }
        if (n1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The first number cannot be blank");
        }
        if (n2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The second number cannot be blank");
        }
        
        //Convert String to Double
        double number1 = Double.parseDouble(n1.getText());
        double number2 = Double.parseDouble(n2.getText());

        // Perform the divide operation
        double result = number1 % number2;

        // Display the result in the Results text field
        Results.setText(String.valueOf(result));
    }//GEN-LAST:event_RemMouseClicked
    
    //This method checks the numbers is a digit or a text
    private boolean isValidNumber(String text){
       return text.matches("\\d*\\.?\\d+");
    }
    
    
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Rem;
    private javax.swing.JTextField Results;
    private javax.swing.JButton Subtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    // End of variables declaration//GEN-END:variables
}
