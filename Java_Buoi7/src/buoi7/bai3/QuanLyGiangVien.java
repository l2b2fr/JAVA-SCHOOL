/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai3;

import java.util.ArrayList;

/**
 *
 * @author LEMINHNAM
 */
public class QuanLyGiangVien {

    private ArrayList<GiangVien> giangViens;

    public QuanLyGiangVien() {
        this.giangViens = new ArrayList<GiangVien>();
    }

    public void addGiangVien(GiangVien giangVien) {
        this.giangViens.add(giangVien);
    }

    public void getAllInfo() {
        System.out.println("Hiển thị ra tất cả số nhân viên");
        for (int i = 0; i < giangViens.size(); i++) {
            System.out.println("\n\nNhân viên " + i + " là:");
            GiangVien gv = giangViens.get(i);
            gv.getLuong();
        }
    }
}
