public class Schiff {
    protected String name;
    protected double tonnage;
    public Schiff(double tonnage) {
        this.tonnage = tonnage;
        name = "Schiff";
    }

    public String getName() {
        return name;
    }
}
