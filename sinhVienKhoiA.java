package de7;

import java.util.Scanner;

public class sinhVienKhoiA extends thiSinh {
    public int diemToan;
    public int diemLy;
    public int diemHoa;


    public sinhVienKhoiA() {

    }

    public sinhVienKhoiA(String ten, String ngaySinh, String diaChi, int diemToan, int diemLy, int diemHoa) {
        super(ten, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("nhap diem toan:");
        setDiemToan(scanner.nextInt());
        System.out.println("nhap diem ly:");
        setDiemLy(scanner.nextInt());
        System.out.println("nhap diem hoa :");
        setDiemHoa(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "sinhVienKhoiA{" +
                "diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
