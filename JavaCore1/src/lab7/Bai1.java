/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Louis
 */
public class Bai1 {
    public static void main(String[] args){
        ChuNhat cn = new ChuNhat(5, 3);
        Vuong vu = new Vuong(5);
        cn.xuat();
        vu.xuat();
    }
}

class ChuNhat{
    double dai, rong;
    public double getChuVi(){
        return (dai + rong)*2;
    }
    public ChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }
    public double getDienTich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("Dai: "+dai+", Rong: "+rong+", Chu vi: "+getChuVi()+", Dien tich: "+getDienTich());
    }
}

class Vuong extends ChuNhat{
    
    public Vuong(double canh) {
        super(canh,canh);
    }
    public void xuat(){
        System.out.println("Canh: "+dai+", Chu vi: "+getChuVi()+", Dien tich: "+getDienTich());
    }
    
}
