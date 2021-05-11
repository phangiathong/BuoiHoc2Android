/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2hoc2;

import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author ADMIN
 */
public class BUOI2HOC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //5
        SinhVien sv1 = new SinhVien("0001","Nguyen An",true,"0147852");
        System.out.println(sv1);
        SinhVien sv2 = new SinhVien("0002","Hanh",false,"0546852");
        System.out.println(sv2);
        //7
        ArrayList<SinhVien> listsv = new ArrayList<SinhVien>();
        listsv.add(sv1);
        listsv.add(sv2);
        
        //lay thong tin tu list
        //cach 1
        for(int i = 0;i>listsv.size();i++){         
            System.out.println("" + listsv.get(i));
        }
        //cach 2
         for(int i = 0;i>listsv.size();i++){ 
            listsv.get(i).xuatSV();
        }
         //8
        System.out.println("Danh sach sau khi xoa");
         //xoa sv thu 2
        listsv.remove(1);
        for(int i = 0;i>listsv.size();i++){ 
            listsv.get(i).xuatSV();
        }
    }
    
}
