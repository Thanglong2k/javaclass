package BTDuongThang;

public class HinhTron {
    private Diem o;
    private  double r;

    public HinhTron(Diem o, double r) {
        super();
        this.o = o;
        this.r = r;
    }



    public double chuVi(){
        return 2*Math.PI*r;
    }

    public double dienTich(){
        return Math.PI*r*r;
    }
}
