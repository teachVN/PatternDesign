package Composite;

public class DipartimentoFisica implements Dipartimento{
    private String nome;

    public DipartimentoFisica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void stampaNomeDipartimento() {
        System.out.println(nome);
    }
}
