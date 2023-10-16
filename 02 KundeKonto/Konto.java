public class Konto {
  
  // Anfang Attribute
  private String kontoNr;
  private String kontoTyp;
  private double kontoStand;
  // Ende Attribute
  
  public Konto(String kontoNr){            //besonderen Kontruktor
    this.kontoNr = kontoNr;
  }
 
  
  public String getKontoTyp(){
    return kontoTyp;
  }
  
  public void setKontoTyp(String kontoTyp){
    this.kontoTyp = kontoTyp;
  }
  
  public String getKontoNr() {
    return this.kontoNr;
  }
  
  public void setKontoNr(String kontoNr) {
    this.kontoNr = kontoNr;
  }

  public double getKontoStand() {
    return kontoStand;
  }

  public void setKontoStand(double kontoStand) {
    this.kontoStand = kontoStand;
  }

  public boolean auszahlen(double betrag) {
    if (kontoStand < betrag) {
      kontoStand -= betrag;
      return true;
    }
    return false;
  }
  public void einzahlen(double betrag) {
    kontoStand += betrag;
  }


}

