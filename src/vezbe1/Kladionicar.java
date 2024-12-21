package vezbe1;

public class Kladionicar {
    private String ime;
    private String igra;
    private int stanjeNaRacunu;



    public Kladionicar(String ime, String igra, int stanjeNaRacunu) {
        super();
        this.ime = ime;
        this.igra = igra;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIgra() {
        return igra;
    }

    public void setIgra(String igra) {
        if(igra.equals("ajns") || igra.equals("poker") || igra.equals("rulet")){
            this.igra = igra;
        }else {
            igra = "poker";
        }
    }

    public int getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(int stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    @Override
    public String toString() {
        return ime + " igra " + igra + " i ima " + stanjeNaRacunu + " na racunu. \n";
    }
}
