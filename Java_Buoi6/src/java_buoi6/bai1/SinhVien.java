/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai1;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class SinhVien {

    private static Scanner scanner = new Scanner(System.in);
    private String hoTen;
    private double diemTB;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String xepLoai(double diem) {
        if (diem < 3.5) {
            return "Yếu";
        } else if (diem >= 3.5 && diem < 6.5) {
            return "Trung Bình";
        } else if (diem < 8 && diem >= 6.5) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }

    public void nhap() {
        System.out.print("Nhập vào họ tên: ");
        setHoTen(scanner.nextLine());
        System.out.print("\nNhập vào điểm: ");
        setDiemTB(scanner.nextDouble());
    }

    public void xuat() {
        System.out.println("\nHọ tên: " + hoTen + "\nĐiểm TB: " + diemTB + "\nXếp loại: " + xepLoai(diemTB) + "");
    }

    public SinhVien() {
    }

    public SinhVien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
}