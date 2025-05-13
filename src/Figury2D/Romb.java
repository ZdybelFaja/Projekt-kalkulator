package Figury2D;

public class Romb extends FiguraPlaska {

    private double a;
    private double e;
    private double f;

    public Romb() {
        this.a = 1.0;
        this.e = 1.0;
        this.f = 1.0;
    }


    public void setBok(double a) {
        this.a = a;
    }

    public void setF(double f) {
        this.f = f;
    }

    public void setE(double e) {
        this.e = e;
    }


    public  double obliczPole() {
        return (e*f)/2;
    }

    @Override
    public double ObliczObwod() {
        return a*4;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBok: "+a+", "+" Przekątne: "+e+", "+f+" Pole: "+obliczPole()+" Obwod: "+ObliczObwod();
    }
}
