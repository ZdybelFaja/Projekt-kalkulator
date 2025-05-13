package Figury2D;

public class Trojkat extends FiguraPlaska {

    private double a;
    private double b;
    private double c;
    private double h;

    public Trojkat() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
        this.h = 1.0;
    }


    public void setBokA(double a) {
        this.a = a;
    }

    public void setBokB(double b) {
        this.b = b;
    }

    public void setBokC(double c) {
        this.c = c;
    }

    public void setWysokosc(double h) {
        this.h = h;
    }



    public  double obliczPole() {
        return (a*h)/2;
    }

    @Override
    public double ObliczObwod() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBoki: "+a+", "+b+", "+c+" Wysokosc: "+h+" Pole: "+obliczPole()+" Obwod: "+ObliczObwod();
    }



}
