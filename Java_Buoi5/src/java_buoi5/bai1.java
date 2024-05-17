/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi5;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai1 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;

        // Nhập số a từ bàn phím và xử lý ngoại lệ
        boolean isValidInputA = false;
        while (!isValidInputA) {
            try {
                System.out.print("Nhập số a: ");
                a = Integer.parseInt(scanner.nextLine());
                isValidInputA = true;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại số nguyên.");
            }
        }

        // Nhập số b từ bàn phím và xử lý ngoại lệ
        boolean isValidInputB = false;
        while (!isValidInputB) {
            try {
                System.out.print("Nhập số b: ");
                b = Integer.parseInt(scanner.nextLine());
                isValidInputB = true;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại số nguyên.");
            }
        }

        // Tìm ước số chung lớn nhất (UCLN) của a và b
        int ucln = timUCLN(a, b);
        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + ucln);
    }

    // Hàm tìm ước số chung lớn nhất của 2 số a và b sử dụng vòng while
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
