package ChainOfResponsability;

public abstract class Erogatore {

    private Erogatore successivo;

    private int valoreBanconota;



    public Erogatore getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(Erogatore successivo) {
        this.successivo = successivo;
    }

    public int getValoreBanconota() {
        return valoreBanconota;
    }

    public void setValoreBanconota(int valoreBanconota) {
        this.valoreBanconota = valoreBanconota;
    }

    public void eroga(ContoBancario contoBancario) {
        int saldo = contoBancario.getSaldo();
        int prelievoRimanente = contoBancario.getPrelievoRimanente();


        if(saldo>=prelievoRimanente){
            if(prelievoRimanente>=valoreBanconota){
                int numeroBanconote = prelievoRimanente/valoreBanconota;
                contoBancario.setPrelievoRimanente(prelievoRimanente%valoreBanconota);
                contoBancario.setSaldo(saldo-numeroBanconote*valoreBanconota);
                System.out.println("Erogate " + numeroBanconote + " banconote da " + valoreBanconota + "€");
            }
            else{
                System.out.println("Erogate 0 banconote da " + valoreBanconota + "€");
            }

            if(successivo!=null)
                getSuccessivo().eroga(contoBancario);
        }
        else{
            System.out.println("Saldo insufficiente");
        }


    }
}
