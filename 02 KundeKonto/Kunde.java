import java.util.*;    


public class Kunde {
  
  private int kundenNr;
  private String kundenName;
  private Konto[] meineKonten = new Konto[3];
  
  public Kunde(int kundenNr, String kundenName){
    this.kundenNr = kundenNr;
    this.kundenName = kundenName;   
     }  
  
  // Anfang Methoden
  public int getKundenNr(){
    return this.kundenNr;
  }
  
  public void setKundenNr(int kundenNr){
    this.kundenNr = kundenNr;
  }
  
  public String getKundenName(){
    return this.kundenName;
  }
  
  public void setKundenName(String kundenName){
    this.kundenName = kundenName;
  }

  public Konto[] getMeineKonten() {
    return meineKonten;
  }
  
  public boolean neuesKontoAnlegen(String kontoNr, String kontoTyp){
    /*
    this.meineKonten[index] = new Konto(kontoNr);
    this.meineKonten[index].setKontoTyp(kontoTyp);
     */

    for (int i = 0; i < meineKonten.length; i++) {
      if (meineKonten[i] == null) {
        this.meineKonten[i] = new Konto(kontoNr);
        this.meineKonten[i].setKontoTyp(kontoTyp);
        return true;
      }
    }

    return false;
  }
  
  public void kontenUebersicht(){
    System.out.println(this.kundenName + "(KundenNr: " + this.kundenNr +") hat folgende Konten: ");
    for (int i = 0; i < this.getMeineKonten().length; i++) {
      if (meineKonten[i] != null) {
        System.out.println((i+1) + ". Konto: " + this.meineKonten[i].getKontoTyp() + " " + this.meineKonten[i].getKontoNr());
      }
    }

  }

  public boolean auszahlen(String kontoNr, double betrag) {
    for (int i = 0; i < meineKonten.length; i++) {
      if (this.meineKonten != null) {
        if (this.meineKonten[i].getKontoNr().equals(kontoNr) && this.meineKonten[i].getKontoStand() >= betrag) {
          this.meineKonten[i].auszahlen(betrag);
          return true;
        }
      }
    }
    return false;
  }

  public boolean einzahlen(String kontoNr, double betrag) {
    for (int i = 0; i < meineKonten.length; i++) {
      if (this.meineKonten[i] != null){
        if (this.meineKonten[i].getKontoNr().equals(kontoNr) && betrag > 0) {
          this.meineKonten[i].einzahlen(betrag);
          return true;
        }
      }
    }
    return false;
  }

  public boolean loescheKonto(String kontoNr) {
    for (int i = 0; i < meineKonten.length; i++) {
      if (this.meineKonten[i] != null) {
        if (this.meineKonten[i].getKontoNr().equals(kontoNr)) {
          meineKonten[i] = null;
          return true;
        }
      }
    }
    return false;
  }

  public double abfrageKontoStand(String kontoNr) {
    for (int i = 0; i < meineKonten.length; i++) {
      if (this.meineKonten[i] != null){
        if (meineKonten[i].getKontoNr().equals(kontoNr)) {
          return meineKonten[i].getKontoStand();
        }
      }
    }
    return Double.NaN;
  }

}

