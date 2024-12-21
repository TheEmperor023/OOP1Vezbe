package vezbe4;

import java.util.Arrays;

abstract public class Lekar {
    protected String ime;
    protected String prezime;
    private Pacijent[] pacijenti;
    private int brPacijenata;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Pacijent[] getPacijenti() {
        return pacijenti;
    }

    public int getBrPacijenata() {
        return brPacijenata;
    }

    public Lekar(String ime, String prezime, int maksPacijanta) {
        this.ime = ime;
        this.prezime = prezime;
        this.pacijenti = new Pacijent[maksPacijanta];
        this.brPacijenata = 0;
    }

    public boolean prihvati(Pacijent p){
        if (brPacijenata < pacijenti.length){
            pacijenti[brPacijenata++] = p;
            return true;
        }else {
            return false;
        }
    }

    public abstract int plata();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lekar{");
        sb.append("ime='").append(ime).append('\'');
        sb.append(", prezime='").append(prezime).append('\'');
        sb.append(", pacijenti=").append(pacijenti == null ? "null" : Arrays.asList(pacijenti).toString());
        sb.append(", brPacijenata=").append(brPacijenata);
        sb.append('}');
        return sb.toString();
    }
}
