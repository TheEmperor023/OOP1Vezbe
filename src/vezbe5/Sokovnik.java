package vezbe5;

public class Sokovnik implements Kontejner, Cediljka{
    private double zapremina;
    private int brVoca;
    private Voce[] ubacenoVoce;

    public Sokovnik(double zapremina, Voce[] ubacenoVoce) {
        this.zapremina = zapremina;
        this.brVoca = 0;
        this.ubacenoVoce = new Voce[ubacenoVoce.length];
        double ubaceno = 0;
        for (int i = 0; i < ubacenoVoce.length && ubaceno + ubacenoVoce[i].getZapremina() <= zapremina; i++) {
            if(ubacenoVoce[i] instanceof Jabuka && ((Jabuka) ubacenoVoce[i]).jeCrvljiva()) {
                continue;
            }else  {
                this.ubacenoVoce[brVoca++] = ubacenoVoce[i];
                ubaceno += ubacenoVoce[i].getZapremina();
            }
        }
    }

    @Override
    public void cedi(){
        System.out.println("Cedim...");
        int br = 0;
        while(br < brVoca && ubacenoVoce[br] != null){
            System.out.println(ubacenoVoce[br++]);
        }
    }

    @Override
    public double zapremina() {
        return zapremina;
    }

    @Override
    public int brojKomada() {
        return brVoca;
    }
}
