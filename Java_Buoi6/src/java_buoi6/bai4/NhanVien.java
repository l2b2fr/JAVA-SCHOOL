/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai4;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class NhanVien {

    private String hoTen;
    private String diaChi;
    private int tuoi;
    private double luong;

    // Constructor
    public NhanVien(String hoTen, String diaChi, int tuoi, double luong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    // Phương thức nhập thông tin của nhân viên
    public void nhapThongTin(Scanner scanner) {
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("Họ và tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        this.diaChi = scanner.nextLine();
        System.out.print("Tuổi: ");
        this.tuoi = scanner.nextInt();
        System.out.print("Lương: ");
        this.luong = scanner.nextDouble();
    }

    // Phương thức xuất thông tin của nhân viên
    public void xuatThongTin() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Lương: " + luong);
    }

    // Getter cho thuộc tính tuổi
    public int getTuoi() {
        return tuoi;
    }

    // Getter cho thuộc tính lương
    public double getLuong() {
        return luong;
    }
}
