package Adapter;

import java.util.ArrayList;
import java.util.List;

public class CollezioneFigureGeometriche {
    private List<Figura> figure=new ArrayList<>();

    public void addFigura(Figura figura){
        figure.add(figura);
    }

    public void perimetri(){
        figure.stream().forEach(figura -> figura.perimetro());
    }

    public void aree(){
        figure.stream().forEach(figura -> figura.area());
    }

}
