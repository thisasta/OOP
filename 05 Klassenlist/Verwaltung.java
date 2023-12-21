import java.util.Scanner;

public class Verwaltung {
    private Klasse meineKlasse;

    public Verwaltung() {
        meineKlasse = new Klasse();
    }

    public void eingabe() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Klassenbezeichnung: ");
        meineKlasse.setName(scn.nextLine());
        System.out.println("Name des Tutors: ");
        String tutorName = scn.nextLine();
        System.out.println("Kürzel des Tutors: ");
        meineKlasse.setMeinTutor(new Lehrer(tutorName, scn.nextLine()));
        String cont = "j";
        do {
            System.out.println("\nName des Schuelers: ");
            meineKlasse.neuerSchuelerHinzufuegen(scn.nextLine());
            System.out.println("\nWollen sie einen weiteren Schüler anlegen? (Ja: j, Nein: n)");
            cont = scn.nextLine();
        }while(cont.equalsIgnoreCase("j"));
    }

    public void automatischeEingabe() {
        meineKlasse.setName("BG12-DV");
        meineKlasse.setMeinTutor(new Lehrer("Michael Schlosser", "SCLO"));

        meineKlasse.neuerSchuelerHinzufuegen("Max Muster");
        meineKlasse.neuerSchuelerHinzufuegen("Friedrich List");
        meineKlasse.neuerSchuelerHinzufuegen("Tim Tester");
        meineKlasse.neuerSchuelerHinzufuegen("Birgit Beispiel");


        for (Schueler temp : meineKlasse.getMeineSchueler()) {
            temp.neuenKursHinzufuegen("LK PI: Objektorientierte Softwareentwickelung", 6);
        }


        meineKlasse.getMeineSchueler().get(0).neuenKursHinzufuegen("GK IT: Betriebssysteme", 3);
        meineKlasse.getMeineSchueler().get(0).neuenKursHinzufuegen("GK Englisch: The Challenge of Individualism", 3);
        meineKlasse.getMeineSchueler().get(1).neuenKursHinzufuegen("GK Sport: Fussball", 2);
        meineKlasse.getMeineSchueler().get(1).neuenKursHinzufuegen("GK Englisch: The Challenge of Individualism", 3);

        meineKlasse.getMeineSchueler().get(2).neuenKursHinzufuegen("GK IT: Betriebssysteme", 3);

    }

    public void menue() {
        int menueI;
        do {
        System.out.println("1: Neue Klasse anlegen\n2: Ausgabe der Daten der Klasse\n3: automatische Eingabe\n0: Programm schließen");
        Scanner scn = new Scanner(System.in);
        menueI = scn.nextInt();
            switch (menueI) {
                case 1:
                    eingabe();
                    break;
                case 2:
                    ausgabe();
                    break;
                case 3:
                    automatischeEingabe();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (menueI != 0);

    }

    public void ausgabe() {
        System.out.println("Klassenbezeichnung: " + meineKlasse.getName());
        System.out.println("Tutor: " + meineKlasse.getMeinTutor().getName() + "(" + meineKlasse.getMeinTutor().getKuerzel() + ")");

        System.out.println(meineKlasse.ausgabeSchuelerMitKursen());
    }

    public static void main(String[] args) {
        Verwaltung v = new Verwaltung();
        v.menue();
    }
}
