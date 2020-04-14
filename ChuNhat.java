package BTDuongThang;

public class ChuNhat {
    private double a;
    private double b;

    public ChuNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double chuVi(){
        return 2*(a+b);
    }
    public double dienTich(){
        return a*b;
    }
}
