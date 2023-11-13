/**
 * Vererbung Schiffe mit protected
 */
 
public class SegelSchiff extends Schiff {

  private double segelFlaeche;

  public SegelSchiff(String name, double tonnage, double segelFlaeche) {
    
    super(name, tonnage);
    this.segelFlaeche = segelFlaeche;
    super.setSchiffsTyp("Segelschiff");
  }
  
  
  public double getSegelFlaeche() {
    return segelFlaeche;
  }
  
  public void setSegelFlaeche(double segelFlaeche) {
    this.segelFlaeche = segelFlaeche;
  }
  
  
}
