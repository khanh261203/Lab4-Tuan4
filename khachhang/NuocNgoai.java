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
public class NuocNgoai extends KhachHang{
    private String quocTich;

    public NuocNgoai() {
    }

    public NuocNgoai(String quocTich, String maKH, String hoTen, LocalDate ngayTao, double slTieuThu, double donGia) {
        super(maKH, hoTen, ngayTao, slTieuThu, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public double thanhTien(){
        return super.getSlTieuThu() * super.getDonGia();
    }
    @Override
    public String toString() {
        return "NuocNgoai{"+ super.toString() + "quocTich=" + quocTich + '}';
    }
    
}
