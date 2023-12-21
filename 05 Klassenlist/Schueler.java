import java.util.ArrayList;

public class Schueler extends Person{
    static int schuelerstammNummer = 1000;
    int schuelerNummer;
    ArrayList<Kurs> meineKurse;
    public Schueler (String name) {
        super(name);
        meineKurse = new ArrayList<>();
        schuelerNummer = schuelerstammNummer;
        schuelerstammNummer++;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public int getSchuelerNummer() {
        return schuelerNummer;
    }

    public void setSchuelerNummer(int schuelerNummer) {
        this.schuelerNummer = schuelerNummer;
    }

    public ArrayList<Kurs> getMeineKurse() {
        return meineKurse;
    }

    public void setMeineKurse(ArrayList<Kurs> meineKurse) {
        this.meineKurse = meineKurse;
    }

    public void neuenKursHinzufuegen(String name, int stunden){
        meineKurse.add(new Kurs(name, stunden));
    }

    public String ausgabeKurse() {
        String temp = "";
        for (Kurs tempK:
             meineKurse) {
            temp += tempK.toString() + "\n";
        }
        return temp;
    }

    @Override
    public String toString() {
        return super.getName() + " (Schuelernummer: " + schuelerNummer + ")";
    }
}
