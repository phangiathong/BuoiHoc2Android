/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    //1
    private String masv;
    private String tensv;
    private boolean gt;
    private String sdt;
//2
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
//3
    public SinhVien(String masv, String tensv, boolean gt, String sdt) {
        this.masv = masv;
        this.tensv = tensv;
        this.gt = gt;
        this.sdt = sdt;
    }
    //Xuat thong tin sv //4
    public void xuatSV() {
        String sex = "";
        if(isGt()) {
            sex ="Nam";
        } else {
            sex="Nu";
        }
        System.out.println("Ma sv:" + getMasv());
        System.out.println("Ten sv:" + getTensv());
        System.out.println("Gioi tinh:" +sex);
        System.out.println("SDT sv:" + getSdt());
    }
    //6
    //toString
    @Override
    public String toString() {
        String sex = "";
        if(isGt()) {
            sex ="Nam";
        } else {
            sex="Nu";
        }
        return "Ma sinh vien " + getMasv() + "\nTen sinh vien " + getTensv()+"\nGioi tinh "+sex+"\nSDT "+getSdt();
    }
    
}
