
package blood.bank.database.project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class DB_Connection {
   Connection con  = null;
   public static Connection connectDB(){
        try {           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/bloodbank","root","");
            //JOptionPane.showMessageDialog(null,"connected");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database connection failed " );
            return null;
    }
  }
}
