/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai1;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author LEMINHNAM
 */
public class NhanVien {

    private String ho, ten, diachi;
    private double luong;
    private int tuoi;

    public NhanVien() {
    }

    public NhanVien(String ho, String ten, String diachi, double luong, int tuoi) {
        this.ho = ho;
        this.ten = ten;
        this.diachi = diachi;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void getInfo() {
        System.out.println("\nHọ của nhân viên là: " + ho + "");
        System.out.println("\nTên của nhân viên là: " + ten + "");
        System.out.println("\nĐịa chỉ của nhân viên là: " + diachi + "");
        System.out.println("\nTuổi của nhân viên là: " + tuoi + "");
        System.out.println("\nLương của nhân viên là: " + luong + "\n"
        );
    }
}
