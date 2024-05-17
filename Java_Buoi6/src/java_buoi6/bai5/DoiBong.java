/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai5;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class DoiBong {

    private String tenDoiBong;
    private int soTranThang;
    private int soTranHoa;
    private int soTranThua;

    // Constructor
    public DoiBong(String tenDoiBong, int soTranThang, int soTranHoa, int soTranThua) {
        this.tenDoiBong = tenDoiBong;
        this.soTranThang = soTranThang;
        this.soTranHoa = soTranHoa;
        this.soTranThua = soTranThua;
    }

    // Phương thức nhập thông tin của đội bóng
    public void nhapThongTin(Scanner scanner) {
        System.out.println("\nNhập thông tin đội bóng:");
        System.out.print("Tên đội bóng: ");
        this.tenDoiBong = scanner.nextLine();
        System.out.print("Số trận thắng: ");
        this.soTranThang = scanner.nextInt();
        System.out.print("Số trận hòa: ");
        this.soTranHoa = scanner.nextInt();
        System.out.print("Số trận thua: ");
        this.soTranThua = scanner.nextInt();
    }

    // Tính số điểm của đội bóng
    public int tinhDiem() {
        return (soTranThang * 3) + soTranHoa;
    }

    // Phương thức xuất thông tin của đội bóng
    public void xuatThongTin() {
        System.out.println("\nTên đội bóng: " + tenDoiBong);
        System.out.println("Số trận thắng: " + soTranThang);
        System.out.println("Số trận hòa: " + soTranHoa);
        System.out.println("Số trận thua: " + soTranThua);
    }

    // Getter cho số điểm của đội bóng
    public int getDiem() {
        return tinhDiem();
    }
}
