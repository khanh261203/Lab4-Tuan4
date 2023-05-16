/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khachhang;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ArrayListt {
    private ArrayList<VietNam> listvn = new ArrayList<VietNam>();
    private ArrayList<NuocNgoai> listnn = new ArrayList<NuocNgoai>();
    VietNam v = new VietNam();
    NuocNgoai n = new NuocNgoai();
    Scanner sc = new Scanner(System.in);
    
    public void Themvn(){
        System.out.println("Nhap ma KH");
        v.setMaKH(sc.nextLine());
        System.out.println("Nhap ho va ten Khach Hang");
        v.setHoTen(sc.nextLine());
        System.out.println("Nhap Ngay tao don");
        String date1 = sc.nextLine();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate date = LocalDate.parse(date1, f);
        v.setNgayTao(date);
        System.out.println("nhap vao so luong tieu thu dien");
        v.setSlTieuThu(sc.nextDouble());
        System.out.println("nhap vao don gia ");sc.nextLine();
        v.setDonGia(sc.nextDouble());sc.nextLine();
        System.out.println("nhap vao doi tuong khach hang là: sinhhoat,kinhdoanh,sãnuat");
        v.setDoiTuong(sc.nextLine());
        System.out.println("nhap vaon dinh muc");
        v.setDinhMuc(sc.nextDouble());
        listvn.add(v);
    }
    
    public void hienthidsdienVN(){
        for(VietNam i : listvn){
            System.out.println("danh sach khach hang dong tien dien");
            System.out.println(i.toString());
        }
    }
    
    public void SLKHVN(){
        for(int i = 0; i<listvn.size();i++){
            System.out.println("so luong khach hang vietnam");
            System.out.println(i);
        }
    }
    
    public void themnn(){
        System.out.println("Nhap ma KH");
        n.setMaKH(sc.nextLine());
        System.out.println("Nhap ho va ten Khach Hang");
        n.setHoTen(sc.nextLine());
        System.out.println("Nhap Ngay tao don");
        String date1 = sc.nextLine();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(date1, f);
        n.setNgayTao(date);
        System.out.println("nhap vao so luong tieu thu dien");
        n.setSlTieuThu(sc.nextDouble());
        System.out.println("nhap vao don gia ");sc.nextLine();
        n.setDonGia(sc.nextDouble());sc.nextLine();
        System.out.println("nhap vao quoc tich");
        n.setQuocTich(sc.nextLine());
        listnn.add(n);
    }
    
    public void hienthinn(){
        for(NuocNgoai i : listnn){
            System.out.println("Danh Sach Tien dien khach hang");
            System.out.println(i.toString());
        }
    }
    
    public void SLKHNN(){
        for(int i = 0; i<listnn.size();i++){
            System.out.println("SL khach hang nuoc ngoai la");
            System.out.println(i);
        }
    }
    
    public double thanhTien(){
        double sum = 0;
        for(NuocNgoai i : listnn){
            sum+= i.thanhTien();
        }
        return sum/listnn.size();
    }
}
