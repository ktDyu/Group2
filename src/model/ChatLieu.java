/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class ChatLieu {
    private int ID;
    private String TenChatLieu;

    public ChatLieu() {
    }

    public ChatLieu(int ID, String TenChatLieu) {
        this.ID = ID;
        this.TenChatLieu = TenChatLieu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenChatLieu() {
        return TenChatLieu;
    }

    public void setTenChatLieu(String TenChatLieu) {
        this.TenChatLieu = TenChatLieu;
    }
    
    public Object[] torowtable(){
        return new Object[]{
          ID,TenChatLieu  
        };
    }
}
