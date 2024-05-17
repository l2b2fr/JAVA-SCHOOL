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
public class bai5 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Chuẩn hoá chuỗi
        String normalizedString = chuanHoaChuoi(input);

        // In ra chuỗi đã được chuẩn hoá
        System.out.println("Chuỗi đã được chuẩn hoá: " + normalizedString);
    }

    // Hàm chuẩn hoá chuỗi
    public static String chuanHoaChuoi(String str) {
        // Loại bỏ các dấu cách thừa
        str = str.trim().replaceAll("\\s+", " ");

        // Chuyển đổi ký tự đầu mỗi từ thành chữ hoa và các ký tự khác thành chữ thường
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(word.substring(0, 1).toUpperCase()); // Chuyển ký tự đầu tiên thành chữ hoa
                result.append(word.substring(1).toLowerCase()); // Chuyển các ký tự còn lại thành chữ thường
                result.append(" "); // Thêm dấu cách giữa các từ
            }
        }
        return result.toString().trim(); // Loại bỏ dấu cách ở đầu và cuối chuỗi
    }
}
