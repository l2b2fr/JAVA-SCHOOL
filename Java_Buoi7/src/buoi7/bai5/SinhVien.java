/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai5;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class SinhVien {

    private String hoTen;
    private String ngaySinh;
    private String queQuan;
    private String nganhHoc;
    private int namNhapHoc;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String ngaySinh, String queQuan, String nganhHoc, int namNhapHoc) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.nganhHoc = nganhHoc;
        this.namNhapHoc = namNhapHoc;
    }

    public void nhapThongTin() {
        System.out.print("Nhập họ tên: ");
        hoTen = new Scanner(System.in).nextLine();

        System.out.print("Nhập ngày sinh (YYYY-MM-DD): ");
        ngaySinh = new Scanner(System.in).nextLine();

        System.out.print("Nhập quê quán: ");
        queQuan = new Scanner(System.in).nextLine();

        System.out.print("Nhập ngành học: ");
        nganhHoc = new Scanner(System.in).nextLine();

        System.out.print("Nhập năm nhập học: ");
        namNhapHoc = new Scanner(System.in).nextInt();
    }

    public void xuatThongTin() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Ngành học: " + nganhHoc);
        System.out.println("Năm nhập học: " + namNhapHoc);
    }

    public int getNamNhapHoc() {
        return namNhapHoc;
    }
   
}
