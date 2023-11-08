import java.util.Scanner;

public class Vegetable {
    private String id;
    private String name;
    private String unit;
    private int quantitySold;
    private int sale;
    private double price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public int getSale() {
        return sale;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vegetable() {
    }

    public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.sale = sale;
        this.price = price;
    }
    public double getTotalRevenue(){
        double Revenue;
        return Revenue = quantitySold * (price*(100 - sale));
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một loại rau củ: ");
        System.out.print("ID: ");
        setId(sc.nextLine());
        System.out.print("Name: ");
        setName(sc.nextLine());
        System.out.print("Unit: ");
        setUnit(sc.nextLine());
        System.out.print("QuantitySold: ");
        setQuantitySold(sc.nextInt());
        System.out.print("Sale: ");
        setSale(sc.nextInt());
        System.out.print("Price: ");
        setPrice(sc.nextDouble());
    }
    public void display(){
        System.out.printf("%-4s%-15s%-10s%-15s%-6s%-15s%-15s\n",id, name, unit,quantitySold,sale,price,getTotalRevenue());
    }
}
