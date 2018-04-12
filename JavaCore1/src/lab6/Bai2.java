/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai2 {
    public static void main(String[] args){
        ArrayList<SanPham> DSSP = new ArrayList<SanPham>();
        for (int i = 0; i < 5; i++){
            SanPham x = new SanPham();
            x.nhap();
            DSSP.add(x);   
        }
        // Xuat danh sach cac san pham cua hang Nokia
        System.out.println("Danh sach san pham hang Nokia");
        for (SanPham sp: DSSP)
            if (sp.getHang().toLowerCase().equals("nokia"))
                sp.xuat();
    }
}

class SanPham{
    private String tenSp;
    private String hang;
    private double donGia;
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Ten san pham: ");
        tenSp = scanner.nextLine();
        System.out.print("Don gia: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Hang sx: ");
        hang = scanner.nextLine();
    }
    
    public void xuat(){
        System.out.println("San pham: " + tenSp + ", Don gia: " + donGia + ", Hang sx: " + hang);
    }
    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return tenSp;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    /**
     * @return the hang
     */
    public String getHang() {
        return hang;
    }

    /**
     * @param hang the hang to set
     */
    public void setHang(String hang) {
        this.hang = hang;
    }

    /**
     * @return the donGia
     */
    public double getDonGia() {
        return donGia;
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
