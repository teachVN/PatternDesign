package Singleton;

import jdk.jfr.consumer.RecordedObject;

public class CorsoEpicode {
    
    private String nome;
    private String sede;
    
    private String argomenti;
    
    private static CorsoEpicode corsoEpicode;
    
    private CorsoEpicode(String nome, String sede, String argomenti){
        this.nome=nome;
        this.sede=sede;
        this.argomenti=argomenti;
    }

    public String getNome() {
        return nome;
    }

    public String getSede() {
        return sede;
    }

    public String getArgomenti() {
        return argomenti;
    }
    
    public static CorsoEpicode createObject(){
        if(corsoEpicode==null)
            corsoEpicode = new CorsoEpicode("CorsoBase", "Roma", "Informatica di base");

        return corsoEpicode;

    }

    @Override
    public String toString() {
        return "CorsoEpicode{" +
                "nome='" + nome + '\'' +
                ", sede='" + sede + '\'' +
                ", argomenti='" + argomenti + '\'' +
                '}';
    }
}
