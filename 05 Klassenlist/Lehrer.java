public class Lehrer extends Person{
    private String kuerzel;

    public Lehrer(String name, String kuerzel) {
        super(name);
        this.kuerzel = kuerzel;
    }

    public String getName() {
        return super.getName();
    }

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.getName() + " (" + this.kuerzel + ")";
    }
}
