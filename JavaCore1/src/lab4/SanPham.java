/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class SanPham {
    private String tenSp;
    private double donGia, giamGia;
    private double getThueNhapKhau(){
        return 0.1*getDonGia();
    }
    public SanPham(){
        this.tenSp = "";
        this.donGia = 0.0;
        this.giamGia = 0.0;
    }
    public SanPham(String tenSP, double donGia, double giamGia){
        this.tenSp = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSP, double donGia){
        this(tenSP,donGia,0);
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten SP: ");
        setTenSp(scanner.nextLine());
        System.out.print("Don gia: ");
        setDonGia(scanner.nextDouble());
        System.out.print("Giam gia: ");
        setGiamGia(scanner.nextDouble());
    }
    public void xuat(){
        System.out.println("San pham: "+getTenSp()+", Don gia: "+getDonGia()+", Giam gia: "+getGiamGia());
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

    /**
     * @return the giamGia
     */
    public double getGiamGia() {
        return giamGia;
    }

    /**
     * @param giamGia the giamGia to set
     */
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
}
