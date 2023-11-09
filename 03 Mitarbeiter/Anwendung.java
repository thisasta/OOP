/**
  *
  * Lösung Aufgabe 1: Mitarbeiter - Angestellter
  * @author Michael Schlosser
  */

public class Anwendung {
  
  public static void main (String[] args) {
    Mitarbeiter ma1;
    System.out.println("\n\n\tMitarbeiter 1:");
    ma1 = new Mitarbeiter();
    ma1.kennung();
    System.out.println("\t-----------------------------------------------" );
    
    System.out.println("\tAngestellter 1:");
    Angestellter an1;
    an1 = new Angestellter();
    an1.kennung();
    an1.arbeitsplatz();
    System.out.println("\t-----------------------------------------------" );
    
    System.out.println("\tAngestellter 2:");
    Angestellter an2;
    an2 = new Angestellter();
    an2.kennung("Hans-Dampf KG");
    an2.setEinkommen(3000);
    an2.abrechnung();
    System.out.println("\t-----------------------------------------------" );
    System.out.println();
    System.out.println();

    System.out.println("\tArbeiter 1:");
    Arbeiter ar1;
    ar1 = new Arbeiter();
    ar1.setFirma("Hans-Dampf KG");
    ar1.kennung();
    ar1.setEinkommen();
    ar1.abrechnung();
    System.out.println("\t-----------------------------------------------" );
    System.out.println();
    System.out.println();

    System.out.println("\tArbeiter 2:");
    Arbeiter ar2;
    ar2 = new Arbeiter();
    ar2.setFirma("Hans-Dampf KG");
    ar2.kennung();
    ar2.setEinkommen(80);
    ar2.abrechnung();
    System.out.println("\t-----------------------------------------------" );
    System.out.println();
    System.out.println();

    System.out.println("\tArbeiter 3:");
    Arbeiter ar3;
    ar3 = new Arbeiter();
    ar3.setFirma("Hans-Dampf KG");
    ar3.kennung();
    ar3.setEinkommen(120, 15);
    ar3.abrechnung();
    System.out.println("\t-----------------------------------------------" );
    System.out.println();
    System.out.println();

    System.out.println("\tAkkordarbeiter 1;");
    AkkordArbeiter aa1;
    aa1 = new AkkordArbeiter();
    aa1.setFirma("Hans-Dampf KG");
    aa1.kennung();
    aa1.setEinkommen(0.16, 1,500);
    aa1.abrechnung();
    System.out.println("\t-----------------------------------------------" );
    System.out.println();
    System.out.println();
  }
}

