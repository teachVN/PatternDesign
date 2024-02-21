package Adapter;

public class Main {

    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(4);
        Rettangolo rettangolo = new Rettangolo(3, 7);

        CollezioneFigureGeometriche collezioneFigureGeometriche = new CollezioneFigureGeometriche();

        collezioneFigureGeometriche.addFigura(quadrato);

        FiguraGeometricaAdapter rettangoloAdapter = new FiguraGeometricaAdapter(rettangolo);

        collezioneFigureGeometriche.addFigura(rettangoloAdapter);

        collezioneFigureGeometriche.aree();
        collezioneFigureGeometriche.perimetri();
    }
}
