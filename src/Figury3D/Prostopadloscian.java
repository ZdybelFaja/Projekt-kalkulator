package Figury3D;

public class Prostopadloscian extends FiguraPrzestrzenna {

    private double a;
    private double b;
    private double c;


    public Prostopadloscian() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
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

    public  double obliczPole() {
        return 2*a*b+2*a*c+2*b*c;
    }

    @Override
    public double ObliczObjetosc() {
        return (a*b)*c;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBok: "+a+", "+b+" Wysokosc: "+c+" Pole: "+obliczPole()+" Objetosc: "+ObliczObjetosc();
    }


}
