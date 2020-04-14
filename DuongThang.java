package BTDuongThang;

public class DuongThang {
    private Diem A;
    private Diem B;

    public DuongThang(Diem a, Diem b) {
        A = a;
        B = b;
    }

    public Diem getA() {
        return A;
    }

    public Diem getB() {
        return B;
    }

    public double dodai(){
        return ( Math.sqrt(Math.pow(A.getX()-B.getX(),2)+Math.pow(A.getY()-B.getY(),2)));
    }
}
