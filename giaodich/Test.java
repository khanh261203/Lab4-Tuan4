/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodich;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
            ArrayListt ar = new ArrayListt();
            Scanner sc = new Scanner(System.in);
           
            while(true)
            {
                 int chon = 0;
            System.out.println("nhap lua chon");
            System.out.println("1 de nhap dat");
            System.out.println("2 de nhap nha");
            System.out.println("3 de hien thi dat");
            System.out.println("4 de hien thi nha");
            System.out.println("5 hien thi kich thuoc nha va dat");
            System.out.println("6 hien thi thanh tien trung binh nha va dat");
            System.out.println("0 de out");
            chon= sc.nextInt();
                if(chon==1)
                    ar.themDat();
                
                else if(chon==2)
                    ar.themNha();
                
                else if(chon==3)
                    ar.hienthiDat();
                    
                else if(chon==4)
                    ar.hienthiNha();
                    
                else if(chon==5){
                    System.out.println("kich thuoc cua nha");
                    ar.soluongGDNha();
                    System.out.println("kich thuoc cua dat");
                    ar.soluongGDDat();
    }
                else if(chon==6){
                    System.out.println("trung binh tien dat");
                    ar.trungBinhTienDat();
                    System.out.println("trung binh tien nha");
                    ar.trungBinhTienNha();
                  
                            }  
                else
                    break;
            }
            
    }
}
