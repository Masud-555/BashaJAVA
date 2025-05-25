
package adjvev;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Util;


public class AdJvEv {

        
    
   static Util utill = new Util();
   static PreparedStatement ps;
   static String sql = "";
    
    public static void main(String[] args) {
        
              
        
    }
    
    public static void saveShop(String oName,String email,String sName,String contact){
        sql="insert into shopowner(ownerName,shopName, email ,contact) values(?,?,?,?)";
        
       try {
           ps =utill.getCon().prepareStatement(sql);
           
           ps.setString(1, oName);
           ps.setString(2, email);
           ps.setString(3, sName);
           ps.setString(4, contact);
           
           ps.executeUpdate();
           
           ps.close();
           utill.getCon().close();
           System.out.println("Data Save");
           System.out.println("-------------");
           
       } catch (ClassNotFoundException |SQLException ex) {
           Logger.getLogger(AdJvEv.class.getName()).log(Level.SEVERE, null, ex);
       }
               
    }
    
    public static void showAllShop(){
    
    sql ="select * from shopowner";
    
       try {
           ps=utill.getCon().prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               int id = rs.getByte("id");
                String oName =rs.getString("ownerName");
               String sName = rs.getString("shopName");
                String email =rs.getString("email");
                String contact =rs.getString("contact");
                
                 System.out.println("ID:"+id+" ownerName: "+oName+" shopName : "+sName+" Email: "
                +email+"contact"+contact);
           
           }
           
           rs.close();
            ps.close();
            utill.getCon().close();
           
           
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(AdJvEv.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    public static void deleteShop(int id){
    
    sql="delet  from student where id=?";
    
       try {
           ps=utill.getCon().prepareStatement(sql);
           
           ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            utill.getCon().close();
           
       } catch (ClassNotFoundException |SQLException ex) {
           Logger.getLogger(AdJvEv.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
                
}
