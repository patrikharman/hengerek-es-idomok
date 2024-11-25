package hu.szamalk.modell;

public abstract class MertaniHenger extends AbstractIdom{
    private static int hengerDb = 0;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDb++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDb() {
        return hengerDb;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "<|--MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
