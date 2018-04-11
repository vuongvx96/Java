/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Louis
 */
public class Program {
    public static void main(String[] args){
        SanPham sp1, sp2;
        sp1 = new SanPham("Nokia 3",3990000,25);
        sp2 = new SanPham("Samsung J7+",8990000);
        sp1.xuat();
        sp2.xuat();
    }
}
