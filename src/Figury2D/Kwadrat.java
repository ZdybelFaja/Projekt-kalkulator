package Figury2D;

public class Kwadrat extends FiguraPlaska {

    private double a;

    public Kwadrat() {
        this.a = 1.0;
    }

    public void setbok(double a) {
        this.a = a;
    }

    public  double obliczPole() {
        return a*a;
    }

    @Override
    public double ObliczObwod() {
        return a*4;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBok: "+a+" Pole: "+obliczPole()+" Obwod: "+ObliczObwod();
    }
}



