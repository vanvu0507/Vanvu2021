/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyclbbongda;

import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class quanlyctModify {

    public static List<quanlyct> findAll() {
       List<quanlyct> ctList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null; 
        try {
            //lay tat ca danh sach cau thu
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cauthu", "root", "");
        
            //tao query
            String sql = "select Ten , Vitri , Soao, Chieucao, Cannang , Namsinh from quanlyct";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                quanlyct ct = new quanlyct(resultSet.getString("Ten"),
                                           resultSet.getString("Vitri"),
                                           resultSet.getInt("Soao"),
                                           resultSet.getInt("Chieucao"),
                                           resultSet.getInt("Cannang"),
                                           resultSet.getInt("Namsinh"));
                ctList.add(ct);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        
        return ctList;
    }
    
    public static void insert(quanlyct ct) {
                Connection connection = null;
                PreparedStatement statement = null; 
        try {
            //lay tat ca danh sach cau thu
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cauthu", "root", "");
        
            //tao query
            String sql = "insert into quanlyct(Ten,Vitri,Soao,Chieucao,Canang,Namsinh) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1,ct.getTên());
            statement.setString(2,ct.getVị_trí());
            statement.setInt(3,ct.getSố_áo());
            statement.setInt(4,ct.getChiều_cao());
            statement.setInt(5,ct.getCân_nặng());
            statement.setInt(5,ct.getNăm_sinh());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        
    }
    
        public static void update(quanlyct ct) {
                Connection connection = null;
                PreparedStatement statement = null; 
        try {
            //lay tat ca danh sach cau thu
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cauthu", "root", "");
        
            //tao query
            String sql = "update quanlyct set Ten=? , Vitri=? , Soao=? , Chieucao=? , Cannang=? , Namsinh=? ";
            statement = connection.prepareCall(sql);
            
            statement.setString(1,ct.getTên());
            statement.setString(2,ct.getVị_trí());
            statement.setInt(3,ct.getSố_áo());
            statement.setInt(4,ct.getChiều_cao());
            statement.setInt(5,ct.getCân_nặng());
            statement.setInt(5,ct.getNăm_sinh());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        
    }
        
               public static void delete(String Tên) {
                Connection connection = null;
                PreparedStatement statement = null; 
        try {
            //lay tat ca danh sach cau thu
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cauthu", "root", "");
        
            //tao query
            String sql = "delete from quanlyct where Ten=? ";
            statement = connection.prepareCall(sql);
            
            statement.setString(1,Tên);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(quanlyctModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        
    }
}
