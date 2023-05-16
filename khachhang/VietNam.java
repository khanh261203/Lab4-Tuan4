/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khachhang;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class VietNam extends KhachHang{
    private String doiTuong;
    private double dinhMuc;

    public VietNam() {
    }

    public VietNam(String doiTuong, double dinhMuc) {
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public VietNam(String doiTuong, double dinhMuc, String maKH, String hoTen, LocalDate ngayTao, double slTieuThu, double donGia) {
        super(maKH, hoTen, ngayTao, slTieuThu, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "VietNam{"+super.toString() + "doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + '}';
    }
    
}
