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
public class Bai2 {
    public static void main(String[] args) {
        // Giai phuong trinh bac 2 ax^2 + bx + c = 0
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
}
