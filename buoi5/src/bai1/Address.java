package bai1;

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public Address() {
    }

    public String getCommune() {
        return commune;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("Nhập commune: ");
        setCommune(sc.nextLine());
        System.out.print("Nhập district: ");
        setDistrict(sc.nextLine());
        System.out.print("Nhập city: ");
        setCity(sc.nextLine());
    }
    public void output(){
        System.out.printf("%-12s %-13s %-10s" , this.commune , this.district , this.city);
    }
}
