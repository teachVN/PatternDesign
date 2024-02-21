package Adapter;

public class Quadrato implements Figura{
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public void perimetro() {
        System.out.println(lato*4);
    }

    @Override
    public void area() {
        System.out.println(lato*lato);
    }
}
