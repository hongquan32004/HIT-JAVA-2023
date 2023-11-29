package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService{
    public StudentServiceImpl() {
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<Student> std = new ArrayList<>();
    @Override
    public void addStudent(Student t) {
        Student st = new Student();
        st.nhap();
        std.add(st);
    }

    @Override
    public void deleteStudent(int id) {
        for (Student x:std) {
            if(x.getId() == id)
                std.remove(x);
        }

    }

    @Override
    public void searchStudent(String name) {
        for(int i = 0;i<std.size();i++){

        }
    }

    @Override
    public void sortedStudent() {

    }

    @Override
    public void showAllStudent() {
        for(Student s: std){
            s.xuat();
        }
    }
}
