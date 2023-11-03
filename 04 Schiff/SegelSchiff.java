public class SegelSchiff extends Schiff{

    private double segelflaeche;
    public SegelSchiff(double tonnage, double segelflaeche) {
        super(tonnage);
        this.segelflaeche = segelflaeche;
        name = "Segelschiff";
    }

    public String getName() {
        return name;
    }

    public double getSegelflaeche() {
        return segelflaeche;
    }
}
