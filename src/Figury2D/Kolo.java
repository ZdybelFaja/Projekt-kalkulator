package Figury2D;

public class Kolo extends FiguraPlaska {

    private double r;

    public Kolo() {
        this.r = 1.0;
    }

    public void setPromien(double r) {
        this.r = r;
    }

    public  double obliczPole() {
        return Math.PI*r*r;
    }

    @Override
    public double ObliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien: "+r+", "+" Pole: "+obliczPole()+" Obwod: "+ObliczObwod();
    }
}
