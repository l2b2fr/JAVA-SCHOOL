/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai5 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSinhVien = scanner.nextInt();

        // Nhập thông tin cho từng sinh viên
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("\nThông tin sinh viên thứ " + (i + 1));
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhapThongTin();
            danhSachSinhVien.add(sinhVien);
        }

        // In danh sách sinh viên
        System.out.println("\nDanh sách sinh viên:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            sinhVien.xuatThongTin();
            System.out.println("------------------------");
        }

        // Tìm và in thông tin sinh viên có năm nhập học gần nhất
        int namNhapHocGanNhat = danhSachSinhVien.get(0).getNamNhapHoc(); // Assuming the first student has the latest enrollment year
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getNamNhapHoc() > namNhapHocGanNhat) {
                namNhapHocGanNhat = sinhVien.getNamNhapHoc();
            }
        }

        System.out.println("\nSinh viên có năm nhập học gần nhất:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getNamNhapHoc() == namNhapHocGanNhat) {
                sinhVien.xuatThongTin();
            }
        }
    }
}
