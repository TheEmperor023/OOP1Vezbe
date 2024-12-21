package vezbe4;

public class Pedijatar extends Lekar{
    public Pedijatar(String ime, String prezime) {
        super(ime, prezime, 200);
    }

    @Override
    public int plata() {
        int toRet = this.getBrPacijenata() * 300;
        for (int i = 0; i < getPacijenti().length; i++) {
            if (getPacijenti()[i].getGodine() < 5){
                toRet += 100;
            }
        }
        return toRet;
    }

    @Override
    public boolean prihvati(Pacijent p){
        if (p.getGodine() > 18){
            return false;
        }else {
            return super.prihvati(p);
        }
    }

    @Override
    public String toString() {
        return "Pedijatar{} " + super.toString();
    }
}
