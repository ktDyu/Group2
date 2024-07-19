/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class MauSac {
    private int ID;
    private String TenMauSac;

    public MauSac() {
    }

    public MauSac(int ID, String TenMauSac) {
        this.ID = ID;
        this.TenMauSac = TenMauSac;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenMauSac() {
        return TenMauSac;
    }

    public void setTenMauSac(String TenMauSac) {
        this.TenMauSac = TenMauSac;
    }
    
    public Object[] torowtable(){
        return new Object[]{
            ID,TenMauSac
        };
    }
}
