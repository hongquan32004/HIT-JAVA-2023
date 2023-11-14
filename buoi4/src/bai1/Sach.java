package bai1;

import java.util.Scanner;

public class Sach {
    private static int soSach = 1;
    private int id;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private TacGia x = new TacGia();


    public Sach() {
        this.id = soSach++;
    }

    public Sach(String tenSach, int namXuatBan, String theLoai, String tenTacGia, int namSinh) {
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        x.setTenTacGia(tenTacGia);
        x.setNamSinh(namSinh);

    }
    //getter


    public int getId() {
        return id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public TacGia getX() {
        return x;
    }
    //setter
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setX(TacGia x) {
        this.x = x;
    }

    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("Nhập tên sách: ");
        setTenSach(sc.nextLine());
        System.out.print("Nhập năm xuất bản: ");
        setNamXuatBan(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập thể loại: ");
        setTheLoai(sc.nextLine());
        System.out.println("<=====Nhập tác giả=====>");
        x.input();
    }
    public void output(){
        System.out.println("ID: " + getId() + ", tên sách: " + getTenSach() + ", năm xuất bản: " + getNamXuatBan() + ", thể loại: " + getTheLoai() + ", tác giả: " );
        x.output();
    }
}
