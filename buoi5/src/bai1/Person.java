package bai1;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address address = new Address();

//    public Person(String name, int age, String commune, String district, String city) {
//        this.name = name;
//        this.age = age;
//        address.setCommune(commune);
//        address.setDistrict(district);
//        address.setCity(city);
//    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("Nhập name: ");
        setName(sc.nextLine());
        System.out.print("Nhập age: ");
        setAge(sc.nextInt());
        System.out.println("<============Address============>");
        sc.nextLine();
        address.input();
    }
    public void output(){
        System.out.printf("%-20s %-10d" , this.name , this.age);
        address.output();
    }
}
