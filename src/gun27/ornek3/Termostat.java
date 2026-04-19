package gun27.ornek3;

public class Termostat {
    private double sicaklik;

    public Termostat (double sicaklik) {
        this.sicaklik = sicaklik;
    }

    public void sicaklikArttir() {
        if (sicaklik < 15) {
            sicaklik ++;
        }
    }
    public void sicaklikAzalt() {
        if (sicaklik > 30) {
            sicaklik -= 4;

        }
    }

    public double getSicaklik() {
        return sicaklik;
    }
}
