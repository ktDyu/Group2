/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.ChucVu;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DBcontext;

/**
 *
 * @author DELL
 */
public class ChucVuService {
    List<ChucVu> getAll(){
        List<ChucVu> lists = new ArrayList<>();
        String sql = """
                     SELECT [ID]
                           ,[TenChucVu]
                       FROM [dbo].[ChucVu]
                     """;
        try (Connection con = DBcontext.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
                ){
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                ChucVu cv = new ChucVu(rs.getInt(1), rs.getString(2));
                lists.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return lists;
    }
    
    public ChucVu getChucVuByTen(String ten){
        List<ChucVu> lists = new ArrayList<>();
        String sql = """
                     SELECT [ID]
                           ,[TenChucVu]
                       FROM [dbo].[ChucVu]
                     where TenChucVu like ?
                     """;
        try (Connection con = DBcontext.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
                ){
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {                
                return new ChucVu(rs.getInt(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(new ChucVuService().getAll());
    }
}
