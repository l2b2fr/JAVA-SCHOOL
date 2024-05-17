/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi3;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai5 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Nhập vào số nguyên: ");
        a = scanner.nextInt();
        boolean soNguyenTo = true;

        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                soNguyenTo = false;
                break;
            }
        }
        if (soNguyenTo == true) {
            System.out.println(a + " là số nguyên tố !");
        } else {
            System.out.println(a + " không là số nguyên tố !");
        }
    }
}
