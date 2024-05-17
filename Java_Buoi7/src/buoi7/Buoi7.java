/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi7;

import buoi7.bai1.bai1;
import buoi7.bai2.bai2;
import buoi7.bai3.bai3;
import buoi7.bai4.bai4;
import buoi7.bai5.bai5;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class Buoi7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int values;
        boolean check = false;
        System.out.println("\n\nBÀI NÀY LÀM BỞI LÊ MINH NAM\n\n");
        System.out.println("Bài 1: \n"
                + "	Xây dựng lớp nhanvien gồm các thông tin: Họ và tên, địa chỉ, tuổi, lương. và các phương thức: Phương thức nhập: nhập các thông tin của nhân viên, phương thức xuất: xuất các thông tin của nhân viên lên màn hình. \n"
                + "	Xây dựng chương trình chính nhập vào một danh sách các nhân viên. In ra những người có tuổi dưới 30 và thu nhập từ 500.000 trở lên. \n"
                + "Bài 2:\n"
                + "	Xây dựng lớp doibong gồm các thông tin: Tên đội bóng, số trận thắng, số trận hòa, số trận thua. và các phương thức: Phương thức nhập: nhập các thông tin của đội bóng, phương thức xuất: xuất các thông tin của đội bóng lên màn hình. \n"
                + "	Xây dựng chương trình chính nhập vào một danh sách các đội bóng. In ra đội bóng có số điểm cao nhất (với 1 trận thắng = 3 điểm, 1 trận hòa = 1 điểm và 1 trận thua = 0 điểm)\n"
                + "Bài 3: \n"
                + "	Trường Cao đẳng Công Nghệ Bách Khoa Hà Nội cần quản lý thông tin giảng viên gồm các thông tin: họ tên, ngày sinh, giới tính, khoa, trình độ (cử nhân, thạc sĩ, tiến sĩ), phụ cấp, số tiết dạy, hệ số lương. Lương giảng viên được tính như sau: Hệ số lương * 1.400.000 + phụ cấp + số tiết dạy * 45.000.\n"
                + "	Hãy viết chương trình thực hiện các chức năng sau:\n"
                + "	Nhập vào danh sách giảng viên trong trường.\n"
                + "	In danh sách giảng viên.\n"
                + "	Tính tổng lương phải trả cho giảng viên trong trường\n"
                + "Bài 4: \n"
                + "	Xây dựng lớp NhanVien gồm các thuộc tính: tên, tuổi, địa chỉ, tiền lương, tổng số giờ làm việc.\n"
                + "	Constructor không tham số, Constructor đầy đủ tham số. Các hàm get/set. Và các phương thức: InputInfo(), Output(), tinhThuong() để tính toán và trả về số tiền thưởng của nhân viên thông qua công thức sau:\n"
                + "	Nếu tổng số giờ làm của nhân viên >= 200 thì thưởng = lương * 200%.\n"
                + "	Nếu tổng số giờ làm việc của nhân viên <200 và >= 100 thì thưởng = lương * 10%\n"
                + "	Nếu tổng số giờ làm của nhân viên < 100 thì thưởng = 0.\n"
                + "Viết chương trình chính nhập vào 1 danh sách các nhân viên, in danh sách nv vừa nhập lên màn hình, đưa ra danh sách nhân viên có thưởng.\n"
                + "Bài 5:\n"
                + "	Xây dựng lớp sinhvien gồm các thông tin: Họ và tên, ngày sinh, quê quán, ngành học, năm vào trường và các phương thức: Phương thức nhập: nhập các thông tin của sinh viên, phương thức xuất: xuất các thông tin của sinh viên lên màn hình. \n"
                + "	Xây dựng chương trình chính nhập vào một danh sách các sinh viên. In danh sách các sinh viên lên màn hình và thông tin của các sinh viên có năm nhập trường gần nhất.");

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
