/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai2up1;

import java.util.ArrayList;
import java_buoi6.bai2up1.SanPham;

/**
 *
 * @author LEMINHNAM
 */
public class bai2up1 {

    public static void run() {
        ArrayList<SanPham> listSanPhams = new ArrayList<>();
        SanPham sanPham1 = new SanPham("Bao Cao Su", 10.000, 1.000);
        SanPham sanPham2 = new SanPham("Quả trứng", 2.000, 100);

        listSanPhams.add(sanPham1);
        listSanPhams.add(sanPham2);

        for (SanPham sp : listSanPhams) {
            sp.xuat();
        }
    }
}
