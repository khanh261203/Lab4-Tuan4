/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diemhocvien;

/**
 *
 * @author ADMIN
 */
import java.util.List;

class LopHoc {
    private List<DiemHocVien> hocVien;

    public LopHoc(List<DiemHocVien> hocVien) {
        this.hocVien = hocVien;
    }

    public int soLuongLuanVanTotNghiep() {
        int count = 0;
        for (DiemHocVien hocVien : hocVien) {
            if (coDiemTrungBinhTren7(hocVien) && khongCoMonDuoi5(hocVien)) {
                count++;
            }
        }
        return count;
    }

    public int soLuongThiTotNghiep() {
        int count = 0;
        for (DiemHocVien hocVien : hocVien) {
            if (!coDiemTrungBinhTren7(hocVien) && khongCoMonDuoi5(hocVien)) {
                count++;
            }
        }
        return count;
    }

    public int soLuongThiLai() {
        int count = 0;
        for (DiemHocVien hocVien : hocVien) {
            if (coMonDuoi5(hocVien)) {
                count++;
            }
        }
        return count;
    }

    private boolean coDiemTrungBinhTren7(DiemHocVien hocVien) {
        double diemTrungBinh = tinhDiemTrungBinh(hocVien);
        return diemTrungBinh > 7.0;
    }

    private boolean khongCoMonDuoi5(DiemHocVien hocVien) {
        for (double diem : hocVien.getDiemMonHoc()) {
            if (diem < 5.0) {
                return false;
            }
        }
        return true;
    }
    private boolean coMonDuoi5(DiemHocVien hocVien) {
    for (double diem : hocVien.getDiemMonHoc()) {
        if (diem < 5.0) {
            return true;
        }
    }
    return false;
}

private double tinhDiemTrungBinh(DiemHocVien hocVien) {
    List<Double> diemMonHoc = hocVien.getDiemMonHoc();
    double tongDiem = 0.0;
    for (double diem : diemMonHoc) {
        tongDiem += diem;
    }
    return tongDiem / diemMonHoc.size();
}

}
                
