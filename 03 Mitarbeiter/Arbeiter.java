public class Arbeiter extends Mitarbeiter{
    private String arbeitsplatz;
    private double stundenlohn;
    private double geleisteteStunden;

    public Arbeiter() {
        arbeitsplatz = "Fertigung";
        super.einkommen = 0;
        stundenlohn = 18;
        geleisteteStunden = 140;
    }

    public void kennung() {
        System.out.println("\tIch bin ein Arbeiter der " + firma + "." );
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public String getArbeitsplatz() {
        return arbeitsplatz;
    }

    public void setArbeitsplatz(String arbeitsplatz) {
        this.arbeitsplatz = arbeitsplatz;
    }

    public double getGeleisteteStunden() {
        return geleisteteStunden;
    }

    public void setGeleisteteStunden(double geleisteteStunden) {
        this.geleisteteStunden = geleisteteStunden;
    }

    public void setEinkommen(double geleisteteStunden, double stundenlohn) {
        super.einkommen = geleisteteStunden * stundenlohn;
    }

    public void setEinkommen() {
        super.einkommen = geleisteteStunden * stundenlohn;
    }

    public void setEinkommen(double geleisteteStunden) {
        super.einkommen = geleisteteStunden * stundenlohn;
    }
}
