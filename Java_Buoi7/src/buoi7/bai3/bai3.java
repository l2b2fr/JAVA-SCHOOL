/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai3;

/**
 *
 * @author LEMINHNAM
 */
public class bai3 {

    public static void run() {
        GiangVien giangVien1 = new GiangVien("Nguyễn Văn A", "01/01/1980", "Nam", "Công nghệ Thông tin", "Thạc sĩ", 3000000.0, 120.0, 2.0);
        GiangVien giangVien2 = new GiangVien("Trần Thị B", "15/05/1975", "Nữ", "Kế toán", "Cử nhân", 2500000.0, 100.0, 1.5);
        GiangVien giangVien3 = new GiangVien("Lê Văn C", "20/10/1990", "Nam", "Ngoại ngữ", "Thạc sĩ", 2000000.0, 80.0, 1.2);
        GiangVien giangVien4 = new GiangVien("Phạm Thị D", "08/03/1985", "Nữ", "Khoa học Xã hội", "Tiến sĩ", 4000000.0, 40.0, 2.5);
        GiangVien giangVien5 = new GiangVien("Hoàng Anh E", "22/12/1978", "Nam", "Kỹ thuật", "Thạc sĩ", 3500000.0, 10.0, 2.0);
        GiangVien giangVien6 = new GiangVien("Dương Mai F", "07/07/1995", "Nữ", "Y khoa", "Bác sĩ", 5000000.0, 30.0, 3.0);

        QuanLyGiangVien quanLyGiangVien = new QuanLyGiangVien();

        quanLyGiangVien.addGiangVien(giangVien1);
        quanLyGiangVien.addGiangVien(giangVien2);
        quanLyGiangVien.addGiangVien(giangVien3);
        quanLyGiangVien.addGiangVien(giangVien4);
        quanLyGiangVien.addGiangVien(giangVien5);
        quanLyGiangVien.addGiangVien(giangVien6);
        
        quanLyGiangVien.getAllInfo();
    }
}
