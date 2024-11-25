package hu.szamalk.modell;

public abstract class AbstractFaIdom  extends AbstractIdom  {
    private static double fajsuly = 0.8;

    public static int getFajsuly() {

        return 0;
    }

    public  double terfogat(){
        return 0;
    }

    public double suly(){

        return terfogat() * AbstractFaIdom.fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
