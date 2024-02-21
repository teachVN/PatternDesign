package Singleton;

public class Main {
    public static void main(String[] args) {
        CorsoEpicode corsoEpicode = CorsoEpicode.createObject();

        System.out.println(corsoEpicode);
        System.out.println(corsoEpicode.hashCode());

        CorsoEpicode corsoEpicode1 = CorsoEpicode.createObject();
        System.out.println(corsoEpicode);
        System.out.println(corsoEpicode.hashCode());


    }
}
