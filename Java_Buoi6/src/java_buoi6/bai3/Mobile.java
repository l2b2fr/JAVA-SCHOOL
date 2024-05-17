/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai3;

/**
 *
 * @author LEMINHNAM
 */
public class Mobile {

    private String tenKhachHang;
    private String sdt;
    public double monney;

    public Mobile() {
    }

    public Mobile(String tenKhachHang, String sdt, double monney) {
        this.tenKhachHang = tenKhachHang;
        this.sdt = sdt;
        this.monney = monney;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getMonney() {
        return monney;
    }

    public void setMonney(double monney) {
        this.monney = monney;
    }
}
