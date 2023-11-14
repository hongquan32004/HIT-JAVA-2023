package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static {
        // id, tenSach, namXuatBan, theLoai , tenTacGia , namSinh
        Sach[] book = new Sach[4];
        book[0] = new Sach("Shin", 1990, "Thiếu nhi ", " Usui Yoshito", 1979);
        book[1] = new Sach("Conan", 1994, "Trinh thám ", "Aoyama Gosho", 1963);
        book[2] = new Sach("Doremon", 1970, "Thiếu nhi ", "Fujio", 1933);
        book[3] = new Sach("MESSI", 2023, "Huyền thoại", "Me", 1996);
    }
    public static void menu(){
        boolean chay = true;
        Scanner sc = new Scanner(System.in);
        Sach sach[] = new Sach[10000];
        int n = 0;
        while (chay){
            System.out.println("<================menu================>");
            System.out.println("1.Nhập vào thông tin cuốn sách.");
            System.out.println("2.In ra thông tin các cuốn sách.");
            System.out.println("3.Tìm kiếm sách theo tên.");
            System.out.println("4.Sắp xếp lại các cuốn sách đã nhập theo tên tác giả.");
            System.out.print("CHỌN: ");
            int chon = sc.nextInt();
            if(chon == 1){
                Sach sachs = new Sach();
                sachs.input();
                sach[n] = sachs;
                n++;
            }
            else if(chon == 2){
                for(int i = 0;i < n;i++){
                    sach[i].output();
                }
            }
            else if(chon == 3){
                System.out.print("Nhập tên sách cần tìm:");
                sc.nextLine();
                String name = sc.nextLine();
                for(int i = 0;i<n;i++){
                    if(name.equals(sach[i].getTenSach())){
                        sach[i].output();
                    }
                }
            }
            else if(chon == 4){

            }
            else if(chon == 5){
                chay = false;
                System.out.println("Thoát menu.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}