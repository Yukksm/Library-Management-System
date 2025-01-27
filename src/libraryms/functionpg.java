/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libraryms;

/**
 *
 * @author vidis
 */
public class functionpg extends javax.swing.JFrame {

    /**
     * Creates new form functionpg
     */
    public functionpg() {
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

        jPanel1 = new javax.swing.JPanel();
        membershipbutton = new javax.swing.JButton();
        borrowbutton = new javax.swing.JButton();
        reservationbutton = new javax.swing.JButton();
        checdbbutton = new javax.swing.JButton();
        returnbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        membershipbutton.setBackground(new java.awt.Color(0, 0, 0));
        membershipbutton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        membershipbutton.setForeground(new java.awt.Color(255, 255, 255));
        membershipbutton.setText("Membership");
        membershipbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(membershipbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 340, 60));

        borrowbutton.setBackground(new java.awt.Color(0, 0, 0));
        borrowbutton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        borrowbutton.setForeground(new java.awt.Color(255, 255, 255));
        borrowbutton.setText("Borrow");
        borrowbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(borrowbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 340, 50));

        reservationbutton.setBackground(new java.awt.Color(0, 0, 0));
        reservationbutton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        reservationbutton.setForeground(new java.awt.Color(255, 255, 255));
        reservationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(reservationbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 340, 50));

        checdbbutton.setBackground(new java.awt.Color(0, 0, 0));
        checdbbutton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        checdbbutton.setForeground(new java.awt.Color(255, 255, 255));
        checdbbutton.setText("Check DB");
        checdbbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checdbbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(checdbbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 340, 60));

        returnbutton.setBackground(new java.awt.Color(0, 0, 0));
        returnbutton.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        returnbutton.setForeground(new java.awt.Color(255, 255, 255));
        returnbutton.setText("Return");
        returnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(returnbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 340, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidis\\OneDrive\\Desktop\\functionality.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -130, 720, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void membershipbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipbuttonActionPerformed
        // TODO add your handling code here:
        memberpg member = new memberpg();
        member.setVisible(true);
    }//GEN-LAST:event_membershipbuttonActionPerformed

    private void borrowbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowbuttonActionPerformed
        // TODO add your handling code here:
        Borrowpg borrow = new Borrowpg();
        borrow.setVisible(true);
    }//GEN-LAST:event_borrowbuttonActionPerformed

    private void returnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbuttonActionPerformed
        // TODO add your handling code here:
        returnpg retur = new returnpg();
        retur.setVisible(true);
    }//GEN-LAST:event_returnbuttonActionPerformed

    private void reservationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationbuttonActionPerformed

    private void checdbbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checdbbuttonActionPerformed
        // TODO add your handling code here:
        newppg db = new newppg();
        db.setVisible(true);
    }//GEN-LAST:event_checdbbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(functionpg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(functionpg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(functionpg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(functionpg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new functionpg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrowbutton;
    private javax.swing.JButton checdbbutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton membershipbutton;
    private javax.swing.JButton reservationbutton;
    private javax.swing.JButton returnbutton;
    // End of variables declaration//GEN-END:variables
}
