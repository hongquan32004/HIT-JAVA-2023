package bai1;

public class Student extends Person{
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

//    public Student(String name, int age, String commune, String district, String city, int id, String nameClass, float gpa) {
//        super(name, age, commune, district, city);
//        this.id = id;
//        this.nameClass = nameClass;
//        this.gpa = gpa;
//    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public boolean checkFall(){
        return getGpa()<getCriteria();
    }
    @Override
    public void input() {
        super.input();
        System.out.println("<=============Students==============>");
        System.out.print("Nhập ID : ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập name of class : ");
        setNameClass(sc.nextLine());
        System.out.print("Nhập GPA : ");
        setGpa(sc.nextFloat());
        sc.nextLine();
    }
    @Override
    public void output() {
        super.output();
        System.out.printf("%-10d %-15s %-11.2f" , this.id , this.nameClass , this.gpa);
        if(checkFall()){
            System.out.printf("%-10s\n" , "Fall");
        }
        else{
            System.out.printf("%-10s\n" , "Pass");
        }
    }

}
