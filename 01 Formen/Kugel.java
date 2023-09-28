/**
 *
 * Description
 *
 * @version 1.0 from 13.09.2023
 * @author 
 */

public class Kugel {
  
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

  public double oberflaechenBerechnung() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  public double oberflaechenBerechnung(double radius) {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  public double volumenBerechnung() {
    return 4 / 3 * Math.PI * Math.pow(radius, 3);
  }

  public double volumenBerechnung(double radius) {
    return 4 / 3 * Math.PI * Math.pow(radius, 3);
  }

  // end methods
} // end of Kugel
