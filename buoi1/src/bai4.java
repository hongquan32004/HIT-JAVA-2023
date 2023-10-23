import java.util.Scanner;

public class bai4 {
    public static void quan(int a,int b,char op){
        if(op == '+'){
            System.out.println("Kết quả là: "+ (a + b));
        }
        else if(op == '-'){
            System.out.println("Kết quả là: "+ (a - b));
        } else if (op == '*') {
            System.out.println("Kết quả là: "+ (a * b));
        }
        else if(op == '/'){
            System.out.println("Kết quả là: "+ (a / b));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các số:");
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        quan(a, c, b);
    }
}
