/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author LEMINHNAM
 */
public class NhanVien {

    private DecimalFormat decimalFormat = new DecimalFormat("#,###");
    private DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
    private String ten, diachi;
    private int tuoi, sogiolamviec;
    private long tienluong;

    public NhanVien() {
    }

    public NhanVien(String ten, String diachi, int tuoi, int sogiolamviec, long tienluong) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.sogiolamviec = sogiolamviec;
        this.tienluong = tienluong;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSogiolamviec() {
        return sogiolamviec;
    }

    public void setSogiolamviec(int sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(long tienluong) {
        this.tienluong = tienluong;
    }

    public void inputInfo() {
        // cái này e tạo constructor rồi nên emk viết cái này
    }

    public void outputInfo() {
        System.out.println("\nThông tin nhân viên:");
        System.out.println("Tên: " + ten);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Số giờ làm việc: " + sogiolamviec);
        System.out.println("Tiền lương: " + tienluong);
    }

    private double tinhThuong() {
        if (sogiolamviec >= 200) {
            return tienluong * 2.0;
        } else if (sogiolamviec >= 100) {
            return tienluong * 0.1;
        } else {
            return 0;
        }
    }

    public void tinhLuong() {
        decimalFormatSymbols.setGroupingSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        System.out.println("Luong và tiền thưởng là: " + decimalFormat.format(tienluong + tinhThuong()) + " đ");
    }
}
