package Composite;

public class DipartimentoMatematica implements Dipartimento{
    private String nome;

    public DipartimentoMatematica(String nome) {
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
