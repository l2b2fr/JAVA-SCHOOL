/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai4;

/**
 *
 * @author LEMINHNAM
 */
public class bai4 {

    public static void run() {
        //Em tạo Constructor luôn bới vì em lười nhập
        NhanVien nhanVien1 = new NhanVien("Nguyễn Văn A", "Hà Nội", 30, 180, 10000000);
        NhanVien nhanVien2 = new NhanVien("Trần Thị B", "Đà Nẵng", 25, 170, 8000000);
        NhanVien nhanVien3 = new NhanVien("Lê Văn C", "TP. Hồ Chí Minh", 40, 200, 12000000);
        NhanVien nhanVien4 = new NhanVien("Phạm Thị D", "Cần Thơ", 35, 190, 9000000);
        NhanVien nhanVien5 = new NhanVien("Hoàng Anh E", "Hải Phòng", 28, 160, 7000000);
        NhanVien nhanVien6 = new NhanVien("Dương Mai F", "Bình Dương", 32, 185, 11000000);

        nhanVien1.outputInfo();
        nhanVien1.tinhLuong();

        nhanVien2.outputInfo();
        nhanVien2.tinhLuong();

        nhanVien3.outputInfo();
        nhanVien3.tinhLuong();

        nhanVien4.outputInfo();
        nhanVien4.tinhLuong();

        nhanVien5.outputInfo();
        nhanVien5.tinhLuong();

        nhanVien6.outputInfo();
        nhanVien6.tinhLuong();
    }
}
