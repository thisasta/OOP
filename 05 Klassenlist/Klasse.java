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

    public String ausgabeSchuelerMitKursen() {
        String temp = "";
        int i = 1;
        for (Schueler tempS:
             meineSchueler) {
            temp += i++ + ". " + tempS.toString() + "\n" + tempS.ausgabeKurse();
        }
        return temp;
    }

    public void schuelerNameAendern(String alterName, String neuerName) {
        for (Schueler tempS : meineSchueler) {
            if (tempS.getName().equals(alterName)){
                tempS.setName(neuerName);
                break;
            }
        }
    }

    public void kursNameAendern (String alterName, String neuerName) {
        for (Schueler tempS:meineSchueler) {

            for (Kurs tempk: tempS.meineKurse) {
                if (tempS.getMeineKurse().get(tempS.meineKurse.indexOf(tempk)).getBezeichnung().equals(alterName)){
                    tempS.getMeineKurse().get(tempS.meineKurse.indexOf(tempk)).setBezeichnung(neuerName);
                }
            }

            /*
            for (int i = 0; i < tempS.getMeineKurse().size(); i++) {
                if (tempS.getMeineKurse().get(i).getBezeichnung().equals(alterName)){
                    tempS.getMeineKurse().get(i).setBezeichnung(neuerName);
                }
            }
            */
        }
    }
}
