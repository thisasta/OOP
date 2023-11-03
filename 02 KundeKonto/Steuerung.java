import java.util.Scanner;

public class Steuerung {
  private Kunde meinKunde;
  
  public void eingabeNeueKundenDaten() {
    Scanner sc = new Scanner(System.in);     
    System.out.print("\nName des Kontoinhabers: ");
    String kundenName = sc.nextLine();
    System.out.print("Eingabe Kundennr: ");
    int kundenNr = sc.nextInt();   
    meinKunde = new Kunde(kundenNr, kundenName);
    
  }
  
  public void auswahlMenue() {

    int auswahl = 1;
    int counterKonten = 0;
    Scanner sc1 = new Scanner(System.in);

    eingabeNeueKundenDaten();
    while (auswahl != 0) {
      System.out.println("Auswahlmenue");
      System.out.println("Neues Konto eroeffnen: \t ---> 1");
      System.out.println("Kontenuebersicht: \t ---> 2");
      System.out.println("Abfrage Kontostand: \t ---> 3");
      System.out.println("Einzahlung: \t ---> 4");
      System.out.println("Auszahlung: \t ---> 5");
      System.out.println("Konto löschen \t ---> 6");
      System.out.println("Programm beenden: \t ---> 0");
      System.out.println();
      System.out.print("Auswahleingabe: \t");
      auswahl = sc1.nextInt();
      switch (auswahl) {
        case 1:
          if (counterKonten < 3) {
            eingabeNeuesKontoAnlegen();
            counterKonten++;
          } else {
            System.out.println("Du hast schon 3 Kontes.");
          }
          break;
        case 2:
          System.out.println("\nKontenübersicht:");
          meinKunde.kontenUebersicht();
          System.out.println("\n\n\n");
          break;

        case 3:
          abfrageKontoStand();
          System.out.println("\n\n\n");
          break;

        case 4:
          einzahlen();
          System.out.println("\n\n\n");
          break;

        case 5:
          auszahlen();
          System.out.println("\n\n\n");
          break;

        case 6:
          loescheKonto();
          System.out.println("\n\n\n");
          break;
      }
    }

    System.exit(0);

    /*
    System.out.println("\nKontenübersicht:");
    this.meinKunde.kontenUebersicht();
     */
    
  }


  public void eingabeNeuesKontoAnlegen() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Eingabe KontoNr: ");
    String kontoNr = sc.next();
    System.out.print("Eingabe Kontotyp: ");
    String kontoTyp = sc.next();
    if (meinKunde.neuesKontoAnlegen(kontoNr, kontoTyp)) {
      System.out.println("Konto wurde angelegt.");
    }else {
      System.out.println("Konto wurde nicht angelegt, da nur " + this.meinKunde.getMeineKonten().length + " angelegt werden können.");
    }
  }

  public void abfrageKontoStand() {
    System.out.println("KONTOSTAND: ");
    System.out.print("Bitte die KontoNr eingeben: ");
    Scanner sc = new Scanner(System.in);
    String kontoNr = sc.next();
    double kontoStand = meinKunde.abfrageKontoStand(kontoNr);
    if (!Double.isNaN(kontoStand)){
      System.out.println(kontoStand);
    } else {
      System.out.println("Verpiss dich!");
    }
  }

  public void einzahlen() {S
    System.out.println("EINZAHLEN: ");
    System.out.print("Bitte die KontoNr eingeben: ");
    Scanner sc = new Scanner(System.in);
    String kontoNr = sc.next();

    System.out.print("Bitte den Betrag eingeben: ");
    double betrag = sc.nextDouble();
    if (meinKunde.einzahlen(kontoNr, betrag)) {
      System.out.println("Die Einzahlung war erfolgreich!");
    } else {
      System.out.println("Bei der Einzahlung ist etwas schief gelaufen...");
    }
  }

  public void auszahlen() {
    System.out.println("AUSZAHLEN");
    System.out.print("Bitte die KontoNr eingeben: ");
    Scanner sc = new Scanner(System.in);
    String kontoNr = sc.next();

    System.out.print("Bitte den Betrag eingeben: ");
    double betrag = sc.nextDouble();
    if (meinKunde.auszahlen(kontoNr, betrag)) {
      System.out.println("Die Auszahlung war erfolgreich!");
    } else {
      System.out.println("Bei der Auszahlung ist etwas schief gelaufen...");
    }
  }

  public void loescheKonto() {
    System.out.println("KONTO LOESCHEN: ");
    System.out.print("Bitte die KontoNr eingeben: ");
    Scanner sc = new Scanner(System.in);
    String kontoNr = sc.next();

    if (meinKunde.loescheKonto(kontoNr)){
      System.out.println("Konto wurde geloescht!");
    } else {
      System.out.println("Beim Loeschen ist etwas schief gelaufen.");
    }
  }

  public static void main(String[] args) {
    Steuerung st = new Steuerung();
    st.auswahlMenue();
  }
}
