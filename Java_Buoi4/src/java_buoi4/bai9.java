/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai9 {

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

        // Loại bỏ các phần tử trùng lặp
        List<Integer> uniqueList = new ArrayList<>(new HashSet<>(n));

        // In ArrayList ban đầu
        System.out.println("ArrayList ban đầu:");
        System.out.println(n);

        // In ArrayList sau khi loại bỏ phần tử trùng lặp
        System.out.println("ArrayList sau khi loại bỏ phần tử trùng lặp:");
        System.out.println(uniqueList);
    }
}
