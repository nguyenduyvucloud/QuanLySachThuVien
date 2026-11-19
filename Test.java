package com.mycompany.btt07t62;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        Sach s1 = new Sach("001", "Lap trinh Java", "Nguyen Van A", 2022, 10);
        Sach s2 = new Sach("002", "Lap trinh C", "Nguyen Van B", 2023, 15);
        Sach s3 = new Sach("003", "Co so du lieu", "Nguyen Van C", 2024, 20);

        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        System.out.println("===== DANH SACH CAC CUON SACH =====");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
        System.out.println("Tong so dau sach: " + danhSachSach.size());
        System.out.println("\n===== KIEM TRA SETTER & GETTER  =====");
        s1.setNamXuatBan(3000);
        s1.setSoLuong(-5);

        s1.setSoLuong(25);
        System.out.println("So luong moi cua sach " + s1.getTieuDe() + ": " + s1.getSoLuong());
    }
}