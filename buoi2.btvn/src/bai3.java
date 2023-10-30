import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int chucai = 0;
        int so = 0;
        int kitu = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) >= 'a'&& s.charAt(i) <= 'z' || s.charAt(i) >= 'A'&& s.charAt(i) <= 'Z' ){
                chucai++;
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                so++;
            }
            else{
                kitu++;
            }
        }
        System.out.println(chucai + " " + so + " " + kitu);
    }
}
