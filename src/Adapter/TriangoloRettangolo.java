package Adapter;

public class TriangoloRettangolo implements Figura{

    private double base;
    private double altezza;
    private double latoObliquo;

    public TriangoloRettangolo(double base, double altezza, double latoObliquo) {
        this.base = base;
        this.altezza = altezza;
        this.latoObliquo = latoObliquo;
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

    public double getLatoObliquo() {
        return latoObliquo;
    }

    public void setLatoObliquo(double latoObliquo) {
        this.latoObliquo = latoObliquo;
    }

    @Override
    public void perimetro() {
        System.out.println(base+altezza+latoObliquo);
    }

    @Override
    public void area() {
        System.out.println((base*altezza)/2);
    }
}
