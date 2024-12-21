package vezbe4;

public class Pulmolog extends Lekar{
    public Pulmolog(String ime, String prezime) {
        super(ime, prezime, 100);
    }

    @Override
    public int plata() {
        return getBrPacijenata() * 500;
    }

    @Override
    public String toString() {
        return "Pulmolog{} " + super.toString();
    }
}
