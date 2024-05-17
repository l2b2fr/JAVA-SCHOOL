/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi5;

import java.util.Arrays;

/**
 *
 * @author LEMINHNAM
 */
public class bai6 {

    public static void run() {
        int[] A = {1, 3, 5, 7, 9}; // Mảng A đã sắp xếp tăng dần
        int[] B = {2, 4, 6, 8, 10}; // Mảng B đã sắp xếp tăng dần

        // Ghép hai mảng thành mảng mới cũng có thứ tự tăng dần
        int[] C = mergeArrays(A, B);

        // In ra mảng C
        System.out.println("Mảng C sau khi ghép: " + Arrays.toString(C));
    }

    public static int[] mergeArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // Copy các phần tử còn lại của mảng A (nếu có)
        while (i < m) {
            C[k++] = A[i++];
        }

        // Copy các phần tử còn lại của mảng B (nếu có)
        while (j < n) {
            C[k++] = B[j++];
        }

        return C;
    }
}
