/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_buoi5;

import db_Connection.SQLDatabaseExecute;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai4 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String user = "admin"; // Thiết lập giá trị cho user
        String pass = "password"; // Thiết lập giá trị cho pass

        // Bài 1: Tách tên từ chuỗi họ tên
        String fullName = "Nguyen Van A";
        String[] parts = fullName.split(" ");
        String lastName = parts[parts.length - 1];
        System.out.println("Tên của người là: " + lastName);

        // Bài 2: Yêu cầu người dùng nhập username và password và kiểm tra
        String username;
        String password;
        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.print("Nhập username: ");
            username = scanner.nextLine();
            System.out.print("Nhập password: ");
            password = scanner.nextLine();

            // Kiểm tra username và password
            if (username.equals(user) && password.equals(pass)) {
                isAuthenticated = true;
                System.out.println("Tên đăng nhập là: " + username + " và password là: " + password);
            } else {
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.");
            }
        }
    }
}
