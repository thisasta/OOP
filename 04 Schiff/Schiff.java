/**
 * Vererbung Schiffe mit protected
 */
 
public class Schiff  {
    
  private double tonnage;
  private String schiffsTyp;
  private String name;
  
  public Schiff(String name, double tonnage) {
    this.name = name;
    this.tonnage = tonnage;
    this.schiffsTyp = "Schiff";
  }
  
  public Schiff() { 

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTonnage() {
    return tonnage;
  }

  public void setTonnage(double tonnage) {
    this.tonnage = tonnage;
  }
  public String getSchiffsTyp() {
    return schiffsTyp;
  }

  public void setSchiffsTyp(String schiffsTyp) {
    this.schiffsTyp = schiffsTyp;
  } 

}
