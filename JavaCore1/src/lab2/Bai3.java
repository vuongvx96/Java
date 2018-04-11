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
public class Bai3 {
    public static void main(String[] args){
        // Tinh tien dien
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
