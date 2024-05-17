/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi8.bai3;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class SinhVienBiz extends SinhVien {

    private float mmt, web, diemtb;
    private static Scanner scanner = new Scanner(System.in);

    public SinhVienBiz() {
    }

    public SinhVienBiz(float mmt, float web) {
        this.mmt = mmt;
        this.web = web;
    }

    public SinhVienBiz(float mmt, float web, String masv, String hodem, String ten, String gioi) {
        super(masv, hodem, ten, gioi);
        this.mmt = mmt;
        this.web = web;
    }

    @Override //Ghi đè phương thức nhập trong class Sinh Vien
    public void nhap() {
        super.nhap();

        System.out.print("Điểm môn mạng máy tính: ");
        mmt = scanner.nextFloat();

        System.out.print("Điểm môn web: ");
        web = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Điểm môn mạng máy tính: " + mmt);
        System.out.println("Điểm môn web: " + web);
    }

    public void diemTrungBinh() {
        diemtb = (((mmt) * 3 + (web) * 4) / 7);
        System.out.println("Điểm trung bình là: " + diemtb + " điểm");
    }

    public void xepLoai() {
        if (diemtb < 5) {
            System.out.println("Xếp loại yếu");
        } else if (diemtb >= 5 && diemtb < 6.5) {
            System.out.println("Xếp loại trung bình");
        } else if (diemtb >= 6.5 && diemtb < 7.5) {
            System.out.println("Xếp loại trung khá");
        } else if (diemtb >= 7.5 && diemtb < 9) {
            System.out.println("Xếp loại giỏi");
        } else {
            System.out.println("Xếp loại xuất sắc");
        }
    }
}
