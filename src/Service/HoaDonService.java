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
import model.HoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonService {
    public List<HoaDon> getall(){
        List<HoaDon> list= new ArrayList<>();
        String sql = "select HoaDon.ID,ID_NhanVien,ID_KhachHang,MaHoaDon,TongTien,NgayThanhToan,TrangThai,MoTa from HoaDon join QLBA on HoaDon.ID=QLBA.ID ";
        try {
            Connection connect =DBConnect.getConnection();
            PreparedStatement ps=connect.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                HoaDon HD=new HoaDon();
                HD.setID(rs.getInt("ID"));
                HD.setID_NhanVien(rs.getInt("ID_NhanVien"));
                HD.setID_KhachHang(rs.getInt("ID_KhachHang"));
                HD.setMaHoaDon(rs.getString("MaHoaDon"));
                HD.setTongTien(rs.getString("TongTien"));
                HD.setNgayThanhToan(rs.getString("NgayThanhToan"));
                HD.setTrangThai(rs.getInt("TrangThai"));
                HD.setMoTa(rs.getString("MoTa"));
                list.add(HD);
                
                
            }
            return list;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
