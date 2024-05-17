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
public class bai4 {

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

    private static int[] removeK(int[] arr, int k) {
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }
        }

        return Arrays.copyOf(arr, c);
    }

    public static void run() {
        int size, k;
        System.out.print("Nhập vào số kích thước mảng: ");
        size = scanner.nextInt();

        int[] n = new int[size];

        nhap(n);

        System.out.print("\nNhập vào phần tử k muốn xóa: ");
        k = scanner.nextInt();
        n = removeK(n, k);

        System.out.print("\nMảng sau khi xóa là: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
