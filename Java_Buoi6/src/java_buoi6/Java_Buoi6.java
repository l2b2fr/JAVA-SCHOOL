/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_buoi6;

import java.util.Scanner;
import java_buoi6.bai1.*;
import java_buoi6.bai2.*;
import java_buoi6.bai2up1.*;
import java_buoi6.bai3.*;
import java_buoi6.bai4.bai4;
import java_buoi6.bai5.bai5;

/**
 *
 * @author LEMINHNAM
 */
public class Java_Buoi6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int values;
        boolean check = false;
        System.out.println("\n\nBÀI NÀY LÀM BỞI LÊ MINH NAM\n\n");
        System.out.println("Lựa chọn 1: Bài 1: Thực hiện lại ví dụ 2 trong slide bài giảng.\n");
        System.out.println("Lựa chọn 2: Bài 2: 1.	Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2  phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn hình\n");
        System.out.println("Lựa chọn 3: Bài 2.1: Nâng cấp bài 1 \n"
                + "1.Tạo lớp SanPham (giống bài 1) và thêm 2 hàm  tạo: Hàm tạo có tham số: tên sản phẩm, giá và giảm giá và hàm tạo thứ 2 là hàm tạo không tham số. \n"
                + "Cứ mỗi trường dữ liệu được khai private bạn cần định nghĩa một cập phương thức getter/setter để cho phép đọc ghi dữ liệu thông qua các  phương thức này. \n"
                + "2.Tạo lớp main() Sử dụng mảng để lưu trữ n sản phẩm (tham khảo code bài giảng)\n");
        System.out.println("Lựa chọn 4: Bài 3: Xây dựng lớp thuê bao Mobile mô tả thông tin về chủ sở hữu thuê bao điện thoại, gồm  các thông tin tên khách hàng, số thuê bao, tiền cước phí. \n"
                + "Nhập vào danh sách n thuê bao, hiện lên màn hình danh sách thuê bao có cước phí lớn nhất.\n");
        System.out.println("Lựa chọn 5: Bài 4:\n"
                + "	Xây dựng lớp nhanvien gồm các thông tin: Họ và tên, địa chỉ, tuổi, lương. và các phương thức: Phương thức nhập: nhập các thông tin của nhân viên, phương thức xuất: xuất các thông tin của nhân viên lên màn hình. \n"
                + "	Xây dựng chương trình chính nhập vào một danh sách các nhân viên. In ra những người có tuổi dưới 30 và thu nhập từ 500.000 trở lên. \n");
        System.out.println("Lựa chọn 6: Bài 5:\n"
                + "	Xây dựng lớp doibong gồm các thông tin: Tên đội bóng, số trận thắng, số trận hòa, số trận thua. và các phương thức: Phương thức nhập: nhập các thông tin của đội bóng, phương thức xuất: xuất các thông tin của đội bóng lên màn hình. \n"
                + "	Xây dựng chương trình chính nhập vào một danh sách các đội bóng. In ra đội bóng có số điểm cao nhất (với 1 trận thắng = 3 điểm, 1 trận hòa = 1 điểm và 1 trận thua = 0 điểm)\n");
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
                    bai2up1.run();
                    check = true;
                    break;
                case 4:
                    bai3.run();
                    check = true;
                    break;
                case 5:
                    bai4.run();
                    check = true;
                    break;
                case 6:
                    bai5.run();
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
