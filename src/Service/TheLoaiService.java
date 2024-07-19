/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import JDBC.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.TheLoai;

/**
 *
 * @author Admin
 */
public class TheLoaiService {
    public List<TheLoai> getall(){
        List<TheLoai> list= new ArrayList<>();
        String sql = "select Size.ID,TenSize from Size join QLBA on Size.ID=QLBA.ID ";
        try {
            Connection connect =DBConnect.getConnection();
            PreparedStatement ps=connect.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                TheLoai TL=new  TheLoai();
                TL.setID(rs.getInt("ID"));
                TL.setTenTheLoai(rs.getString("TenTheLoai"));
                list.add(TL);
                
                
            }
            return list;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
