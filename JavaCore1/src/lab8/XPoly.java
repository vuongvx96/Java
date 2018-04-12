/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Louis
 */
public final class XPoly {
    // Bai 1. Them mot phuong thuc tinh voi tham so bien doi thuc hien tinh 
    //tong cac tham so truyen vao
    public static final double sum(double ...x){
        double sum = 0;
        for (double i: x)
            sum += i;
        return sum;
    }
    // Bai2. Them phuong thuc tinh tim so be nhat va lon nhat
    public static final double min(double ...x){
        double min = x[0];
        for (double i: x)
            min = Math.min(min, i);
        return min;
    }
    public static final double max(double ...x){
        double max = x[0];
        for (double i: x)
            max = Math.max(max, i);
        return max;
    }
    // Bai 3. Them phuong thuc In hoa chu cai dau tien cua moi tu
    public static final String toUpperFirstChar(String s){
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++){
            char firstChar = words[i].charAt(0);
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String ss = String.join(" ", words);
        return ss;
    }
    // Chuong trinh chinh
    public static void main(String[] args){
        // Demo day 7.6; 8.9; 0.5
        System.out.println("Tong cua cac so: " + XPoly.sum(7.6,8.9,0.5));
        System.out.println("Min trong day: " + XPoly.min(7.6,8.9,0.5));
        System.out.println("Max trong day: " + XPoly.max(7.6,8.9,0.5));
        System.out.println("In hoa chu cai dau moi tu: " + XPoly.toUpperFirstChar("vo xuan vuong"));
    }
}
