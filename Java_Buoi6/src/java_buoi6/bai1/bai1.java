/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai1;

/**
 *
 * @author LEMINHNAM
 */
public class bai1 {

    public static void run() {
        SinhVien sinhVien1 = new SinhVien();
        sinhVien1.nhap();
        sinhVien1.xuat();

        SinhVien sinhVien2 = new SinhVien("Văn Du", 8.5);
        sinhVien2.xuat();
    }
}
