/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai7 {
    private static Scanner scanner = new Scanner(System.in);

    private static void nhap(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("\nNhập vào a[%d] = ", i);
            a[i] = scanner.nextInt();
        }
    }

    private static void xuat(int[] a) {
        System.out.print("Mảng vừa nhập là: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void run() {
        int size;
        System.out.print("Nhập vào số kích thước mảng: ");
        size = scanner.nextInt();

        int[] n = new int[size];

        nhap(n);

        System.out.print("Nhập vào số để tìm kiếm trong dãy: ");
        int x = scanner.nextInt();

        Arrays.sort(n);
        xuat(n);

        int index = Arrays.binarySearch(n, x);
        if (index != -1) {
            System.out.println("\nSố " + x + " xuất hiện đầu tiên tại vị trí: " + index);
        } else {
            System.out.println("\nSố " + x + " không có trong mảng.");
        }

    }
}
