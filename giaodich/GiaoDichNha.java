/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodich;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChia;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String loaiNha, String diaChia) {
        this.loaiNha = loaiNha;
        this.diaChia = diaChia;
    }

    public GiaoDichNha(String loaiNha, String diaChia, String maGD, LocalDate ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChia = diaChia;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChia() {
        return diaChia;
    }

    public void setDiaChia(String diaChia) {
        this.diaChia = diaChia;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" + super.toString()+ "loaiNha=" + loaiNha + ", diaChia=" + diaChia + '}';
    }

    public double thanhTien(){
        double sum = 0;
        if(getLoaiNha()=="cao cap")
            sum = getDienTich() * getDonGia();
        if(getLoaiNha()=="thuong")
            sum = getDienTich() * getDonGia() * 0.09;
        return sum;
    }
    
}
