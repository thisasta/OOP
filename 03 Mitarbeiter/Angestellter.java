/**
  * Lösung Aufgabe 1: Mitarbeiter - Angestellter
  * @author Michael Schlosser
  */

public class Angestellter extends Mitarbeiter {
  //double einkommen;
  // Erweiterung der Klasse Mitarbeiter
  public void arbeitsplatz() {
    System.out.println("\tIch arbeite im Buero!" );
  }
  public void setEinkommen(double ek){
    super.einkommen = ek;   
  }
  
  public void kennung() {
    System.out.println("\tIch bin ein Angestellter der " + firma + ".");
  }
  public void kennung(String f) {
    this.firma = f;
    System.out.println("\tIch bin ein Angestellter der " + firma + ".");
  }
  
}

