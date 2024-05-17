/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi5;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai7 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        // Nhập cấp của ma trận vuông
        System.out.print("Nhập cấp của ma trận vuông: ");
        int n = scanner.nextInt();

        // Khởi tạo và nhập ma trận A
        int[][] A = new int[n][n];
        System.out.println("Nhập ma trận vuông A:");
        nhapMaTran(scanner, A);

        // a. Tìm hàng, cột hoặc đường chéo có tổng các phần tử lớn nhất
        timHangCotChuCheoMax(A);

        // b. Tìm ma trận chuyển vị của A
        int[][] chuyenViA = timMaTranChuyenVi(A);
        System.out.println("Ma trận chuyển vị của A:");
        inMaTran(chuyenViA);
    }

    // Hàm nhập ma trận
    public static void nhapMaTran(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Hàm in ma trận
    public static void inMaTran(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // a. Tìm hàng, cột hoặc đường chéo có tổng các phần tử lớn nhất
    public static void timHangCotChuCheoMax(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;

        // Tìm hàng có tổng lớn nhất
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        // Tìm cột có tổng lớn nhất
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = -1;
                maxCol = j;
            }
        }

        // Tìm đường chéo chính có tổng lớn nhất
        int sumDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonal += matrix[i][i];
        }
        if (sumDiagonal > maxSum) {
            maxSum = sumDiagonal;
            maxRow = -1;
            maxCol = -1;
        }

        if (maxRow != -1) {
            System.out.println("Hàng có tổng các phần tử lớn nhất là hàng " + maxRow);
        } else if (maxCol != -1) {
            System.out.println("Cột có tổng các phần tử lớn nhất là cột " + maxCol);
        } else {
            System.out.println("Đường chéo có tổng các phần tử lớn nhất");
        }
    }

    // b. Tìm ma trận chuyển vị của A
    public static int[][] timMaTranChuyenVi(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
