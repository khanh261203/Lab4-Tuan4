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
public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String loaiDat, String maGD, LocalDate ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" + super.toString()+ "loaiDat=" + loaiDat + '}';
    }
    public double thanhTien(){
        double sum = 0;
        if(getLoaiDat()=="A")
            sum = getDienTich() * getDonGia() * 1.5;
        if(getLoaiDat()=="B" || getLoaiDat()=="C")
            sum = getDienTich() * getDonGia();
        return sum;    
    }
   // private ArrayList<GiaoDichDat> list = new ArrayList<GiaoDichDat>();
}
