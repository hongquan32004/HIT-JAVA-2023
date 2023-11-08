import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Menu(){
        Scanner sc = new Scanner(System.in);
        Vegetable[] vg = new Vegetable[100001];
        int n = 0;
        boolean chay = true;
        while (chay){
            System.out.println("+.........................................................+");
            System.out.println("1. Nhập 1 loại rau củ mới. ");
            System.out.println("2. Hiển thị danh sách rau củ theo định dạng. ");
            System.out.println("3. Sắp xếp rau củ theo thứ tự số tiền thu được tăng dần. ");
            System.out.println("4. Nhóm các rau củ theo đơn vị tính. ");
            System.out.println("5. Tìm kiếm rau củ theo tên. ");
            System.out.println("6. Thoát menu.");
            System.out.println("+..........................................................+");

            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            if(chon == 1){
                Vegetable v = new Vegetable();
                v.Input();
                int check = 0;
                for(int i = 1;i<=n;i++){
                    if(v.getId().equals(vg[i].getId())){
                        check = 1;
                        break;
                    }
                }
                if(check == 0){
                    n++;
                    vg[n] = v;
                }
                else{
                    System.out.println("Bạn nhập sai rùiiiiii,hãy nhập lại");
                    check = 0;
                }
            }
            else if(chon == 2){
                System.out.printf("%-4s%-15s%-10s%-15s%-6s%-15s%-15s%n","Id","Name","Unit","Quantity sold","Sale", "Price","Revenue");
                for(int i = 1;i<=n;i++){
                    vg[i].display();
                }
            }
            else if (chon == 3) {
                for(int i = 1;i<=n;i++){
                    for(int j = i + 1;j <= n;j++){
                        if(vg[i].getTotalRevenue()>vg[j].getTotalRevenue()){
                              Vegetable tmp = vg[i];
                              vg[i] = vg[j];
                              vg[j] = tmp;
                        }
                    }
                }
                System.out.println("Đã sắp xếp xong");
            }
            else if(chon == 4){
                for(int i = 1;i<=n;i++){
                    for(int j = i + 1;j<=n;j++){
                        if(vg[i].getPrice() > vg[j].getPrice() && vg[i].getUnit().equals(vg[j].getUnit())){
                            Vegetable tmp = vg[i];
                            vg[i] = vg[j];
                            vg[j] = tmp;
                        }
                    }
                }
                System.out.println("Đã sắp xếp xong");
            }
            else if(chon == 5){
                System.out.print("Nhập tên một loại rau củ: " );
                String name = sc.nextLine();
                System.out.printf("%-4s%-15s%-10s%-15s%-6s%-15s%-15s%n","Id","Name","Unit","Quantity sold","Sale", "Price","Revenue");
                for(int i = 1;i<=n;i++){
                    if(name.equals(vg[i].getName())){
                        vg[i].display();
                    }
                }
            }
            else if(chon == 6){
                System.out.println("EXIT");
                chay = false;
            }
        }

    }
    public static void main(String[] args) {
        Menu();
    }
}