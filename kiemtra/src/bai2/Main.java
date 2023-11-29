package bai2;

import java.util.Scanner;

public class Main {
    static StudentServiceImpl st = new StudentServiceImpl();
    static Student std ;
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        boolean chay = true;
        while (chay){
            System.out.println("1.Thêm sinh viên vào danh sách.");
            System.out.println("2.Xóa sinh viên theo id.");
            System.out.println("3.Tìm sinh viên theo id.");
            System.out.println("4.Sắp xếp danh sách sinh viên theo score giảm dần.");
            System.out.println("5.Hiện thị danh sách. ");
            System.out.println("6.Kết thúc chương trình.");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            if(chon == 1){
                st.addStudent(std);
            }
            else if(chon == 2){
                System.out.print("Nhập id của một sinh viên bất kì: ");
                int id = sc.nextInt();
                st.deleteStudent((int) id);
            }
            else if(chon == 3){

            }
            else if( chon == 4){

            }
            else if(chon == 5){
                st.showAllStudent();
            }
            else if(chon == 6){
                chay = false;
                System.out.println("Kết thúc chương trình.");
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
