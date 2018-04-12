/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai3 {
    public static void main(String[] args){
        ArrayList<SinhVien> DSSV = new ArrayList<SinhVien>();
        for (int i = 0; i < 5; i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            DSSV.add(sv);
        }    
    }
}  
class SinhVien{
    String hoTen, email, dienThoai, cmnd;
    public void nhap(){
        System.out.println("------------------------");
        String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        String regexSDT = "(\\+84|0)\\d{9,10}";
        String regexID = "[0-9]{10}";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = scanner.nextLine();
        do{
            System.out.print("Email: ");
            email = scanner.nextLine();
        }
        while(email.matches(regexEmail) == false);
        do{
            System.out.print("Dien thoai: ");
            dienThoai = scanner.nextLine();
        }
        while(dienThoai.matches(regexSDT) == false);
        do{
            System.out.print("So CMND: ");
            cmnd = scanner.nextLine();
        }
        while(cmnd.matches(regexID));
    }
    
}
