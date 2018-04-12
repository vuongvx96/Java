/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai1 {
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<>();
        Double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao danh sach cac so thuc: ");
        while(true){
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.print("Nhap them (Y/N)? ");
            if(scanner.nextLine().equals("N") || scanner.nextLine().equals("n")){
                break;
            }
        }
        System.out.println("Danh sach vua nhap: ");
        for (Double x: list){
            System.out.printf("%.2f  ", x);
            sum += x;
        }
        System.out.println("Tong cac phan tu: " + sum);
    }   
}
