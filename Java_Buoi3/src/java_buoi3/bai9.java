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
public class bai9 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số N: ");
        int n = scanner.nextInt();

        long sumOfOddSquares = calculateSumOfOddSquares(n);

        System.out.println("Tổng bình phương các số lẻ từ 1 đến " + n + " là: " + sumOfOddSquares);
    }

    private static long calculateSumOfOddSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i * i;
        }
        return sum;
    }
}
