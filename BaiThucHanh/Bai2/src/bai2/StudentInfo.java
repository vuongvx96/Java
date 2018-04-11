/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Louis
 */
public class StudentInfo {

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @return the namSinh
     */
    public String getNamSinh() {
        return namSinh;
    }

    /**
     * @return the gioiTinh
     */
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    private String hoTen, namSinh;
    private boolean gioiTinh;
    public StudentInfo(){
        hoTen = "Vo Xuan Vuong";
        namSinh = "1996";
        gioiTinh = true;
    }
    public StudentInfo(String ht, String ns, boolean gt){
        hoTen = ht;
        namSinh = ns;
        gioiTinh = gt;
    }
    public StudentInfo(StudentInfo sv){
        hoTen = sv.hoTen;
        namSinh = sv.namSinh;
        gioiTinh = sv.gioiTinh;
    }
}
