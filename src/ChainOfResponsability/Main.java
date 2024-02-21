package ChainOfResponsability;

public class Main {

    public static void main(String[] args) {
        ContoBancario contoBancario = new ContoBancario();
        contoBancario.setSaldo(1400);
        contoBancario.setNumeroConto(65414);
        contoBancario.setPrelievo(1379);
        contoBancario.setPrelievoRimanente(1379);

        Erogatore1 erogatore1 = new Erogatore1();
        Erogatore5 erogatore5 = new Erogatore5();
        Erogatore10 erogatore10 = new Erogatore10();
        Erogatore20 erogatore20 = new Erogatore20();
        Erogatore50 erogatore50 = new Erogatore50();
        Erogatore100 erogatore100 = new Erogatore100();
        Erogatore200 erogatore200 = new Erogatore200();
        Erogatore500 erogatore500 = new Erogatore500();
        erogatore500.setSuccessivo(erogatore100);
        //erogatore200.setSuccessivo(erogatore100);
        erogatore100.setSuccessivo(erogatore50);
        erogatore50.setSuccessivo(erogatore20);
        erogatore20.setSuccessivo(erogatore10);
        erogatore10.setSuccessivo(erogatore5);
        erogatore5.setSuccessivo(erogatore1);

        erogatore100.eroga(contoBancario);

    }
}
