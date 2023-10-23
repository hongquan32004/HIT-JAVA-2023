import java.util.Scanner;

public class bai3 {
     public static long quan(int a){
         long tich = 1;
         while(a != 0){
             tich *= a%10;
             a/=10;
         }
         return tich;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ: ");
        int a = sc.nextInt();
        System.out.println("Kết quả cần tìm: " + quan(a));

    }
}
