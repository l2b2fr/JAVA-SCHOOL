/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author LEMINHNAM
 */
public class MaxPostage {

    private ArrayList<Mobile> mobiles;

    public MaxPostage(ArrayList<Mobile> mobiles) {
        this.mobiles = new ArrayList<>();
        this.mobiles = mobiles;
    }

    public void out() {
        for (Mobile mb : mobiles) {
            System.out.println("\nTên khách hàng: " + mb.getTenKhachHang());
            System.out.println("SDT khách hàng: " + mb.getSdt());
            System.out.println("Monney khách hàng: " + mb.getMonney());

        }
    }
}
