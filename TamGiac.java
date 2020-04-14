package BTDuongThang;

import java.util.InputMismatchException;

public class TamGiac{
    private Diem A;
    private Diem B;
    private Diem C;
    private DuongThang dt1;
    private DuongThang dt2;
    private DuongThang dt3;

    public TamGiac(Diem a, Diem b, Diem c) {
        A = a;
        B = b;
        C = c;
        dt1= new DuongThang(A,B);
        dt2= new DuongThang(B,C);
        dt3= new DuongThang(A,C);
        check();
    }

    public double ChuVi(){

        if(check())
        return dt1.dodai()+dt2.dodai()+dt3.dodai();
        else return 0;
    }
    public double DienTich(){

        if(check()) {
            double p = ChuVi() / 2;
            return Math.sqrt(p * (p - dt1.dodai()) * (p - dt2.dodai()) * (p - dt3.dodai()));
        }
        else return 0;
    }

    public boolean check(){
        double a=dt1.dodai();
        double b=dt2.dodai();
        double c=dt3.dodai();
        if(a+b>c||a+c>b||b+c>a) return true;
        else return false;
    }
//    public void check(){
//
//        double a=dt1.dodai();
//        double b=dt2.dodai();
//        double c=dt3.dodai();
//        if(a+b==c||a+c==b||b+c==a){
//            throw new InputMismatchException("3 diem ko tao tam giac");
//        }
//
//    }
}
