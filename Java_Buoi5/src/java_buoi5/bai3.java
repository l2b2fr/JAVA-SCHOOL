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
public class bai3 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Đếm số lượng ký tự in hoa trong chuỗi
        int countUpperCase = demKyTuInHoa(input);

        // In ra kết quả
        System.out.println("Số lượng ký tự in hoa trong chuỗi là: " + countUpperCase);
    }

    // Hàm đếm số lượng ký tự in hoa trong chuỗi
    public static int demKyTuInHoa(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
}
