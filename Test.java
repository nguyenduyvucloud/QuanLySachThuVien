
package com.mycompany.btt07t62;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // Tao danh sach sach
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Tao cac doi tuong sach
        Sach s1 = new Sach("001", "Lap trinh Java",
                "Nguyen Van A", 2022, 10);

        Sach s2 = new Sach("002", "Lap trinh C",
                "Nguyen Van B", 2023, 15);

        Sach s3 = new Sach("003", "Co so du lieu",
                "Nguyen Van C", 2024, 20);

        // Them sach vao danh sach
        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        // Hien thi danh sach sach
        System.out.println("===== DANH SACH CAC CUON SACH =====");

        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }

        // Hien thi tong so dau sach
        System.out.println("Tong so dau sach: "
                + danhSachSach.size());
    }
}
