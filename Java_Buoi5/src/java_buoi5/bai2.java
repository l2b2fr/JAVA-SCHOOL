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
public class bai2 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        double distance = 0;

        // Nhập số km từ bàn phím và xử lý ngoại lệ
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                System.out.print("Nhập số km đi được: ");
                distance = Double.parseDouble(scanner.nextLine());
                if (distance <= 0) {
                    throw new IllegalArgumentException();
                }
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại số km là một số.");
            } catch (IllegalArgumentException e) {
                System.out.println("Vui lòng nhập lại số km lớn hơn 0.");
            }
        }

        // Tính tiền đi taxi
        double totalFare = tinhTienTaxi(distance);
        System.out.println("Tiền đi taxi Mai Linh: " + totalFare + "đ");
    }

    // Hàm tính tiền taxi dựa trên số km đi được
    public static double tinhTienTaxi(double distance) {
        double totalFare = 0;

        // Giá mở cửa
        totalFare += 14000;

        // Tiếp theo đến 25km
        if (distance > 0.8 && distance <= 25) {
            totalFare += (distance - 0.8) * 16300;
        } // Từ km thứ 26
        else if (distance > 25) {
            totalFare += (25 - 0.8) * 16300 + (distance - 25) * 13300;
        }
        return totalFare;
    }
}
