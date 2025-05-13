package Figury3D;

public class Szescian extends FiguraPrzestrzenna {

    private double a;

    public Szescian() {
        this.a = 1.0;
    }


    public void setBok(double a) {
        this.a = a;
    }


    public  double obliczPole() {
        return (a*a)*6;
    }

    @Override
    public double ObliczObjetosc() {
        return a*a*a;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBok: "+a+" Pole: "+obliczPole()+" Objetosc: "+ObliczObjetosc();
    }

}
