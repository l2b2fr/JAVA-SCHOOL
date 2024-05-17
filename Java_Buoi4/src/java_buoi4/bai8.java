/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai8 {

    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int size;
        System.out.print("Nhập vào số kích thước mảng: ");
        size = scanner.nextInt();

        ArrayList n = new ArrayList();

        for (int i = 0; i < size; i++) {
            System.out.printf("\nNhập vào ArrayList n[%d] = ", i);
            n.add(scanner.nextInt());
        }

        Collections.sort(n);
        System.out.print("\nMảng vừa nhập là: ");

        for (Object i : n) {
            System.out.print(i + " ");
        }

        System.out.print("\nPhần tử lớn nhất là: " + n.get(n.size() - 1));
        System.out.print("\nPhần tử nhỏ nhất là: " + n.get(0));
    }
}
