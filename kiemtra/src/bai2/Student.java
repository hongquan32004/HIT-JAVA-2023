package bai2;

import java.util.Scanner;

public class Student extends Person{
    private double score;

    public Student() {

    }

    public Student(int id, String name, short age, Address address, double score) {
        super(id, name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }


    @Override
    public String getCapacity() {
        if(score >= 9.0){
            return "Học lực xuất sắc";
        }
        else if( 8.0 <= score && score< 9.0 ){
            return "Học lực giỏi";
        }
        else if(score >= 6.5 && score< 9){
            return "Học lực khá";
        }
        else if(score < 6.5){
            return "Học lực trung bình yếu";
        }
        return "Quá kém";
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập số điểm của sinh viên: ");
        setScore(sc.nextDouble());
    }
    public void xuat(){
        System.out.print("ID: " + getId()+ " ,Name: " + getName() + " ,Age: " + getAge()+ "Score: " + getScore() + " ,Capacity: " + getCapacity());
        System.out.println();
    }
}
