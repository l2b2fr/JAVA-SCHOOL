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
public class bai8 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        // Nhập ký tự từ bàn phím
        System.out.print("Nhập ký tự: ");
        char kyTu = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự trong chuỗi
        int count = demSoLanXuatHien(str, kyTu);

        // In ra kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' trong chuỗi là: " + count);
    }

    public static int demSoLanXuatHien(String str, char kyTu) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        return count;
    }
}
