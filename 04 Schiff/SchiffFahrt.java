public class SchiffFahrt {

    private Schiff s1 = new Schiff(1000);
    private SegelSchiff s2 = new SegelSchiff(2000, 200);
    private MotorSchiff s3 = new MotorSchiff(3000, 30);

    public void ausgabe() {
        System.out.println("s1: " + s1.getName() + "[Tonnage=" + s1.tonnage +"]");
        System.out.println("s2: " + s2.getName() + "[Segelflaeche= " + s2.getSegelflaeche() +", Tonnage=" + s2.tonnage +"]");
        System.out.println("s3: " + s3.getName() + "[Motorleistung= " + s3.getMotorleistung() +", Tonnage=" + s3.tonnage +"]");
    }
    public static void main(String[] args) {
        SchiffFahrt s1 = new SchiffFahrt();
        s1.ausgabe();
    }
}
