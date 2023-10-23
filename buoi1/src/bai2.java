import java.util.Scanner;
public class bai2 {
    public static void doiCoSo(int n,int base){
        if(n>=base) doiCoSo(n / base, base);
        if(n % base>9) System.out.printf("%c",n%base+55);
        else
            System.out.print((n % base));
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap n");
            int n = sc.nextInt();
            System.out.println("Nhap vao co so can chuyen sang b");
            int b = sc.nextInt();
            System.out.println("So " +n+ " chuyen sang co so " +b+ " thanh: ");
            doiCoSo(n,b);
        }
}
