import java.util.Scanner;

public class Steuerung {

    static Kunde kunde1;
    static Kunde kunde2;


    public Kunde eingabeNeueKundenDaten() {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("\nName des Kontoinhabers: ");
        String name = sc1.next();
        System.out.print("\nEingabe Kundennr: ");
        int nr = sc1.nextInt();
        return new Kunde(nr, name);
    }

    public Konto eingabeNeuesKontoAnlegen() {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("\nEingabe KontoNr: ");
        String kontoNr = sc1.next();

        System.out.print("\nEingabe Kontotyp: ");
        String kontoTyp = sc1.next();
        System.out.println("\n\n");

        return new Konto(kontoNr, kontoTyp);
    }

    public void kontenUebersicht() {
        System.out.println("Kontenübersicht: ");
        System.out.println(kunde1.getKundenName() + " (" + kunde1.getKundenNr() + ") hat das " + kunde1.getMeinKonto().getKontoTyp() + " " + kunde1.getMeinKonto().getKontoNr());
        System.out.println(kunde2.getKundenName() + " (" + kunde2.getKundenNr() + ") hat das " + kunde2.getMeinKonto().getKontoTyp() + " " + kunde2.getMeinKonto().getKontoNr());
    }

    public static void main(String[] args) {

        Steuerung steuerung = new Steuerung();
        kunde1 = steuerung.eingabeNeueKundenDaten();
        kunde1.neuesKontoAnlegen(steuerung.eingabeNeuesKontoAnlegen());
        kunde2 = steuerung.eingabeNeueKundenDaten();
        kunde2.neuesKontoAnlegen(steuerung.eingabeNeuesKontoAnlegen());
        steuerung.kontenUebersicht();

    }
}
