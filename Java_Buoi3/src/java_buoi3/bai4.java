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
public class bai4 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int min, max;
        System.out.print("Nhập vào min: ");
        min = scanner.nextInt();
        System.out.print("Nhập vào max: ");
        max = scanner.nextInt();
        int i = min;
        int dem = 0;
        int tong = 0;
        
        while (i <= max) {
            if(i % 5 == 0){
                tong += i;
                dem += 1;
            }
            i++;
        }
        
        System.out.println("Trung bình bằng : "+ (double)(tong/dem));
    }
}
