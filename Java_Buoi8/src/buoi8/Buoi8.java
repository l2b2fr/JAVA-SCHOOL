/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi8;

import buoi8.bai1.bai1;
import buoi8.bai2.bai2;
import buoi8.bai3.bai3;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class Buoi8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int values;
        boolean check = false;
        System.out.println("\n\nBÀI NÀY LÀM BỞI LÊ MINH NAM\n\n");
        System.out.println("Bài 1\n"
                + "Xây dựng lớp A gồm\n"
                + "-	 2 thuộc tính x, y và 2 phương thức khời tạo có tham số và không tham số. \n"
                + "-	Phương thức nhập và xuất thông tin x,y ra màn hình.\n"
                + "Xây dựng lớp B kế thừa lớp A có thêm thuộc tính z. Xuất thông tin ra màn hình.\n"
                + "Bài 2: \n"
                + "-	Tạo một lớp person lưu trữ các thông tin:\n"
                + "+	 Thuộc tính: họ và tên, giới tính, địa chỉ, ngày sinh.\n"
                + "+	 Phương thức: Nhập thông tin, xuất thông tin\n"
                + "Với đầy đủ các hàm get,set, contructor có tham số và không có tham số.\n"
                + "-	Tạo một lớp Student kế thừa từ lớp person lưu trữ thêm các thông tin như dưới đây: \n"
                + "+	Mã sinh viên, điểm trung bình, email.\n"
                + "+	Viết một phương thức nhập thông tin của student\n"
                + "+	Viết một phương thức hiện thị thông tin của student\n"
                + "+	Viết phương trình xem xét có sinh viên nào được học bổng không? điểm trung bình hơn 8.0 sẽ được hổng bổng.\n"
                + "Sử dụng để quản lý n sinh viên trên\n"
                + "HƯỚNG DẪN:\n"
                + "-	Khai báo class Person có 4 biến bao gồm (hoten, gioitinh,diachi,ngaysinh) và có 2 phương thức:\n"
                + "+	 nhap : Là phương thức nhập thông tin\n"
                + "+	xuat : Xuất hiện thông tin\n"
                + "+	Và 2 hàm tạo có đối số và không đối số\n"
                + "-	Khai báo một lớp student được kế thừa từ lớp Person\n"
                + "+	Thêm thuộc tính Mã sinh viên, điểm trung bình, email.\n"
                + "+	Tạo 2 hàm tạo kế thừa từ person sử dụng: super(thamso)\n"
                + "+	Phương thức nhập thông tin, xuất thông tin kế thừa từ lớp person sử dụng ghi đè lên phương thức nhập xuất của lớp person.\n"
                + "+	Viết phương thức kiểm tra có đạt học bổng hay không?\n"
                + "if(this.dtb >=8){\n"
                + "			System.out.println(\"Duoc hoc bong\");\n"
                + "	}else{\n"
                + "			System.out.println(\"Khong duoc hoc bong\");\n"
                + "		}\n"
                + "Sử dụng mảng để quản lý n sinh viên (tham khảo code bài giảng)\n"
                + "Bài 3: Xây dựng một chương trình quản lý điểm SinhVien \n"
                + "-	Xây dựng lớp SinhVien với cấu trúc như sau: Mã số sinh viên; Họ đệm; Tên sinh viên; Giới tính; \n"
                + "-	Xây dựng lớp SinhVienBiz có kế thừa từ lớp SINHVIEN và bổ sung thêm các thành phần:\n"
                + "o	Điểm MMT; Điểm Web;\n"
                + "o	Điểm trung bình các môn học=(Điểm MMT *3+ Điểm Web *4)/7.\n"
                + "o	Xếp loại dựa vào quy định sau:\n"
                + "-	Yếu: điểm < 5; Trung bình: 5 <= điểm < 6.5; Khá: 6.5 <= điểm < 7.5; Giỏi: 7.5 <= điểm < 9; Xuất sắc: điểm >= 9\n"
                + "Thực hiện các yêu cầu:  \n"
                + "a. Xây dựng các lớp với chức năng kế thừa\n"
                + "-	Xây dựng các phương thức nhập xuất danh sách sinh viên.\n"
                + "-	Xây dựng phương thức tính điểm trung bình.\n"
                + "-	Xây dựng phương thức Xếp loại sinh viên\n"
                + "b. Nhập vào một mảng gồm N (N nguyên dương) SinhVienBiz, sau đó in lên màn hình danh sách sinh viên đó. ");

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
//                case 4:
//                    bai4.run();
//                    check = true;
//                    break;
//                case 5:
//                    bai5.run();
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
