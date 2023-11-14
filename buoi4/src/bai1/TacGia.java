package bai1;

import java.util.Scanner;

public class TacGia {
    private String tenTacGia;
    private int namSinh;
    //constructor
    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public TacGia() {
    }

    //getter
    public String getTenTacGia() {
        return tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }
    //setter

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "Tên tác giả: " + getTenTacGia() + " - Năm sinh: " + getNamSinh() ;
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("Nhập tên tác giả: ");
        setTenTacGia(sc.nextLine());
        System.out.print("Nhập năm sinh của tác giả: ");
        setNamSinh(sc.nextInt());
    }
    public void output(){
        System.out.println(toString());
    }
}
