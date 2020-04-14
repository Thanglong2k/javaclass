package BTDuongThang;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Demo {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

            int n=readInt("Ban nhap bao nhieu hinh:",0,100);
            for (int i = 0; i < n; i++) {
                showMenu();
                int chon = scanner.nextInt();
                switch (chon) {
                    case 1:
                        tamGiac();
                        break;
                    case 2:
                        chuNhat();
                        break;
                    case 3:
                        hinhTron();
                        break;
                    default:
                        System.out.println("chi nhap [1;3]");
                        break;
                }
            }

    }

    public static void showMenu(){
        System.out.println("Ban nhap hinh gi:");
        System.out.println("1.Tam Giac");
        System.out.println("2.Chu Nhat");
        System.out.println("3.Hinh Tron");
    }

    public static void tamGiac(){
        double x1,y1,x2,y2,x3,y3;
        System.out.println("nhap Diem 1:");
        x1=scanner.nextDouble();
        y1=scanner.nextDouble();
        System.out.println("nhap Diem 2:");
        x2=scanner.nextDouble();
        y2=scanner.nextDouble();
        System.out.println("nhap Diem 3:");
        x3=scanner.nextDouble();
        y3=scanner.nextDouble();
        Diem A=new Diem(x1,y1);
        Diem B=new Diem(x2,y2);
        Diem C=new Diem(x3,y3);
        TamGiac tamGiac=new TamGiac(A,B,C);
        System.out.println("Chu vi tam giac:"+tamGiac.ChuVi());
        System.out.println("Dien tich tam giac:"+tamGiac.DienTich());
    }

    public static void chuNhat(){
        double x,y;
        System.out.println("nhap chieu dai:");
        x=scanner.nextDouble();

        System.out.println("nhap chieu rong:");
        y=scanner.nextDouble();

        ChuNhat chuNhat=new ChuNhat(x,y);
        System.out.println("Chu vi HCN:"+ chuNhat.chuVi());
        System.out.println("Dien tich HCN:"+chuNhat.dienTich());
    }

    public static void hinhTron(){
        double r,x,y;
        System.out.println("nhap Ban Kinh:");
        r=scanner.nextDouble();
        System.out.println("nhap Tam");
        x=scanner.nextDouble();
        y=scanner.nextDouble();
        Diem A=new Diem(x,y);
        HinhTron O =new HinhTron(A,r);
        System.out.println("Chu vi HCN:"+ O.chuVi());
        System.out.println("Dien tich HCN:"+O.dienTich());
    }
    private static int readInt(String message,int lowerBound,int upperBound){
        int n;
        do {
            System.out.println(message);
            n = scanner.nextInt();
            if(n<1||n>100)
                System.out.println("phai nhap "+ n +" trong ["+lowerBound+";"+upperBound+"]");
        }while(n<1||n>100);
        return n;
    }
}
