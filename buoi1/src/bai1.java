import java.util.Scanner;

public class bai1 {
    public static int GCD(int a,int b) {
        if(b == 0){
            return a;
        }
        else{
            return GCD(b,a%b);
        }
    }
    public static int BCNN(int a, int b){
        int k = a * b;
        int q = GCD(a,b);
        return k/q;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int q = GCD(a,b);
        int t = BCNN(a,b);
        System.out.println("Ước chung lớn nhất của 3 số là: " + GCD(q,c));
        System.out.println("Bội chung nhỏ  của 3 số là: " + BCNN(t,c));
    }
}
