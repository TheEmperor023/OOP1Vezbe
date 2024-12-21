package vezbe4;

public class Pacijent {
    private String ime;
    private String prezime;
    private int godine;

    public Pacijent(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacijent{");
        sb.append("ime='").append(ime).append('\'');
        sb.append(", prezime='").append(prezime).append('\'');
        sb.append(", godine=").append(godine);
        sb.append('}');
        return sb.toString();
    }
}
