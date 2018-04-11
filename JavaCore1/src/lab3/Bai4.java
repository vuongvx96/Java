/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import static java.lang.System.in;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai4 {
    public static String XepLoai(double diem){
        if (diem < 5)
            return "Yeu";
        else if (diem >= 5 && diem < 6.5)
            return "Trung binh";
        else if (diem >= 6.5 && diem < 7.5)
            return "Kha";
        else if (diem >= 7.5 && diem < 9)
            return "Gioi";
        else 
            return "Xuat sac";
    }
    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    

    public static void SapXep(String[] hoten, Double[] diem, int n){
        for (int i = 0; i < n- 1; i++)
            for (int j = i+1; j < n; j++)
                if (diem[i] > diem[j]){
                    swap(hoten, i, j);
                    swap(diem, i, j);
                }
    }
    public static void main(String[] args){
        String[] HoTen;
        Double[] Diem;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong SV: ");
        n = scanner.nextInt();
        HoTen = new String[n];
        Diem = new Double[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap thong tin SV["+(i+1)+"]: ");
            System.out.print("Ho ten: ");
            scanner.nextLine();
            HoTen[i] = scanner.nextLine();
            System.out.print("Diem: ");
            Diem[i] = scanner.nextDouble();
        }
        SapXep(HoTen,Diem,n);
        // Xuat mang thong tin sv va diem cung xep loai
        for (int i = 0; i < n; i++){
           System.out.printf("SV %d: %s %.2f %s\n",(i+1),HoTen[i],Diem[i],XepLoai(Diem[i])); 
           
        }  
    }
    
}
