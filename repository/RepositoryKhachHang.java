/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.DBconnect;
import entity.KhachHang;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author my account
 */
public class RepositoryKhachHang {

    public ArrayList<KhachHang> getAll() {
        String sql = """
                   SELECT [ID]
                         ,[MaKhachHang]
                         ,[HoTen]
                         ,[SDT]
                         ,[DiaChi]
                         ,[NgaySinh]
                         ,[GioiTinh]
                     FROM [dbo].[KhachHang]
                   """;
        ArrayList<KhachHang> list = new ArrayList<>();
        try (Connection con = DBconnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setIdKH(rs.getInt(1));
                kh.setMaKhachHang(rs.getString(2));
                kh.setHoTen(rs.getString(3));
                kh.setSDT(rs.getString(4));
                kh.setDiaChi(rs.getString(5));
                kh.setNgaySinh(rs.getString(6));
                kh.setGioiTinh(rs.getBoolean(7));
                list.add(kh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean add(KhachHang kh) {
        String sql = """
                   INSERT INTO [dbo].[KhachHang]
                              ([MaKhachHang]
                              ,[HoTen]
                              ,[SDT]
                              ,[DiaChi]
                              ,[NgaySinh]
                              ,[GioiTinh])
                        VALUES
                              (?,?,?,?,?,?)
                   """;
        int check = 0;
        try (Connection con = DBconnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, kh.getMaKhachHang());
            ps.setObject(2, kh.getHoTen());
            ps.setObject(3, kh.getSDT());
            ps.setObject(4, kh.getDiaChi());
            ps.setObject(5, kh.getNgaySinh());
            ps.setObject(6, kh.isGioiTinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return check > 0;
    }

    public boolean update(int id, KhachHang newKhachHang) {
        String sql = """
                   UPDATE [dbo].[KhachHang]
                      SET [MaKhachHang] = ?
                         ,[HoTen] = ?
                         ,[SDT] =?
                         ,[DiaChi] = ?
                         ,[NgaySinh] = ?
                         ,[GioiTinh] = ?
                    WHERE ID=?
                   """;
        int check = 0;
        try (Connection con = DBconnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, newKhachHang.getMaKhachHang());
            ps.setObject(2, newKhachHang.getHoTen());
            ps.setObject(3, newKhachHang.getSDT());
            ps.setObject(4, newKhachHang.getDiaChi());
            ps.setObject(5, newKhachHang.getNgaySinh());
            ps.setObject(6, newKhachHang.isGioiTinh());
            ps.setObject(7, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return check > 0;
    }

    public boolean delete(int id) {
        String sql = """
                   DELETE FROM [dbo].[KhachHang]
                         WHERE ID=?
                   """;
        int check = 0;
        try (Connection con = DBconnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return check > 0;
    }

    public static void main(String[] args) {
        System.out.println(new RepositoryKhachHang().getAll());
    }

}
