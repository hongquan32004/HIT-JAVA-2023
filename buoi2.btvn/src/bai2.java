import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        long f[] = new long[n];
        for(int i = 0;i< n;i++){
            if(i == 0){
                f[0] = a[0];
            }
            else{
                f[i] = f[i- 1] + a[i];
            }
        }
        int b = sc.nextInt();
        while(b > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l == 1){
                System.out.println(f[r - 1]);
            }
            else{
                System.out.println(f[r- 1] - f[l-2]);
            }
            b--;
        }
    }
}
