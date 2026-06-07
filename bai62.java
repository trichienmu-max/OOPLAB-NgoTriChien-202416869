import java.util.Scanner;

public class bai62 {
    public static void main(String[] args) {

        // Tao doi tuong Scanner de nhap tu ban phim
        Scanner keyboard = new Scanner(System.in);

        // Nhap ten
        System.out.print("What's your name? ");
        String strName = keyboard.nextLine();

        // Nhap tuoi
        System.out.print("How old are you? ");
        int iAge = keyboard.nextInt();

        // Nhap chieu cao
        System.out.print("How tall are you (m)? ");
        double dHeight = keyboard.nextDouble();

        // In ket qua
        System.out.println("Mr/Ms. " + strName + ", " + iAge + " years old.");
        System.out.println("Your height is " + dHeight + " m.");

        keyboard.close();
    }
}