
package com.mycompany.electricity;

import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ElectricityBill extends javax.swing.JFrame {

  
    public ElectricityBill() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCiD = new javax.swing.JTextField();
        jTextCN = new javax.swing.JTextField();
        jTextUnit = new javax.swing.JTextField();
        jButtonCal = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPrint = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtDate = new com.toedter.calendar.JDateChooser();
        jtxtTime = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Electricity billing System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 27, 444, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 98, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 176, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Unit");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jTextCiD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextCiD, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 93, 188, 31));

        jTextCN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 188, 31));

        jTextUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 188, 31));

        jButtonCal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCal.setText("Calculate");
        jButtonCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 31));

        jButtonPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPrint.setText("Print");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, 31));

        jTextPrint.setColumns(20);
        jTextPrint.setRows(5);
        jScrollPane1.setViewportView(jTextPrint);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 93, 390, 280));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Time");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        jPanel1.add(jtxtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 190, 30));

        jtxtTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TIME.....", "9.00am", "10.00am", "10.30pm", "11.00am", "12.00 noon", "12.30.pm", " " }));
        jPanel1.add(jtxtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 342, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 215, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     String CustomerId;
        double charge;
        double GroundTotal;
        int count;
        
        
        void PrintBill()
        {
             String CustomerId = jTextCiD.getText();
             String customerName = jTextCN.getText();
             String unit = jTextUnit.getText();
             SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-mm-dd");
             String Date =  Date_Format.format(jtxtDate.getDate()); 
             String Time = jtxtTime.getSelectedItem().toString();
             
             jTextPrint.setText(jTextPrint.getText() + "IKEJA ELECTRICITY PLC:\n");
             jTextPrint.setText(jTextPrint.getText() + "\n");
              jTextPrint.setText(jTextPrint.getText() + "Electricity Billing System" + "\n");
              jTextPrint.setText(jTextPrint.getText() + "\n=================================\n");
             
             jTextPrint.setText(jTextPrint.getText() + "Customer ID :" + " " + CustomerId + "\n-------------------------\n");
              jTextPrint.setText(jTextPrint.getText() + "Customer Name :" + " " +customerName  + "\n------------------------------\n");
              jTextPrint.setText(jTextPrint.getText() + "Customer unit :" + " " + unit  + "\n-----------------\n");
              jTextPrint.setText(jTextPrint.getText() + "Date :" + " " + Date  + "\n-----------------\n");
              jTextPrint.setText(jTextPrint.getText() + "Time :" + " " + Time  + "\n-----------------\n");
              jTextPrint.setText(jTextPrint.getText() + "Total Bill Amount :" + " " + GroundTotal  + "\n");
              jTextPrint.setText(jTextPrint.getText() + "Thank you for Your Patronage,Pls Come Again:");
               
             
        }
    private void jButtonCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalActionPerformed
        
        CustomerId = jTextCiD.getText();
        count = Integer.parseInt(jTextUnit.getText());
        
        if(count<500)
        {
          charge = 1.00;  
        }
        else if(count<500 && count<600)
        {
            charge = 1.80;
        }
        
         else if(count<600 && count<800)
        {
            charge = 2.00;
        }
       
        else
         {
             charge = 3.00;
         }
        
        
        GroundTotal = charge * count;
        
        PrintBill();
       
        
        
    }//GEN-LAST:event_jButtonCalActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        try {
            jTextPrint.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ElectricityBill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
              jTextCiD.setText("");
              jTextCN.setText("");
             jTextUnit.setText("");
             jTextPrint.setText("");
             SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-mm-dd");
            // Date_Format.format(jtxtDate.setDate(""));// 
             jtxtTime.getSelectedItem().toString();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectricityBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCal;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCN;
    private javax.swing.JTextField jTextCiD;
    private javax.swing.JTextArea jTextPrint;
    private javax.swing.JTextField jTextUnit;
    private com.toedter.calendar.JDateChooser jtxtDate;
    private javax.swing.JComboBox<String> jtxtTime;
    // End of variables declaration//GEN-END:variables
}
