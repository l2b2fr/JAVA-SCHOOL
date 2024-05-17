/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai4 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        // Nhập danh sách các nhân viên
        System.out.print("Nhập số lượng nhân viên: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới sau khi nhập số lượng
        for (int i = 0; i < soLuong; i++) {
            NhanVien nhanVien = new NhanVien("", "", 0, 0); // Khởi tạo đối tượng nhân viên
            nhanVien.nhapThongTin(scanner); // Nhập thông tin cho nhân viên
            danhSachNhanVien.add(nhanVien); // Thêm nhân viên vào danh sách
        }

        // In ra những nhân viên có tuổi dưới 30 và thu nhập từ 500.000 trở lên
        System.out.println("Những nhân viên có tuổi dưới 30 và thu nhập từ 500.000 trở lên:");
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getTuoi() < 30 && nhanVien.getLuong() >= 500000) {
                nhanVien.xuatThongTin();
            }
        }
    }
}
