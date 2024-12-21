package vezbe5;

public class Voce implements Comparable<Voce> {
    private String naziv;
    private double zapremina;

    public Voce(String naziv, double zapremina) {
        this.naziv = naziv;
        this.zapremina = zapremina;
    }

    public double getZapremina() {
        return zapremina;
    }

    @Override
    public String toString() {
        return naziv + " od " + zapremina + "l";
    }


    @Override
    public int compareTo(Voce o) {
        return Double.compare(this.getZapremina(), o.getZapremina());
    }
}
