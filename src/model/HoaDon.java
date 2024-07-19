/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private  int ID;
    private int ID_NhanVien;
    private int ID_KhachHang;
    private String MaHoaDon;
    private String TongTien;
    private String NgayThanhToan;
    private Integer TrangThai;
    private String MoTa;

    public HoaDon() {
    }

    public HoaDon(int ID, int ID_NhanVien, int ID_KhachHang, String MaHoaDon, String TongTien, String NgayThanhToan, Integer TrangThai, String MoTa) {
        this.ID = ID;
        this.ID_NhanVien = ID_NhanVien;
        this.ID_KhachHang = ID_KhachHang;
        this.MaHoaDon = MaHoaDon;
        this.TongTien = TongTien;
        this.NgayThanhToan = NgayThanhToan;
        this.TrangThai = TrangThai;
        this.MoTa = MoTa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_NhanVien() {
        return ID_NhanVien;
    }

    public void setID_NhanVien(int ID_NhanVien) {
        this.ID_NhanVien = ID_NhanVien;
    }

    public int getID_KhachHang() {
        return ID_KhachHang;
    }

    public void setID_KhachHang(int ID_KhachHang) {
        this.ID_KhachHang = ID_KhachHang;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
    public Object[] torowtable(){
        return new Object[]{
          ID,ID_NhanVien,ID_KhachHang,MaHoaDon,TongTien,NgayThanhToan,TrangThai,MoTa
        };
    }
}
