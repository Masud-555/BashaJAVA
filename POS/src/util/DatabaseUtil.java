
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseUtil {
    
    
    private Connection con = null;
    private String url = "jdbs:mysql://localhost:3306/pos";
    private String uder = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jbdc.driver";
    
    
    public Connection getcon(){
        try {
            Class.forName(driver);
            
            con =DriverManager.getConnection(url, uder, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return  con;
    }
    
}
