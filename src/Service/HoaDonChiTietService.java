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
import model.HoaDonChiTiet;
/**
 *
 * @author Admin
 */
public class HoaDonChiTietService {
    public List<HoaDonChiTiet> getall(){
        List<HoaDonChiTiet> list= new ArrayList<>();
        String sql = "select HoaDonChiTiet.ID,ID_SanPhamChiTiet,ID_HoaDon,SoLuong,DonGia from HoaDonChiTiet join QLBA on HoaDonchiTiet.ID=QLBA.ID ";
        try {
            Connection connect =DBConnect.getConnection();
            PreparedStatement ps=connect.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet HDCT=new HoaDonChiTiet();
                HDCT.setID(rs.getInt("ID"));
                HDCT.setID_SanPhamChiTiet(rs.getInt("ID_SanPhamChiTiet"));
                HDCT.setID_HoaDon(rs.getInt("ID_HoaDon"));
                HDCT.setSoLuong(rs.getInt("SoLuong"));
                HDCT.setDonGia(rs.getString("DonGia"));
                
                list.add(HDCT);
                
                
            }
            return list;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
