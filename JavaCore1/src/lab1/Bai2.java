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
public class Bai2 {
    public static void main(String[] args){
        double dai = 0, rong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài HCN: ");
        dai = scanner.nextDouble();
        System.out.print("Chiều rộng HCN: ");
        rong = scanner.nextDouble();
        System.out.println("Chu vi HCN: " + (dai+rong)*2);
        System.out.println("Dien tich HCN: " + dai*rong);
        System.out.println("Canh nho nhat: " + Math.min(dai, rong));
    }
}
