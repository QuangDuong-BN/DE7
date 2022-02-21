package de7;

import java.util.ArrayList;
import java.util.Scanner;

public class mainChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n :");
        int n = scanner.nextInt();
        System.out.println("so luong sinh vien khoi A :");
        int soLuongA = scanner.nextInt();
        int soLuongC = n - soLuongA;

        System.out.println("--- nhap sinh vien khoi A ---");
        ArrayList<sinhVienKhoiA> list1 = new ArrayList<>(soLuongA);
        for (int i = 0; i < soLuongA; i++) {
            System.out.println("nhap sv khoi A , thu : "+(i+1));
            sinhVienKhoiA sv = new sinhVienKhoiA();
            sv.nhapThongTin();
            list1.add(sv);

        }

        System.out.println("--- nhap sinh vien khoi C ---");
        ArrayList<sinhVienKhoiC> list2 = new ArrayList<>(soLuongC);
        for (int i = 0; i < soLuongC; i++) {
            System.out.println("nhap sv khoi C ,thu : "+(i+1));
            sinhVienKhoiC sv = new sinhVienKhoiC();
            sv.nhapThongTin();
            list2.add(sv);
        }

        System.out.println("nhung sinh vien dat chi tieu :");
        for (int i = 0; i < soLuongA; i++) {

            int tongdiem = list1.get(i).diemHoa+ list1.get(i).diemLy + list1.get(i).diemToan ;
            if(tongdiem>20 ) System.out.println(list1.get(i).ten);
        }
        for (int i = 0; i < soLuongC; i++) {

            int tongdiem = list2.get(i).diemDia+ list2.get(i).diemSu + list2.get(i).diemVan ;
            if(tongdiem>20 ) System.out.println(list2.get(i).ten);
        }



    }
}
