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
public class Person {

    private String hoten, gioitinh, diachi, ngaysinh;
    private static Scanner scanner = new Scanner(System.in);

    public Person() {
    }

    public Person(String hoten, String gioitinh, String diachi, String ngaysinh) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void nhap() {

        System.out.print("Họ tên: ");
        hoten = scanner.nextLine();

        System.out.print("Giới tính: ");
        gioitinh = scanner.nextLine();

        System.out.print("Địa chỉ: ");
        diachi = scanner.nextLine();

        System.out.print("Ngày sinh: ");
        ngaysinh = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("\nThông tin cá nhân:");
        System.out.println("Họ tên: " + hoten);
        System.out.println("Giới tính: " + gioitinh);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Ngày sinh: " + ngaysinh);
    }
}
