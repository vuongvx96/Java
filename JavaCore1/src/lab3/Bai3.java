/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai3 {
    public static void NhapMang(int[] a, int n){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.print("a["+ (i+1) + "] = ");
            a[i] = scanner.nextInt();
        }
    }
    public static void XuatMang(int[] a, int n){
        for (int i = 0; i < n; i++){
            System.out.printf("%4d",a[i]);
        }
        System.out.println();
    }
    public static int TimMin(int[] a, int n){
        int min = a[0];
        for (int i = 1; i < n; i++)
            min = Math.min(min, a[i]);
        return min;
    }
    public static double TB3(int[] a, int n){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++){
            if (a[i] % 3 == 0){
                sum += a[i];
                count++;
            }
        }
        return sum*1.0/count;
    }
    
    public static void main(String[] args){
        int n;
        int[] a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu: ");
        n = scanner.nextInt();
        a = new int[n];
        NhapMang(a,n);
        System.out.println("Mang vua nhap: ");
        XuatMang(a,n);
        // Sap xep mang
        Arrays.sort(a);
        System.out.printf("Mang da sap xep: %s\n",Arrays.toString(a));
        System.out.println("Min cua mang la: " + TimMin(a,n));
        System.out.println("TB cong cua cac phan tu bang 3: " + TB3(a,n));
    }
    
}
