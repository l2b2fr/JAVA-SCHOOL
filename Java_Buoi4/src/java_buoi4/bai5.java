/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai5 {

    private static Scanner scanner = new Scanner(System.in);

    private static void nhap(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("\nNhập vào a[%d] = ", i);
            a[i] = scanner.nextInt();
        }
    }

    private static void xuat(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void run() {
        int size, k;
        System.out.print("Nhập vào số kích thước mảng: ");
        size = scanner.nextInt();

        int[] n = new int[size];

        nhap(n);
        int chiaMang = (int) (n.length / 2);
        int[] mang1 = new int[chiaMang];
        int[] mang2 = new int[n.length - chiaMang];

        for (int i = 0; i < chiaMang; i++) {
            mang1[i] = n[i];
        }

        for (int i = chiaMang, c = 0; i < n.length; i++) {
            mang2[c] = n[i];
            c++;
        }

        System.out.println("\nMảng 1 là: ");
        xuat(mang1);

        System.out.println("\nMảng 2 là: ");
        xuat(mang2);
    }
}
