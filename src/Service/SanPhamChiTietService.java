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
import model.SanPhamChiTiet;
/**
 *
 * @author Admin
 */
public class SanPhamChiTietService {
     public List<SanPhamChiTiet> getall(){
        List<SanPhamChiTiet> list= new ArrayList<>();
        String sql = "select SanPhamChiTiet.ID,ID_TheLoai,ID_ChatLieu,ID_MauSac,ID_Size,ID_SanPham,MaSP,Anh,MoTa,DonGia,SoLuong,TrangThai from SanPhamChiTiet join QLBA on SanPhamChoTiet.ID=QLBA.ID ";
        try {
            Connection connect =DBConnect.getConnection();
            PreparedStatement ps=connect.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                SanPhamChiTiet SPCT=new SanPhamChiTiet();
                SPCT.setID(rs.getInt("ID"));
                SPCT.setID_TheLoai(rs.getInt("ID_TheLoai"));
                 SPCT.setID_ChatLieu(rs.getInt("ID_ChatLieu"));
                SPCT.setID_MauSac(rs.getInt("ID_MauSac"));
                SPCT.setID_Size(rs.getInt("ID_Size"));
                SPCT.setID_SanPham(rs.getInt("ID_SanPham"));
                SPCT.setMaSP(rs.getString("MaSP"));
                SPCT.setAnh(rs.getString("Anh"));
                SPCT.setMoTa(rs.getString("MoTa"));
                SPCT.setDonGia(rs.getString("DonGia"));
                SPCT.setSoLuong(rs.getInt("MaSP"));
                SPCT.setTrangThai(rs.getInt("TrangThai"));
                
                SPCT.setDonGia(rs.getString("DonGia"));
                
                list.add(SPCT);
                
                
            }
            return list;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
