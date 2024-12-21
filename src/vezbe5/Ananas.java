package vezbe5;

public class Ananas extends Voce{

    public Ananas(String naziv, double zapremina) {
        super(naziv, zapremina);
    }

    @Override
    public double getZapremina(){
        return super.getZapremina() * 0.5;
    }
}
