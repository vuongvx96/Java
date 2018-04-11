/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Louis
 */
public class Bai2 {
    public static void main(String[] args){
        for (int i = 1; i <=9; i++){
            System.out.println("Bang nhan " + i + ":");
            for (int j = 1; j <= 10; j++)
                System.out.printf("%d x %d = %d\n", i,j,i*j);
        }
    }
}
