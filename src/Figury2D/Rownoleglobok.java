package Figury2D;

public class Rownoleglobok extends FiguraPlaska {

    private double a;
    private double b;
    private double h;

    public Rownoleglobok() {
        this.a = 1.0;
        this.b = 1.0;
        this.h = 1.0;
    }

    public void setBokA(double a) {
        this.a = a;
    }

    public void setBokB(double b) {
        this.b = b;
    }

    public void setWysokosc(double h) {
        this.h = h;
    }

    public  double obliczPole() {
        return a*h;
    }

    @Override
    public double ObliczObwod() {
        return a*2+b*2;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBoki: "+a+", "+b+" Wysokosc: "+h+" Pole: "+obliczPole()+" Obwod: "+ObliczObwod();
    }



}
