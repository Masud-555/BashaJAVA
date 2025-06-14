
package crude;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;


public class Crude {

    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";
    
    public static void main(String[] args) {
        
           
        
    }
    
    public  void saveGym(){
    
        sql ="insert into gym(name,email,contact,membership) values(?,?,?,?)";
        try {
            ps=du.getCon().prepareStatement(sql);
           ps.setString(1, name);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Crude.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
