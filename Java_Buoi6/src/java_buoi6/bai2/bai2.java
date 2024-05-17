/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai2;

/**
 *
 * @author LEMINHNAM
 */
public class bai2 {
    private String mm;

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public static void run() {
        SanPham sanPham1 = new SanPham("Thuốc diệt cỏ", 10.000, 1.000);
        SanPham sanPham2 = new SanPham("Quả trứng", 2.000, 100);
        sanPham1.xuat();
        sanPham2.xuat();
    }
}
