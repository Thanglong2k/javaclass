package BTDuongThang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        double x1=scanner.nextDouble();
        double y1=scanner.nextDouble();
        double x2=scanner.nextDouble();
        double y2=scanner.nextDouble();
        double x3=scanner.nextDouble();
        double y3=scanner.nextDouble();

        double r=scanner.nextDouble();

        Diem A=new Diem(x1,y1);
        Diem B=new Diem(x2,y2);
        Diem C=new Diem(x3,y3);

        DuongThang dt1=new DuongThang(A,B);
        DuongThang dt2=new DuongThang(B,C);


        System.out.println(dt1.dodai());

        TamGiac a=new TamGiac(A,B,C);
        System.out.println(a.ChuVi());
        System.out.println(a.DienTich());

        HinhTron b=new HinhTron(A,r);
        System.out.println(b.chuVi());
        System.out.println(b.dienTich());

        ChuNhat c=new ChuNhat(dt1.dodai(),dt2.dodai());
        System.out.println(c.chuVi());
        System.out.println(c.dienTich());
    }
}
