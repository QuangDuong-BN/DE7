package de7;

import java.util.Scanner;

public class thiSinh {
    public String ten ;
    public String ngaySinh;
    public String diaChi;

    public thiSinh() {
    }

    public thiSinh(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten :");
        setTen(scanner.nextLine());
        System.out.println("nhap ngay sinh :");
        setNgaySinh(scanner.nextLine());
        System.out.println("nhap dia chi :");
        setDiaChi(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "{" +
                "ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
