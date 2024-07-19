/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HoaDonChiTiet {
    private int ID;
    private int ID_SanPhamChiTiet;
    private int ID_HoaDon;
    private int SoLuong;
    private String DonGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int ID, int ID_SanPhamChiTiet, int ID_HoaDon, int SoLuong, String DonGia) {
        this.ID = ID;
        this.ID_SanPhamChiTiet = ID_SanPhamChiTiet;
        this.ID_HoaDon = ID_HoaDon;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_SanPhamChiTiet() {
        return ID_SanPhamChiTiet;
    }

    public void setID_SanPhamChiTiet(int ID_SanPhamChiTiet) {
        this.ID_SanPhamChiTiet = ID_SanPhamChiTiet;
    }

    public int getID_HoaDon() {
        return ID_HoaDon;
    }

    public void setID_HoaDon(int ID_HoaDon) {
        this.ID_HoaDon = ID_HoaDon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }
    
    public Object[] torowtable() {
         return new Object[]{
            ID,ID_SanPhamChiTiet,ID_HoaDon,SoLuong,DonGia
        };
        
    }
}
