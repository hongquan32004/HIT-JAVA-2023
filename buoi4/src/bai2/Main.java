package bai2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static ArrayList<May> m= new ArrayList<>();
    private static PhongMay phongMay= new PhongMay();
    private static int n=0;
    static {
        m.add(new May(1,"Dell","Tốt"));
        m.add(new May(2,"Asus","Tốt"));
        m.add(new May(3,"Lenovo","Khá"));
        m.add(new May(4,"HP","Tệ"));
        m.add(new May(5,"Acer","Tốt"));
        QuanLy quanLy= new QuanLy("01","Liên");
        phongMay= new PhongMay("001","Lab","001","may",1,"acer","tốt");
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        boolean chay = true;
        PhongMay pm = new PhongMay();
        while (chay){
            System.out.println("<================Menu=============>");
            System.out.println("1. Nhập vào thông tin 1 phòng máy.");
            System.out.println("2. Xuất thông tin của phòng máy vừa nhập.");
            System.out.println("3. Tìm kiếm máy theo kiểu máy.");
            System.out.println("4. Tìm kiếm máy theo mã máy.");
            System.out.println("5. Thoát khỏi chương trình");
            System.out.print("CHỌN: ");
            int chon = sc.nextInt();
            if(chon == 1){
                pm.nhap();
            }
            else if(chon == 2){
                pm.xuat();
            }
            else if(chon == 3){
                System.out.print("Nhập kiểu máy cần tìm: ");
                sc.nextLine();
                String km = sc.nextLine();
                for(May i : pm.mays){
                    if(i.getKieuMay() == km){
                        i.xuat();
                    }
                }
            }
            else if(chon == 4){
                System.out.print("Nhập mã máy cần tìm: ");
                int mm = sc.nextInt();
                for(May i : pm.mays){
                    if(i.getMaMay() == mm){
                        i.xuat();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
