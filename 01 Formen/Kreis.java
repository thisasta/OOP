/**
 * Description
 *
 * @author Abishan Arankesan
 * @version 1.0 from 13.09.2023
 */

public class Kreis {

    // start attributes
    private double radius;
    // end attributes

    // start methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double flächenBerechnung() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double flächenBerechnung(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double umfangsBerechnung() {
        return 2 * Math.PI * radius;
    }

    public double umfangsBerechnung(double radius) {
        return 2 * Math.PI * radius;
    }

    // end methods
} // end of Kreis
