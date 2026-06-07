import java.util.Scanner;

public class bai64 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang (1-12): ");
        int month = sc.nextInt();

        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        int days = 0;

        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;

            case 4: case 6: case 9: case 11:
                days = 30;
                break;

            case 2:
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                System.out.println("Thang khong hop le!");
                return;
        }

        System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");

        sc.close();
    }
}