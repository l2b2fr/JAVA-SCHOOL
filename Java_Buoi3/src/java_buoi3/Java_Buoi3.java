/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_buoi3;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class Java_Buoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int values;
        boolean check = false;

        System.out.println("Lựa chọn 1: Bài 4: Viết chương trình nhập vào 2 số min và max từ bàn phím. Tính và xuất trung bình  cộng các số chia hết cho 5 từ min đến max. ");
        System.out.println("Lựa chọn 2: Bài 5: Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số  nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).");
        System.out.println("Lựa chọn 3: Bài 6: Viết chương trình nhập từ bàn phím số m. Xuất dãy số fibonaci các số nhỏ hơn m.  Dãy fibonaci là dãy số có số sau bằng tổng 2 số đứng kế trước trong đó 2 số đầu tiên f0=1 và f1=2.");
        System.out.println("Lựa chọn 4: Bài 7: Viết chương trình liệt kê các số nguyên dương có 3 chữ số và có từ 20 ước số trở lên.");
        System.out.println("Lựa chọn 5: Bài 8: Viết chương trình nhập số N sau đó tính các tổng sau.");
        System.out.println("Lựa chọn 6: Bài 9: Viết chương trình tính tổng bình phương các số lẻ từ 1 đến N.");
        System.out.println("Lựa chọn 7: Bài 10: Viết chương trình tính số hạng thứ n của dãy Fibonaci.");
        System.out.println("Lựa chọn 0: Thoát ứng dụng");

        do {
            System.out.print("Nhập vào lựa chọn: ");
            values = scanner.nextInt();
            switch (values) {
                case 1:
                    bai4.run();
                    check = true;
                    break;
                case 2:
                    bai5.run();
                    check = true;
                    break;
                case 3:
                    bai6.run();
                    check = true;
                    break;
                case 4:
                    bai7.run();
                    check = true;
                    break;
                case 5:
                    bai8.run();
                    check = true;
                    break;
                case 6:
                    bai9.run();
                    check = true;
                    break;
                case 7:
                    bai10.run();
                    check = true;
                    break;
                case 0:
                    check = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập vào không đúng lựa chọn vui lòng chọn lại");
            }
        } while (check == false);
    }

}
