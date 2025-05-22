package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DatabaseUtil;

public class CustomerDao {

    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;

    public void saveCustomer(String name, String email, String cell, String address) {
        
        String sql ="insert into customer (name , cell , email, address)value(?,?,?,?)";
        try {
            
            ps=util.getcon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            
            ps.executeUpdate();
            
            ps.close();
            util.getcon().close();
            
            JOptionPane.showMessageDialog(null, "Customer Saved Successfully");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Saved Successfully");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void showAllCustomer(JTable jt){
        
        String[] colmnsName = {"ID"," Name","Email","Cell Phone","Adress"}; 
        DefaultTableModel tableModel = new DefaultTableModel(colmnsName, 0);
        jt.setModel(tableModel);
        
        String sql="select * from customer";
        
        try {
            
            PreparedStatement ps = util.getcon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String cell = rs.getString("cell");
            String address = rs.getString("address");
            
             //  add row to table model
             Object[] rowData = {id,name,email,cell,address};
             tableModel.addRow(rowData);
            
            }
            
            rs.close();
            ps.close();
            util.getcon().close();            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
 
}
