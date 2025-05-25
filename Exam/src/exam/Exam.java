
package exam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Util;


public class Exam {
    
     static Util util = new Util();
     static PreparedStatement ps;
     static String sql = "";
    
    
    public static void main(String[] args) {
        
        saveEmp("Masud", "Manager", 60000);
        System.out.println("After save");
        showAllEmp();
        System.out.println("---------------------");
        
        updateEmp("Masud", "CEO", 100000, 1);
        System.out.println("After Update");
        showAllEmp();
        System.out.println("---------------------");
        
        deleteEmp(1);
        System.out.println("After Delet");
        showAllEmp();
        System.out.println("---------------------");
        
    }
    
    public static void saveEmp(String name, String designation, int salary){
        sql = "insert into emp(name,designation,salary) values(?,?,?)";
        
         try {
             ps=util.getCon().prepareStatement(sql);
             
              ps.setString(1, name);
            ps.setString(2, designation);            
            ps.setInt(3, salary);
            System.out.println("Data Save");
            System.out.println("-------------");

            ps.executeUpdate();

            ps.close();
            util.getCon().close();
             
         } catch (SQLException ex) {
             Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
         }    
    }
    
    public static void showAllEmp() {
         sql="select * from emp ";
         
         try {
             ps=util.getCon().prepareStatement(sql);
             
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 
                 String name = rs.getString("name");
            String designation = rs.getString("designation");            
            int salary = rs.getInt("salary");
            int id = rs.getInt("id");
            
                 System.out.println("Id : "+id+"\n"+"Name :"+name+"\n"+"Designation :"+designation+"\n"+"Salary :"+salary);
             
             }
             
             ps.executeQuery();
            ps.close();
            rs.close();
            util.getCon().close();
             
         } catch (SQLException ex) {
             Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
         }    
    }
    
    public static void deleteEmp(int id){
        sql="delete from emp where id=?";
        
         try {
             ps=util.getCon().prepareStatement(sql);
             
              ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();
             
         } catch (SQLException ex) {
             Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
         }    
    }

public static void updateEmp(String name,String designation, int salary, int id){
    sql = "update emp set name=?, designation=?, salary=? where id=?";
    
         try {
             ps=util.getCon().prepareStatement(sql);
             
             ps.setString(1, name);
             ps.setString(2, designation);            
            ps.setInt(3, salary);
            ps.setInt(4, id);
            
             ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
             
         } catch (SQLException ex) {
             Logger.getLogger(Exam.class.getName()).log(Level.SEVERE, null, ex);
         }
}
    
}
