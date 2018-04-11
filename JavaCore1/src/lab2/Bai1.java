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
public class Bai1 {
    public static void main(String[] args) {
        // Giai phuong trinh bac nhat ax + b = 0
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
}
