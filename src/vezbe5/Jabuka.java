package vezbe5;

public class Jabuka extends Voce{
    private boolean crvljiva;

    public Jabuka(String naziv, double zapremina, boolean crvljiva) {
        super(naziv, zapremina);
        this.crvljiva = crvljiva;
    }

    public boolean jeCrvljiva() {
        return crvljiva;
    }
}
