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
                meineKunden[i].setName(scn.nextLine());
                break;
            }
        }
    }

    public void eingabeNeuesSchiffAnlegen(){
        Scanner scn = new Scanner(System.in);
        System.out.print("\n\nEingabe Kundennummer: ");
        int kundenNr = scn.nextInt();
        System.out.print("Eingabe Schiffstyp: (1: Motorschiff, 2: Segelschiff): ");
        int type = scn.nextInt();
        if (type == 1) {
            System.out.print("\nEingabe Schiffname: ");
            String name = scn.next();
            System.out.print("\nEingabe Tonnage: ");
            double tonnage = scn.nextDouble();
            System.out.print("\nMotorleistung (in PS): ");
            double motorleistung = scn.nextDouble();
            for (int i = 0; i < meineKunden.length; i++) {
                if (meineKunden[i] != null) {
                    if (kundenNr == meineKunden[i].getKundenNr()) {
                        if (meineKunden[i].neuesMotorSchiffAnlegen(name, tonnage, motorleistung)) {
                            System.out.println("Yippie!!");
                            break;
                        } else {
                            System.out.println("Didn't work!");
                            break;
                        }
                    }
                }
            }
        } else if (type == 2) {
            System.out.print("\nEingabe Schiffname: ");
            String name = scn.next();
            System.out.print("\nEingabe Tonnage: ");
            double tonnage = scn.nextDouble();
            System.out.print("\nEingabe Segelflaeche: ");
            double segelflaeche = scn.nextDouble();
            for (int i = 0; i < meineKunden.length; i++) {
                if (meineKunden[i] != null) {
                    if (kundenNr == meineKunden[i].getKundenNr()) {
                        if (meineKunden[i].neuesSegelSchiffAnlegen(name, tonnage, segelflaeche)) {
                            System.out.println("Yippie!!");
                            break;
                        } else {
                            System.out.println("Didn't work!");
                            break;
                        }
                    }
                }
            }
        }
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
                for (int j = 0; j < meineKunden[i].getMeineSchiffe().length; j++) {
                    if (meineKunden[i].getMeineSchiffe()[j] != null) {
                        if (meineKunden[i].getMeineSchiffe()[j] instanceof MotorSchiff) {
                            System.out.println((j+1) + ".\t Schiff: " + meineKunden[i].getMeineSchiffe()[j].getName() + "\n\tSchiffstyp: " + meineKunden[i].getMeineSchiffe()[j].getSchiffsTyp() + "\n\tTonnage: " + meineKunden[i].getMeineSchiffe()[j].getTonnage()
                             + "\n\tMotorleistung: " + ((MotorSchiff)meineKunden[i].getMeineSchiffe()[j]).getMotorLeistung() + " PS");
                        }

                        if (meineKunden[i].getMeineSchiffe()[j] instanceof SegelSchiff ) {
                            System.out.println((j+1) + ".\t Schiff: " + meineKunden[i].getMeineSchiffe()[j].getName() + "\n\tSchiffstyp: " + meineKunden[i].getMeineSchiffe()[j].getSchiffsTyp() + "\n\tTonnage: " + meineKunden[i].getMeineSchiffe()[j].getTonnage()
                                    + "\n\tSegelflaeche: " + ((SegelSchiff)meineKunden[i].getMeineSchiffe()[j]).getSegelFlaeche() + " qm");
                        }
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
                    break;
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

//NZ9T52