import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    private ArrayList<Subject> subjects = new ArrayList<>();

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void displaySubjects() {
        System.out.println("Danh sach cac mon hoc:");
        for (Subject subject : subjects) {
            System.out.println("Mon hoc " + subject.getSubjectName() + " bat dau luc " + subject.getTimeStart() + " va ket thuc luc " + subject.getTimeEnd());
        }
    }

    public void sortSubjects() {
        Collections.sort(subjects, (a, b) -> {
            String timeA = a.getTimeEnd();
            String timeB = b.getTimeEnd();
            int hourA = Integer.parseInt(timeA.split(":")[0]);
            int hourB = Integer.parseInt(timeB.split(":")[0]);
            int minuteA = Integer.parseInt(timeA.split(":")[1]);
            int minuteB = Integer.parseInt(timeB.split(":")[1]);
            if (hourA == hourB) {
                return minuteA - minuteB;
            }
            return hourA - hourB;
        });
    }

    public void selectSubjects() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap khoang thoi gian bat dau: ");
        String start = scanner.nextLine();
        System.out.print("Nhap khoang thoi gian ket thuc: ");
        String end = scanner.nextLine();
        int maxSubjects = 0;
        for (Subject subject : subjects) {
            String timeStart = subject.getTimeStart();
            String timeEnd = subject.getTimeEnd();
            int hourStart = Integer.parseInt(timeStart.split(":")[0]);
            int hourEnd = Integer.parseInt(timeEnd.split(":")[0]);
            int minuteStart = Integer.parseInt(timeStart.split(":")[1]);
            int minuteEnd = Integer.parseInt(timeEnd.split(":")[1]);
            if (hourStart >= Integer.parseInt(start.split(":")[0]) && hourEnd <= Integer.parseInt(end.split(":")[0])) {
                if (maxSubjects == 0) {
                    System.out.println("Cac mon hoc co the hoc trong khoang thoi gian nay la:");
                }
                System.out.println(subject.getSubjectName());
                maxSubjects++;
            }
        }
        if (maxSubjects == 0) {
            System.out.println("Khong co mon hoc nao co the hoc trong khoang thoi gian nay.");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu quan ly tiet hoc:");
            System.out.println("1. Nhap 1 tiet hoc moi.");
            System.out.println("2. Hien thi danh sach tiet hoc.");
            System.out.println("3. Sap xep cac mon hoc theo thoi gian ket thuc tang dan.");
            System.out.println("4. Lua chon mon hoc.");
            System.out.println("5. Thoat menu.");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhap id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap ten mon hoc: ");
                    String subjectName = scanner.nextLine();
                    System.out.print("Nhap so luong sinh vien: ");
                    int studentCount = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap thoi gian bat dau (theo dinh dang HH:mm): ");
                    String timeStart = scanner.nextLine();
                    System.out.print("Nhap thoi gian ket thuc (theo dinh dang HH:mm): ");
                    String timeEnd = scanner.nextLine();
                    Subject subject = new Subject(id, subjectName, studentCount, timeStart, timeEnd);
                    main.addSubject(subject);
                    System.out.println("Da them tiet hoc moi thanh cong.");
                    break;
                case 2:
                    main.displaySubjects();
                    break;
                case 3:
                    main.sortSubjects();
                    System.out.println("Da sap xep cac mon hoc theo thoi gian ket thuc tang dan.");
                    break;
                case 4:
                    main.selectSubjects();
                    break;
                case 5:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice != 5);
    }
}