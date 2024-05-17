/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author LEMINHNAM
 */
public class GiangVien {

    private DecimalFormat decimalFormat = new DecimalFormat("#,###");
    private DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
    private String hoTen, ngaySinh, gioiTinh, khoa, trinhDo;
    private double phuCap, soTietDay, heSoLuong;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String ngaySinh, String gioiTinh, String khoa, String trinhDo, Double phuCap, Double soTietDay, Double heSoLuong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
        this.trinhDo = trinhDo;
        this.phuCap = phuCap;
        this.soTietDay = soTietDay;
        this.heSoLuong = heSoLuong;
    }

    public DecimalFormat getDecimalFormat() {
        return decimalFormat;
    }

    public void setDecimalFormat(DecimalFormat decimalFormat) {
        this.decimalFormat = decimalFormat;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public Double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(Double phuCap) {
        this.phuCap = phuCap;
    }

    public Double getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(Double soTietDay) {
        this.soTietDay = soTietDay;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void getLuong() {
        double Luong = (heSoLuong * (1400000 + phuCap + soTietDay) * 45000);
        decimalFormatSymbols.setGroupingSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        System.out.print("\nLương của nhân viên " + hoTen + " là: " + decimalFormat.format(Luong) + " đ");
    }

    public void getInfo() {
        System.out.println("\nHọ tên là: " + hoTen + "");
        System.out.println("\nNgày sinh là: " + ngaySinh + "");
        System.out.println("\nGiới tính là: " + gioiTinh + "");
        System.out.println("\nKhoa là: " + khoa + "");
        System.out.println("\nTrình độ là: " + trinhDo + "");
        System.out.println("\nPhụ cấp là: " + phuCap + " đ");
        System.out.println("\nSố tiết dạy là: " + soTietDay + " tiết");
        System.out.println("\nHệ số lương là: " + heSoLuong + "");
    }
}
