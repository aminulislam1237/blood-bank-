package blood.bank.database.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    ResultSet rs = null;
    PreparedStatement pr =null;
    Connection con = null;
    
    public Home() {
        initComponents();
        con = DB_Connection.connectDB();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernametf = new javax.swing.JTextField();
        passwordtf = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        registrationbtn = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 93, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 93, 31));

        usernametf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametfActionPerformed(evt);
            }
        });
        getContentPane().add(usernametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 272, 36));

        passwordtf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(passwordtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 272, -1));

        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 100, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Welcome to Blood Bank Management System ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        registrationbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrationbtn.setText("New Registration");
        registrationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationbtnActionPerformed(evt);
            }
        });
        getContentPane().add(registrationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 150, 31));

        Admin.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Admin.setText("Close");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/database/project/zLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String query ="select * from home where username =? and password = ? ";
         try {
            pr=con.prepareStatement(query);
            pr.setString(1, usernametf.getText());
            pr.setString(2, passwordtf.getText());
            rs = pr.executeQuery();
           
            int count = 0;
            while(rs.next())
            {
                count++;
            }
            if(count==1){
                JOptionPane.showMessageDialog(null, "Logged in successful ");
                
                 Admin a = new Admin();
                 a.show();
                 dispose();
            }
            else{
                 JOptionPane.showMessageDialog(null, "user name or password is incorrect ");
            }
            rs.close();
            pr.close();
            
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }        
         
       
    }//GEN-LAST:event_loginbtnActionPerformed

    private void registrationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationbtnActionPerformed
        Registration R = new Registration();
        R.show();
        
        dispose();
    }//GEN-LAST:event_registrationbtnActionPerformed

    private void usernametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametfActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit the application");
        
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JButton registrationbtn;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
