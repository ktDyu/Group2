/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class TheLoai {
    private int ID;
    private String TenTheLoai;

    public TheLoai() {
    }

    public TheLoai(int ID, String TenTheLoai) {
        this.ID = ID;
        this.TenTheLoai = TenTheLoai;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }
    
    public Object[] torowtable(){
        return new Object[]{
      ID,TenTheLoai      
    };
    
}
}
