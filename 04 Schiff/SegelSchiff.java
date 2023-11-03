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
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getTonnage() {
        return super.getTonnage();
    }

    @Override
    public void setTonnage(double tonnage) {
        super.setTonnage(tonnage);
    }

    public double getSegelflaeche() {
        return segelflaeche;
    }

    public void setSegelflaeche(double segelflaeche) {
        this.segelflaeche = segelflaeche;
    }
}
