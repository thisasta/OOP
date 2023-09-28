public class Konto {
    private String kontoNr;
    private String kontoTyp;

    public Konto(String kontoNr, String kontoTyp) {
        this.kontoNr = kontoNr;
        this.kontoTyp = kontoTyp;
    }

    public String getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;
    }

    public String getKontoTyp() {
        return kontoTyp;
    }

    public void setKontoTyp(String kontoTyp) {
        this.kontoTyp = kontoTyp;
    }
}
