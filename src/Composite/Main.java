package Composite;

public class Main {
    public static void main(String[] args) {
        DipartimentoFisica dipartimentoFisica = new DipartimentoFisica("Dipartimento di Fisica");
        DipartimentoMatematica dipartimentoMatematica = new DipartimentoMatematica("Dipartimento di Matematica");

        DipartimentoTecnologico dipartimentoTecnologico = new DipartimentoTecnologico();
        dipartimentoTecnologico.add(dipartimentoFisica);
        dipartimentoTecnologico.add(dipartimentoMatematica);

        dipartimentoTecnologico.stampaNomeDipartimento();
    }
}
