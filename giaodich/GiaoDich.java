/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.giaodich;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class GiaoDich {
    private String maGD;
    private LocalDate ngayGD;
    private double donGia;
    private double dienTich;

    public GiaoDich() {
    }
    
    public GiaoDich(String maGD, LocalDate date, double donGia, double dienTich) {
        
        this.maGD = maGD;
        this.ngayGD = date;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public LocalDate getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(LocalDate ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }
    
}
