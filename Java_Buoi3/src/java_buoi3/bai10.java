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
public class bai10 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hạng thứ n trong dãy Fibonacci: ");
        int n = scanner.nextInt();

        long nthFibonacci = calculateNthFibonacci(n);

        System.out.println("Số hạng thứ " + n + " trong dãy Fibonacci là: " + nthFibonacci);
    }

    private static long calculateNthFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long prev = 1;
            long curr = 1;
            long next = 0;
            for (int i = 3; i <= n; i++) {
                next = prev + curr;
                prev = curr;
                curr = next;
            }
            return next;
        }
    }
}
