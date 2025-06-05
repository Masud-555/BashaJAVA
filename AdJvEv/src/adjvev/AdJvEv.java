package adjvev;

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
        saveShop("Masud", "Abdullah", "masud@gmail.com", "126485");
        System.out.println("After save");
        showAllShop();
        System.out.println("---------");
        
        updateShop("AA Masud", "Ajom Shop", "aamasud@gmail.com", "012345", 1);
        System.out.println("After Update");
        showAllShop();
        System.out.println("---------------------------");
        
        deleteShop(1);
        System.out.println("After Delet");
        showAllShop();
        System.out.println("---------------------------");

    }

    public static void saveShop(String ownerName, String shopName, String email, String contact) {
        sql = "insert into shopowner(ownerName,shopName, email ,contact) values(?,?,?,?)";

        try {
            ps = utill.getCon().prepareStatement(sql);

            ps.setString(1, ownerName);
            ps.setString(2, shopName);
            ps.setString(3, email);
            ps.setString(4, contact);
            System.out.println("Data Save");
            System.out.println("-------------");

            ps.executeUpdate();

            ps.close();
            utill.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdJvEv.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllShop() {
        sql = "select * from shopowner";

        try {
            ps = utill.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String ownerName = rs.getString("ownerName");

                String shopName = rs.getString("shopName");
                String email = rs.getString("email");
                String contact = rs.getString("contact");
                int id = rs.getInt("id");
                System.out.println("ownerName : " + ownerName + "\n" + "shopName : " + shopName + "\n" + "email : " + email
                        + "\n" + "contact : " + contact + "\n " + "id : " + id);
            }
            ps.executeQuery();
            ps.close();
            rs.close();
            utill.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdJvEv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteShop(int id) {
        sql = "delete from shopowner where id=?";

        try {
            ps = utill.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            utill.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdJvEv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateShop(String ownerName, String shopName, String email, String contact,int id){
    
        sql="update shopowner set ownerName=?,shopName=?, email=?,contact=? where id=?";
        
        try {
            ps=utill.getCon().prepareStatement(sql);
            
             ps.setString(1, ownerName);
             ps.setString(2, shopName);
            ps.setString(3, email);
            ps.setString(4, contact);
            ps.setInt(5, id);
            
             ps.executeUpdate();
            
            ps.close();
            utill.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdJvEv.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

}
