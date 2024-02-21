package Adapter;

public class Rettangolo implements FiguraGeometrica{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public void perimetro() {
        System.out.println((base+altezza)*2);
    }

    @Override
    public void area() {
        System.out.println(base*altezza);
    }
}
