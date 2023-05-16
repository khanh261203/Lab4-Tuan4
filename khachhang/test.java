/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khachhang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class test {
    public static void main(String[] args) {
        ArrayListt a =new ArrayListt();
        Scanner s = new Scanner(System.in);
        int c = 0;
        while(true){
            System.out.println("nhap lua chon");
            System.out.println("1 de nhap ds hoa don viet nam");
            System.out.println("2 de hien thi danh sach hoa don viet nam");
            System.out.println("3 de nhạp ds hoa don nuoc ngoai");
            System.out.println("4 de hien thi ds hoa don nuoc ngoai");
            System.out.println("5 de tinh sl của tung loai hoa don ");
            System.out.println("6 de tinh trung binh thanh tien nuoc ngoai");
            System.out.println("0 de out");
            c = s.nextInt();
            if(c==1)
                a.Themvn();
            else if(c==2)
                a.hienthidsdienVN();
            else if(c==3)
                a.themnn();
            else if(c==4)
                a.hienthinn();
            else if(c==5){
                System.out.println("SL khach hang NN");
                a.SLKHNN();
                System.out.println("SL khach hang VN");
                a.SLKHVN();
            }
            else if(c==6)
                a.thanhTien();
            else 
                break;
        }
    }
    
}
