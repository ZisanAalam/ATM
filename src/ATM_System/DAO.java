
package ATM_System;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    public Connection connect() throws Exception{
        Connection con;
      
            String url = "jdbc:mysql://localhost:3306/info";
            String uname = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,uname,pass); 
            return con;
 
    }
    
}
