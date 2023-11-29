package bai2;

import java.util.Scanner;

public class Address {
    private String district;
    private String city;

    public Address() {
    }

    public Address(String district, String city) {
        this.district = district;
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhập district: ");
        setDistrict(sc.nextLine());
        System.out.print("Nhập city: ");
        setCity(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Address{" +
                "district='" + district + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    public void xuat(){
        System.out.print(" ,district: " + getDistrict() + " ,city: " + getCity());
    }
}
