/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi6.bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai3 {

    private static int n;
    private static ArrayList<Mobile> mobiles;
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.print("Nhập vào số lượng Mobile muốn nhập: ");
        n = scanner.nextInt();

        mobiles = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Mobile mobile = new Mobile();
            System.out.print("\nNhập vào Tên của Mobile " + i + ": ");
            scanner.nextLine();
            mobile.setTenKhachHang(scanner.nextLine());
            System.out.print("\nNhập vào SDT của Mobile " + i + ": ");
            mobile.setSdt(scanner.nextLine());
            System.out.print("\nNhập vào Monney của Mobile " + i + ": ");
            mobile.setMonney(scanner.nextDouble());

            mobiles.add(mobile);
        }

        MaxPostage maxPostage = new MaxPostage(mobiles);
        maxPostage.out();
    }
}
