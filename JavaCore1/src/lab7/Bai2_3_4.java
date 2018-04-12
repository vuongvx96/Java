/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Louis
 */
public class Bai2_3_4 {
    static ArrayList<SinhVienIT> DSSV = new ArrayList<SinhVienIT>();
    static Scanner scanner = new Scanner(System.in);
    public static Comparator<SinhVienIT> comp = new Comparator<SinhVienIT>(){
        @Override
        public int compare(SinhVienIT sv1, SinhVienIT sv2) {
            if (sv1.getDiem() == sv2.getDiem())
            return 0;
            else if (sv1.getDiem() > sv2.getDiem())
                return 1;
            else
                return -1;
        } 
    };
    public static void Nhapds(ArrayList<SinhVienIT> DSSV){
        int n = 0;
        System.out.print("Nhap so luong sv: ");
        n = scanner.nextInt();
        scanner.nextLine();
        String ht, nganh;
        double dCss, dHtml, dJava;
        for (int i = 0; i < n; i++){
            System.out.println("----------Nhap thong tin SV " + (i+1));
            System.out.print("Ho ten: ");
            ht = scanner.nextLine();
            System.out.print("Nganh hoc: ");
            nganh = scanner.nextLine();
            System.out.print("Diem Java: ");
            dJava = scanner.nextDouble();
            System.out.print("Diem HTML: ");
            dHtml = scanner.nextDouble();
            System.out.print("Diem CSS: ");
            dCss = scanner.nextDouble();
            SinhVienIT sv = new SinhVienIT(ht, nganh, dJava, dCss, dHtml);
            DSSV.add(sv);
        }
    }
    public static void Xuat(ArrayList<SinhVienIT> DSSV){
        System.out.println("Danh sach sinh vien da nhap:");
        for (SinhVienIT x: DSSV)
            x.xuat();
    }
    public static void SVGioi(ArrayList<SinhVienIT> DSSV){
        System.out.println("Danh sach sinh vien Gioi:");
        for (SinhVienIT x: DSSV)
            if (x.getHocLuc().equals("Gioi"))
                x.xuat();
    }
    public static void SapXep(ArrayList<SinhVienIT> DSSV){
        Collections.sort(DSSV, comp);
        System.out.println("Danh sach sinh vien da sap xep theo diem:");
        for (SinhVienIT x: DSSV)
            x.xuat();        
    }
    public static void main(String[] args){
        Nhapds(DSSV);
        Xuat(DSSV);
        SVGioi(DSSV);
        SapXep(DSSV);
    }
}

abstract class SinhVienPoly{
    String hoTen, nganhHoc;
    SinhVienPoly(String hoTen, String nganhHoc){
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
    }
    public abstract double getDiem();
    String getHocLuc(){
        if (this.getDiem() < 5)
            return "Yeu";
        else if (this.getDiem() >= 5 && this.getDiem() < 6.5)
            return "Trung binh";
        else if (this.getDiem() >= 6.5 && this.getDiem() < 7.5)
            return "Kha";
        else if (this.getDiem() >= 7.5 && this.getDiem() < 9)
            return "Gioi";
        else
            return "Xuat sac";
    }
    void xuat(){
        System.out.println("Ho ten: "+hoTen+", Nganh hoc: "+nganhHoc+
                ", Diem: "+getDiem()+", Hoc luc: "+getHocLuc());
    } 
}

class SinhVienIT extends SinhVienPoly{
    double dJava, dHtml, dCss;
    SinhVienIT(String hoTen, String nganhHoc, double dJava, double dCss, double dHtml){
        super(hoTen,nganhHoc);
        this.dJava = dJava;
        this.dCss =  dCss;
        this.dHtml = dHtml; 
    }
    @Override
    public double getDiem(){
        return (2*dJava + dHtml + dCss)/4;
    }
}

class SinhVienBiz extends  SinhVienPoly{
    double diemMarketing, diemSales;
    SinhVienBiz(String hoTen, String nganhHoc, double diemMarketing, double diemSales){
        super(hoTen,nganhHoc);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
        return (2*diemMarketing + diemSales)/3;
    }
}
