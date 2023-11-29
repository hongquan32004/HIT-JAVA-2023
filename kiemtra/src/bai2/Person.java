package bai2;

import java.util.Scanner;

public abstract class Person {
    public static int count = 0;

    private int id;
    private String name;
    private short age;
    private Address address = new Address();

    public Person() {
        id = count++;
    }

    public Person(int id, String name, short age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public abstract String getCapacity();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhập tên sinh viên: ");
        setName(sc.nextLine());
        System.out.print("Nhập tuổi sinh viên: ");
        setAge(sc.nextShort());
        System.out.print("<=======Nhập địa chỉ của sinh viên=====>");
        address.nhap();
    };
}
