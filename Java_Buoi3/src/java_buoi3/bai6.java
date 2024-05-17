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
public class bai6 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int f0 = 1, f1 = 2, next = f0 + f1;
        System.out.print("Nhập vào số m: ");
        a = scanner.nextInt();
        while (next < a) {
            next = f0 + f1;
            System.out.println(next);
            f1 = next;
        }
    }
}
