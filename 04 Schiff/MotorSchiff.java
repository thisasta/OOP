/**
 * Vererbung Schiffe mit protected
 */
 
public class MotorSchiff extends Schiff {
  
  private double motorLeistung;
  
  
  public MotorSchiff(String name, double tonnage, double motorLeistung) {
    super(name, tonnage);
    super.setSchiffsTyp("Motorschiff");
    this.motorLeistung = motorLeistung;
  }
  
  public double getMotorLeistung() {
    return motorLeistung;
  }
  
  public void setMotorLeistung(double motorLeistung) {
    this.motorLeistung = motorLeistung;
  }
  
}
