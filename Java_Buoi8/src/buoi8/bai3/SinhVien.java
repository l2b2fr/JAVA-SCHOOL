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
public class SinhVien {

    private String masv, hodem, ten, gioi;
    private static Scanner scanner = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String masv, String hodem, String ten, String gioi) {
        this.masv = masv;
        this.hodem = hodem;
        this.ten = ten;
        this.gioi = gioi;
    }

    public void nhap() {
        System.out.print("Mã sinh viên: ");
        masv = scanner.nextLine();

        System.out.print("Họ đệm : ");
        hodem = scanner.nextLine();

        System.out.print("Tên : ");
        ten = scanner.nextLine();

        System.out.print("Giới tính: ");
        gioi = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("\nThông tin cá nhân:");
        System.out.println("Mã sinh viên: " + masv);
        System.out.println("Họ đệm: " + hodem);
        System.out.println("Tên: " + ten);
        System.out.println("Giới tính: " + gioi);
    }
}
