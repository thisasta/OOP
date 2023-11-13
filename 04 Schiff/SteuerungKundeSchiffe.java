import com.sun.tools.javac.Main;

import java.util.Scanner;

public class SteuerungKundeSchiffe {
    private Kunde[] meineKunden;

    public SteuerungKundeSchiffe() {
        meineKunden = new Kunde[5];
    }

    public void eingabeNeuenKundenAnlegen(){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < meineKunden.length; i++) {
            if (meineKunden[i] == null) {
                meineKunden[i] = new Kunde();
                System.out.print("Name des " + (i+1) + ". Kunden eingeben: ");
                meineKunden[i].setName(scn.next());
                break;
            }
        }
    }

    public boolean eingabeNeuesSchiffAnlegen(){
        Scanner scn = new Scanner(System.in);
        System.out.print("\n\nEingabe Kundennummer");
        int kundenNr = scn.nextInt();
        System.out.print("\nEingabe Name des Schiffes: ");
        String name = scn.next();
        System.out.print("\nEingabe Tonnage: ");
        double tonnage = scn.nextDouble();
        for (int i = 0; i < meineKunden.length; i++) {
            if (meineKunden[i] != null) {
                if (kundenNr == meineKunden[i].getKundenNr()) {
                    meineKunden[i].neuesSchiffAnlegen(name, tonnage);
                    return true;
                }
            }
        }
        return false;
    }

    public void ausgabeKunden(){
        System.out.println("Ausgabe von Kunden: \n");
        for (int i = 0; i < meineKunden.length; i++) {
            if (meineKunden[i] != null) {
                System.out.println(meineKunden[i].getName() + ": " + meineKunden[i].getKundenNr());
            }
        }
    }

    public void ausgabeKundenMitIhrenSchiffen(){
        System.out.println("Ausgabe von Kunden mit ihren Schiffen: ");
        for (int i = 0; i < meineKunden.length; i++) {
            if (meineKunden[i] != null) {
                System.out.println("Alle Schiffe von " + meineKunden[i].getName() + "(Kundennr: " + meineKunden[i].getKundenNr() + ") : ");
                for (int j = 0; j < meineKunden[i].meineSchiffe.length; j++) {
                    if (meineKunden[i].meineSchiffe[j] != null) {
                        System.out.println((j+1) + ". Schiff: " + meineKunden[i].meineSchiffe[j].getName() + " (Tonnage: " + meineKunden[i].meineSchiffe[j].getTonnage() + ")");
                    }
                }
            }
        }
    }

    public void menue() {
        int eingabe = 1;
        Scanner scn = new Scanner(System.in);
        while(eingabe!=0) {
            System.out.println("Auswahlmenü:");
            System.out.println("Neuen Kunden anlegen:\t\t\t\t\t\t\t---> 1");
            System.out.println("Neues Schiff anlegen:\t\t\t\t\t\t\t---> 2");
            System.out.println("Alle Kunden mit KundenNr ausgeben:\t\t\t\t---> 3");
            System.out.println("Alle Kunden mit ihren Schiffen ausgeben:\t\t---> 4");
            System.out.println("Programm beenden:\t\t\t\t\t\t\t\t---> 0");
            System.out.print("\nEingabe:");
            eingabe = scn.nextInt();
            switch (eingabe){
                case 0:
                    System.exit(0);
                case 1:
                    eingabeNeuenKundenAnlegen();
                    break;
                case 2:
                    eingabeNeuesSchiffAnlegen();
                    break;
                case 3:
                    ausgabeKunden();
                    break;
                case 4:
                    ausgabeKundenMitIhrenSchiffen();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SteuerungKundeSchiffe s = new SteuerungKundeSchiffe();
        s.menue();
    }
}
