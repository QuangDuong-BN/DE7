package de7;

import java.util.Scanner;

public class sinhVienKhoiC extends thiSinh {
    public int diemVan;
    public int diemSu;
    public int diemDia;

    public sinhVienKhoiC() {
    }

    public sinhVienKhoiC(String ten, String ngaySinh, String diaChi, int diemVan, int diemSu, int diemDia) {
        super(ten, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public int getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(int diemVan) {
        this.diemVan = diemVan;
    }

    public int getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(int diemSu) {
        this.diemSu = diemSu;
    }

    public int getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(int diemDia) {
        this.diemDia = diemDia;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner =new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("nhap diem van :");
        setDiemVan(scanner.nextInt());
        System.out.println("nhap diem su :");
        setDiemSu(scanner.nextInt());
        System.out.println("nhap diem dia :");
        setDiemDia(scanner.nextInt());

    }

    @Override
    public String toString() {
        return "sinhVienKhoiB{" +
                "diemVan=" + diemVan +
                ", diemSu=" + diemSu +
                ", diemDia=" + diemDia +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
