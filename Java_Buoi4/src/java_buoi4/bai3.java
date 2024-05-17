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
public class bai3 {

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

    public static boolean timKiem(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return true;
            }
        }
        return false;
    }

    public static void run() {
        int size;
        System.out.print("Nhập vào số kích thước mảng: ");
        size = scanner.nextInt();

        int[] n = new int[size];

        nhap(n);

        Arrays.sort(n);
        System.out.print("\nNhập vào phần tử cần tìm kiếm trong mảng: ");
        int k = scanner.nextInt();
        if (timKiem(n, k)) {
            System.out.printf("\nPhần tử %d có trong mảng!\n", k);
        } else {
            System.out.printf("\nPhần tử %d không tồn tại trong mảng \n");
        }
    }
}
