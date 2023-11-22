package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
    private static ArrayList<Student> std = new ArrayList<>();

    public static void inputList() {
        boolean go=true;
        while(go==true) {
            Student student= new Student();
            student.input();
            std.add(student);
            if (student.getId()== 555) go=false;
        }
    }

    public static void outputList() {
        System.out.printf("%-20s %-10s %-10s %-13s %-10s %-10s %-15s %-10s %-10s\n", "Name", "Age", "Commune", "District", "City", "ID", "Name Class", "GPA" ,"Note");
        for (Student x : std) {
            x.output();
        }
    }
    public static void sortByGpa() {
        Collections.sort(std, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.getGpa() < b.getGpa())
                    return -1;
                else
                    return 1;
            }
        }
        );
    }
    public static boolean removeByID(Scanner scan, Student student, int removeID) {
        if (student.getId() == removeID) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean chay = true;
        while(chay){
            System.out.println("\n<================== Menu ================>");
            System.out.println("1. Nhập thông tin các sinh viên.");
            System.out.println("2. In ra thông tin các Sinh Viên theo dạng bảng.");
            System.out.println("3. Sắp xếp danh sách sinh viên theo điểm gpa");
            System.out.println("4. Xóa sinh viên theo id");
            System.out.println("5. Thoát chương trình");
            System.out.print("Chọnnnnnnn : ");
            int chon = sc.nextInt();
            sc.nextLine();
            if(chon == 1){
                inputList();
            }
            else if(chon == 2){
                outputList();
            }
            else if(chon == 3){
                sortByGpa();
                System.out.println("Đã xắp xếp xong.");
            }
            else if(chon == 4){
                System.out.print("ID của sinh viên cần xóa: ");
                int id = sc.nextInt();
                sc.nextLine();
                for(int i = 0;i<std.size();i++){
                    if(removeByID(sc,std.get(i),id) == true){
                        std.remove(std.get(i));
                    }
                }
            }
            else if(chon == 5){
                System.out.println("Thoát.");
                chay = false;
            }
        }
    }
}
