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
public class Bai3 {
    public static void main(String[] args){
        double V = 0, a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao do dai canh cua khoi lap phuong: ");
        a = scanner.nextDouble();
        V = Math.pow(a,3);
        System.out.println("The tich: " + V);
    }
}
