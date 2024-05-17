/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi3;

/**
 *
 * @author LEMINHNAM
 */
public class bai7 {

    public static void run() {
        // Vòng lặp for chạy từ 100 đến 999
        for (int i = 100; i <= 999; i++) {
            int demUocSo = 0; // Biến đếm số ước số

            // Vòng lặp for lồng nhau để kiểm tra ước số
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    demUocSo++; // Tăng biến đếm số ước số
                }
            }

            // Kiểm tra số lượng ước số và hiển thị kết quả
            if (demUocSo >= 20) {
                System.out.println(i + " có " + demUocSo + " ước số");
            }
        }
    }
}
