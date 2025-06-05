package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class Crud {

    static DbUtil util = new DbUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {
        
        saveGym("Masud", "01626681203", "Gold", 1500);
        System.out.println("After save");
        showAllGym();
        System.out.println("---------------------");
        
        updateGym("AA Masud", "01786555277", "Student", 1000, 1);
        System.out.println("After Update");
        showAllGym();
        System.out.println("---------------------------");
        
        deleteGym(2);
        System.out.println("After Delet");
        showAllGym();
        System.out.println("---------------------");

    }

    public static void saveGym(String name,String contact,String membership,int payment){
        sql = "insert into gym(name,contact,membership,payment) values(?,?,?,?)";
        
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setString(3, membership);
            ps.setInt(4, payment);
            System.out.println("Data Save");
            System.out.println("-------------");

            ps.executeUpdate();

            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public static void showAllGym() {
    sql="select * from gym ";
    
        try {
            ps=util.getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            String name = rs.getString("name");
            String contact = rs.getString("contact");
            String membership = rs.getString("membership");
            int payment = rs.getInt("payment");
            int id = rs.getInt("id");
            
                System.out.println("Name : "+name+"\n Contact :"+contact+"\n Membership :"
                        +membership+"\n Payment :"+payment+"\n ID :"+id);
            
            }
            
            ps.executeQuery();
            ps.close();
            rs.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public static void deleteGym(int id){
        sql="delete from gym where id=?";
        
        try {
            ps=util.getCon().prepareStatement(sql);
            
             ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
    public static void updateGym(String name,String contact, String membership, int payment, int id){
    sql = "update gym set name=?, contact=?,membership=?,payment=? where id=?";
    
        try {
            ps=util.getCon().prepareStatement(sql);
            
             ps.setString(1, name);
             ps.setString(2, contact);
            ps.setString(3, membership);
            ps.setInt(4, payment);
            ps.setInt(5, id);
            
             ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
