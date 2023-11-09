/**
  *
  * Lösung Aufgabe 1: Mitarbeiter - Angestellter
  * @author Michael Schlosser
  */

public class Mitarbeiter {
  protected String firma;
  protected String nachName;
  protected double einkommen;
  
  public Mitarbeiter() {
    firma = "Friedrich-List OHG";
    einkommen = 0;
  }
  public void kennung() {
    System.out.println("\tIch bin ein Mitarbeiter der " + firma + "." );
  }
  public void setName(String n){
    this.nachName = n;
  }
  public String getName(){
    return nachName;
  }
  public void abrechnung(){
    System.out.println("\tDas Einkommen betraegt : " + einkommen + " Euro." );
  }

  public void setFirma(String firma) {
    this.firma = firma;
  }
}

