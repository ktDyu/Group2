/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.ChucVu;
import entity.NhanVien;
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
public class NhanVienService {

    List<NhanVien> getAll() {
        List<NhanVien> lists = new ArrayList<>();
        String sql = """
                     SELECT dbo.NhanVien.ID, dbo.NhanVien.MaNhanVien, dbo.NhanVien.HoTen, dbo.NhanVien.SDT, dbo.NhanVien.NgaySinh, dbo.NhanVien.GioiTinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Anh, dbo.NhanVien.TrangThai, dbo.NhanVien.TaiKhoan, 
                                       dbo.NhanVien.MatKhau, dbo.ChucVu.TenChucVu
                     FROM     dbo.NhanVien INNER JOIN
                                       dbo.ChucVu ON dbo.NhanVien.ID_ChucVu = dbo.ChucVu.ID
                     				  where TrangThai like 'Active'
                     """;
        try(Connection con = DBcontext.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
                ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                ChucVu cv = new ChucVu();
                cv.setTenCV(rs.getString(12));
                NhanVien nv = new NhanVien();
                nv.setId(rs.getInt(1));
                nv.setMaNV(rs.getString(2));
                nv.setHoTen(rs.getString(3));
                nv.setSdt(rs.getString(4));
                nv.setNgaySinh(rs.getString(5));
                nv.setGioiTinh(rs.getBoolean(6));
                nv.setDiaChi(rs.getString(7));
                nv.setAnh(rs.getString(8));
                nv.setTrangThai(rs.getString(9));
                nv.setTaiKhoan(rs.getString(10));
                nv.setMatKhau(rs.getString(11));
                nv.setChucVu(cv);
                lists.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return lists;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(new NhanVienService().getAll());
    }
}
