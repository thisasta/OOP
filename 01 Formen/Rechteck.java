/**
 * Description
 *
 * @author Abishan Arankesan
 * @version 1.0 from 08.09.2023
 */

public class Rechteck {

    // start attributes
    private double seiteA;
    private double seiteB;
    // end attributes

    // start methods
    public double getSeiteA() {
        return this.seiteA;
    }

    public void setSeiteA(double seiteANew) {
        this.seiteA = seiteANew;
    }

    public double getSeiteB() {
        return this.seiteB;
    }

    public void setSeiteB(double seiteBNew) {
        this.seiteB = seiteBNew;
    }

    public double berechneFlaeche() {
        return (this.seiteA * this.seiteB);
    }

    public double berechneFlaeche(double seiteA, double seiteB) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        return (seiteA * seiteB);
    }

    public double berechneUmfang() {
        return 2 * (this.seiteA + this.seiteB);
    }

    public double berechneUmfang(double seiteA, double seiteB) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        return 2 * (seiteA + seiteB);
    }

    // end methods
} // end of Rechteck
