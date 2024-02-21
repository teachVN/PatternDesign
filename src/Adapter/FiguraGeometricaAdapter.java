package Adapter;

public class FiguraGeometricaAdapter implements Figura{

    private FiguraGeometrica figuraGeometrica;

    public FiguraGeometricaAdapter(FiguraGeometrica figuraGeometrica) {
        this.figuraGeometrica = figuraGeometrica;
    }

    public FiguraGeometrica getFiguraGeometrica() {
        return figuraGeometrica;
    }

    public void setFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
        this.figuraGeometrica = figuraGeometrica;
    }

    @Override
    public void perimetro() {
        figuraGeometrica.perimetro();
    }

    @Override
    public void area() {
        figuraGeometrica.area();
    }
}
