
package blood.bank.database.project;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddNewDonor extends javax.swing.JFrame {

    ResultSet rs = null;
    PreparedStatement pr =null;
    Connection con = null;
    
    public AddNewDonor() {
        initComponents();
        con = DB_Connection.connectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ea = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        adress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mo = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        bg = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ea.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        getContentPane().add(ea, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 120, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Email Adress");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 102, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Blood group");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 103, 26));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("City");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 80, 25));

        city.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, 200, -1));

        adress.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        getContentPane().add(adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 154, 101));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("Adress");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 81, -1));

        save.setFont(new java.awt.Font("Corbel", 3, 15)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 83, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Full Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 174, 110, 30));

        jButton2.setFont(new java.awt.Font("Corbel", 3, 15)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 104, 26));

        jButton3.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 107, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Add New Donor");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 170, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Date of Birth:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 120, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Mobile No:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 109, 24));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 88, -1));

        fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 130, 30));

        dob.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 133, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Donor Profile Id: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 120, 26));

        mo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        getContentPane().add(mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 133, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 130, 30));

        g.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 372, 133, 30));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 182, 200, 26));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/database/project/zsearch2.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 1280, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Admin a = new Admin();
        
        a.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       
        String query ="insert into addnewdonor values(?,?,?,?,?,?,?,?,?) ";
            try {
            pr=con.prepareStatement(query);
            pr.setString(1, id.getText());
            pr.setString(2, fname.getText());
            pr.setString(3, dob.getText());
            pr.setString(4, mo.getText());
            pr.setString(5, g.getText());
            pr.setString(6, ea.getText());
            pr.setString(7, bg.getText());
            pr.setString(8, city.getText());
            pr.setString(9, adress.getText());
            
            int k=0;
            if(id.getText().isEmpty() || fname.getText().isEmpty() || dob.getText().isEmpty() || g.getText().isEmpty() || ea.getText().isEmpty() || bg.getText().isEmpty() || city.getText().isEmpty() || adress.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Input Filds can not be empty"); 
                k=1;
            }
            
            if(k==0){
            pr.execute();
             JOptionPane.showMessageDialog(null, "saved"); 
             con.close();
             id.setText("");
             fname.setText("");
             dob.setText("");
             mo.setText("");
             g.setText("");
             ea.setText("");
             bg.setText("");
             city.setText("");
             adress.setText("");
            }
            
        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, "not saved");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            id.setText("");
             fname.setText("");
             dob.setText("");
             mo.setText("");
             g.setText("");
             ea.setText("");
             bg.setText("");
             city.setText("");
             adress.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JTextField bg;
    private javax.swing.JTextField city;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField ea;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField g;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mo;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
