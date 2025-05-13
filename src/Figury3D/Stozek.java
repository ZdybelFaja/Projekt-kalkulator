package Figury3D;

public class Stozek extends FiguraPrzestrzenna {

    private double r;
    private double h;
    private double l;

    public Stozek() {
        this.r = 1.0;
        this.h = 1.0;
        this.l = 1.0;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setWyskosc(double h) {
        this.h = h;
    }

    public void setL(double l) {
        this.l = l;
    }

    public  double obliczPole() {
        return (Math.PI*r*r)+(Math.PI*r*l);
    }

    @Override
    public double ObliczObjetosc() {
        return (1.0/3.0)*Math.PI*r*r*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien: "+r+" Wysokosc: "+h+" Bok: "+l+" Pole: "+obliczPole()+" Objetosc: "+ObliczObjetosc();
    }

}