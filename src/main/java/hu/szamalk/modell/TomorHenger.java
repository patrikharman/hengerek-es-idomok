package hu.szamalk.modell;

public abstract class TomorHenger extends MertaniHenger {
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return 0.0;
    }

    @Override
    public String toString() {
        String os = super.toString();
        /* amelyik szimpi, de legyen egységes a LyukasHenger-rel: */
        return os + " <|-- TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';

//        return "TomorHenger{" +
//                "fajsuly=" + fajsuly +
//                '}' + " --|> " + os;
    }
}
