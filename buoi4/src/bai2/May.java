package bai2;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public May() {
    }

    public int getMaMay() {
        return maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhập mã máy: ");
        setMaMay(sc.nextInt());
        System.out.print("Nhập kiểu máy: ");
        sc.nextLine();
        setKieuMay(sc.nextLine());
        System.out.print("Nhập tình trạng: ");
        setTinhTrang(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Mã máy: " + getMaMay() + ", Kiểu máy: " + getKieuMay() + ", Tình trạng: " + getTinhTrang());
    }
}
