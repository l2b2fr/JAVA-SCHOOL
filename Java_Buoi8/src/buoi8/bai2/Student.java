/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi8.bai2;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class Student extends Person {

    private String masv, email;
    private static Scanner scanner = new Scanner(System.in);
    private float diemtb;

    public Student() {
    }

    public Student(String hoTen, String gioiTinh, String diaChi, String ngaySinh, String maSinhVien, float diemTB, String email) {
        super(hoTen, gioiTinh, diaChi, ngaySinh);
        this.masv = maSinhVien;
        this.diemtb = diemTB;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    @Override
    public void nhap() {
        super.nhap();

        System.out.print("Mã sinh viên: ");
        masv = scanner.nextLine();

        System.out.print("Điểm trung bình: ");
        diemtb = scanner.nextFloat();

        System.out.print("Email: ");
        scanner.nextLine();
        email = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.println("Mã sinh viên: " + masv);
        System.out.println("Điểm trung bình: " + diemtb);
        System.out.println("Email: " + email);
    }

    public void kiemTraHocBong() {
        if (diemtb >= 8.0) {
            System.out.println("Đủ điều kiện nhận học bổng!");
        } else {
            System.out.println("Không đủ điều kiện nhận học bổng.");
        }
    }
}
