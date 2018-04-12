/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ho va ten: ");
        String hoTen = scanner.nextLine();
        String ho = hoTen.substring(0, hoTen.indexOf(' '));
        String hoLot = hoTen.substring(hoTen.indexOf(' ') + 1,hoTen.lastIndexOf(' '));
        String ten = hoTen.substring(hoTen.lastIndexOf(' ')+1);
        System.out.println("Ho: " + ho.toUpperCase());
        System.out.println("Ho lot: " + hoLot);
        System.out.println("Ten: " + ten.toUpperCase());
    }
}
