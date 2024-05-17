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
public class bai2 {

    private static Scanner scanner = new Scanner(System.in);

    public static boolean checkNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
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

        Arrays.sort(n);
        xuat(n);

        System.out.print("\nMax của mảng là: " + n[n.length - 1]);
        System.out.print("\nMin của mảng là: " + (n[0]));

        int tong = 0;
        for (int i = 0; i < n.length; i++) {
            tong += n[i];
        }
        System.out.print("\nTổng các phần tử trong mảng là: " + tong);

        System.out.println("\nDanh sách các số nguyên tố trong mảng là: ");
        for (int i = 0; i < n.length; i++) {
            if (checkNguyenTo(n[i])) {
                System.out.print(n[i] + " ");
            }
        }
    }
}
