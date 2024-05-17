/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi8.bai1;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        classA a = new classA();
        a.nhap();
        System.out.println("Class A là: ");
        a.xuat();

        classB b = new classB();
        b.nhap();
        System.out.println("Class B là: ");
        b.xuat();
    }
}
