import com.sun.tools.javac.Main;

import java.util.Scanner;

public class SteuerungKundeSchiffe {
    Kunde[] meineKunden = new Kunde[5];

    public SteuerungKundeSchiffe() {

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

    public void eingabeNeuesSchiffAnlegen(){
        Scanner scn = new Scanner(System.in);
        System.out.print("\n\nEingabe Kundennummer");
    }

    public void ausgabeKunden(){

    }

    public void ausgabeKundenMitIhrenSchiffen(){

    }

    public void menue() {
        int eingabe = 1;
        Scanner scn = new Scanner(System.in);
        while(eingabe!=0) {
            System.out.println("Auswahlmenü:");
            System.out.println("Neuen Kunden anlegen:\t\t\t\t\t\t\t---> 1");
            System.out.println("Neues Schiff anlegen:\t\t\t\t\t\t\t---> 2");
            System.out.println("Alle Kunden mit Kundennr ausgeben:\t\t\t\t---> 3");
            System.out.println("Alle Kunden mit ihren Schiffen ausgeben:\t\t---> 4");
            System.out.println("Programm beenden:\t\t\t\t\t\t\t\t---> 0");
            System.out.print("\nEingabe:");
            eingabe = scn.nextInt();
            switch (eingabe){
                case 1:
                    eingabeNeuenKundenAnlegen();
                    break;
                case 2:
                    eingabeNeuesSchiffAnlegen();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SteuerungKundeSchiffe s = new SteuerungKundeSchiffe();
        s.menue();
    }
}
