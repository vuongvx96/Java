/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Louis
 */
public class Bai3 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPham> list = new ArrayList<SanPham>();
    public static Comparator<SanPham> comp = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham o1, SanPham o2) {
            return o1.getGiaSP().compareTo(o2.getGiaSP());
        }
    };
    public static void Nhapds(){
        int n = 0;
        System.out.print("Nhap vao so luong san pham: ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            System.out.println("Nhap san pham " + (i+1));
            SanPham x = new SanPham();
            x.Nhap();
            list.add(x);
        }
    }
    public static void SapXep(){
        Collections.sort(list, comp);
        Collections.reverse(list);
        System.out.println("Danh sach sau khi da sap xep giam dan theo gia");
        for (SanPham x: list)
            x.Xuat();
    }
    public static Double GiaTB(){
        Double sum = 0.0;
        for (SanPham x: list){
            sum += x.getGiaSP();
        }
        return sum/list.size();
    }
    public static void  Xoa(){
        scanner.nextLine();
        System.out.print("Nhap vao ten san pham can xoa: ");
        String x = scanner.nextLine();
        for (SanPham sp: list){
            if(sp.getTenSP().equals(x)){
                list.remove(sp);
                break;
            }
        }
        System.out.println("Danh sach sau khi xoa san pham " + x);
        for (SanPham prod: list)
            prod.Xuat();
    }
    public static void Menu(){
        int x = 1;
        System.out.println();
        System.out.println("|-------------- MENU ---------------|");
        System.out.println("|1. Nhap danh sach san pham         |");
        System.out.println("|2. Sap xep giam dan theo gia       |");
        System.out.println("|3. Tim va xoa theo ten san pham    |");
        System.out.println("|4. Xuat gia trung binh san pham    |");
        System.out.println("|-----------------------------------|");
        System.out.print("Nhap vao lua chon: ");
        x = scanner.nextInt();
        switch(x){
            case 1: Nhapds();
                    Menu();
                    break;
            case 2: SapXep();
                    Menu();
                    break;
            case 3: Xoa();
                    Menu();
                    break;
            case 4: System.out.println("Gia TB cac san pham: " + GiaTB());
                    Menu();
                    break;
            default: System.exit(0);
                     break;
        }
    }
    // Main
    public static void main(String[] args){
        Menu();
    }
}
class SanPham{
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        giaSP = scanner.nextDouble();
    }
    public void Xuat(){
        System.out.println("San pham: "+tenSP+", Gia: "+giaSP);
    }
    
    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the giaSP
     */
    public Double getGiaSP() {
        return giaSP;
    }

    /**
     * @param giaSP the giaSP to set
     */
    public void setGiaSP(Double giaSP) {
        this.giaSP = giaSP;
    }
    private String tenSP;
    private Double giaSP;
    
}
