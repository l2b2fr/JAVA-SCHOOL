/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_buoi4;

import java.util.Scanner;
import java_buoi4.bai10.bai10;
/**
 *
 * @author LEMINHNAM
 */
public class Java_Buoi4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int values;
        boolean check = false;
        System.out.println("\n\nBÀI NÀY LÀM BỞI LÊ MINH NAM\n\n");
        System.out.println("Lựa chọn 1: Bài 1: Viết chương trình nhập mảng số nguyên từ bàn phím.\n"
                + "-	Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3\n"
                + "-	Sắp xếp và xuất mảng vừa nhập ra màn hình. \n");
        System.out.println("Lựa chọn 2: Bài 2: Viết chương trình nhập vào một mảng số nguyên có n phần tử và thực hiện các công việc sau (viết bằng hàm-phương thức)\n");
        System.out.println("Lựa chọn 3: Bài 3: Viết chương trình thực hiện các công việc sau:\n"
                + "-	Nhập liệu cho mảng có n phần tử nguyên (n > 0) từ bàn phím.\n"
                + "-	Nhập số nguyên k từ bàn phím. \n"
                + "-	Tìm kiếm phần tử trong mảng có giá trị bằng k thì thông báo lên màn hình k có trong mảng. Nếu không có phần tử nào của mảng có giá trị bằng k thì thông báo \"Trong mảng không có phần tử nào chứa giá trị cần tìm.\"\n");
        System.out.println("Lựa chọn 4: Bài 4: Viết chương trình thực hiện các công việc sau: \n"
                + "	Nhập một mảng có n phần tử nguyên từ bàn phím (n > 0). Sau đó nhập vào số nguyên k và xóa các phần tử trong mảng có giá trị bằng k.\n");
        System.out.println("Lựa chọn 5: Bài 5: Viết chương trình tách đôi mảng số nguyên ban đầu sang hai mảng, một nửa đầu sang mảng thứ nhất và nửa còn lại sang mảng thứ hai. Sau đó hiển thị hai mảng đó ra màn hình.\n");
        System.out.println("Lựa chọn 6: Bài 6: Nhập một mảng số nguyên a0, a1, a2, …, an-1. Sử dụng phương thức tiện ích Array sort sắp xếp mảng vừa nhập. In ra mảng trước và sau sắp xếp.\n");
        System.out.println("Lựa chọn 7: Bài 7: Nhập một mảng số nguyên a0, a1, a2, …, an-1. Nhập vào một số, sử dụng phương thức tiện ích array tìm vị trí xuất hiện đầu tiên của số đó trong dãy.");
        System.out.println("Lựa chọn 8: Bài 8: Viết chương trình nhập vào các phần tử cho 1 ArrayList từ bàn phím. Sau đó tìm và hiển thị phần tử lớn nhất, nhỏ nhất trong ArrayList đó.");
        System.out.println("Lựa chọn 9: Bài 9: Nhập vào một mảng (sử dụng ArrayList nhập mảng), hãy loại bỏ các phần tử trùng nhau trong mảng chỉ gữi lại 1 phần tử");
        System.out.println("Lựa chọn 10: Bài 10: Một cái menu nữa");
        System.out.println("Lựa chọn 0: Thoát ứng dụng");

        do {
            System.out.print("\n\n\nNhập vào lựa chọn: ");
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
                case 9:
                    bai9.run();
                    check = true;
                    break;
                case 10:
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
