package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    QuanLy x = new QuanLy();
    May y = new May();
    ArrayList<May> mays= new ArrayList<>();
    private int n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, String maQL, String tenQL, int maMay, String kieuMay, String tinhTrang) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        x.setMaQL(maQL);
        x.setTenQL(tenQL);
        y.setMaMay(maMay);
        y.setKieuMay(kieuMay);
        y.setTinhTrang(tinhTrang);
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public May getY() {
        return y;
    }

    public int getN() {
        return n;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public void setY(May y) {
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("ENTER 1 cái đầu thôi mấy cái sau nhập mã phòng luôn nhé :))");
        sc.nextLine();
        System.out.print("Nhập mã phòng: ");
        setMaPhong(sc.nextLine());
        System.out.print("Nhập tên phòng: ");
        setTenPhong(sc.nextLine());
        x.nhap();
        System.out.print("Nhập n: ");
        setN(sc.nextInt());
        mays.clear();
        for(int i = 0;i<n;i++){
            May may = new May();
            may.nhap();
            mays.add(may);
        }
    }
    public void xuat(){
        System.out.println("Mã Phòng: " + getMaPhong() + ", Tên Phòng: " + getTenPhong());
        x.xuat();
        System.out.println("Số máy trong phòng: " + getN())  ;
        for(May i : mays){
            i.xuat();
        }
    }
}
