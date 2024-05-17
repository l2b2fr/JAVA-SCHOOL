/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi4.bai10;

import java.util.Scanner;
import java_buoi4.bai10.bai10_Tainguyen.*;

/**
 *
 * @author LEMINHNAM
 */
public class bai10 {

    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int values;
        boolean check = false;
        bai10_Tainguyen.nhap();
        System.out.println("\n\n1.	Xuất các giá trị của mảng ra\n"
                + "2.	Tìm min, max\n"
                + "3.	Tính tổng các phần tử trong mảng\n"
                + "4.	Tìm các số nguyên tố có trong mảng\n"
                + "5.	Sắp xếp mảng theo thứ tự tăng dần\n"
                + "6.	Tính tổng các phần từ chẳn của mảng\n"
                + "7.	Tính tổng các phần tử lẻ của mảng\n"
                + "8.	Tính tổng các phần tử chia hết cho 3\n"
                + "9.	Tính tổng các phần từ chia hết cho 5\n"
                + "10.	Đếm số phần tử của mảng\n"
                + "11.	Đểm số phần từ dương của mảng\n"
                + "12.	Đếm số phần tử âm của mảng\n"
                + "13.	Đếm số phần từ chẵn của mảng\n"
                + "14.	Đếm số phần tử lẻ của mảng\n"
                + "15.	Tìm phần từ bé nhất của mảng\n"
                + "16.	Tìm phần tử lớn nhất của mảng\n"
                + "17.	Tính trung bình cộng của các phần từ\n"
                + "18.	Sắp xếp mảng tăng dần\n"
                + "19.	Sắp xếp mảng giảm dần\n"
                + "20.	Tính trung bình của các phần tử ở vị trị lẻ và có giá trị chia hết cho 3\n"
                + "21.	Đếm số lần xuất hiện của phần tử có giá trị c (c nhập từ bàn phím)\n"
                + "22.	Tìm phần tử bất kỳ c xuất hiện đầu tiên trong mảng (với c nhập từ bàn phím), sau đó đưa ra giá trị và vị trí.\n"
                + "23.	Đếm số lần xuất hiện của phần tử có giá trị c và đưa ra các vị trí xuất hiện (c nhập từ bàn phím).\n"
                + "24.	Tìm số lớn nhất trong mảng. Số lớn nhất nằm ở những vị trí nào trong mảng?\n"
                + "25.	Tìm những phần tử nào trong mảng mà có giá trị nhỏ hơn hoặc bằng c (c được nhập từ bàn phím) thì thay bằng 0, sau đó in ra mảng ra màn hình. Đếm trong mảng sau khi thay thế có bao nhiêu phần tử có giá trị lẻ, in kết quả ra màn hình.\n"
                + "26.	Tìm trong mảng những phần tử nào có giá trị bằng a thì thay chúng bằng b (a,b được nhập từ bàn phím), sau đó in mảng ra màn hình.\n"
                + "27.	Tính trung bình cộng các phần tử trong mảng sau khi đã thay các phần tử a bằng b, in kết quả ra màn hình.\n"
                + "28.	Tính tổng các phần tử lẻ đồng thời chia hết cho 3. Đếm các các phần tử có giá trị lớn hơn 7 trong mảng.\n"
                + "29.	Tính tổng các phần tử dương, chẵn. In kết quả ra màn hình.\n"
                + "30.	In các số không chia hết cho 3 trên 1 dòng. Dòng tiếp theo in các số chia hết cho 3 nhưng không chia hết cho 5. Dòng thứ 3 in tất cả các phần tử trong mảng.\n"
                + "31.	Tính tổng các số có giá trị nằm trong đoạn [a, b] với (a< b) là các số nguyên được nhập từ bàn phím\n"
                + "32.	Đếm các phần từ là số chính phương của mảng\n"
                + "33.	Đếm các phần tử là số nguyên tố của mảng\n"
                + "\n");
        System.out.println("Lựa chọn 0: Thoát ứng dụng");

        do {
            System.out.print("\n\n\nNhập vào lựa chọn: ");
            values = scanner.nextInt();
            switch (values) {
                case 1:
                    bai10_Tainguyen.op1();
//                    check = true;
                    break;
                case 2:
                    bai10_Tainguyen.op2();
//                    check = true;
                    break;
                case 3:
                    bai10_Tainguyen.op3();
//                    check = true;
                    break;
                case 4:
                    bai10_Tainguyen.op4();
//                    check = true;
                    break;
                case 5:
                    bai10_Tainguyen.op5();
//                    check = true;
                    break;
                case 6:
                    bai10_Tainguyen.op6();
//                    check = true;
                    break;
                case 7:
                    bai10_Tainguyen.op7();
//                    check = true;
                    break;
                case 8:
                    bai10_Tainguyen.op8();
//                    check = true;
                    break;
                case 9:
                    bai10_Tainguyen.op9();
//                    check = true;
                    break;
                case 10:
                    bai10_Tainguyen.op10();
//                    check = true;
                    break;
                case 12:
                    bai10_Tainguyen.op12();
//                    check = true;
                    break;
                case 13:
                    bai10_Tainguyen.op13();
//                    check = true;
                    break;
                case 14:
                    bai10_Tainguyen.op14();
//                    check = true;
                    break;
                case 15:
                    bai10_Tainguyen.op15();
//                    check = true;
                    break;
                case 16:
                    bai10_Tainguyen.op16();
//                    check = true;
                    break;
                case 17:
                    bai10_Tainguyen.op17();
//                    check = true;
                    break;
                case 18:
                    bai10_Tainguyen.op18();
//                    check = true;
                    break;
                case 19:
                    bai10_Tainguyen.op19();
//                    check = true;
                    break;
                case 20:
                    bai10_Tainguyen.op20();
//                    check = true;
                    break;
                case 21:
                    bai10_Tainguyen.op21();
//                    check = true;
                    break;
                case 22:
                    bai10_Tainguyen.op22();
//                    check = true;
                    break;
                case 23:
                    bai10_Tainguyen.op23();
//                    check = true;
                    break;
                case 24:
                    bai10_Tainguyen.op24();
//                    check = true;
                    break;
                case 25:
                    bai10_Tainguyen.op25();
//                    check = true;
                    break;
                case 26:
                    bai10_Tainguyen.op26();
//                    check = true;
                    break;
                case 27:
                    bai10_Tainguyen.op27();
//                    check = true;
                    break;
                case 28:
                    bai10_Tainguyen.op28();
//                    check = true;
                    break;
                case 29:
                    bai10_Tainguyen.op29();
//                    check = true;
                    break;
                case 30:
                    bai10_Tainguyen.op30();
//                    check = true;
                    break;
                case 31:
                    bai10_Tainguyen.op31();
//                    check = true;
                    break;
                case 32:
                    bai10_Tainguyen.op32();
//                    check = true;
                    break;
                case 33:
                    bai10_Tainguyen.op33();
//                    check = true;
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
