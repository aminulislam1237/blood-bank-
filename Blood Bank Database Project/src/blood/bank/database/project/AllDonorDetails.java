
package blood.bank.database.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AllDonorDetails extends javax.swing.JFrame {

     Connection con = null;
     ResultSet rs = null;
    PreparedStatement pr =null;
    public AllDonorDetails() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        showdetails = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/database/project/zsearch2.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText(" All Donor Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 220, -1));

        jButton1.setFont(new java.awt.Font("Corbel", 3, 15)); // NOI18N
        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 131, 39));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Donor id", "Donor Name", "Date of Birth", "Mobile No", "Gender", "Email", "Blood Group", "City", "Adress"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 660, 320));

        showdetails.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        showdetails.setText("Cick Here");
        showdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(showdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/database/project/zsearch2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin a = new Admin();
        a.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdetailsActionPerformed
        try{ 
//            Class.forName("com.mysql.jdbc.Driver");
//                 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
//                 Statement st= conn.createStatement();

                String sql="select * from addnewdonor";
                PreparedStatement pstmt=con.prepareStatement(sql);
                ResultSet rs= pstmt.executeQuery();
                DefaultTableModel tm=(DefaultTableModel)table.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                Object o[]={rs.getInt("id"),rs.getString("fname"),rs.getString("dob"),rs.getString("mo"),rs.getString("g"),rs.getString("ea"),rs.getString("bg"),rs.getString("city"),rs.getString("adress")};
//                
                tm.addRow(o);
                }
                 }catch(Exception e){
                     JOptionPane.showMessageDialog(null,e);
                 }
    }//GEN-LAST:event_showdetailsActionPerformed

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
            java.util.logging.Logger.getLogger(AllDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllDonorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllDonorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showdetails;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
