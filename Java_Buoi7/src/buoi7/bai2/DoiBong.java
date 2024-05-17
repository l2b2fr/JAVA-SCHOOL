/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai2;

/**
 *
 * @author LEMINHNAM
 */
public class DoiBong {

    private String tenDoiBong;
    private int soTranThang, soTranHoa, soTranThua, diem;

    public DoiBong() {
    }

    public DoiBong(String tenDoiBong, int soTranThang, int soTranHoa, int soTranThua, int diem) {
        this.tenDoiBong = tenDoiBong;
        this.soTranThang = soTranThang;
        this.soTranHoa = soTranHoa;
        this.soTranThua = soTranThua;
        this.diem = diem;
    }

    public String getTenDoiBong() {
        return tenDoiBong;
    }

    public void setTenDoiBong(String tenDoiBong) {
        this.tenDoiBong = tenDoiBong;
    }

    public int getSoTranThang() {
        return soTranThang;
    }

    public void setSoTranThang(int soTranThang) {
        this.soTranThang = soTranThang;
    }

    public int getSoTranHoa() {
        return soTranHoa;
    }

    public void setSoTranHoa(int soTranHoa) {
        this.soTranHoa = soTranHoa;
    }

    public int getSoTranThua() {
        return soTranThua;
    }

    public void setSoTranThua(int soTranThua) {
        this.soTranThua = soTranThua;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public void getInfo() {
        System.out.println("\nTên đội bóng: " + tenDoiBong + "");
        System.out.println("Số trận thắng đội bóng: " + soTranThang + "");
        System.out.println("Số trận hòa đội bóng: " + soTranHoa + "");
        System.out.println("Số trận thua đội bóng: " + soTranHoa + "");
        System.out.println("Điểm đội bóng: " + diem + "");

    }
}
