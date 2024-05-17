/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi8.bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class QuanLySinhVien {

    private ArrayList<SinhVienBiz> sinhVienBizs;
    private int size;
    private static Scanner scanner = new Scanner(System.in);

    public QuanLySinhVien() {
        sinhVienBizs = new ArrayList<>();
    }

    public void nhapSinhVien() {
        System.out.println("\nNhập số lượng sinh viên muốn nhập: ");
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("\nNhập thông tin sinh viên " + (i + 1));
            SinhVienBiz sinhVienBiz = new SinhVienBiz();
            sinhVienBiz.nhap();
            sinhVienBizs.add(sinhVienBiz);
        }
    }

    public void xuatSinhVien() {
        for (SinhVienBiz sv : sinhVienBizs) {
            sv.xuat();
            sv.diemTrungBinh();
            sv.xepLoai();

        }
    }
}
