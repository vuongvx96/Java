/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai4 {
     public static void main(String[] args){
         double a=0, b=0, c=0, Delta=0;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhap vao cac he so cua phuong trinh bac 2");
         System.out.print("Nhap vao a = ");
         a = scanner.nextDouble();
         System.out.print("Nhap vao b = ");
         b = scanner.nextDouble();
         System.out.print("Nhap vao c = ");
         c = scanner.nextDouble();
         Delta = Math.pow(b, 2) - 4*a*c;
         System.out.println("Can Delta = " + Math.sqrt(Delta));
     }
}
