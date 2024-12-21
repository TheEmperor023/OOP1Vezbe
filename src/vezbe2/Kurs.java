package vezbe2;

public class Kurs {
    private String jezik;
    private String nivo;
    private int brojPolaznika;

    public Kurs(String jezik, String nivo, int brojPolaznika) {
        this.jezik = jezik;
        this.nivo = nivo;
        this.brojPolaznika = brojPolaznika;
    }

    public String getJezik() {
        return jezik;
    }

    public void setJezik(String jezik) {
        this.jezik = jezik;
    }

    public String getNivo() {
        return nivo;
    }

    public void setNivo(String nivo) {
        if(nivo.equalsIgnoreCase("osnovni") || nivo.equalsIgnoreCase("srednji") || nivo.equalsIgnoreCase("napredni")){
            this.nivo = nivo;
        }else {
            this.nivo = "osnovni";
        }
    }

    public int getBrojPolaznika() {
        return brojPolaznika;
    }

    public void setBrojPolaznika(int brojPolaznika) {
        this.brojPolaznika = brojPolaznika;
    }

    @Override
    public String toString() {
        return "Jezik: " + jezik +"; nivo: " + nivo + "; broj polaznika: " + brojPolaznika;
    }
}
