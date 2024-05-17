/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LEMINHNAM
 */
public class bai2 {

    private static Scanner scanner = new Scanner(System.in);
    private static int size;

    private static DoiBong tinhDiemMax(ArrayList doiBongs) {
        DoiBong maxBong = (DoiBong) doiBongs.get(0);

        for (int i = 1; i < doiBongs.size(); i++) {
            DoiBong bong = (DoiBong) doiBongs.get(i);
            if (maxBong.getDiem() < bong.getDiem()) {
                maxBong = bong;
            }
        }
        return maxBong;
    }

    public static void run() {
        
        ArrayList<DoiBong> doiBongs = new ArrayList<>();
        System.out.println("Nhập số đội bóng: ");
        size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            DoiBong db = new DoiBong();

            System.out.print("Nhập Tên đội bóng " + (i + 1)
                    + ": ");
            scanner.nextLine();
            db.setTenDoiBong(scanner.nextLine());
            System.out.print("Nhập Số Trận Thắng đội bóng " + (i + 1)
                    + ": ");
            db.setSoTranThang(scanner.nextInt());
            System.out.print("Nhập Số Trận Hòa đội bóng " + (i + 1)
                    + ": ");
            db.setSoTranHoa(scanner.nextInt());
            System.out.print("Nhập Số Trận Thua đội bóng " + (i + 1)
                    + ": ");
            db.setSoTranThua(scanner.nextInt());

            int diem = (db.getSoTranThang() * 3) + db.getSoTranHoa();
            db.setDiem(diem);
            doiBongs.add(db);
        }

        DoiBong max = tinhDiemMax(doiBongs);
        max.getInfo();
    }
}
