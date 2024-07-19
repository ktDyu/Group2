/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Size {
    private int ID;
    private String TenSize;

    public Size() {
    }

    public Size(int ID, String TenSize) {
        this.ID = ID;
        this.TenSize = TenSize;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenSize() {
        return TenSize;
    }

    public void setTenSize(String TenSize) {
        this.TenSize = TenSize;
    }
    
    
    
    public Object[] torowtable(){
        return new Object[]{
          ID,TenSize
        };
    }
}
