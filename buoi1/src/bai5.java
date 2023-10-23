import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các giá trị: " );
        for(int i = 0 ; i < 5 ; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Kết quả là: " + a[3] +" "+ a[4]);

    }
}
