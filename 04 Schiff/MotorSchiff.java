public class MotorSchiff extends Schiff{
    double motorleistung;
    public MotorSchiff(double tonnage, double motorleistung) {
        super(tonnage);
        this.motorleistung = motorleistung;
        name = "Motorschiff";
    }

    public String getName() {
        return name;
    }

    public double getMotorleistung() {
        return motorleistung;
    }
}
