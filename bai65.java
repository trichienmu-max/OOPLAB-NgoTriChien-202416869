import java.util.Scanner;
import java.util.Arrays;

public class bai65 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu " + i + ": ");
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        double sum = 0;
        for (double x : arr) {
            sum += x;
        }

        double avg = sum / n;

        System.out.println("Mang sau khi sap xep:");
        for (double x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("\nTong: " + sum);
        System.out.println("Trung binh: " + avg);

        sc.close();
    }
}