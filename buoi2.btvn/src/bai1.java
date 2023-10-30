import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f[] = new int[10000];
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] =sc.nextInt();
            f[a[i]]++;
        }
        Arrays.sort(a);
        int b = 0;
        for(int i = 0;i < n-1;i++){
            if(f[a[i]] < f[a[i + 1]]){
                b = a[i + 1];
            }
        }
        System.out.println( b + " " +f[b]);
    }
}
