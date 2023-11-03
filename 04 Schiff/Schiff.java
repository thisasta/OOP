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

    public void setName(String name) {
        this.name = name;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }
}
