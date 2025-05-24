
package adjavaevd;

import com.mysql.cj.xdevapi.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;


public class AdJavaEvd {
    
    static DbUtil du = new DbUtil();
    static PreparedStatement ps;
    static String sql ="";
   
    public static void main(String[] args) {
       
        saveStudent("Masud", "masud@gmail.com");
        System.out.println("After Save");
        showAllStudent();
        System.out.println("---------------------------");
        
        updateStudent("AA Masud", "Masud@gmail.com", 101);
        System.out.println("After Update");
        showAllStudent();
        System.out.println("---------------------------");
        
        deleteStudent(1);
        System.out.println("After Delet");
        showAllStudent();
        System.out.println("---------------------------");
        
    }
    
    public static void saveStudent(String name, String email){
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
    
    public static void showAllStudent(){
    
    sql="select * from student";
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
    
    public static void deleteStudent(int id){
    
        sql ="delete from student where id=?";
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
    
    public static void updateStudent(String name, String email,int id){
        sql="update student set name=?, email=? where id=?";
        
        try {
            ps=du.getCon().prepareStatement(sql);
            
             ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);
            
             ps.executeUpdate();
            
            ps.close();
            du.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEvd.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }
    
    
}
