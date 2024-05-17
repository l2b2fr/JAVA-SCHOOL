/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai5 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DoiBong> danhSachDoiBong = new ArrayList<>();

        // Nhập danh sách các đội bóng
        System.out.print("Nhập số lượng đội bóng: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới sau khi nhập số lượng
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin đội bóng thứ " + (i + 1) + ":");
            DoiBong doiBong = new DoiBong("", 0, 0, 0); // Khởi tạo đối tượng đội bóng
            doiBong.nhapThongTin(scanner); // Nhập thông tin cho đội bóng
            danhSachDoiBong.add(doiBong); // Thêm đội bóng vào danh sách
        }

        // Tìm đội bóng có số điểm cao nhất
        int diemCaoNhat = Integer.MIN_VALUE;
        DoiBong doiBongCaoNhat = null;
        for (DoiBong doiBong : danhSachDoiBong) {
            if (doiBong.getDiem() > diemCaoNhat) {
                diemCaoNhat = doiBong.getDiem();
                doiBongCaoNhat = doiBong;
            }
        }

        // In ra đội bóng có số điểm cao nhất
        System.out.println("Đội bóng có số điểm cao nhất:");
        if (doiBongCaoNhat != null) {
            doiBongCaoNhat.xuatThongTin();
        }
    }
}
