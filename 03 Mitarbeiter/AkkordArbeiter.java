public class AkkordArbeiter extends Arbeiter{

    public void kennung() {
        System.out.println("\tIch bin ein Akkordarbeiter der " + firma + "." );
    }

    public void setEinkommen(double minutenFaktor, double vorgabezeit, double produzierteMenge) {
        super.einkommen = minutenFaktor * vorgabezeit * produzierteMenge;
    }
}
