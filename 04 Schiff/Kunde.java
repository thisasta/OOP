public class Kunde {
    private int kundenNr;
    private static int kundenstammNr = 999;
    String name;
    Schiff[] meineSchiffe = new Schiff[5];

    public Kunde(){

    }

    public int getKundenNr() {
        return kundenNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Schiff[] getMeineSchiffe() {
        return meineSchiffe;
    }

    public void setMeineSchiffe(Schiff[] meineSchiffe) {
        this.meineSchiffe = meineSchiffe;
    }

    public boolean neuesSchiffAnlegen(String name, double tonnage){
        for (int i = 0; i < meineSchiffe.length; i++) {
            if (meineSchiffe[i] != null) {
                meineSchiffe[i] = new Schiff(name, tonnage);
                return true;
            }
        }
        return false;
    }
}
