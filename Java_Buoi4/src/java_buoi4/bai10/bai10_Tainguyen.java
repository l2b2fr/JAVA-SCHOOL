/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4.bai10;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai10_Tainguyen {

    public static int n;
    public static int[] a;
    public static Scanner scanner = new Scanner(System.in);

    public static void nhap() {
        System.out.println("Nhập vào số lượng phần tử mảng: ");
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("\nNhập vào a[%d] = ", i);
            a[i] = scanner.nextInt();
        }
    }

    private static void xuat() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static boolean nguyenTo(int n) {
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

    public static void selectionSortTang(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSortGiam(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Hoán đổi phần tử lớn nhất với phần tử tại vị trí i
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void op1() {
//        nhap();
        System.out.println("Mảng vừa nhập là");
        xuat();
    }

    public static void op2() {
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void op3() {
//        nhap();
        int sum = 0;

        for (int num : a) {
            sum += num;
        }

        System.out.println("Tổng: " + sum);
    }

    public static void op4() {
//        nhap();
        System.out.println("Các số nguyên tố trong mảng:");
        for (int num : a) {
            if (nguyenTo(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void op5() {
//        nhap();
        selectionSortTang(a);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void op6() {
//        nhap();
        int sum = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Tổng các phần tử chẵn: " + sum);
    }

    public static void op7() {
//        nhap();
        int sum = 0;

        for (int num : a) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        System.out.println("Tổng các phần tử lẻ: " + sum);
    }

    public static void op8() {
//        nhap();
        int sum = 0;

        for (int num : a) {
            if (num % 3 == 0) {
                sum += num;
            }
        }

        System.out.println("Tổng các phần tử chia hết cho 3: " + sum);
    }

    public static void op9() {
//        nhap();
        int sum = 0;

        for (int num : a) {
            if (num % 5 == 0) {
                sum += num;
            }
        }

        System.out.println("Tổng các phần tử chia hết cho 5: " + sum);
    }

    public static void op10() {
//        nhap();
        int length = a.length;

        System.out.println("Số phần tử của mảng: " + length);
    }

    public static void op11() {
//        nhap();
        int count = 0;

        for (int num : a) {
            if (num > 0) {
                count++;
            }
        }

        System.out.println("Số phần tử dương của mảng: " + count);
    }

    public static void op12() {
//        nhap();
        int count = 0;

        for (int num : a) {
            if (num < 0) {
                count++;
            }
        }

        System.out.println("Số phần tử âm của mảng: " + count);
    }

    public static void op13() {
//        nhap();
        int count = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Số phần tử chẵn của mảng: " + count);
    }

    public static void op14() {
//        nhap();
        int count = 0;

        for (int num : a) {
            if (num % 2 != 0) {
                count++;
            }
        }

        System.out.println("Số phần tử lẻ của mảng: " + count);
    }

    public static void op15() {
//        nhap();
        selectionSortTang(a);
        System.out.println("Phần tử nhỏ nhất của mảng: " + a[0]);
    }

    public static void op16() {
//        nhap();
        selectionSortTang(a);
        System.out.println("Phần tử lớn nhất của mảng: " + a[a.length - 1]);
    }

    public static void op17() {
//        nhap();
        int sum = 0;

        for (int num : a) {
            sum += num;
        }

        double average = (double) sum / a.length;
        System.out.println("Trung bình cộng của các phần tử: " + average);
    }

    public static void op18() {
//        nhap();
        selectionSortTang(a);
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void op19() {
//        nhap();
        selectionSortGiam(a);
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void op20() {
//        nhap();
        int sum = 0;
        int dem = 0;
        for (int num : a) {
            if (num % 3 == 0) {
                sum += num;
                dem++;
            }
        }
        double trungbinh = (double) (sum / dem);
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + trungbinh);
    }

    public static void op21() {
//        nhap();
        System.out.print("Nhập giá trị c: ");
        int c = scanner.nextInt();
        int count = 0;

        for (int num : a) {
            if (num == c) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của phần tử có giá trị " + c + ": " + count);
    }

    public static void op22() {
//        nhap();
        System.out.print("Nhập giá trị c: ");
        int c = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == c) {
                System.out.println("Phần tử " + c + " xuất hiện đầu tiên ở vị trí " + i);
                return;
            }
        }

        System.out.println("Phần tử " + c + " không xuất hiện trong mảng.");
    }

    public static void op23() {
//        nhap();
        System.out.print("Nhập giá trị c: ");
        int c = scanner.nextInt();
        int count = 0;

        System.out.print("Các vị trí xuất hiện của phần tử có giá trị " + c + ": ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == c) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Không có vị trí nào.");
        }
    }

    public static void op24() {
//        nhap();
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Số lớn nhất trong mảng: " + max);
        System.out.print("Nằm ở các vị trí: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                System.out.print(i + " ");
            }
        }
    }

    public static void op25() {
//        nhap();
        System.out.print("Nhập giá trị c: ");
        int c = scanner.nextInt();
        int countOdd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= c) {
                a[i] = 0;
            }
            if (a[i] % 2 != 0) {
                countOdd++;
            }
        }

        System.out.println("Mảng sau khi thay thế:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println("\nSố lượng phần tử lẻ sau khi thay thế: " + countOdd);
    }

    public static void op26() {
//        nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();

        for (int i = 0; i < bai10_Tainguyen.a.length; i++) {
            if (bai10_Tainguyen.a[i] == a) {
                bai10_Tainguyen.a[i] = b;
            }
        }

        System.out.println("Mảng sau khi thay thế:");
        for (int num : bai10_Tainguyen.a) {
            System.out.print(num + " ");
        }
    }

    public static void op27() {
//        nhap();
        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int num : bai10_Tainguyen.a) {
            if (num == a) {
                num = b;
            }
            sum += num;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Trung bình cộng các phần tử sau khi thay thế: " + average);
    }

    public static void op28() {
//        nhap();
        int sum = 0;
        int count = 0;

        for (int num : a) {
            if (num % 2 != 0 && num % 3 == 0) {
                sum += num;
            }
            if (num > 7) {
                count++;
            }
        }

        System.out.println("Tổng các phần tử lẻ đồng thời chia hết cho 3: " + sum);
        System.out.println("Số lượng phần tử lớn hơn 7 trong mảng: " + count);
    }

    public static void op29() {
//        nhap();
        int sum = 0;

        for (int num : a) {
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Tổng các phần tử dương, chẵn: " + sum);
    }

    public static void op30() {
//        nhap();
        System.out.println("Các số không chia hết cho 3:");
        for (int num : a) {
            if (num % 3 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nCác số chia hết cho 3 nhưng không chia hết cho 5:");
        for (int num : a) {
            if (num % 3 == 0 && num % 5 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nTất cả các phần tử trong mảng:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void op31() {
//        nhap();
        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();
        int sum = 0;

        for (int num : bai10_Tainguyen.a) {
            if (num >= a && num <= b) {
                sum += num;
            }
        }

        System.out.println("Tổng các số có giá trị nằm trong đoạn [" + a + ", " + b + "]: " + sum);
    }

    public static void op32() {
//        nhap();
        int count = 0;

        for (int num : a) {
            if (isPerfectSquare(num)) {
                count++;
            }
        }

        System.out.println("Số lượng phần tử là số chính phương của mảng: " + count);
    }

    public static void op33() {
//        nhap();
        int count = 0;

        for (int num : a) {
            if (nguyenTo(num)) {
                count++;
            }
        }

        System.out.println("Số lượng phần tử là số nguyên tố của mảng: " + count);
    }

}
