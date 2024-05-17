/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_buoi5;

import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class Java_Buoi5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int values;
        boolean check = false;
        System.out.println("\n\nBÀI NÀY LÀM BỞI LÊ MINH NAM\n\n");
        System.out.println("Lựa chọn 1: Bài 1: Viết chương trình nhập vào 2 số a,b từ bàn phím nếu nhập không phải là số yêu cầu nhập lại cho đúng. Tìm UCLN 2 số đó.  \n");
        System.out.println("Lựa chọn 2: Bài 2: Viết chương trình tính tiền đi taxi Mai Linh với số km đi được nhập từ bàn phím, biết:\n");
        System.out.println("Lựa chọn 3: Bài 3: Viết chương trình nhập vào một chuỗi bất kỳ có ký tự thường và ký tự hoa từ bàn phím. Sau đó đếm có bao nhiêu kí tự in hoa trong chuỗi.\n");
        System.out.println("Lựa chọn 4: Bài 4: Cho trước một xâu ký tự là họ tên người đầy đủ. Hãy tách ra tên của người đó\n");
        System.out.println("Lựa chọn 5: Bài 5. Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ các dấu cách thừa, chuyển ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành chữ thường)\n");
        System.out.println("Lựa chọn 6: Bài 6. Nhập 2 mảng A gồm  a0 , a1 ,..., am-1   và  mảng B gồm b0 , b1 ,..., bn-1. Giả sử cả 2 mảng này đã được sắp theo thứ tự tăng dần. Hãy ghép 2 mảng thành mảng c  ci  cũng có thứ tự tăng dần\n");
        System.out.println("Lựa chọn 7: Bài 7. Cho hai ma trận vuông A cấp n. Hãy viết chương trình thực hiện các thao tác sau:\n"
                + "a.	Tìm hàng, cột hoặc đường chéo có tổng các phần tử lớn nhất.\n"
                + "b.	Tìm ma trận chuyển vị của A\n");
        System.out.println("Lựa chọn 8: Bài 8: Viết chương trình nhập từ bàn phím một chuỗi và một ký tự bất kỳ. Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.");
//        System.out.println("Lựa chọn 9: Bài 9: Nhập vào một mảng (sử dụng ArrayList nhập mảng), hãy loại bỏ các phần tử trùng nhau trong mảng chỉ gữi lại 1 phần tử");
        System.out.println("\nLựa chọn 0: Thoát ứng dụng\n");

        do {
            System.out.print("Nhập vào lựa chọn: ");
            values = scanner.nextInt();
            switch (values) {
                case 1:
                    bai1.run();
                    check = true;
                    break;
                case 2:
                    bai2.run();
                    check = true;
                    break;
                case 3:
                    bai3.run();
                    check = true;
                    break;
                case 4:
                    bai4.run();
                    check = true;
                    break;
                case 5:
                    bai5.run();
                    check = true;
                    break;
                case 6:
                    bai6.run();
                    check = true;
                    break;
                case 7:
                    bai7.run();
                    check = true;
                    break;
                case 8:
                    bai8.run();
                    check = true;
                    break;
//                case 9:
//                    bai9.run();
//                    check = true;
//                    break;
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
