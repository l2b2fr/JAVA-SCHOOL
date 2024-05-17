/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai2up1;

/**
 *
 * @author LEMINHNAM
 */
public class SanPham {

    // Thuộc tính
    private String tenSP;
    private double donGia;
    private double giamGia;

    // Hàm tạo
    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Phương thức tính thuế nhập khẩu
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Phương thức xuất thông tin
    public void xuat() {
        System.out.println("\n\nTên sản phẩm: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
}
