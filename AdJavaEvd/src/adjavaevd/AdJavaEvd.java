
package adjavaevd;

import com.mysql.cj.xdevapi.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;


public class AdJavaEvd {
    
    DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql ="";
   
    public static void main(String[] args) {
       
                 
        
    }
    
    public void saveStudent(String name, String email){
        sql="insert into student(name, email) values(?,?)";
        try {
            ps =du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            
            ps.executeUpdate();
            
            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("------------------");
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void showAllStudent(){
    
    sql="select * from stident";
        try {
            ps=du.getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getByte("id");
                String name =rs.getString("name");
                String email =rs.getString("email");
                
                System.out.println("ID:"+id+" Name: "+name+" Email: "
                +email);
            
            }
            rs.close();
            ps.close();
            du.getCon().close(); 
            
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void deleteStudent(int id){
    
        sql ="delet from student where id=?";
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            du.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void updateStudent(int id){
        sql="update student set name=?, email=? where id=?";
        
        try {
            ps=du.getCon().prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }
    
    
}
