package Composite;

import java.util.ArrayList;
import java.util.List;

public class DipartimentoTecnologico implements Dipartimento{

    private List<Dipartimento> dipartimenti = new ArrayList<>();

    public void add(Dipartimento dipartimento){
        dipartimenti.add(dipartimento);
    }
    @Override
    public void stampaNomeDipartimento() {
        dipartimenti.stream().forEach(Dipartimento::stampaNomeDipartimento);
    }
}
