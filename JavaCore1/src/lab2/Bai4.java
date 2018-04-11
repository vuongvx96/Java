/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai4 {

    public static void main(String[] args){
       byte ch = 0;
       Scanner scanner = new Scanner(System.in);
       System.out.println("+------------------------------------+");
       System.out.println("1. Giai phuong trinh bac nhat");
       System.out.println("2. Giai phuong trinh bac hai");
       System.out.println("3. Tinh tien dien");
       System.out.println("4. Ket thuc");
       System.out.println("Chon chuc nang: ");
       ch = scanner.nextByte();
       switch(ch){
            case 1: giaiPTB1();
                    break;
            case 2: giaiPTB2();
                    break;
            case 3: tinhTienDien();
                    break;
            case 4: System.exit(0);
            default: System.out.println("Lua chon khong dung");
       }
    }
    
    public static void giaiPTB1(){
        double a = 0, b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = scanner.nextDouble();
        System.out.print("Nhap b = ");
        b = scanner.nextDouble();
        if (a == 0)
            if (b == 0)
                System.out.println("Phuong trinh co VSN");
            else
                System.out.println("Phuong trinh vo nghiem");
        else
            System.out.printf("Phuong trinh co nghiem x = %.2f\n",-b/a);
    }
    
    public static void giaiPTB2(){
        double a, b, c, Delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = scanner.nextDouble();
        System.out.print("Nhap b = ");
        b = scanner.nextDouble();
        System.out.print("Nhap c = ");
        c = scanner.nextDouble();
        if (a == 0){
            if (b == 0)
                if (c == 0)
                    System.out.println("Phuong trinh co VSN");
                else
                    System.out.println("Phuong trinh vo nghiem");
            else
                System.out.printf("Phuong trinh co nghiem x = %.2f\n",-c/b);
        }
        else{
            Delta = Math.pow(b, 2) - 4*a*c;
            if (Delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if (Delta == 0){
                double x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            }
            else{
                double x1 = (-b + Math.sqrt(Delta))/(2*a);
                double x2 = (-b - Math.sqrt(Delta))/(2*a);
                System.out.printf("PT co 2 nghiem x1 = %.2f , x2 = %.2f\n",x1,x2);
            }
        }
    }
    
    public static void tinhTienDien(){
        int sodienTT = 0;
        float tien = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so KWh dien tieu thu: ");
        sodienTT = scanner.nextInt();
        if (sodienTT < 50)
           tien = sodienTT*1000;
        else
            tien = 50*1000 + (sodienTT - 50)*1200;
        System.out.println("So tien phai tra: " + tien);  
    }
}
