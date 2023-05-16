/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diemhocvien;

/**
 *
 * @author ADMIN
 */

    
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DiemHocVien hocVien1 = new DiemHocVien("Nguyen Van A", 1999, Arrays.asList(8.0, 7.5, 9.0, 8.5, 7.0));
        DiemHocVien hocVien2 = new DiemHocVien("Tran Thi B", 2000, Arrays.asList(6.0, 6.5, 7.0, 5.5, 7.0));
        DiemHocVien hocVien3 = new DiemHocVien("Le Van C", 2001, Arrays.asList(9.0, 8.0, 9.5, 8.5, 9.0));
        DiemHocVien hocVien4 = new DiemHocVien("Pham Thi D", 2002, Arrays.asList(7.5, 6.5, 8.0, 4.5, 6.0));

        List<DiemHocVien> hocVien = new ArrayList<>();
        hocVien.add(hocVien1);
        hocVien.add(hocVien2);
        hocVien.add(hocVien3);
        hocVien.add(hocVien4);

        LopHoc lopHoc = new LopHoc(hocVien);

        int soLuongLuanVan = lopHoc.soLuongLuanVanTotNghiep();
        int soLuongThiTotNghiep = lopHoc.soLuongThiTotNghiep();
        int soLuongThiLai = lopHoc.soLuongThiLai();

        System.out.println("Số lượng học viên làm luận văn tốt nghiệp: " + soLuongLuanVan);
        System.out.println("Số lượng học viên thi tốt nghiệp: " + soLuongThiTotNghiep);
        System.out.println("Số lượng học viên phải thi lại: " + soLuongThiLai);
    }

}
