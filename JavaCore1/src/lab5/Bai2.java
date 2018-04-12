/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai2 {
    static Scanner scanner = new Scanner(System.in);
    public static void Nhap(ArrayList<String> ds, int n){
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            System.out.print("Nhap ho ten: ");
            ds.add(scanner.nextLine()); 
        }
    }
    public static void Xuat(ArrayList<String> ds, int n){
         for (String x: ds){
            System.out.println(x);
        }
    }
    public static void NgauNhien(ArrayList<String> ds){
        Collections.shuffle(ds);
        Xuat(ds,ds.size());
    }
    public static void SapXep(ArrayList<String> ds){
        // Sap xep tang dan
        Collections.sort(ds);
        // Dao nguoc de co day giam dan
        Collections.reverse(ds);
        Xuat(ds,ds.size());
    }
    public static void xoa(ArrayList<String> ds){
        System.out.print("Nhap vao ho ten can xoa: ");
        String hoten = scanner.nextLine();
        for (String x: ds)
            if (x.equals(hoten)){
                ds.remove(x);
                break;
            }
        Xuat(ds,ds.size());
    }
    
    
    public static void main(String[] args){
        ArrayList<String> ds = new ArrayList<String>();
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        Nhap(ds,n);
        System.out.println("Danh sach vua nhap: ");
        Xuat(ds,n);
        System.out.println("Hien thi ngau nhien: ");
        NgauNhien(ds);
        System.out.println("Sap xep giam dan: ");
        SapXep(ds);
        System.out.println("Tim va xoa mot phan tu: ");
        xoa(ds);
    }
}
