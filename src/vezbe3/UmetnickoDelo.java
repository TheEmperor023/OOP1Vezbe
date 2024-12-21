package vezbe3;

public class UmetnickoDelo {
    private String naziv;
    private int godinaNastanka;
    private double cena;

    public UmetnickoDelo(String naziv, int godinaNastanka, double cena) {
        this.naziv = naziv;
        this.godinaNastanka = godinaNastanka;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaNastanka() {
        return godinaNastanka;
    }

    public void setGodinaNastanka(int godinaNastanka) {
        this.godinaNastanka = godinaNastanka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString(){
        return "Naziv: " + this.naziv + "; godina: " + this.godinaNastanka + "; cena: " + (Math.round(cena * 100.0) / 100.0);
    }


}
