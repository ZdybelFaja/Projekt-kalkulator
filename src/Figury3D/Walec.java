package Figury3D;

public class Walec extends FiguraPrzestrzenna {

    private double r;
    private double h;

    public Walec() {
        this.r = 1.0;
        this.h = 1.0;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setWysokosc(double h) {
        this.h = h;
    }

    public  double obliczPole() {
        return (2*Math.PI*r*h)+(2*Math.PI*r*r);
    }

    @Override
    public double ObliczObjetosc() {
        return Math.PI*r*r*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien: "+r+" Wysokosc: "+h+" Pole: "+obliczPole()+" Objetosc: "+ObliczObjetosc();
    }

}