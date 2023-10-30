import java.util.Locale;
import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        char f[] = new char[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        for(int i =0;i<s.length();i++){
            f[s.charAt(i) - 'a'] = 1;
        }
        for(int i = 0;i<26;i++){
            if(f[i] == 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

