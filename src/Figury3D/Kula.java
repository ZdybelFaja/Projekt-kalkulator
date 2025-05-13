package Figury3D;

public class Kula extends FiguraPrzestrzenna {

    private double r;

    public Kula() {
        this.r = 1.0;
    }


    public void setR(double r) {
        this.r = r;
    }


    public  double obliczPole() {
        return 4*Math.PI*r*r;
    }

    @Override
    public double ObliczObjetosc() {
        return (4.0/3.0)*Math.PI*r*r*r;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien: "+r+" Pole: "+obliczPole()+" Objetosc: "+ObliczObjetosc();
    }

}
