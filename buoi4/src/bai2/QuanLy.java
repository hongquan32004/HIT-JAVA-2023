package bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String tenQL;

    public QuanLy() {
    }

    public QuanLy(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public String getMaQL() {
        return maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhập mã quản lý: ");
        setMaQL(sc.nextLine());
        System.out.print("Nhập tên quản lý: ");
        setTenQL(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Mã quản lý: " + getMaQL() + ", Tên quản lý: " + getTenQL());
    }
}
