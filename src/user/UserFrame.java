/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author jasmin
 */
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.lang.*;
import user.questions.Questions;


public class UserFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserFrame
     */
    
    
    public UserFrame() {
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

        Desktopuser = new javax.swing.JDesktopPane();
        MainPaneluser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Combostd = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Combosem = new javax.swing.JComboBox<>();
        Combosub = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(350, 350));

        MainPaneluser.setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Welcome To User Panel");

        Combostd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Combostd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "12", "11", "10" }));
        Combostd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombostdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("SELECT STANDARD");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("SELECT SEMESTER");

        Combosem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Combosem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        Combosem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombosemActionPerformed(evt);
            }
        });

        Combosub.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Combosub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TCS", "DBMS", "DC", "N/W", "MATHS", " " }));
        Combosub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombosubActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("SELECT SUBJECT");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPaneluserLayout = new javax.swing.GroupLayout(MainPaneluser);
        MainPaneluser.setLayout(MainPaneluserLayout);
        MainPaneluserLayout.setHorizontalGroup(
            MainPaneluserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPaneluserLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPaneluserLayout.createSequentialGroup()
                .addGroup(MainPaneluserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPaneluserLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(MainPaneluserLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(MainPaneluserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPaneluserLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Combosub, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPaneluserLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Combosem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPaneluserLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(Combostd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        MainPaneluserLayout.setVerticalGroup(
            MainPaneluserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPaneluserLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(MainPaneluserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combostd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(MainPaneluserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Combosem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(MainPaneluserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combosub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        Desktopuser.setLayer(MainPaneluser, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopuserLayout = new javax.swing.GroupLayout(Desktopuser);
        Desktopuser.setLayout(DesktopuserLayout);
        DesktopuserLayout.setHorizontalGroup(
            DesktopuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPaneluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopuserLayout.setVerticalGroup(
            DesktopuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPaneluser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktopuser)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktopuser)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CombostdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombostdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombostdActionPerformed

    private void CombosemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombosemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombosemActionPerformed

    private void CombosubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombosubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombosubActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String std=Combostd.getSelectedItem().toString();
        String sem=Combosem.getSelectedItem().toString();
        String sub=Combosub.getSelectedItem().toString();
        Questions.std=std;
        Questions.sem=sem;
        Questions.sub=sub;
        
        Questions qframe=new Questions();
        
        Desktopuser.add(qframe);
        qframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combosem;
    private javax.swing.JComboBox<String> Combostd;
    private javax.swing.JComboBox<String> Combosub;
    private javax.swing.JDesktopPane Desktopuser;
    private javax.swing.JPanel MainPaneluser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
