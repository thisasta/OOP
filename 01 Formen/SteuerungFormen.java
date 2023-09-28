/**
 * Description
 *
 * @version 1.0 from 08.09.2023
 * @author Abishan Arankesan
 */

import java.util.*;

public class SteuerungFormen {

    // start attributes
    private Rechteck rechteck; //Referenzattribute, Beziehungsattribute
    private Kreis kreis;
    private Kugel kugel;
    // end attributes

    // start methods
    public void input() {
        //Rechteck
        rechteck = new Rechteck();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nLaenge A: ");
        rechteck.setSeiteA(sc.nextDouble());
        System.out.print("\nLaenge B: ");
        rechteck.setSeiteB(sc.nextDouble());

        //Kreis
        kreis = new Kreis();
        System.out.print("\n\nRadius (Kreis): ");
        kreis.setRadius(sc.nextDouble());

        //Kugel
        kugel = new Kugel();
        System.out.print("\n\nRadius (Kugel): ");
        kugel.setRadius(sc.nextDouble());
    }

    public void output() {
        System.out.println("\nRechteck:");
        System.out.println("Flaeche: " + rechteck.berechneFlaeche() + "\t =(" + rechteck.getSeiteA() + " * " + rechteck.getSeiteB() + ")");
        System.out.println("Umfang: " + rechteck.berechneUmfang() + "\t =(2 x (" + rechteck.getSeiteA() + " + " + rechteck.getSeiteB() + "))");

        System.out.println("\nKreis:");
        System.out.println("Flaeche: " + kreis.flächenBerechnung() + "\t =(2*" + kreis.getRadius() + "^2 * " + "PI)");
        System.out.println("Umfang: " + kreis.umfangsBerechnung() + "\t =(2 x PI x " + kreis.getRadius() + ")");

        System.out.println("\nKugel");
        System.out.println("Oberflaeche: " + kugel.oberflaechenBerechnung() + "\t =(4 x PI x " + kugel.getRadius() + "^2)");
        System.out.println("Volumen: " + kugel.volumenBerechnung() + "\t = (4 / 3 x PI x " + kugel.getRadius() + "^3)");
    }


    // end methods
} // end of SteuerungFormen
