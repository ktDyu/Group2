/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class SanPhamChiTiet {
    private int ID;
    private int ID_TheLoai;
    private int ID_ChatLieu;
    private int ID_MauSac;
    private int ID_Size;
    private int ID_SanPham;
    private String MaSP;
    private String Anh;
    private String MoTa;
    private String DonGia;
    private int SoLuong;
    private Integer TrangThai;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int ID, int ID_TheLoai, int ID_ChatLieu, int ID_MauSac, int ID_Size, int ID_SanPham, String MaSP, String Anh, String MoTa, String DonGia, int SoLuong, Integer TrangThai) {
        this.ID = ID;
        this.ID_TheLoai = ID_TheLoai;
        this.ID_ChatLieu = ID_ChatLieu;
        this.ID_MauSac = ID_MauSac;
        this.ID_Size = ID_Size;
        this.ID_SanPham = ID_SanPham;
        this.MaSP = MaSP;
        this.Anh = Anh;
        this.MoTa = MoTa;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.TrangThai = TrangThai;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_TheLoai() {
        return ID_TheLoai;
    }

    public void setID_TheLoai(int ID_TheLoai) {
        this.ID_TheLoai = ID_TheLoai;
    }

    public int getID_ChatLieu() {
        return ID_ChatLieu;
    }

    public void setID_ChatLieu(int ID_ChatLieu) {
        this.ID_ChatLieu = ID_ChatLieu;
    }

    public int getID_MauSac() {
        return ID_MauSac;
    }

    public void setID_MauSac(int ID_MauSac) {
        this.ID_MauSac = ID_MauSac;
    }

    public int getID_Size() {
        return ID_Size;
    }

    public void setID_Size(int ID_Size) {
        this.ID_Size = ID_Size;
    }

    public int getID_SanPham() {
        return ID_SanPham;
    }

    public void setID_SanPham(int ID_SanPham) {
        this.ID_SanPham = ID_SanPham;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }
    public Object[] torowtable(){
        return new Object[]{
            ID,ID_TheLoai,ID_ChatLieu,ID_MauSac,ID_Size,ID_SanPham,MaSP,Anh,MoTa,DonGia,SoLuong,TrangThai
        };
    }
    
    
    
    
}
