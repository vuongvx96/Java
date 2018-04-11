/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean ok = true;
        int N;
        System.out.println("Nhap vao so nguyen N: ");
        N = scanner.nextInt();
        if (N < 2)
            ok = false;
        for (int i = 2; i < N-1; i++){
            if (N % i == 0){
                ok = false;
                break;
            }
        i++;
        }
        if (ok == true)
            System.out.println(N + " la so nguyen to.");
        else
            System.out.println(N + " khong la so nguyen to.");
    }   
}
