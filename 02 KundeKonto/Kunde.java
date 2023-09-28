public class Kunde {

    private int kundenNr;
    private String kundenName;

    private Konto meinKonto;

    public Kunde(int kundenNr, String kundenName) {
        this.kundenNr = kundenNr;
        this.kundenName = kundenName;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public String getKundenName() {
        return kundenName;
    }

    public void setKundenName(String kundenName) {
        this.kundenName = kundenName;
    }

    public void neuesKontoAnlegen(Konto meinKonto) {
        this.meinKonto = meinKonto;
    }

    public Konto getMeinKonto() {
        return meinKonto;
    }
}
