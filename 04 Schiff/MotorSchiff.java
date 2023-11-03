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

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public double getMotorleistung() {
        return motorleistung;
    }

    public void setMotorleistung(double motorleistung) {
        this.motorleistung = motorleistung;
    }

    @Override
    public double getTonnage() {
        return super.getTonnage();
    }

    @Override
    public void setTonnage(double tonnage) {
        super.setTonnage(tonnage);
    }
}
