/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi3;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai8 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập vào số N: ");
        n = scanner.nextInt();

        int S1 = 0;
        for (int i = 1; i <= n; i++) {
            S1 += i;
        }
        System.out.println("S1: " + S1);

        double S2 = 0;
        for (int i = 1; i <= n; i++) {
            S2 += 1.0 / i;
        }
        System.out.println("S2: " + S2);

        int S3 = 0;
        for (int i = 1; i <= n; i++) {
            S3 = (int) Math.pow(i, i);
        }
        System.out.println("S3: " + S3);

        long S4 = 1;
        for (int i = 1; i <= n; i++) {
            S4 = S4 * i;
        }
        System.out.println("S4: " + S4);

        long S5 = 1;
        for (int i = 1; i <= n; i++) {
            long gt = giaiThua(i);
            S5 = (long) (S5 + (1.0 / gt)); // Chuyển 1 thành 1.0 để thực hiện phép chia thực
        }
    }

    private static long giaiThua(int a) {
        long giaiThua = 1; // Khởi tạo giaiThua bằng 1
        for (int i = 1; i <= a; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }
}
