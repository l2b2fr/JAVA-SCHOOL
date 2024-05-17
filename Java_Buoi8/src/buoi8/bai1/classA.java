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
public class classA {

    private int x, y;
    private static Scanner scanner = new Scanner(System.in);

    public classA() {
    }

    public classA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void nhap() {
        System.out.print("Nhập vào x: ");
        setX(scanner.nextInt());
        System.out.print("Nhập vào y: ");
        setY(scanner.nextInt());
    }

    public void xuat() {
        System.out.println("x  = " + x + " y = " + y);
    }
}
