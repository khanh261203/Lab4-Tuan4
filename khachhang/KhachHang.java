/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.khachhang;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String maKH;
    private String hoTen;
    private LocalDate ngayTao;
    private double slTieuThu;
    private double donGia;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, LocalDate ngayTao, double slTieuThu, double donGia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayTao = ngayTao;
        this.slTieuThu = slTieuThu;
        this.donGia = donGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getSlTieuThu() {
        return slTieuThu;
    }

    public void setSlTieuThu(double slTieuThu) {
        this.slTieuThu = slTieuThu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", ngayTao=" + ngayTao + ", slTieuThu=" + slTieuThu + ", donGia=" + donGia + '}';
    }
    
}
