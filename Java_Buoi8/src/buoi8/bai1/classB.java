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
public class classB extends classA {

    private static Scanner scanner = new Scanner(System.in);
    private int z;

    public classB() {
    }

    public classB(int z) {
        this.z = z;
    }

    public classB(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void nhap() {
        System.out.print("Nhập vào x: ");
        setX(scanner.nextInt());
        System.out.print("Nhập vào y: ");
        setY(scanner.nextInt());
        System.out.print("Nhập vào z: ");
        setZ(scanner.nextInt());
    }

    @Override
    public void xuat() {
        System.out.println("x  = " + getX() + " y = " + getY() + " z = " + getZ());
    }
}
