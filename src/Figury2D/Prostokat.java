package Figury2D;

public class Prostokat extends FiguraPlaska {

    private double a;
    private double b;

    public Prostokat() {
        this.a = 1.0;
        this.b = 1.0;
    }

    public void setBokA(double a) {
        this.a = a;
    }

    public void setBokB(double b) {
        this.b = b;
    }




    public  double obliczPole() {
        return a*b;
    }

    @Override
    public double ObliczObwod() {
        return a*2+b*2;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBoki: "+a+", "+b+" Pole: "+obliczPole()+" Obwod: "+ObliczObwod();
    }


}
