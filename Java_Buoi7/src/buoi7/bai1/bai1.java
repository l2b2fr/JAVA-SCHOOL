/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai1;

import java.util.ArrayList;
import java.util.Scanner;
import buoi7.bai1.NhanVien;

/**
 *
 * @author LEMINHNAM
 */
public class bai1 {

    private static Scanner scanner = new Scanner(System.in);
    private static int size;

    public static void run() {
        ArrayList<NhanVien> nvList = new ArrayList<>();
        System.out.print("Nhập vào số lượng nhân viên: ");
        size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            NhanVien nv = new NhanVien();
            System.out.println("\nNhập vào Họ nhân viên " + (i + 1) + ": ");
            scanner.nextLine();
            nv.setHo(scanner.nextLine());
            System.out.println("Nhập vào Tên nhân viên " + (i + 1) + ": ");
            nv.setTen(scanner.nextLine());
            System.out.println("Nhập vào Địa Chỉ nhân viên " + (i + 1) + ": ");
            nv.setDiachi(scanner.nextLine());
            System.out.println("Nhập vào Lương nhân viên " + (i + 1) + ": ");
            nv.setLuong(scanner.nextDouble());
            System.out.println("Nhập vào Tuổi nhân viên " + (i + 1) + ": ");
            nv.setTuoi(scanner.nextInt());
            nvList.add(nv);
        }

        System.out.println("Những người có tuổi dưới 30 và thu nhập từ 500.000 trở lên là: \n");
        for (NhanVien n : nvList) {
            if (n.getTuoi() < 30 && n.getLuong() >= 500000) {
                n.getInfo();
            }
        }
    }
}
