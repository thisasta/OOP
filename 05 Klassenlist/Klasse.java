import java.util.ArrayList;

public class Klasse {
    private String name;
    private ArrayList <Schueler> meineSchueler;
    private Lehrer meinTutor;

    public Klasse() {
        meineSchueler = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Schueler> getMeineSchueler() {
        return meineSchueler;
    }

    public void setMeineSchueler(ArrayList<Schueler> meineSchueler) {
        this.meineSchueler = meineSchueler;
    }

    public void neuerSchuelerHinzufuegen(String name) {
        meineSchueler.add(new Schueler(name));
    }

    public void setMeinTutor(Lehrer meinTutor) {
        this.meinTutor = meinTutor;
    }

    public Lehrer getMeinTutor() {
        return meinTutor;
    }

    public String ausgabeSchuelerNamen() {
        String tempNamen = "";
        int i = 1;
        for (Schueler tempS:
             meineSchueler) {
            tempNamen += i + ". " +  tempS.getName() + "\n";
            i++;
        }
        return tempNamen;
    }
}
