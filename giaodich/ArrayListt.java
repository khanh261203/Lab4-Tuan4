/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.giaodich;

/**
 *
 * @author ADMIN
 */
import static java.lang.System.out;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListt {
    private ArrayList<GiaoDichDat> listDat = new ArrayList<GiaoDichDat>();
    private ArrayList<GiaoDichNha> listNha = new ArrayList<GiaoDichNha>();
    GiaoDichDat d = new GiaoDichDat();
    GiaoDichNha n = new GiaoDichNha();
    Scanner sc = new Scanner(System.in);
    public void themDat(){
        System.out.println("nhap vao ma giao dich ");
        d.setMaGD(sc.nextLine());
        
        //System.out.println("nhap vao ngay giao dich ");
        /*String inputString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate date = LocalDate.parse(inputString, formatter);
            System.out.println("Ngày tháng năm đã nhập: " + date);
        } catch (Exception e) {
            System.out.println("Định dạng ngày không hợp lệ!");
        }
        sc.close();
        */
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày GD (dd/MM/yyyy): ");
        String ngayGDTxt = scanner.nextLine();
        //LocalDate ngayGD = convertStringToLocalDate(ngayGDTxt);
        //scanner.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate date = LocalDate.parse(ngayGDTxt, formatter);
        //System.out.println("Ngày tháng năm đã nhập: " + date);
        d.setNgayGD(date);
        
        System.out.println("nhap vao don gia ");
        d.setDonGia(sc.nextDouble());sc.nextLine();
        
        System.out.println("nhap vao loai dat ");
        d.setLoaiDat(sc.nextLine());sc.nextLine();
        
        System.out.println("nhaop vao dien tich ");
        d.setDienTich(sc.nextDouble());sc.nextLine();
        
        listDat.add(d);
    }
    public void hienthiDat(){
        for(GiaoDichDat d : listDat){
            System.out.println("danh sach cac giao dich dat :");
            System.out.println(d.toString());
        }
    }
    
    public void soluongGDDat(){
        System.out.println(listDat.size());
    }
    
    public double trungBinhTienDat(){
        double tich=0;
        int count=0;
        for(int i = 0; i<listDat.size() ; i++){
            tich += d.thanhTien();
            count++;
        }
        return tich/count;
    }
    
    /*public void XuatGD92013(){
        for(int i = 0; i< listDat.size(); i++)
       // for(GiaoDichDat a : listDat)
        {
         String[] ngayThangNam = d.getNgayGD().split("/");  
            String ngay = ngayThangNam[0];
            String thang = ngayThangNam[1];
            String nam = ngayThangNam[2];

            int thangInt = Integer.parseInt(thang);
            int namInt = Integer.parseInt(nam);

            if (thangInt == 9 && namInt == 2013) {
                System.out.println("Ngay: " + ngay + ", Thang: " + thang + ", Nam: " + nam);
            }
    }
    }*/
    
    
     public void themNha(){
        System.out.println("nhap vao ma giao dich ");
        n.setMaGD(sc.nextLine());
        
        //System.out.println("nhap vao ngay giao dich ");
        /*String inputString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate date = LocalDate.parse(inputString, formatter);
            System.out.println("Ngày tháng năm đã nhập: " + date);
        } catch (Exception e) {
            System.out.println("Định dạng ngày không hợp lệ!");
        }
        sc.close();
        */
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày GD (dd/MM/yyyy): ");
        String ngayGDTxt = scanner.nextLine();
        //LocalDate ngayGD = convertStringToLocalDate(ngayGDTxt);
        //scanner.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate date = LocalDate.parse(ngayGDTxt, formatter);
        //System.out.println("Ngày tháng năm đã nhập: " + date);
       n.setNgayGD(date);
        
        System.out.println("nhap vao don gia ");
        n.setDonGia(sc.nextDouble());sc.nextLine();
        
        System.out.println("nhap vao loai nha ");
        n.setLoaiNha(sc.nextLine());sc.nextLine();
        
         System.out.println("nhap vao dia chi");
         n.setDiaChia(sc.nextLine());
        
        System.out.println("nhaop vao dien tich ");
        n.setDienTich(sc.nextDouble());sc.nextLine();
        
        listNha.add(n);
    }
    public void hienthiNha(){
        for(GiaoDichNha n : listNha){
            System.out.println("danh sach cac giao dich nha :");
            System.out.println(n.toString());
        }
    }
    
    public void soluongGDNha(){
        System.out.println(listNha.size());
    }
    
    public double trungBinhTienNha(){
        double tich=0;
        int count=0;
        for(int i = 0; i<listNha.size() ; i++){
            tich += n.thanhTien();
            count++;
        }
        return tich/count;
    }
}
